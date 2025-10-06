import java.sql.Time;
import java.util.*;

/**
 * Engenharia de Software 2025/2026 - Trabalho no4
 * Guilherme Maurício 62746
 * Tiago Ferro 66191
 * Tomás Silva 69720
 */


public class IndirectFlight extends Flight {

    // List<Airport> transitAirports = new ArrayList<>();
    List<Boolean>  boardingPassengers = new ArrayList<>();
    List<Integer> levies  = new ArrayList<>();

    public IndirectFlight(String flightNumber, String destination, Time departureTime, int flightCost, int baseRate, List<Boolean> boardingPassengers, List<Integer> levies) {
        super(flightNumber, destination, departureTime, flightCost, baseRate);
        this.boardingPassengers = boardingPassengers;
        this.levies = levies;

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
    public List<Integer> getLevies() {
        return levies;
    }

}
