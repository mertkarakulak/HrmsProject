package com.kodlamaio.hrms.dataAccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.EmailActivationCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmailActivationCodeDao extends JpaRepository<EmailActivationCode, Integer> {

    Optional<EmailActivationCode>  findByIdAndEmailActivationCode(Integer integer, String activationCode);
}
