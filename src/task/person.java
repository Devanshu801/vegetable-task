package task;

public class person {
	String name;

	public person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [name=" + name + "]";
	}
	
	
}
