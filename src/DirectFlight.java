import java.sql.Time;

/**
 * Engenharia de Software 2025/2026 - Trabalho no4
 * Guilherme Maurício 62746
 * Tiago Ferro 66191
 * Tomás Silva 69720
 */

public class DirectFlight extends Flight {
    public DirectFlight(String flightNumber, String destination, Time departureTime, int flightCost, int baseRate) {
        super(flightNumber, destination, departureTime, flightCost, baseRate);
    }
}
