package ua.bohdanrud.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.bohdanrud.repository.UserRepository;

@Component
public class CheckUserNameExistsValidator implements ConstraintValidator<CheckUserNameExists, String> {

	@Autowired
	UserRepository userRepository;

	@Override
	public void initialize(CheckUserNameExists constraintAnnotation) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (name == null) {
			return false;
		}
		if (userRepository.findUserByName(name) != null) {
			return false;
		} else {
			return true;
		}
	}

}
