package maple;

public class User {
	public User() {
		super();
	}
	private String name;
	
	public User(String name){
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
		return "User_name=" + name;
	}
	
}
