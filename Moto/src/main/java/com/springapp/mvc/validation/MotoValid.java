package com.springapp.mvc.validation;

import com.springapp.mvc.domain.Moto;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by vlad on 21.04.2015.
 */
@Component
public class MotoValid implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Moto.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "brand", "required.brand", "Brand is empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "required.model", "Model is empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "price", "required.price", "Price is empty");
    }
}
