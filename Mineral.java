import com.google.common.collect.HashMultiset;

import java.util.ArrayList;
import java.util.HashMap;

public class Mineral extends Item {

    Mineral(String type, HashMap<String, Integer> featureChangeRate, double capacity, String name, Probability invalid,
            double price, HashMultiset<Item> initialIngredients, HashMultiset<Item> invalidIngredients,
            ArrayList<Tool> tools, ArrayList<Task> task, Probability use) {
        super(true, type, featureChangeRate, capacity, name, 0, invalid, price, initialIngredients, 0,
                invalidIngredients, tools, task, 4, 1, use, false, false, false);
    }
}