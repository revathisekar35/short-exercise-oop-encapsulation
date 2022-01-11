package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

	private String location;
	private double temperature;
	private final float TEMPFORMULAVAR1 = 9f;
	private final float TEMPFORMULAVAR2 = 5f;
	private final int TEMPFORMULAVAR3 = 32;
	private final String LONDON = "London";
	private final String CALIFORNIA = "California";
	private final String CAPE_TOWN = "Cape Town";
	private final int TEMP30 = 30;
	private final int TEMP10 = 10;

	public WeatherReporter(String location, double temperature) {
		this.location = location;
		this.temperature = temperature;
	}

	public String print() {
		return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location,
				findLocation(), findTemperature(), calculateTemperature());
	}

	private double calculateTemperature() {
		return ((TEMPFORMULAVAR1 / TEMPFORMULAVAR2) * temperature + TEMPFORMULAVAR3);

	}

	private String findLocation() {
		if (location == LONDON) {

			return "🌦";

		} else if (location == CALIFORNIA) {

			return "🌅";

		} else if (location == CAPE_TOWN) {

			return "🌤";

		}
		return "🔆";
	}

	private String findTemperature() {
		if (temperature > TEMP30) {

			return "It's too hot 🥵!";

		} else if (temperature < TEMP10) {

			return "It's too cold 🥶!";

		}
		return "Ahhh...it's just right 😊!";
	}

}
