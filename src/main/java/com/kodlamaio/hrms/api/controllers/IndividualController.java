package com.kodlamaio.hrms.api.controllers;

import com.kodlamaio.hrms.business.abstracts.IndividualService;
import com.kodlamaio.hrms.core.utilities.results.DataResult;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.entities.concretes.Individuals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/individual/")
public class IndividualController {
    private IndividualService individualService;

    @Autowired
    public IndividualController(IndividualService individualService) {
        this.individualService = individualService;
    }

    @GetMapping("/getall")
    public DataResult<List<Individuals>> getAll(){
        return this.individualService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Individuals individuals){
        return this.individualService.add(individuals);
    }
}
