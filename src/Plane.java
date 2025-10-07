public class Plane {
    String tailModel;
    PlaneModel model;

    public Plane(String tailModel, PlaneModel model) {
        this.tailModel = tailModel;
        this.model = model;
    }

    /**
     * Returns the plane's tail model.
     * @return plane's tail model
     */
    public String getTailModel() {
        return tailModel;
    }

    /**
     * Returns the plane's model.
     * @return plane's model
     */
    public PlaneModel getModel() {
        return model;
    }
}
