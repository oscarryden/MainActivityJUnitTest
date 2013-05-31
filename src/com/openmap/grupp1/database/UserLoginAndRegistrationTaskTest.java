package com.openmap.grupp1.database;

import java.util.Arrays;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class contains tests for the class UserLoginAndRegistrationTask.
 * @author Oscar Rydén
 */
public class UserLoginAndRegistrationTaskTest {
	
	/**
	 * Run the boolean postMysql() method test.
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testPostMysql_1()
		throws Exception {
		UserLoginAndRegistrationTask userlogin = new UserLoginAndRegistrationTask("", "");
		boolean result = userlogin.postMysql();

		// assert that the method postMysql() returns true
		assertTrue(result);
	}

	/**
	 * Launch the test.
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(UserLoginAndRegistrationTaskTest.class);
	}
}