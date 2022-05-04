package maple;

public class Monster {
	private String name;
	private int hp;
	private int level;
	private int damage;
	public Monster(String name, int hp, int level, int damage) {
		super();
		this.name = name;
		this.hp = hp;
		this.level = level;
		this.damage = damage;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public String toString() {
		return "몬스터이름: " + name + "hp=" + hp + ", level=" + level + ", damage=" + damage;
	}
	
	
}
