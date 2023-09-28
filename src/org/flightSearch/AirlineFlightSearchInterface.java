package org.flightSearch;

import java.util.List;

public interface AirlineFlightSearchInterface {
    public List<FlightData> getAllFlightFromSrcToDest(String src, String dest);
}
