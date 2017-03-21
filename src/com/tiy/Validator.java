package com.tiy;

/**
 * Created by josh on 3/20/17.
 */
public class Validator {

	public boolean validateAge(String age) throws Exception{

		parseDouble(age);

		parseInt(age);

			// checks to see if age is less than 0
			if(Integer.parseInt(age) < 0 ){
				throw new Exception(String.format("You must be unborn your age is %s.", age));
			}
			//checks to see if age is greater than 115
			if( Integer.parseInt(age) > 115){
				throw new Exception(String.format("You appear to be lying about your age."));
			}
			//Checks to see if age is between 0 and less than 18
			if(Integer.parseInt(age) >= 0 && Integer.parseInt(age) < 18) {
				throw new Exception(String.format("You must be over 18."));
			}

			return true;
	}

	private void parseDouble(String age) throws Exception{
		try{
			Double.parseDouble(age);
		}catch (NumberFormatException ne){
			throw new Exception("Age must be a number.");

		}
	}
	private void parseInt(String age) {
		try{
			Integer.parseInt(age);
		}catch (NumberFormatException n){
			throw new NumberFormatException("Age needs to be an Integer.");
		}
	}

}