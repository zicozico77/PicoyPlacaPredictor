package test;


import org.junit.Test;

import org.junit.Assert;
import predictor.*;

public class TimeTest {

	@Test(expected = InvalidTimeException.class)
	public void testExceptionHourHigh() {
		Time currentTime = new Time(24, 11, 01);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionHourLow() {
		Time currentTime = new Time(-1, 11, 01);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionMinuteHigh() {
		Time currentTime = new Time(12, 61, 01);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionMinuteLow() {
		Time currentTime = new Time(12, -1, 01);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionSecondHigh() {
		Time currentTime = new Time(12, 11, 61);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionSecondLow() {
		Time currentTime = new Time(12, 12, -1);
	}
	
	@Test(expected = InvalidTimeException.class)
	public void testExceptionAllWrong() {
		Time currentTime = new Time(24, -1, 61);
	}
	
	@Test
	public void testGetHours() {
		Time currentTime = new Time(12, 11, 10);
		int hoursToCheck = currentTime.getHours();
		Assert.assertEquals("hours match", hoursToCheck, 12);
	}
	
	@Test
	public void testSetHours() {
		Time currentTime = new Time(12, 11, 10);
		currentTime.setHours(15);
		int hoursToCheck = currentTime.getHours();
		Assert.assertEquals("times match", hoursToCheck, 15);
	}
	
	@Test
	public void testGetMinutes() {
		Time currentTime = new Time(12, 11, 10);
		int minutesToCheck = currentTime.getMinutes();
		Assert.assertEquals("minutes match", minutesToCheck, 11);
	}
	
	@Test
	public void testSetMinutes() {
		Time currentTime = new Time(12, 11, 10);
		currentTime.setMinutes(30);
		int minutesToCheck = currentTime.getMinutes();
		Assert.assertEquals("minutes match", minutesToCheck, 30);
	}
	
	@Test
	public void testGetSeconds() {
		Time currentTime = new Time(12, 11, 10);
		int secondsToCheck = currentTime.getSeconds();
		Assert.assertEquals("seconds match", secondsToCheck, 10);
	}
	
	@Test
	public void testSetSeconds() {
		Time currentTime = new Time(12, 11, 10);
		currentTime.setSeconds(30);
		int secondsToCheck = currentTime.getSeconds();
		Assert.assertEquals("seconds match", secondsToCheck, 30);
	}
}
