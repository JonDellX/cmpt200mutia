import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.ArrayList;

public class Problem3 {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("US230",
                new GregorianCalendar(2014, 4, 5, 5, 5, 0),
                new GregorianCalendar(2014, 4, 5, 6, 15, 0)));
        flights.add(new Flight("US235",
                new GregorianCalendar(2014, 4, 5, 6, 55, 0),
                new GregorianCalendar(2014, 4, 5, 7, 45, 0)));
        flights.add(new Flight("US237",
                new GregorianCalendar(2014, 4, 5, 9, 35, 0),
                new GregorianCalendar(2014, 4, 5, 12, 55, 0)));
        Itinerary itinerary = new Itinerary(flights);
        System.out.println(itinerary.getTotalTime());
        System.out.println(itinerary.getTotalFlightTime());

    }
}

class Flight {
    private String flightNo;
    private GregorianCalendar departureTime;
    private GregorianCalendar arrivalTime;

    public Flight(String flightNo, GregorianCalendar departureTime, GregorianCalendar arrivalTime) {
        this.flightNo = flightNo;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;

    }

    public String getFlightNo() {
        return flightNo;
    }

    public GregorianCalendar getDepartureTime() {
        return departureTime;
    }

    public GregorianCalendar getArrivalTime() {
        return arrivalTime;
    }

    public void setDepartureTime(GregorianCalendar changedDepartureTime) {
        this.departureTime = changedDepartureTime;
    }

    public void setArrivalTime(GregorianCalendar changedArrivalTime) {
        this.arrivalTime = changedArrivalTime;
    }

    public double getFlightTime() {
        return (arrivalTime.getTimeInMillis() - departureTime.getTimeInMillis()) / 60000; // There are 1000 milliseconds
                                                                                          // in a second and 60 seconds
                                                                                          // in a departureTimesListute.
    }
}

class Itinerary {
    ArrayList<Flight> flights;
    ArrayList<Double> arrivalTimesList = new ArrayList<>();
    ArrayList<Double> departureTimesList = new ArrayList<>();

    Itinerary(ArrayList flights) {
        this.flights = flights;

    }

    public double getTotalTime() {
        double totalTime= 0;
    
        
        for(int i = 0; i < flights.size(); i++) {
            Flight flightobj = flights.get(i);
            totalTime += (flightobj.getArrivalTime().getTimeInMillis()   / 60000) - (flightobj.getDepartureTime().getTimeInMillis() / 60000);
            
        }
        return totalTime;
    }

    public double getTotalFlightTime() {
        

        for (int i = 0; i < flights.size(); i++) {

            Flight flightobj = flights.get(i);
            arrivalTimesList.add((double) flightobj.getArrivalTime().getTimeInMillis());
            departureTimesList.add((double) flightobj.getDepartureTime().getTimeInMillis());

        }

        java.util.Collections.sort(arrivalTimesList);
        java.util.Collections.sort(departureTimesList);

        return (arrivalTimesList.get(arrivalTimesList.size() - 1) - departureTimesList.get(0)) / 60000;
    }

}
