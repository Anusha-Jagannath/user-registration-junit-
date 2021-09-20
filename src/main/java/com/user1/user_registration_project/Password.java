package com.user1.user_registration_project;

import java.util.regex.Pattern;

/*
 * method to validate password entered by the user
 * 
 * @param password given as input by the user
 * 
 * @return true if password has minimum 8 characters , at least one upper case,
 * minimum 1 number character else returns false
 */
public class Password {
	String passwordMatcher = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&]).{8,}";

	public Boolean validatePassword(String password) {
		Boolean check = Pattern.matches(passwordMatcher, password);
		return check;
	}
}
