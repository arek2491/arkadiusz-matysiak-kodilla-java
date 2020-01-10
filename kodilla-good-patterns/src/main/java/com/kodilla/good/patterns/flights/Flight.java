package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.Objects;

public class Flight {

    private String startCity;
    private String throughCity;
    private String landingCity;
    private LocalDateTime startTime;

    public Flight(String startCity, String throughCity, String landingCity, LocalDateTime startTime) {
        this.startCity = startCity;
        this.throughCity = throughCity;
        this.landingCity = landingCity;
        this.startTime = startTime;
    }

    public String getStartCity() {
        return startCity;
    }

    public String getThroughCity() {
        return throughCity;
    }

    public String getLandingCity() {
        return landingCity;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getStartCity().equals(flight.getStartCity()) &&
                getThroughCity().equals(flight.getThroughCity()) &&
                getLandingCity().equals(flight.getLandingCity()) &&
                getStartTime().equals(flight.getStartTime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStartCity(), getThroughCity(), getLandingCity(), getStartTime());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startCity='" + startCity + '\'' +
                ", throughCity='" + throughCity + '\'' +
                ", landingCity='" + landingCity + '\'' +
                ", startTime=" + startTime +
                '}';
    }
}
