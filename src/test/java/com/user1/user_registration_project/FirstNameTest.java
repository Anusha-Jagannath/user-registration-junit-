package com.user1.user_registration_project;

import java.util.regex.Pattern;

import org.junit.Test;

import junit.framework.Assert;

public class FirstNameTest {

	String nameMatcher = "^[A-Z]{1}[a-z]{2,}$";
	IUserDetails user = new IUserDetails() {
		public boolean validate(String x) throws InvalidUserException {
			boolean check;
			try {
				if(x.length() == 0) {
					throw new InvalidUserException("Please enter valid name");
				}
			check = Pattern.matches(nameMatcher, x);
			}
			catch(NullPointerException e) {
				throw new InvalidUserException("Please enter valid name");
			}
			return check;
		}
	};
	
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		FirstName firstName = new FirstName();
		boolean result;
		try {
			result = user.validate("Sam");
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
			result = user.validate("Sa");
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
			result = user.validate("Sa@");
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
			result = user.validate("Jerry");
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
			result = user.validate("Sa");
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
			result = user.validate("Sa@");
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
			result = user.validate(null);

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
			result = user.validate(" ");

		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid name", e.getMessage());
			e.printStackTrace();
		}
	}

}
