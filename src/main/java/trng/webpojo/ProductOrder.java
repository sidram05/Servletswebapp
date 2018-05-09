package trng.webpojo;

public class ProductOrder {
	private String pname;
	private String cname;
	private int quantity;
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public ProductOrder(String pname, String cname, int quantity) {
		super();
		this.pname = pname;
		this.cname = cname;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ProductOrder [pname=" + pname + ", cname=" + cname + ", quantity=" + quantity + "]";
	}
	
	
}
