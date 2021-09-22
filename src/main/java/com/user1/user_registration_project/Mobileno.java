package com.user1.user_registration_project;

import java.util.regex.Pattern;

/**
 * method to validate phone number entered by the user
 * 
 * @param phone number given as input by the user
 * 
 * @return true if phone is valid i.e phone number should begin with country
 *         code followed by 10 digits else returns false along with handling
 *         exceptions
 */
public class Mobileno {

	String mobileNoMatcher = "^[0-9]{2}\\s{0,1}[0-9]{10}$";

	public boolean validateMobile(String phone) throws InvalidUserException {
		try {
			if (phone.length() == 0) {
				throw new InvalidUserException("Please enter valid mobile no with length>0");
			}
			Boolean check = Pattern.matches(mobileNoMatcher, phone);
			return check;
		} catch (NullPointerException e) {
			throw new InvalidUserException("Please enter valid mobile no");
		}
	}

}
