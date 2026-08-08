package com.flight_demo.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class Flight {

	private String id;

	private String origin;

	private String destination;

	/**
	 * Minutes until arrival.
	 */
	private Integer arrivalTime;

	private FlightStatus status;

	public Flight(String id, String origin, String destination, Integer arrivalTime, FlightStatus status) {
		super();
		this.id = id;
		this.origin = origin;
		this.destination = destination;
		this.arrivalTime = arrivalTime;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Integer getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Integer arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public FlightStatus getStatus() {
		return status;
	}

	public void setStatus(FlightStatus status) {
		this.status = status;
	}
	
	
	

}