package com.luv2code.springdemo.mvc.validation;
import javax.validation.*;
 
import java.lang.annotation.*;
@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
	
	public String value() default "LUV";
	
	public String message() default "must start with LUV";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default{};

	//String value();

}
