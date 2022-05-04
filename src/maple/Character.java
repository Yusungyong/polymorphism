package maple;


public class Character extends User{
	
	private String work; // ĳ���� ����
	private int min_damage; // ĳ���� ������ 
	private int max_damage;
	private int hp; // ĳ���� ü��
	private String skill_name;
	public Character() {
		super();
	}
	public Character(String name, String work, int min_damage, int max_damage, int hp, String skill_name) {
		super(name);
		
		this.work = work;
		this.min_damage = min_damage;
		this.max_damage = max_damage;
		this.hp = hp;
	}
	public String getWork() {
		
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMin_damage() {
		return min_damage;
	}
	public void setMin_damage(int min_damage) {
		this.min_damage = min_damage;
	}
	public int getMax_damage() {
		return max_damage;
	}
	public void setMax_damage(int max_damage) {
		this.max_damage = max_damage;
	}
	@Override
	public String toString() {
		return super.toString() +", ����=" + work + ", �ּҵ�����=" + min_damage + ", �ִ뵥����="
				+ max_damage + ", ü��=" + hp + "]";
	}
	

}
