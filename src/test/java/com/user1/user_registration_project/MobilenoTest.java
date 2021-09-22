package com.user1.user_registration_project;

import java.util.regex.Pattern;

import org.junit.Assert;
import org.junit.Test;

public class MobilenoTest {

	String mobileNoMatcher = "^[0-9]{2}\\s{0,1}[0-9]{10}$";
	IUserDetails user = new IUserDetails() {
		public boolean validate(String phone) throws InvalidUserException {
			boolean check;
			try {
				if(phone.length() == 0) {
					throw new InvalidUserException("Please enter valid mobile no with length>0");
				}
			check = Pattern.matches(mobileNoMatcher, phone);
		}
			catch(NullPointerException e) {
				throw new InvalidUserException("Please enter valid phone no");
			}
			return check;
		}
	};

	@Test
	public void givenInputAsMobileNo_WhenProper_ShouldReturntrue() {

		Mobileno mobileno = new Mobileno();
		boolean result;
		try {
			result = user.validate("91 6785946372");
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
			result = user.validate("91 678546372");
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
			result = user.validate(null);
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
			result = user.validate(" ");
		} catch (InvalidUserException e) {
			Assert.assertEquals("Please enter valid mobile no with length>0", e.getMessage());
			e.printStackTrace();
		}

	}
}
