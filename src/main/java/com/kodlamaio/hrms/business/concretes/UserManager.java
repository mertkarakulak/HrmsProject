package com.kodlamaio.hrms.business.concretes;

import com.kodlamaio.hrms.business.abstracts.UserService;
import com.kodlamaio.hrms.dataAccess.abstracts.UserDao;
import com.kodlamaio.hrms.entities.abstracts.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {
    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return this.userDao.findAll();
    }
}
