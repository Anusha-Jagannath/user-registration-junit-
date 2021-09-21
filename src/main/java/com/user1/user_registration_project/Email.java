package com.user1.user_registration_project;

import java.util.regex.Pattern;

/**
 * method to validate email id entered by the user
 * 
 * @param email id given as input by the user
 * 
 * @return true if email is valid else returns false
 */
public class Email {

	String emailMatcher = "^[0-9a-zA-Z]+([.-_+][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";

	public boolean testEmail(String email) {
		boolean check = Pattern.matches(emailMatcher, email);
		return check;
	}
}
