package com.flight_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flight_demo.dto.FlightResponse;
import com.flight_demo.model.FlightStatus;
import com.flight_demo.service.FlightService;

@RestController
@RequestMapping("/api/flights")
@CrossOrigin
public class FlightController {

	@Autowired
	private FlightService service;

	@GetMapping
	public List<FlightResponse> getFlights(@RequestParam(required = false) FlightStatus status,
			@RequestParam(required = false) String destination) {

		return service.getFlights(status, destination);
	}

}