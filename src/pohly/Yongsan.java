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
	public void insert(Electronic anything) { // ��ü�� ���޹���
		elec[count] = anything; // �ʱⰪ elec[0] = > insert method�� �ι�° ȣ��ɶ��� elec[1]
		count++;  // insert  method�� ȣ��ɶ����� count ++
	}
	public Electronic[] select() {
		return elec;
	}
	
}
