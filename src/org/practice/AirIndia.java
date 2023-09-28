package org.practice;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirIndia implements FlightInterface{
    @Override
    public List<FlightData> getAllFlightFromSrcToDest(String src, String dest) {
       List<FlightData>list = new ArrayList<>();

       FlightData flightData1 = new FlightData("delhi","jaipur",new Date(),1.5,1400,"AirLine");
       FlightData flightData2 = new FlightData("delhi","jaipur",new Date(),3.5,1000,"AirLine");
       FlightData flightData3 = new FlightData("delhi","jaipur",new Date(),1.5,1100,"AirLine");


       list.add(flightData1);
       list.add(flightData2);
       list.add(flightData3);
       return list;
    }
}
