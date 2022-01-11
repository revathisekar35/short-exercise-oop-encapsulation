package com.techreturners.encapsulation.bankaccount.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeatherReportTest {

	@Test
	public void checkPrint() {

		WeatherReporter weatherReporter1 = new WeatherReporter("Manchester", 2);
		assertEquals("I am in Manchester and it is 🔆. It's too cold 🥶!. The temperature in Fahrenheit is 35.6.",
				weatherReporter1.print());
		WeatherReporter weatherReporter2 = new WeatherReporter("California", 35);
		assertEquals("I am in California and it is 🌅. It's too hot 🥵!. The temperature in Fahrenheit is 95.",
				weatherReporter2.print());
		WeatherReporter weatherReporter3 = new WeatherReporter("London", 20);
		assertEquals("I am in London and it is 🌦. Ahhh...it's just right 😊!. The temperature in Fahrenheit is 68.",
				weatherReporter3.print());
	}

}
