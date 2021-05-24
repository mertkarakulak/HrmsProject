package com.kodlamaio.hrms.business.abstracts;

import com.kodlamaio.hrms.core.utilities.results.Result;
import com.kodlamaio.hrms.core.utilities.results.SuccessResult;
import org.springframework.stereotype.Service;


public interface EmailActivationCodeService {
    Result getById(Integer id, String activationCode);
}
