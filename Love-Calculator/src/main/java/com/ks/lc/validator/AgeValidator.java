package com.ks.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{

	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		
		if(age==null) {
			return false;
		}
		if(age>=20 && age<=50) {
			return true;
		}else {
			return false;
		}
	}

}
