package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.entities.abstracts.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
}
