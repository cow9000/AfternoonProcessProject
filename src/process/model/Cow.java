package process.model;

public class Cow
{
	
	private String name;
	
	public Cow() {
		this.name = "Bessie";
	}
	
	public Cow(String name) {
		this.name = name;
	}
	
	public String toString() {
		String description = "This is my cow, " + name;
		return description;
	}
}
