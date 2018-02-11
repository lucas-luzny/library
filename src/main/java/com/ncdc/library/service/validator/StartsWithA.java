package com.ncdc.library.service.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by Lucas on 10.02.2018
 */
@Documented
@Constraint(validatedBy = AuthorValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartsWithA {

    String message() default "Incorrect author name. In order to be valid authors forename or surname should start from letter 'A'.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
