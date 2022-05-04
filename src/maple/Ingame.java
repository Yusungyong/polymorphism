package maple;

public class Ingame {
	private int count = 0;
	private User[] users = new User[3];
	public Ingame() {
		super();
	}
	
	
	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public User[] getUsers() {
		return users;
	}


	public void setUsers(User[] users) {
		this.users = users;
	}


	public void insert(User anything) { // 객체를 전달받음
		users[count] = anything; // 초기값 elec[0] = > insert method가 두번째 호출될때는 elec[1]
		count++;  // insert  method가 호출될때마다 count ++
	}
	
	public User[] select() {
		return users;
	}
}
