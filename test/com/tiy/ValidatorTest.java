package com.tiy;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

/**
 * Created by josh on 3/21/17.
 */
public class ValidatorTest {


	@Test
	public void checkValidationBetweenZeroAnd18() throws Exception{
		Validator validator = new Validator();
		try {
			validator.validateAge("12");
		}catch (Exception e) {
			assertThat(e.getMessage(), equalTo("You must be over 18."));
		}
	}
	@Test
	public void checkValidationIsNotOver115() throws Exception{
		Validator validator = new Validator();
		try{
			validator.validateAge("116");
		}catch (Exception e){
			assertThat(e.getMessage(),equalTo("You appear to be lying about your age."));
		}
	}

	@Test
	public void checkValidationAgeIsNotUnderZero() throws Exception{
		Validator validator = new Validator();
		try{
			validator.validateAge("-12");
		}catch (Exception e){
			assertThat(e.getMessage(),startsWith("You must be unborn your age is"));
		}
	}
	@Test
	public void checkValidationForDoubleNumber() throws Exception{
		Validator validator = new Validator();
		try{
			validator.validateAge("23.23");
		}catch (Exception e){
			assertThat(e.getMessage(),equalTo("Age needs to be an Integer."));
		}
	}
	@Test
	public void checkValidationWhenLetters() throws Exception{
		Validator validator = new Validator();
		try{
			validator.validateAge("Twelve");
		}catch (Exception e){
			assertThat(e.getMessage(),equalTo("Age must be a number."));
		}
	}
}
