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


	public void insert(User anything) { // ��ü�� ���޹���
		users[count] = anything; // �ʱⰪ elec[0] = > insert method�� �ι�° ȣ��ɶ��� elec[1]
		count++;  // insert  method�� ȣ��ɶ����� count ++
	}
	
	public User[] select() {
		return users;
	}
}
