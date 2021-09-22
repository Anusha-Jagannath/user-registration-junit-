package com.user1.user_registration_project;
/**
 * 
 * InvalidUserException is a custom exception to handle invalid moods
 *
 */
public class InvalidUserException extends Exception{

	public InvalidUserException(String message) {
		super(message);
	}
}
