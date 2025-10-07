public class PlaneModel {
    String maker;
    String model;
    int capacity;

    public PlaneModel(String maker, String model, int capacity) {
        this.maker = maker;
        this.model = model;
        this.capacity = capacity;
    }

    /**
     * Returns the plane model's code.
     * @return plane model's maker
     */
    public String getMaker() {
        return maker;
    }

    /**
     * Returns the plane model's model.
     * @return plane model's model
     */
    public String getModel() {
        return model;
    }

    /**
     * Returns the plane model's capacity.
     * @return plane model's capacity
     */
    public int getCapacity() {
        return capacity;
    }
}
