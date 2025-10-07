import java.util.Collection;
import java.util.ArrayList;

public class Airline {
    String code;
    String name;
    float profitRate;
    Collection<Flight> flights;

    public Airline(String code, String name, float profitRate) {
        this.code = code;
        this.name = name;
        this.profitRate = profitRate;
        flights = new ArrayList<>();
    }

    /**
     * Returns the airline's code.
     * @return airline's code
     */
    public String getCode() {
        return code;
    }

    /**
     * Returns the airline's name.
     * @return airline's name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the airline's profit rate.
     * @return airline's profit rate
     */
    public float getProfitRate() {
        return profitRate;
    }

    /**
     * Returns the airline's flights.
     * @return airline's flights
     */
    public Collection<Flight> getFlights() {
        return flights;
    }

}
