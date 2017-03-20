package com.tiy;

/**
 * Created by josh on 3/20/17.
 */
public class Validator {


	public boolean validateAge(String age) throws Exception{

		//Checks to see if it is a integer
		if(isInteger(age)){
			// checks to see if age is less than 0
			if(Integer.parseInt(age) < 0 ){
				throw new Exception(String.format("You must be unborn your age is %s.", age));

			}
			//checks to see if age is greater than 115
			if( Integer.parseInt(age) > 115){
				throw new Exception(String.format("You appear to be lying about your age. Please try again..."));
			}
			//Checks to see if age is between 0 and less than 18
			if(Integer.parseInt(age) >= 0 && Integer.parseInt(age) < 18) {
				throw new Exception(String.format("You must be over 18."));
			}
		}
		//If age is not a Integer Checks to see if its a double
		else if(isDouble(age)) {
			throw new NumberFormatException(String.format("Age must be an integer."));

		}
		//If no a Integer or double that throws exception for being non numeric.
		else{
			throw new NumberFormatException("Age must be a number.");
		}

		//checks to see if there are an
		if(Integer.parseInt(age) >= 18){
			return true;
		}else{
			return false;
		}

	}
	//checks to see if string is a integer
	private boolean isInteger(String number){
		try{
			Integer.parseInt(number);
			return true;
		}catch (NumberFormatException e){
			return false;
		}
	}
	// checks to see if string is a double
	private boolean isDouble(String number){
		try{
			Double.parseDouble(number);
			return true;
		}catch (NumberFormatException e){
			return false;
		}
	}

}
