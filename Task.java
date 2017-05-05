public abstract class Task {

	private String name;
	private hashMap<String, Integer> featureChangeRate;
	private Log log;
	private Date executionTime;
	private Object input;

	/**
	 * 
	 * @param input
	 */
	public abstract ArrayList<Object> run(ArrayList input);

}