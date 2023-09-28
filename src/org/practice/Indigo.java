package org.practice;

import org.flightSearch.AirlineFlightSearchInterface;
import org.flightSearch.FlightData;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Indigo implements AirlineFlightSearchInterface {
    @Override
    public List<FlightData> getAllFlightFromSrcToDest(String src, String dest) {

        List<FlightData>list = new ArrayList<>();

        FlightData flightData1 = new FlightData("punjab","haryana",new Date(),4.5,2000,"Indigo");
        FlightData flightData2 = new FlightData("punjab","haryana",new Date(),3.5,2500,"Indigo");
        FlightData flightData3 = new FlightData("punjab","haryana",new Date(),4.0,2200,"Indigo");

        list.add(flightData1);
        list.add(flightData2);
        list.add(flightData3);
        return list;
    }
}
