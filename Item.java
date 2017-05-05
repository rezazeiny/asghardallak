import com.google.common.collect.HashMultiset;

import java.util.ArrayList;
import java.util.HashMap;

public class Item {

    private boolean valid;
    private String type;
    private HashMap<String, Integer> featureChangeRate;
    private double capacity;
    private String name;
    private int useCount;
    private Probability invalid;
    private double price;
    private HashMultiset<Item> initialIngredients;
    private double disassemblePrice;
    private HashMultiset<Item> invalidIngredients;
    private ArrayList<Tool> tools;
    private ArrayList<Task> task;
    private int maxLevel;
    private int level;
    private Probability use;
    private boolean eatable;
    private boolean disassemblity;
    private boolean accumulation;

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HashMap<String, Integer> getFeatureChangeRate() {
        return featureChangeRate;
    }

    public void setFeatureChangeRate(HashMap<String, Integer> featureChangeRate) {
        this.featureChangeRate = featureChangeRate;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUseCount() {
        return useCount;
    }

    public void setUseCount(int useCount) {
        this.useCount = useCount;
    }

    public Probability getInvalid() {
        return invalid;
    }

    public void setInvalid(Probability invalid) {
        this.invalid = invalid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HashMultiset<Item> getInitialIngredients() {
        return initialIngredients;
    }

    public void setInitialIngredients(HashMultiset<Item> initialIngredients) {
        this.initialIngredients = initialIngredients;
    }

    public double getDisassemblePrice() {
        return disassemblePrice;
    }

    public void setDisassemblePrice(double disassemblePrice) {
        this.disassemblePrice = disassemblePrice;
    }

    public HashMultiset<Item> getInvalidIngredients() {
        return invalidIngredients;
    }

    public void setInvalidIngredients(HashMultiset<Item> invalidIngredients) {
        this.invalidIngredients = invalidIngredients;
    }

    public ArrayList<Tool> getTools() {
        return tools;
    }

    public void setTools(ArrayList<Tool> tools) {
        this.tools = tools;
    }

    public ArrayList<Task> getTask() {
        return task;
    }

    public void setTask(ArrayList<Task> task) {
        this.task = task;
    }

    public int getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(int maxLevel) {
        this.maxLevel = maxLevel;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Probability getUse() {
        return use;
    }

    public void setUse(Probability use) {
        this.use = use;
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public boolean isDisassemblity() {
        return disassemblity;
    }

    public void setDisassemblity(boolean disassemblity) {
        this.disassemblity = disassemblity;
    }

    public boolean isAccumulation() {
        return accumulation;
    }

    public void setAccumulation(boolean accumulation) {
        this.accumulation = accumulation;
    }

    public Item(boolean valid, String type, HashMap<String, Integer> featureChangeRate, double capacity, String name,
                int useCount, Probability invalid, double price, HashMultiset<Item> initialIngredients,
                double disassemblePrice, HashMultiset<Item> invalidIngredients, ArrayList<Tool> tools,
                ArrayList<Task> task, int maxLevel, int level, Probability use, boolean eatable, boolean disassemblity,
                boolean accumulation) {
        this.valid = valid;
        this.type = type;
        this.featureChangeRate = featureChangeRate;
        this.capacity = capacity;
        this.name = name;
        this.useCount = useCount;
        this.invalid = invalid;
        this.price = price;
        this.initialIngredients = initialIngredients;
        this.disassemblePrice = disassemblePrice;
        this.invalidIngredients = invalidIngredients;
        this.tools = tools;
        this.task = task;
        this.maxLevel = maxLevel;
        this.level = level;
        this.use = use;
        this.eatable = eatable;
        this.disassemblity = disassemblity;
        this.accumulation = accumulation;
    }

    // TODO: 5/5/2017 - kamele?
}