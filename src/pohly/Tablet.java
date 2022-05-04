package pohly;

public class Tablet extends Electronic{
	private boolean penFlag;
	public Tablet() {
		super();
	}
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(name, brand, price);
		this.penFlag = penFlag;
	}
	public boolean isPenFlag() {
		return penFlag;
	}
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	@Override
	public String toString() {
		return super.toString() + ", penFlag=" + penFlag;
	}
	
	
}
