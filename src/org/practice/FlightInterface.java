package org.practice;

import java.util.List;

public interface FlightInterface {
   List<FlightData> getAllFlightFromSrcToDest(String src,String dest);
}
