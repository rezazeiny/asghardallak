import com.google.common.collect.HashMultiset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class AllOfMinerals {

    private Mineral stone = new Mineral("Metal",new HashMap<String , Integer>(), 1, "Stone", new Probability(),
            20, HashMultiset<Item>().create(), new HashMultiset<Item>(), new ArrayList<Tool>(), new ArrayList<Task>(),
            new Probability());
    private Mineral ironOre;
    private Mineral silverOre;
    private Mineral adamantiumOre;

    // FIXME: 5/5/2017 - HashMultiset new nemishe bayad ye balayi saresh biyarim(finale!!!)
    // TODO: 5/5/2017 - baghiye ro new konim
}
