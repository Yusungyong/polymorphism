package action;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Hero[] heros = new Hero[1]; // �迭 �� �迭 ũ�� �Ҵ礷
		heros[0]= new Wizzard("������"); // Wizzard ��ü�� �迭�� ����
		Wizzard temp = (Wizzard) heros[0]; 
		temp.skill();
		Random random = new Random();
		for (int i = 100; i > 0; i -= random.nextInt(10)) {
			System.out.println("HP = " + i);
		}
	}

}
