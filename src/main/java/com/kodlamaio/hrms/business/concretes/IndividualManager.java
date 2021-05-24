package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.IndividualService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.dataAccess.abstracts.IndividualDao;
import com.kodlamaio.hrms.entities.concretes.Individuals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndividualManager implements IndividualService {
    private IndividualDao individualDao;

    @Autowired
    public IndividualManager(IndividualDao individualDao) {
        this.individualDao = individualDao;
    }

    @Override
    public DataResult<List<Individuals>> getAll() {
        return new SuccessDataResult<List<Individuals>>
                (this.individualDao.findAll(), "Veriler listelendi");
    }

    @Override
    public Result add(Individuals individuals){
        individualDao.save(individuals);
        return new SuccessResult("Succesfully Added");
    }
}
