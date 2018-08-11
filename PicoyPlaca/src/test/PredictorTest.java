package test;


import org.junit.Test;

import org.junit.Assert;
import predictor.*;


public class PredictorTest {

	@Test
	public void testInitialState(){
		Predictor checker = new Predictor();
		Assert.assertNotNull(checker);
	}
	
	@Test(expected = InvalidDateException.class)
	public void testInvalidDate() {
		Predictor checker = new Predictor();
		Time time = new Time(11,11,11);
		checker.check(11111, "11 of January of 2018", time);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidLongPlate() {
		Predictor checker = new Predictor();
		Time time = new Time(11,11,11);
		checker.check(111111, "Monday, 11 of January of 2018", time);
	}
	
	@Test(expected = RuntimeException.class)
	public void testInvalidShortPlate() {
		Predictor checker = new Predictor();
		Time time = new Time(11,11,11);
		checker.check(11, "Monday, 11 of January of 2018", time);
	}
	
	@Test
	public void testCheckPassesByDate() {
		Predictor checker = new Predictor();
		Time time = new Time(11,11,11);
		Boolean result = checker.check(1111, "Saturday, 18 of January of 2018", time);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCheckPassesByTime() {
		Predictor checker = new Predictor();
		Time time = new Time(11,11,11);
		Boolean result = checker.check(1111, "Monday, 18 of January of 2018", time);
		Assert.assertTrue(result);
	}
	
	@Test
	public void testCheckFailsEarlyTime() {
		Predictor checker = new Predictor();
		Time time = new Time(8,11,11);
		Boolean result = checker.check(1111, "Monday, 18 of January of 2018", time);
		Assert.assertFalse(result);
	}
	
	@Test
	public void testCheckFailsLateTime() {
		Predictor checker = new Predictor();
		Time time = new Time(17,11,11);
		Boolean result = checker.check(1111, "Monday, 18 of January of 2018", time);
		Assert.assertFalse(result);
	}
}
