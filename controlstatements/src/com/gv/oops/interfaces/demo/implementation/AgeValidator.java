package com.gv.oops.interfaces.demo.implementation;

import com.gv.oops.interfaces.demo.Validator;

public class AgeValidator implements Validator {
    @Override
    public boolean isValid(int age) {
       
        return age >= 18 && age <= 65;
    }
    
    
}
