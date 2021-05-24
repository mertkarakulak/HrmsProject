package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.stereotype.Component;

import java.util.List;


public interface JobPositionService {
    DataResult<List<JobPosition>> getAll();
    Result add(JobPosition jobPosition);
}
