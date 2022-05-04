package maple;

public class CharacterSkill extends Character{
	private String skill_name;
	private int skill_min_damage;
	private int skill_max_damage;
	
	public CharacterSkill() {
		super();
	}
	public CharacterSkill(String skill_name,String skill_min_damage, int skill_max_damage) {
		super();
		this.skill_name = skill_name;
		this.skill_min_damage = this.skill_min_damage;
		this.skill_max_damage = skill_max_damage;
	}
	public String getSkill_name() {
		return skill_name;
	}
	public void setSkill_name(String skill_name) {
		this.skill_name = skill_name;
	}
	public int getSkill_min_damage() {
		return skill_min_damage;
	}
	public void setSkill_min_damage(int skill_min_damage) {
		if (skill_name.equals("럭키 세븐")) {
			int min_damage = super.getMin_damage();
			this.skill_min_damage = min_damage *= 3;
		}
		else if (skill_name.equals("트리플 스로우")) {
			int min_damage = super.getMin_damage();
			this.skill_min_damage = min_damage *= 5;
		}
		else if (skill_name.equals("쿼드러플 스로우")) {
			int min_damage = super.getMin_damage();
			this.skill_min_damage = min_damage *= 9;
		}
		this.skill_min_damage = skill_min_damage;
	}
	public int getSkill_max_damage() {
		return skill_max_damage;
	}
	public void setSkill_max_damage(int skill_max_damage) {
		if (skill_name.equals("럭키세븐")) {
			int max_damage = super.getMax_damage();
			this.skill_max_damage = max_damage *= 4;
		}
		else if (skill_name.equals("트리플 스로우")) {
			int max_damage = super.getMax_damage();
			this.skill_max_damage = max_damage *= 6;
		}
		else if (skill_name.equals("쿼드러플 스로우")) {
			int max_damage = super.getMax_damage();
			this.skill_max_damage = max_damage *= 11;
		}
	}
	
}
