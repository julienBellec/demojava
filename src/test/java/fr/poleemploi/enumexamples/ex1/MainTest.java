package fr.poleemploi.enumexamples.ex1;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		
		Main main = new Main();
		
		Assert.assertFalse("MONDAY is not week-end", main.isWeekEnd(Days.MONDAY));
		Assert.assertFalse("THUESDAY is not week-end", main.isWeekEnd(Days.THUESDAY));
		Assert.assertFalse("WEDNESDAY is not week-end", main.isWeekEnd(Days.WEDNESDAY));
		Assert.assertFalse("THURSDAY is not week-end", main.isWeekEnd(Days.THURSDAY));
		Assert.assertFalse("FRIDAY is not week-end", main.isWeekEnd(Days.FRIDAY));
		Assert.assertTrue("SUNDAY is week-end", main.isWeekEnd(Days.SUNDAY));
		Assert.assertTrue("SATURDAY is week-end", main.isWeekEnd(Days.SATURDAY));
	}

}
