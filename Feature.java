import java.util.ArrayList;

public class Feature {

    private int refillRate;
    private int consumptionRate;
    private int max;
    private int current;
    private String name;
    private ArrayList<Task> task;
    private Logger logger;

    public int getRefillRate() {
        return refillRate;
    }

    public void setRefillRate(int refillRate) {
        this.refillRate = refillRate;
    }

    public int getConsumptionRate() {
        return consumptionRate;
    }

    public void setConsumptionRate(int consumptionRate) {
        this.consumptionRate = consumptionRate;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Task> getTask() {
        return task;
    }

    public void setTask(ArrayList<Task> task) {
        this.task = task;
    }

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public Feature(int refillRate, int consumptionRate, int max, int current, String name, ArrayList<Task> task) {
        this.refillRate = refillRate;
        this.consumptionRate = consumptionRate;
        this.max = max;
        this.current = current;
        this.name = name;
        this.task = task;
    }

    // TODO: 5/5/2017  - hanooz karesh tamoom nashode bayad kamelesh kard
    
}