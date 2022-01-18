package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

enum TemperatureVal {
	TEMPFORMULAVAR1(9f), TEMPFORMULAVAR2(5f), TEMPFORMULAVAR3(32);

	float value;

	private TemperatureVal(float value) {
		this.value = value;
	}
}

enum Location {
	LONDON("London"), CALIFORNIA("California"), CAPETOWN("Cape Town");

	String name;

	private Location(String name) {
		this.name = name;
	}
}

enum Temperature {
	HOT_THRESHOLD(30), COLD_THRESHOLD(10);

	int temp;

	private Temperature(int temp) {
		this.temp = temp;
	}
}

public class WeatherReporter {

	private String location;
	private double temperature;

	public WeatherReporter(String location, double temperature) {
		this.location = location;
		this.temperature = temperature;
	}

	public String print() {
		return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location,
				findLocation(), findTemperature(), calculateTemperature());
	}

	private double calculateTemperature() {
		return ((TemperatureVal.TEMPFORMULAVAR1.value / TemperatureVal.TEMPFORMULAVAR2.value) * temperature
				+ TemperatureVal.TEMPFORMULAVAR3.value);

	}

	private String findLocation() {
		if (location == Location.LONDON.name) {

			return "🌦";

		} else if (location == Location.CALIFORNIA.name) {

			return "🌅";

		} else if (location == Location.CAPETOWN.name) {

			return "🌤";

		}
		return "🔆";
	}

	private String findTemperature() {
		if (temperature > Temperature.HOT_THRESHOLD.temp) {

			return "It's too hot 🥵!";

		} else if (temperature < Temperature.COLD_THRESHOLD.temp) {

			return "It's too cold 🥶!";

		}
		return "Ahhh...it's just right 😊!";
	}

}
