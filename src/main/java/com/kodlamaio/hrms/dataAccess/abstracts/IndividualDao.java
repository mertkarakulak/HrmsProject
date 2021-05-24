package com.kodlamaio.hrms.dataAccess.abstracts;

import com.kodlamaio.hrms.entities.concretes.Individuals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IndividualDao extends JpaRepository<Individuals, Integer> {
}
