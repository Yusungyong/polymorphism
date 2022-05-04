package action;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Hero[] heros = new Hero[1]; // 배열 및 배열 크기 할당ㅇ
		heros[0]= new Wizzard("마법사"); // Wizzard 객체를 배열에 저장
		Wizzard temp = (Wizzard) heros[0]; 
		temp.skill();
		Random random = new Random();
		for (int i = 100; i > 0; i -= random.nextInt(10)) {
			System.out.println("HP = " + i);
		}
	}

}
