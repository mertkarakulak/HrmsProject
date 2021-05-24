package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.JobPositionService;
import com.kodlamaio.hrms.core.utilities.results.*;
import com.kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import com.kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionService {
    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public DataResult<List<JobPosition>> getAll() {
        return new SuccessDataResult<List<JobPosition>>
                (this.jobPositionDao.findAll(),"Veriler listelendi");
    }

    @Override
    public Result add(JobPosition jobPosition) {
        boolean isTheSystem=false;
        boolean isTheNull=false;
        if(jobPosition.getTitle().equals("")){
            isTheNull=true;
            return new ErrorResult("Job position cannot be left blank");
        }else{
            List<JobPosition> allJobPosition = jobPositionDao.findAll();
            for(JobPosition job:allJobPosition)
            {
                if(job.getTitle().equals(jobPosition.getTitle()))
                {
                    isTheSystem=true;
                    return new ErrorResult("This job position already is available in the system: "+job.getTitle());
                }

            }
        }

        if(!isTheSystem && !isTheNull)
        {   jobPositionDao.save(jobPosition);
            return new SuccessResult("Succesfully Added: "+jobPosition.getTitle()) ;
        }
        else{
            return new ErrorResult("Something went wrong");
        }
    }
}
