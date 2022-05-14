package com.shafhaz.rentcloud.rentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class RentProcessServiceImpl implements RentProcessService {



    public boolean validateDL(String dlNumber){
        return dlNumber.length()>5;
    }


}
