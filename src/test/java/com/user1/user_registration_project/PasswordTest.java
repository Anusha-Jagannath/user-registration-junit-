package com.user1.user_registration_project;

import org.junit.Assert;
import org.junit.Test;

public class PasswordTest {

	@Test
	public void givenInputAsPassword_WhenProper_ShouldReturntrue() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("Heema@9876");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenInputAsPassword_WhenProperSpecialCharacter_ShouldReturntrue() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("Heemalata@9876");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenInputAsPassword_WhenNoSpecialCharacter_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("Heema9876");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenInputAsPassword_WhenLessCharacters_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("jev");
		Assert.assertEquals(false, result);
	}
}
