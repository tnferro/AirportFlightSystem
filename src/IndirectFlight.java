import java.sql.Time;
import java.util.*;

/**
 * Engenharia de Software 2025/2026 - Trabalho no4
 * Guilherme Maurício 62746
 * Tiago Ferro 66191
 * Tomás Silva 69720
 */


public class IndirectFlight extends Flight {

    List<Airport> transitAirports = new ArrayList<>();
    List<Boolean>  boardingPassengers = new ArrayList<>();
    List<Integer> levies  = new ArrayList<>();

    public IndirectFlight(String flightNumber, String destination, Time departureTime, int baseRate, Plane plane, Airline airline, List<Boolean> boardingPassengers, List<Integer> levies, List<Airport> transitAirports) {
        super(flightNumber, destination, departureTime, baseRate, plane, airline);
        this.boardingPassengers = boardingPassengers;
        this.levies = levies;
        this.transitAirports = transitAirports;

        int sumLevies = 0;
        Iterator<Integer> leviesIt = levies.iterator();
        while(leviesIt.hasNext()) {
            int levy = leviesIt.next();
            sumLevies += levy;
        }

        this.flightCost += sumLevies;
    }

    /**
     * Returns boarding passengers.
     * @return boarding passengers
     */
    public List<Boolean> getBoardingPassengers() {
        return boardingPassengers;
    }

    /**
     * Adds a boarding passenger to the list.
     * @param passenger new passenger
     */
    public void addBoardingPassenger(Boolean passenger) {
        boardingPassengers.add(passenger);
    }

    /**
     * Returns a flight's levies.
     * @return flight's levies
     */
    public Iterator<Integer> getLevies() {
        return levies.iterator();
    }

    public Iterator<Airport> getTransitAirports() {
        return transitAirports.iterator();
    }

}
