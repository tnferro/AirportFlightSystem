import java.sql.Time;

/**
 * Engenharia de Software 2025/2026 - Trabalho no4
 * Guilherme Maurício 62746
 * Tiago Ferro 66191
 * Tomás Silva 69720
 */

public abstract class Flight {


    String flightNumber;
    String destination;
    Time departureTime;
    String departureGate;
    int flightCost;
    int baseRate;
    Plane plane;
    Airline airline;

    public Flight(String flightNumber, String destination, Time departureTime, int baseRate, Plane plane, Airline airline) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.baseRate = baseRate;
        this.plane = plane;
        this.airline = airline;

        this.flightCost = (int)(plane.getModel().getCapacity() * this.baseRate * (airline.getProfitRate() + 1.0));
    }

    /**
     * Returns the plane's flight number
     * @return flight number
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Returns the plane's destination
     * @return plane's destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Returns plane's departure time.
     * @return plane's departure time
     */
    public Time getDepartureTime() {
        return departureTime;
    }

    /**
     * Returns plane's flight cost.
     * @return plane's flight cost
     */
    public int getFlightCost() {
        return flightCost;
    }

    /**
     * Returns plane's base rate.
     * @return plane's base rate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * Returns the plane.
     * @return plane
     */
    public Plane getPlane() {
        return plane;
    }

    /**
     * Returns the airline.
     * @return airline
     */
    public Airline getAirline() {
        return airline;
    }

}
