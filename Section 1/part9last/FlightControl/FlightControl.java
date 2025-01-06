package FlightControl;

import java.util.Collection;
import java.util.HashMap;

import FlightControl.logic.Airplane;
import FlightControl.logic.Flight;
import FlightControl.logic.Place;

public class FlightControl {
    private HashMap<String, Place> places;
    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;

    public FlightControl() {
        this.places = new HashMap<>();
        this.airplanes = new HashMap<String, Airplane>();
        this.flights = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Airplane newAirplane = new Airplane(ID, capacity);
        this.airplanes.putIfAbsent(ID, newAirplane);
    }

    public void addFlight(Airplane airplane, String departureID, String destinationID) {
        places.putIfAbsent(destinationID, new Place(destinationID));
        places.putIfAbsent(departureID, new Place(departureID));
        Flight newFlight = new Flight(airplane, places.get(departureID), places.get(destinationID));
        this.flights.put(newFlight.toString(), newFlight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}
