package maple;

import java.util.Random;

public class Run {

	public static void main(String[] args) {

		Monster mon = new Monster("���Ƶ���", 10000, 243, 10);
		
		Random random = new Random();
		
		Ingame in = new Ingame();
		in.insert(new Character("��������¥��", "����", 3, 7, 10000,"��Ű ����"));// ��ü ���� ���� : id, ����, �ּҵ�����, �ִ뵥����, hp, ��ų �̸�
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
