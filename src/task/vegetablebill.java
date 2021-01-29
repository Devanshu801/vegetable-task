package task;

import java.util.ArrayList;

public class vegetablebill {
  employee clerk;
  ArrayList<item> items;
public vegetablebill() {
	super();
}
public vegetablebill(employee clerk) {
	super();
	this.clerk = clerk;
	items = new ArrayList<>();
}
  
public void add(item i) {
	items.add(i);
}
  public double getTotal()
  {
	double amt = 0;
	for(item i:items)
	{
		amt += i.getPrice();
	}
	return amt;
  }
  public int getDiscountCount() {
	  return 0;
  }
  public void printReceipt() {
	  System.out.println("Receipt \nName: "+clerk.getName());
	  System.out.println(items);
	  System.out.println(getTotal());
  }
}
