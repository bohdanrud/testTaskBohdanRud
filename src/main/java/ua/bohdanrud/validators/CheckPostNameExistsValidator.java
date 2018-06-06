package ua.bohdanrud.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ua.bohdanrud.repository.PostRepository;

@Component
public class CheckPostNameExistsValidator implements ConstraintValidator<CheckPostNameExists, String> {

	@Autowired
	PostRepository postRepository;

	@Override
	public void initialize(CheckPostNameExists constraintAnnotation) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext arg1) {
		// TODO Auto-generated method stub
		if (name == null) {
			return false;
		}
		if (postRepository.findPostByName(name) != null) {
			return false;
		} else {
			return true;
		}
	}

}
