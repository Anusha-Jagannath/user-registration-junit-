package com.user1.user_registration_project;

import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import junit.framework.Assert;

@RunWith(Parameterized.class)
public class EmailTest {

	private String emailId;
	private boolean result;
	private Email email;
	String emailMatcher = "^[0-9a-zA-Z]+([.-_+][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2})*$";

	public EmailTest(String emailId, boolean result) {
		super();
		this.emailId = emailId;
		this.result = result;
	}

	@Before
	public void initialize() {
		email = new Email();
	}

	IUserDetails user = new IUserDetails() {
		public boolean validate(String emailId) throws InvalidUserException {
			try {
			if(emailId.length() == 0) {
				throw new InvalidUserException("Please enter valid email");
			}
			return Pattern.matches(emailMatcher, emailId);
			}
			catch(NullPointerException e) {
				throw new InvalidUserException("Please enter valid email");
			}
		}
	};
	
	@Parameterized.Parameters
	public static Collection input() {

		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc..2002@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@abc@gmail.com", false },
				{ "abc@gmail.com.1a", false }, { "abc@gmail.com.aa.au", false } ,{" ","Please enter valid email"},{null,"Please enter valid email"}});
	}

	@Test
	public void testEmail() {
		boolean obtainedResult;
		try {
			obtainedResult = user.validate(this.emailId);
			Assert.assertEquals(this.result, obtainedResult);
		} catch (InvalidUserException e) {
			Assert.assertEquals(this.result, e.getMessage());
			e.printStackTrace();
		}
		
		
	}

}
