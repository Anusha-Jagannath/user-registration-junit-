package com.user1.user_registration_project;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

	String passwordMatcher = "^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&]).{8,}";
	IUserDetails user = new IUserDetails() {
		public boolean validate(String password) throws InvalidUserException {
			boolean check;
			try {
				if(password.length() == 0) {
					throw new InvalidUserException("Please enter valid password");
				}
			check = Pattern.matches(passwordMatcher, password);
		}
			catch(NullPointerException e) {
				throw new InvalidUserException("Please enter valid password");
			}
			return check;
		}
	};
	@Test
	public void givenInputAsPassword_WhenProper_ShouldReturntrue() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate("Heema@9876");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenInputAsPassword_WhenProperSpecialCharacter_ShouldReturntrue() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate("Heemalata@9876");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenInputAsPassword_WhenNoSpecialCharacter_ShouldReturnfalse() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate("Heema9876");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenInputAsPassword_WhenLessCharacters_ShouldReturnfalse() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate("jev");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenInputAsPassword_WhenNull_ShouldReturnfalse() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate(null);
		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
			e.printStackTrace();
		}

	}

	@Test
	public void givenInputAsPassword_WhenEmpty_ShouldReturnfalse() {

		Password password = new Password();
		boolean result;
		try {
			result = user.validate(" ");
		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
			e.printStackTrace();
		}

	}
}


