public class Mission {

	private hashMultiset<Task> task;
	private hashSet<Task> taskSet = task.elementSet();;
	private hashMap<Task, Double> progressPerTask;
	private double progress;
	private ArrayList<Object> price;
	private Logger logger;
	private double contractFee;
	private Time dueTime;
	private hashMultiset<Object> input;
	private hashMap<Task, Object> relation;

}