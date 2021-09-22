package com.user1.user_registration_project;

import org.junit.Assert;
import org.junit.Test;

public class MobilenoTest {

	@Test
	public void givenInputAsMobileNo_WhenProper_ShouldReturntrue() {

		Mobileno mobileno = new Mobileno();
		boolean result;
		try {
			result = mobileno.validateMobile("91 6785946372");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenInputAsMobileNo_WhenNotProper_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result;
		try {
			result = mobileno.validateMobile("91 678546372");
			Assert.assertEquals(true, result);
		} catch (InvalidUserException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenInputAsMobileNo_WhenNull_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result;
		try {
			result = mobileno.validateMobile(null);
		} catch (InvalidUserException e) {
			e.printStackTrace();
			Assert.assertEquals("Please enter valid mobile no", e.getMessage());
		}
	}

	@Test
	public void givenInputAsMobileNo_WhenEmpty_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result;
		try {
			result = mobileno.validateMobile(" ");
		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid mobile no with length>0", e.getMessage());
			e.printStackTrace();
		}

	}
}
