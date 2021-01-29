package task;

public class main {

	public static void main(String[] args) {
		vegetable onion = new vegetable("onion",10,50);
		vegetable potato = new vegetable("potato",20,50);
		vegetable ginger = new vegetable("ginger",20,50);
		employee clerk = new employee("ravinder");
		
		onion.setIsdiscount(true);
		ginger.setIsdiscount(true);
		vegetablebill bill = new discountbill(clerk,true);
		bill.add(potato);
		bill.add(onion);
		bill.add(ginger);
		System.out.println(bill.getTotal());
		bill.printReceipt();
		
		System.out.println(bill.items);
		System.out.println(bill.getDiscountCount());
	}
}
