package pohly;

public class Yongsan extends Electronic{
	private Electronic[] elec = new Electronic[5];
	private int count = 0;
	public Yongsan() {
		super();
	}
	public Electronic[] getElec() {
		return elec;
	}
	public void setElec(Electronic[] elec) {
		this.elec = elec;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}	
	public void insert(Electronic anything) { // 객체를 전달받음
		elec[count] = anything; // 초기값 elec[0] = > insert method가 두번째 호출될때는 elec[1]
		count++;  // insert  method가 호출될때마다 count ++
	}
	public Electronic[] select() {
		return elec;
	}
	
}
