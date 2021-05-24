package com.kodlamaio.hrms.api.controllers;

import com.kodlamaio.hrms.business.abstracts.JobPositionService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobPosition/")
public class JobPositionController {
    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobPosition>> getAll(){
        return this.jobPositionService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobPosition jobPosition){
        return this.jobPositionService.add(jobPosition);
    }
}
