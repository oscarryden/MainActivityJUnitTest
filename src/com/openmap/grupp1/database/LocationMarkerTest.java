package com.openmap.grupp1.database;

import java.util.ArrayList;
import java.util.Arrays;

import org.apache.http.NameValuePair;
import org.junit.*;
import static org.junit.Assert.*;
import android.util.Log;
import org.apache.http.message.BasicNameValuePair;
import com.google.android.gms.maps.model.LatLng;

/**
 * This class contains tests for the class LocationMarker
 * @author Oscar Rydén
 */
public class LocationMarkerTest {
	
	/**
	 * Run the LocationMarker() constructor test.
	 */
	@Test
	public void testLocationMarker_1()
		throws Exception {

		LocationMarker result = new LocationMarker();
		//assert that the empty constructor returns the expected values
		assertNotNull(result);
		assertEquals("No description", result.getDescription());
		assertEquals(null, result.getTitle());
		assertEquals(0.0, result.getLatitute(), 0.01);
		assertEquals(0.0, result.getLongitude(), 0.01);
		assertEquals(null, result.getLatLng());
	}

	/**
	 * Run the LocationMarker(String,LatLng,String[]) constructor test.
	 */
	@Test
	public void testLocationMarker_2()
		throws Exception {
		String title = "Bob Saget";
		LatLng loc = new LatLng(1.0, 1.0);
		String[] tags = new String[] {"Full House"};

		LocationMarker result = new LocationMarker(title, loc, tags);

		// assert that the second constructor returns the values we've put in
		assertNotNull(result);
		assertEquals("No description", result.getDescription());
		assertEquals("Bob Saget", result.getTitle());
		assertEquals(1.0, result.getLatitute(), 0.01);
		assertEquals(1.0, result.getLongitude(), 0.01);
		assertTrue("Should be true", Arrays.asList(result.getTags()).contains("Full House"));
	}

	/**
	 * Run the LocationMarker(String,double,double,String[]) constructor test.
	 */
	@Test
	public void testLocationMarker_3()
		throws Exception {
		String title = "Bob Saget";
		double lat = 1.0;
		double lng = 1.0;
		String[] tags = new String[] {"HIMYM"};

		LocationMarker result = new LocationMarker(title, lat, lng, tags);

		// assert that the third constructor returns the values we've put in
		assertNotNull(result);
		assertEquals("No description", result.getDescription());
		assertEquals("Bob Saget", result.getTitle());
		assertEquals(1.0, result.getLatitute(), 0.1);
		assertEquals(1.0, result.getLongitude(), 0.1);
		assertTrue("Should be true", Arrays.asList(result.getTags()).contains("HIMYM"));
	}

	/**
	 * Run the LocationMarker(String,LatLng,String,String[]) constructor test.
	 */
	@Test
	public void testLocationMarker_4()
		throws Exception {
		String title = "Bob Saget";
		LatLng loc = new LatLng(1.0, 1.0);
		String desc = "Bob Saget is here";
		String[] tags = new String[] {"HIMYM"};

		LocationMarker result = new LocationMarker(title, loc, desc, tags);

		// assert that the fourth constructor returns the values we've put in
		assertNotNull(result);
		assertEquals("Bob Saget is here", result.getDescription());
		assertEquals("Bob Saget", result.getTitle());
		assertEquals(1.0, result.getLatitute(), 0.1);
		assertEquals(1.0, result.getLongitude(), 0.1);
		assertTrue("Should be true", Arrays.asList(result.getTags()).contains("HIMYM"));
	}

	/**
	 * Run the LocationMarker(String,double,double,String,String[]) constructor test.
	 */
	@Test
	public void testLocationMarker_5()
		throws Exception {
		String title = "Bob Saget";
		double lat = 1.0;
		double lng = 1.0;
		String desc = "Bob Saget is here";
		String[] tags = new String[] {"HIMYM"};

		LocationMarker result = new LocationMarker(title, lat, lng, desc, tags);

		// assert that the fifth constructor returns the values we've put in
		assertNotNull(result);
		assertEquals("Bob Saget is here", result.getDescription());
		assertEquals("Bob Saget", result.getTitle());
		assertEquals(1.0, result.getLatitute(), 0.1);
		assertEquals(1.0, result.getLongitude(), 0.1);
		assertTrue("Should be true", Arrays.asList(result.getTags()).contains("HIMYM"));
	}

	/**
	 * Run setDescription and getDescription() method test.
	 */
	@Test
	public void testSetGetDescription()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 1.0, 1.0, "", new String[] {});
		lm.setDescription("Nice description");
		String result = lm.getDescription();

		// assert that we've set a description and can get it
		assertEquals("Nice description", result);
	}

	/**
	 * Run the setLatLng() and getLatLng() method test.
	 */
	@Test
	public void testSetGetLatLng()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 1.0, 1.0, "", new String[] {});
		lm.setLatLng(new LatLng(3.0, 4.0));
		LatLng result = lm.getLatLng();

		// assert that we've set the correct LatLng and can get it
		assertNotNull(result);
		assertEquals("lat/lng: (3.0,4.0)", result.toString());
	}

	/**
	 * Run the setLatitude() and getLatitute() method test.
	 */
	@Test
	public void testSetGetLatitute()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 1.0, 1.0, "", new String[] {});
		lm.setLatitude(20.0);
		double result = lm.getLatitute();

		// assert that we've set the latitude and can get it
		assertEquals(20.0, result, 0.1);
	}

	/**
	 * Run the setLongitude() and getLongitude() method test.
	 */
	@Test
	public void testSetGetLongitude()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 0, 0, "", new String[] {});
		lm.setLongitude(20.0);
		double result = lm.getLongitude();

		// assert that we've set the longitude and can get it
		assertEquals(20.0, result, 0.1);
	}

	
	/**
	 * Run setTags() and getTags() method test.
	 */
	@Test
	public void testSetGetTags()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 1.0, 1.0, "", new String[] {});
		String[] tags = {"HIMYM", "Celebrity"};
		lm.setTags(tags);
		String[] result = lm.getTags();

		// assert that we've set the tags and can get them
		assertNotNull(result);
		assertTrue("Should be true", Arrays.asList(result).contains("HIMYM"));
		assertTrue("Should be true", Arrays.asList(result).contains("Celebrity"));
	}

	/**
	 * Run the setTitle() and getTitle() method test.
	 */
	@Test
	public void testSetGetTitle()
		throws Exception {
		LocationMarker lm = new LocationMarker("", 1.0, 1.0, "", new String[] {});
		lm.setTitle("Bob Saget");
		String result = lm.getTitle();

		// assert that we've set the title and can get it
		assertEquals("Bob Saget", result);
	}

	/**
	 * Launch the test.
	 *
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(LocationMarkerTest.class);
	}
}