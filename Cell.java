public class Cell {

	private String location;
	private int id;
	private Object content;
	private Coordination coordination;
	private boolean free;
	private boolean accessibility;
	private boolean watered;
	private boolean plowed;

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Coordination getCoordination() {
		return coordination;
	}

	public void setCoordination(Coordination coordination) {
		this.coordination = coordination;
	}

	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}

	public boolean isAccessibility() {
		return accessibility;
	}

	public void setAccessibility(boolean accessibility) {
		this.accessibility = accessibility;
	}

	public boolean isWatered() {
		return watered;
	}

	public void setWatered(boolean watered) {
		this.watered = watered;
	}

	public boolean isPlowed() {
		return plowed;
	}

	public void setPlowed(boolean plowed) {
		this.plowed = plowed;
	}

	public Cell(String location, Coordination coordination) {
		this.location = location;
		this.coordination = coordination;
		free = true;
		accessibility = true;
	}
}