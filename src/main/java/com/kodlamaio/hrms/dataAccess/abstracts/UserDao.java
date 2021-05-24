package com.kodlamaio.hrms.dataAccess.abstracts;

import com.kodlamaio.hrms.entities.abstracts.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
