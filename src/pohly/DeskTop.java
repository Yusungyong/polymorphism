package pohly;

public class DeskTop extends Electronic{
	private String graphic; // 그래픽카드 제조사
	public DeskTop() {
		super();
	}
	public DeskTop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	@Override
	public String toString() {
		return super.toString() + ", graphic=" +  graphic;
		
	}
	
	
}
