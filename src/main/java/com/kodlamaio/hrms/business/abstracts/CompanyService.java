package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.entities.concretes.Companies;

import java.util.List;

public interface CompanyService {
    DataResult<List<Companies>> getAll();
}
