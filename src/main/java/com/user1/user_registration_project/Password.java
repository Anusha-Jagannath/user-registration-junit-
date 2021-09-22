package com.user1.user_registration_project;

import java.util.regex.Pattern;

/**
 * method to validate password entered by the user
 * 
 * @param password given as input by the user
 * 
 * @return true if password has minimum 8 characters , at least one upper case,
 *         minimum 1 number character else returns false along with handling
 *         exceptions and used lambda expressions
 */
public class Password {
	String passwordMatcher = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&]).{8,}";

	public boolean validatePassword(String password) throws InvalidUserException {
		try {
			if (password.length() == 0) {
				throw new InvalidUserException("Please enter valid password");
			}
			boolean check = Pattern.matches(passwordMatcher, password);
			return check;
		} catch (NullPointerException e) {
			throw new InvalidUserException("Please enter valid password");
		}
	}
}
