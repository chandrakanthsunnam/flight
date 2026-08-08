package com.flight_demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.flight_demo.model.Flight;
import com.flight_demo.util.MockFlightGenerator;

@Repository
public class MockFlightRepository {

    public List<Flight> findAll() {
        return MockFlightGenerator.generateFlights();
    }

}