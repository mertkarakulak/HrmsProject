package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Individuals;

import java.util.List;

public interface IndividualService {
    DataResult<List<Individuals>> getAll();
    Result add(Individuals individuals);
}
