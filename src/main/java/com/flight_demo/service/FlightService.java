package com.flight_demo.service;

import java.util.List;

import com.flight_demo.dto.FlightResponse;
import com.flight_demo.model.FlightStatus;

public interface FlightService {

    List<FlightResponse> getFlights(
            FlightStatus status,
            String destination
    );

}