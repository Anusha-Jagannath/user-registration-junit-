package com.user1.user_registration_project;

import java.util.regex.Pattern;

public class FirstName {

	
	String firstNameMatcher = "^[A-Z]{1}[a-z]{2,}$";

	public Boolean validateFirstName(String string) {
		Boolean check = Pattern.matches(firstNameMatcher, string);
		return check;
	}
}
