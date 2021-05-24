package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.CompanyService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import com.kodlamaio.hrms.dataAccess.abstracts.CompanyDao;
import com.kodlamaio.hrms.entities.concretes.Companies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyManager implements CompanyService {
    private CompanyDao companyDao;

    @Autowired
    public CompanyManager(CompanyDao companyDao) {
        this.companyDao = companyDao;
    }

    @Override
    public DataResult<List<Companies>> getAll(){
        return new SuccessDataResult<List<Companies>>
                (this.companyDao.findAll(),"Veriler listelendi");
    }
}
