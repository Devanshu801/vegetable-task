package task;

public class item {

	boolean isdiscount;
	String name;
	double discount;
	double  price;

	
	public item() {
		super();
	}


	public item( String name, double discount, double price) {
		super();
		
		this.name = name;
		this.discount = discount;
		this.price = price;
	}


	public boolean isdiscount() {
		return isdiscount;
	}


	public void setIsdiscount(boolean isdiscount) {
		this.isdiscount = isdiscount;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "item [isdiscount=" + isdiscount + ", name=" + name + ", discount=" + discount + ", price=" + price
				+ "]";
	}
	
}
