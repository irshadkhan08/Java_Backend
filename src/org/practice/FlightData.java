package org.practice;

import java.util.Date;

public class FlightData {
    private String src;
    private String dest;
    private Date flightOfDate;
    private Double durationOfFlight;
    private int cost;
    private String FlightName;

    public FlightData(String src, String dest, Date flightOfDate, Double durationOfFlight, int cost, String flightName) {
        this.src = src;
        this.dest = dest;
        this.flightOfDate = flightOfDate;
        this.durationOfFlight = durationOfFlight;
        this.cost = cost;
        FlightName = flightName;
    }

    public String getSrc() {
        return src;
    }
    public void setSrc(String src) {
        this.src = src;
    }
    public String getDest() {
        return dest;
    }
    public void setDest(String dest) {
        this.dest = dest;
    }
    public Date getFlightOfDate() {
        return flightOfDate;
    }
    public void setFlightOfDate(Date flightOfDate) {
        this.flightOfDate = flightOfDate;
    }
    public Double getDurationOfFlight() {
        return durationOfFlight;
    }
    public void setDurationOfFlight(Double durationOfFlight) {
        this.durationOfFlight = durationOfFlight;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public String getFlightName() {
        return FlightName;
    }
    public void setFlightName(String flightName) {
        FlightName = flightName;
    }

}
