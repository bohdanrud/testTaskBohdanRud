package ua.bohdanrud.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
@Constraint(validatedBy = CheckUserNameExistsValidator.class)
public @interface CheckUserNameExists {

	String message() default "Typed User already added! Please check name and try again!";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
