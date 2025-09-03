package Com.Sample;
import java.lang.*;
import java.util.Scanner;
public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tcc = new Scanner(System.in);
		System.out.println("Enter Items Name:");
		String itemName = tcc.nextLine();
		System.out.println("Enter Quantity:");
		int qty = tcc.nextInt();
		System.out.println("Enter Price of Item :");
		double price = tcc.nextDouble();
		
		System.out.println("ITEM Details");
		System.out.println("Item Name:"+itemName);
		System.out.println("quantity of item:"+qty);
		System.out.println("price of an item"+price);
		
		/* implicit type Conversion*/
		double totalAmount =price*qty;
		System.out.println("Total Amount of Item :" +totalAmount);
		/** Explicit type Casting
		 happen here */
		int finalAmount = (int)totalAmount;
		System.out.println("After explicit type amount is:"+finalAmount);
		
		tcc.close();

	}

OUTPUT:
Enter Items Name:
BOOKS
Enter Quantity:
50
Enter Price of Item :
25
ITEM Details
Item Name:BOOKS
quantity of item:50
price of an item25.0
Total Amount of Item :1250.0
After explicit type amount is:1250

}
