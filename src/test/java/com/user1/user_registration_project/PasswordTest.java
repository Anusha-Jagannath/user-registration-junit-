package com.user1.user_registration_project;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

	@Test
	public void givenInputAsPassword_WhenProper_ShouldReturntrue() {

		Password password = new Password();
		boolean result;
		try {
			result = password.validatePassword("Heema@9876");
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
			result = password.validatePassword("Heemalata@9876");
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
			result = password.validatePassword("Heema9876");
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
			result = password.validatePassword("jev");
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
			result = password.validatePassword(null);
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
			result = password.validatePassword(" ");
		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid password", e.getMessage());
			e.printStackTrace();
		}

	}
}
