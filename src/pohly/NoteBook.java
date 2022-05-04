package pohly;

public class NoteBook extends Electronic{
	private int usbPort;
	public NoteBook(int usbPort) {
		super();
		
	}
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand,name,price);
		this.usbPort = usbPort;
	}
	
	public int getUsbPort() {
		
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return super.toString()+", usbPort=" + usbPort;
	}
	

}
