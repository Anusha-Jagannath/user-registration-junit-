package com.user1.user_registration_project;

import java.util.regex.Pattern;

/**
 * FirstName is a class used to validate firstname and last nameof the user
 * method validateFirstName returns true if name is proper else returns false
 * along with handling exceptions
 */
public class FirstName {

	String nameMatcher = "^[A-Z]{1}[a-z]{2,}$";

	public Boolean validateFirstName(String string) throws InvalidUserException {
		try {
			if (string.length() == 0) {
				throw new InvalidUserException("Please enter name of length>0");
			}
			Boolean check = Pattern.matches(nameMatcher, string);
			return check;
		} catch (NullPointerException e) {
			throw new InvalidUserException("Please enter valid name");
		}
	}
}
