package task;

public class discountbill extends vegetablebill{

	boolean preferred;

	

	public discountbill(employee clerk, boolean preferred) {
		super(clerk);
	}
	
	
	
		public int getDiscountCount() {
			int count = 0;
			for(item i :items)
			{
				System.out.println(i.getName());
				if(i.isdiscount())
					count++;
			}
			return count;
	}
	public double getDiscountAmount() {
		double amt = 0;
		for(item i :items) {
			if(i.isdiscount()) {
				amt+= i.getPrice() - getDiscount();
			}
		}
		return amt;
	}
	private double getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
	public double getDiscountPercent() {
		double dAmt = getDiscountPercent();
		double aAmt = getTotal();
		return (dAmt/aAmt)*100;
	}
	@Override
	public String toString() {
		return "discountbill [preferred=" + preferred + "]";
	}
	
}
