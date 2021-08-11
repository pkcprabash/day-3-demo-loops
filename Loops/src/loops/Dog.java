package loops;

public class Dog {

	private int id;
	private int legs;
	private String color;
	private String breed;
	
	public Dog() {
		super();
	}
	
	public Dog(int id, int legs, String color) {
		super();
		this.id = id;
		this.legs = legs;
		this.color = color;
	}
	
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", legs=" + legs + ", color=" + color + "]";
	}

	
}
