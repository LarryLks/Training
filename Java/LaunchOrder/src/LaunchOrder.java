import java.util.ArrayList;
import java.util.Scanner;

class Bill{
	String itemName;
	int itemPrice;
	int quantity;
	int subtotal;
	
	Bill(String itemName, int itemPrice, int quantity, int subtotal){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subtotal = subtotal;
	}
	
	public String toString() {
		return itemName + "     " + itemPrice + "     " + quantity + "     " + subtotal;
	}
}

public class LaunchOrder {
	public static void main(String[] args) {
		
		int quantity;
		int itemId;
		String itemName = "";
		int itemPrice = 0;
		int subTotal = 0;
		ArrayList<Bill> totalBill = new ArrayList<Bill>();
		int grandTotal = 0;
		
		System.out.println("Welcome to Hotel Paw Patrol");
		System.out.println("Enter your name");
		
		String input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		char cont ='Y';
		
		while(cont == 'Y') {
			System.out.println("You can check the menu below to order your food");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("itemID                     itemName                     itemPrice");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("1.                           water                          10");
			System.out.println("2.                           coke                           20");
			System.out.println("3.                           pizza                          100");
			System.out.println("4.                           burger                         150");
			System.out.println("5.                     	     fries                          75");
			System.out.println("----------------------------------------------------------------------");
			
			System.out.println("Enter itemID");
			itemId = scan.nextInt();

			System.out.println("How many woud you like?");
			quantity = scan.nextInt();
			
			switch(itemId){
				case 1:
					itemName = "water";
					itemPrice = 5;
					subTotal = quantity * itemPrice;
					break;
				case 2:
					itemName = "coke";
					itemPrice = 10;
					subTotal = quantity * itemPrice;
					break;
				case 3:
					itemName = "burger";
					itemPrice = 20;
					subTotal = quantity * itemPrice;
					break;
				case 4:
					itemName = "pizza";
					itemPrice = 25;
					subTotal = quantity * itemPrice;
					break;
				case 5:
					itemName = "fries";
					itemPrice = 51;
					subTotal = quantity * itemPrice;
					break;
					
				default:
					System.out.println("Invalid");
					break;
			}
			
			grandTotal += subTotal;
			totalBill.add(new Bill(itemName, itemPrice, quantity, subTotal));
			
			System.out.println(itemName + "         " + quantity + "         " + subTotal);
			System.out.println("Would you like to order more(y/n)");
			String input2 = scan.next();
			input2 = input2.toUpperCase();
			char in[] = input2.toCharArray();
			cont = in[0];
		}
		
		for(Bill bill : totalBill) {
			System.out.println(bill);
		}
		System.out.println(grandTotal);
	}
}
