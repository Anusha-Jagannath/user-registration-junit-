package com.user1.user_registration_project;

import org.junit.Assert;
import org.junit.Test;

public class MobilenoTest {

	@Test
	public void givenInputAsMobileNo_WhenProper_ShouldReturntrue() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("91 6785946372");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenInputAsMobileNo_WhenNotProper_ShouldReturnfalse() {

		Mobileno mobileno = new Mobileno();
		boolean result = mobileno.validateMobile("91 678546372");
		Assert.assertEquals(true, result);
	}
}
