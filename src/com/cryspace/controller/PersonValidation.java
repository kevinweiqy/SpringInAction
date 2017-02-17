package com.cryspace.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by bill on 2017/2/13.
 */
public class PersonValidation implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person person = (Person) o;
        if (person.getAge() < 0) {
            errors.reject("age", "negativevalue");
        } else if (person.getAge() > 110) {
            errors.reject("age", "too.darn.old");

        }

    }
}
