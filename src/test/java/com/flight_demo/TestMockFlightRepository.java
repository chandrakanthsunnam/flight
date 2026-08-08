package com.flight_demo;

import java.util.List;


import com.flight_demo.model.Flight;
import org.springframework.stereotype.Repository;


@Repository
public class TestMockFlightRepository {

    public List<Flight> findAll() {
        return TestMockFlightGenerator.generateFlights();
    }

}