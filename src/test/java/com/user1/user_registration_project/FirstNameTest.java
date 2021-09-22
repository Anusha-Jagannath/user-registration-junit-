package com.user1.user_registration_project;

import org.junit.Test;

import junit.framework.Assert;

public class FirstNameTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Sam");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Sa");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenFirstName_WithSpecialCharacter_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Sa@");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Jerry");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Sa");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WithSpecialCharacter_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName("Sa@");
			Assert.assertEquals(false, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void givenLastName_WithNull_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName(null);

		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
			e.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WithEmpty_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = firstName.validateFirstName(" ");

		} catch (InvalidUserException e) {
			Assert.assertEquals("Please name of length>0", e.getMessage());
			e.printStackTrace();
		}
	}

}
