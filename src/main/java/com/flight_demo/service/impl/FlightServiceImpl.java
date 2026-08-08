package com.flight_demo.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flight_demo.dto.FlightResponse;
import com.flight_demo.model.Flight;
import com.flight_demo.model.FlightStatus;
import com.flight_demo.repository.MockFlightRepository;
import com.flight_demo.service.FlightService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FlightServiceImpl implements FlightService {

	@Autowired
	private MockFlightRepository repository;

	@Override
	public List<FlightResponse> getFlights(FlightStatus status, String destination) {

		Stream<Flight> stream = repository.findAll().stream();

		// Status Filter
		if (status != null) {
			stream = stream.filter(f -> f.getStatus() == status);
		}

		// Destination Filter
		if (destination != null && !destination.isBlank()) {

			String search = destination.toLowerCase();

			stream = stream.filter(f -> f.getDestination().toLowerCase().contains(search));
		}

		return stream.sorted(Comparator.comparing(Flight::getArrivalTime)).limit(20).map(this::convert).toList();
	}

	private FlightResponse convert(Flight flight) {

		return new FlightResponse(flight.getId(), flight.getOrigin(), flight.getDestination(), flight.getArrivalTime(),
				flight.getStatus());
	}
}