package com.vaild;

import com.vaild.entity.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PersonValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return Person.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
        Person person = (Person) o;
        if (person.getAge() < 0){
            errors.rejectValue("age","negativeValue");
        }else if (person.getAge() > 110){
            errors.rejectValue("age","too.old");
        }
    }
}
