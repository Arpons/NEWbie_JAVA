package PocketMon;

public class PocketDTO {
	private int num;
	private String name;
	private String type;
	private String location;
	private int height;
	private int weight;
	
	public String toString() {
		return num + " " + name + " " + type + " " + location + " " + " " + weight + " " + height;
	}

	public int getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getLocation() {
		return location;
	}

	public int getWeight() {
		return weight;
	}

	public PocketDTO(int num, String name, String type, String location, int height, int weight) {
		super();
		this.num = num;
		this.name = name;
		this.type = type;
		this.location = location;
		this.height = height;
		this.weight = weight;
	}

}
