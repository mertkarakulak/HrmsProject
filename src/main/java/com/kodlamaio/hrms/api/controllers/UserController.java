package com.kodlamaio.hrms.api.controllers;

import com.kodlamaio.hrms.business.abstracts.EmailActivationCodeService;
import com.kodlamaio.hrms.business.abstracts.UserService;
import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import com.kodlamaio.hrms.entities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    private EmailActivationCodeService emailActivationCodeService;

    @Autowired
    public UserController(UserService userService,EmailActivationCodeService emailActivationCodeService) {
        this.userService = userService;
        this.emailActivationCodeService = emailActivationCodeService;
    }

    @GetMapping("/getall")
    public List<User> getAll(){
        return this.userService.getAll();
    }

//    @PostMapping("/add")
//    public Result getAll(){
//        return this.userService.getAll();
    //    return new DataResult(this.userService.getAll(), True, "Başarılı")
//    }

    @GetMapping("/{id}/{activationCode}")
    public Result getById(@PathVariable Integer id, @PathVariable String activationCode){
        return this.emailActivationCodeService.getById(id, activationCode );

    }


}
