package com.flight_demo.util;

import java.util.List;

import org.springframework.stereotype.Component;

import com.flight_demo.model.Flight;
import com.flight_demo.model.FlightStatus;

@Component
public final class MockFlightGenerator {

	private MockFlightGenerator() {
	}

	public static List<Flight> generateFlights() {

		return List.of(
				new Flight("1", "New York JFK", "Los Angeles", 25, FlightStatus.ON_TIME),
				new Flight("2", "Atlanta", "Chicago O'Hare", 40, FlightStatus.DELAYED),
				new Flight("3", "San Francisco", "Dallas/Fort Worth", 15, FlightStatus.ON_TIME),
				new Flight("4", "Las Vegas", "Phoenix", 55, FlightStatus.CANCELLED),
				new Flight("5", "London Heathrow", "Boston", 70, FlightStatus.ON_TIME),
				new Flight("6", "Frankfurt", "Miami", 35, FlightStatus.DELAYED),
				new Flight("7", "Chicago O'Hare", "Seattle", 90, FlightStatus.ON_TIME),
				new Flight("8", "Minneapolis", "Detroit", 10, FlightStatus.ON_TIME),
				new Flight("9", "New York Newark", "Denver", 48, FlightStatus.CANCELLED),
				new Flight("10", "Dallas/Fort Worth", "Phoenix", 62, FlightStatus.ON_TIME),
				new Flight("11", "Houston", "Las Vegas", 30, FlightStatus.DELAYED),
				new Flight("12", "Los Angeles", "San Francisco", 5, FlightStatus.ON_TIME)

		);

	}

}