import java.util.ArrayList;

public class Place {

    private ArrayList<Place> accessiblePlaces;
    private ArrayList<Object> inspectable;
    private Logger logger;

    public ArrayList<Place> getAccessiblePlaces() {
        return accessiblePlaces;
    }

    public void setAccessiblePlaces(ArrayList<Place> accessiblePlaces) {
        this.accessiblePlaces = accessiblePlaces;
    }

    public ArrayList<Object> getInspectable() {
        return inspectable;
    }

    public void setInspectable(ArrayList<Object> inspectable) {
        this.inspectable = inspectable;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    // TODO: 5/5/2017 - ye karish bokonim ya khube?
}