package com.flight_demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.web.client.RestTemplate;

import com.flight_demo.dto.FlightResponse;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ComponentScan
class FlightStatusDemoApplicationTests {
	
	@LocalServerPort
	private int port;

	private String baseUrl = "http://localhost";

	@Autowired
	private static RestTemplate restTemplate;
	
	@BeforeAll
	public static void init() {
		restTemplate = new RestTemplate();
	}
	
	@BeforeEach
	public void createUri() {
		baseUrl = baseUrl.concat(":").concat(String.valueOf(port).concat("/api/flights"));
	}
	
	@Autowired
	private TestMockFlightRepository testMockFlightRepository;
	
	@Test
	public void getFlights() {
		List<FlightResponse> response = restTemplate.getForObject(baseUrl, List.class);
		
		assertEquals(12, response.size());
		assertNotEquals(11, testMockFlightRepository.findAll().size());

	}
	
}
