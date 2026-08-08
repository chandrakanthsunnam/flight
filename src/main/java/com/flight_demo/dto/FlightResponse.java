package com.flight_demo.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.flight_demo.model.FlightStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
//@AllArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class FlightResponse {

    private String id;

    private String origin;

    private String destination;

    private Integer arrivalTime;

    private FlightStatus status;

	public FlightResponse(String id, String origin, String destination, Integer arrivalTime, FlightStatus status) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.status = status;
	}
    
    

}