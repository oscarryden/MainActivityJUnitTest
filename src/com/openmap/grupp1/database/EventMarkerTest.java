package com.openmap.grupp1.database;

import java.util.ArrayList;
import org.apache.http.NameValuePair;
import org.junit.*;
import static org.junit.Assert.*;
import com.google.android.gms.maps.model.LatLng;

/**
 * This class contains tests for the class EventMarker.
 * @author Oscar Rydén
 */
public class EventMarkerTest {
	private EventMarker em;
	private final String title = "Bob Saget";
	private final String description = "Cool man";
	private LatLng latlng = new LatLng(2.0, 3.0);
	private double lat = 2.0;
	private double lng = 3.0;
	private String defStartDate = "2013-05-30";
	private String defEndDate = "2013-06-02";
	private String defStartTime = "11.00";
	private String defEndTime = "14.00";
	private String[] defTags = {"hej", "då"};
	
	@Before
	public void setUp()
		throws Exception {
		em = new EventMarker(title, lat, lng, description, defTags, defStartDate, defEndDate, defStartTime, defEndTime);
	}
	
	/**
	 * Run the String setStartDay() getStartDay() method test.
	 */
	@Test
	public void testSetGetStartDay()
		throws Exception {
		em.setStartDay("2010-02-15");

		String result = em.getStartDay();

		// assert that we've set a new start date and can get it
		assertEquals("2010-02-15", result);
	}

	/**
	 * Run the setStartTime() and getStartTime() method test.
	 */
	@Test
	public void testSetGetStartTime()
		throws Exception {
		em.setStartTime("09.55");
		String result = em.getStartTime();

		// assert that we've set a new start time and can get it
		assertEquals("09.55", result);
	}

	/**
	 * Run the setStopDay() and getStopDay() method test.
	 */
	@Test
	public void testSetGetStopDay()
		throws Exception {
		em.setStopDay("2014-12-22");

		String result = em.getStopDay();

		//assert that we can set a new stop day and get it
		assertEquals("2014-12-22", result);
	}

	/**
	 * Run the setStopTime() and getStopTime() method test.
	 */
	@Test
	public void testSetGetStopTime()
		throws Exception {
		em.setStopTime("08.00");
		
		String result = em.getStopTime();

		// assert that we can set a new stop time and get it
		assertEquals("08.00", result);
	}

	

	/**
	 * Launch the test.
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(EventMarkerTest.class);
	}
}