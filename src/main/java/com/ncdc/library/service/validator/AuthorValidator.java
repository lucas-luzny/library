package com.ncdc.library.service.validator;

import lombok.extern.slf4j.Slf4j;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by Lucas on 10.02.2018
 */
@Slf4j
public class AuthorValidator implements ConstraintValidator<StartsWithA, String> {

    @Override
    public void initialize(StartsWithA startsWithA) {

    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        if (!doesNameOrSurnameStartWithA(s)) {
            log.error("Book object invalid, returning to add page");
        }
        return doesNameOrSurnameStartWithA(s);
    }

    private boolean doesNameOrSurnameStartWithA(String name) {
        String[] splittedName = name.split("\\s+");
        for (String s : splittedName) {
            if (s.charAt(0) == 'A') {
                return true;
            }
        }
        return false;
    }
}
