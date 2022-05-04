package maple;

import java.util.Random;

public class Run {

	public static void main(String[] args) {

		Monster mon = new Monster("히아데스", 10000, 243, 10);
		
		Random random = new Random();
		
		Ingame in = new Ingame();
		in.insert(new Character("내가가장짜릿", "도적", 3, 7, 10000,"럭키 세븐"));// 객체 구성 순서 : id, 직업, 최소데미지, 최대데미지, hp, 스킬 이름
		User[] eArrr =  in.select();
		Character eArr = (Character)eArrr[0];
		
		System.out.println(mon.toString());
		System.out.println(eArr.getHp());
		
		int monster_np = mon.getHp();
		while(monster_np > 1) {
			
			monster_np -= random.nextInt(eArr.getMin_damage(),eArr.getMax_damage());
			mon.setHp(monster_np);
			System.out.println(mon.getHp());
			
		}
		
	}

}
