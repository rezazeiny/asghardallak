
import java.util.ArrayList;
import java.util.HashMap;

public class Cave extends Place {

    private ArrayList<Mineral> mineral;
    private HashMap<String, Double> probability;

    public ArrayList<Mineral> getMineral() {
        return mineral;
    }

    public void setMineral(ArrayList<Mineral> mineral) {
        this.mineral = mineral;
    }

    public HashMap<String, Double> getProbability() {
        return probability;
    }

    public void setProbability(HashMap<String, Double> probability) {
        this.probability = probability;
    }

    // TODO: 5/5/2017 - constructor
}