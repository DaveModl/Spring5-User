package com.vaild;

import com.vaild.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import java.util.List;


public class VaildatorTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/vaild.xml");
        Person person = context.getBean(Person.class);
        PersonValidator validator = context.getBean(PersonValidator.class);
        if (validator.supports(Person.class)){
            BindException error = new BindException(person,"person");
            validator.validate(person,error);
            List<ObjectError> errors = error.getAllErrors();
            for (int i = 0; i < errors.size() ; i++) {
                System.out.println(errors.get(i).getCode());
            }
        }
    }
}
