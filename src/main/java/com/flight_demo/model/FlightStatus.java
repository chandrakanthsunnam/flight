package com.flight_demo.model;

public enum FlightStatus {

    ON_TIME("on-time"),
    DELAYED("delayed"),
    CANCELLED("cancelled");

    private final String value;

    FlightStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static FlightStatus fromValue(String value) {

        for (FlightStatus status : values()) {
            if (status.value.equalsIgnoreCase(value)) {
                return status;
            }
        }

        throw new IllegalArgumentException("Unknown status : " + value);
    }

}