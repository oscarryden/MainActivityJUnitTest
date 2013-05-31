package com.openmap.grupp1.database;

import java.util.ArrayList;
import org.junit.*;

import static org.junit.Assert.*;

/**
 * This class contains tests for the class RequestTagDbTask.
 * @author Oscar Rydén
 */
public class RequestTagDbTaskTest {
	
	/**
	 * Run the ArrayList<String> requestTagArray() method test.
	 *
	 * @throws Exception
	 */
	@Test(expected = java.lang.RuntimeException.class)
	public void testRequestTagArray_1()
		throws Exception {
		RequestTagDbTask fixture = new RequestTagDbTask();

		ArrayList<String> result = fixture.requestTagArray();

		// Assert that the requestTagArray method returns a resu
		assertNotNull(result);
	}


	/**
	 * Launch the test.
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(RequestTagDbTaskTest.class);
	}
}