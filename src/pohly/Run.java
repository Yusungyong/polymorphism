package pohly;

import pohly.*;

public class Run {

	public static void main(String[] args) {
		Yongsan y = new Yongsan();
		
		y.insert(new DeskTop("»ï¼º","ÄÄÇ»ÅÍ",15,"Geforce"));
		y.insert(new Tablet("¾ÖÇÃ","13pad",12,true));
		y.insert(new NoteBook("LG","±×·¥", 11, 2));
		y.insert(new NoteBook("»ï¼º","°¶·°½Ã ºÏ", 21, 1));
		Electronic elec_2 = new NoteBook("LENOVO", "³ëÆ®ºÏ", 15, 7);
		y.insert(elec_2);
		Electronic[] eArr = y.select();
		
		
		for (int i = 0; i < eArr.length;i++) {
			if (eArr[i] instanceof DeskTop) {
				System.out.println("µ¥½ºÅ©Å¾ = "+eArr[i]);
			} else if(eArr[i] instanceof NoteBook) {
				System.out.println("³ëÆ®ºÏ = "+eArr[i]);
			} else if(eArr[i] instanceof Tablet) {
				System.out.println("ÅÂºí¸´ = "+eArr[i]);
			}
		}
		

	}

}
