package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;
import static org.junit.jupiter.api.Assertions.*;

class TestCalendar {

	GregorianCalendar greg = new GregorianCalendar();
	
	
	
	
	@ParameterizedTest
	@ValueSource(ints = {1825, 1910, 1955, 2002, 2021})
	public void Should_check_if_year_is_leap_also_in_gregorian(int year) {
		Calender calender = new Calender(year);			//muss hier sein damit year aktualisiert wird
		
		boolean actualResult = greg.isLeapYear(year);		
		boolean expectedResult = calender.isLeapYear();
		
		assertEquals(actualResult, expectedResult);
	}

// Implement test cases for the equivalent partitions 

}
