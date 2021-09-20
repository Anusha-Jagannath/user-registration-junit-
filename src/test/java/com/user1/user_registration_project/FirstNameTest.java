package com.user1.user_registration_project;

import org.junit.Test;

import junit.framework.Assert;

public class FirstNameTest {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Sam");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Sa");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WithSpecialCharacter_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Sa@");
		Assert.assertEquals(false, result);
	}
	
	
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Jerry");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Sa");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WithSpecialCharacter_ShouldReturnFalse() {
		FirstName firstName = new FirstName();
		boolean result = firstName.validateFirstName("Sa@");
		Assert.assertEquals(false, result);
	}

}
