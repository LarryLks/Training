import java.util.ArrayList;
import java.util.Scanner;

class Inventory{
	String itemName;
	int itemPrice;
	int quantity;
	int subtotal;
	int itemId;
	
	Inventory(String itemName, int itemPrice, int quantity, int subtotal, int itemId){
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
		this.subtotal = subtotal;
		this.itemId = itemId;
	}
	
	public String toString() {
		return itemName + "     " + itemPrice + "     " + quantity + "     " + subtotal;
	}
}

public class InventoryManagementSystem {
	public static void main(String[] args) {
		int itemId;
		int quantity;
		String itemName = "";
		int itemPrice = 0;
		int subTotal = 0;
		ArrayList<Inventory> totalInventory = new ArrayList<Inventory>();
		int grandTotal = 0;
		
		System.out.println("Hi there! This is your new inventory.");
		System.out.println("Please enter your name");
		
		String input;
		Scanner scan = new Scanner(System.in);
		input = scan.nextLine();
		
		char cont ='N';
		
		while(true) {
			
			if(cont == 'N') {
				System.out.println("What would you like to do?");
				System.out.println("1. Add item(add)");
				System.out.println("2. Delete item(del)");
				System.out.println("3. View item(view)");
				System.out.println("4. Exit Program(exit)");
				
				input = scan.nextLine();
			}

			
			if(input.equals("add")) {
				System.out.println("Please refer to the items below to add item");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("itemID                     itemName                     itemPrice");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("1.                           bag                            10");
				System.out.println("2.                           chair                          20");
				System.out.println("3.                           table                          100");
				System.out.println("4.                           keyboard                       150");
				System.out.println("5.                     	     cpu                            75");
				System.out.println("----------------------------------------------------------------------");
				
				System.out.println("Please enter the ID of the item you want added into your inventory");
				itemId = scan.nextInt();

				System.out.println("How many woud you like?");
				quantity = scan.nextInt();
				
				switch(itemId){
					case 1:
						itemName = "bag";
						itemPrice = 5;
						subTotal = quantity * itemPrice;
						break;
					case 2:
						itemName = "chair";
						itemPrice = 10;
						subTotal = quantity * itemPrice;
						break;
					case 3:
						itemName = "table";
						itemPrice = 20;
						subTotal = quantity * itemPrice;
						break;
					case 4:
						itemName = "keyboard";
						itemPrice = 25;
						subTotal = quantity * itemPrice;
						break;
					case 5:
						itemName = "cpu";
						itemPrice = 51;
						subTotal = quantity * itemPrice;
						break;
						
					default:
						System.out.println("Invalid");
						break;
				}
				
				grandTotal += subTotal;
				totalInventory.add(new Inventory(itemName, itemPrice, quantity, subTotal, itemId));
				System.out.println("Item has been added!");
				
				System.out.println("Would you like to order more(y/n)");
				String input2 = scan.next();
				input2 = input2.toUpperCase();
				char in[] = input2.toCharArray();
				cont = in[0];
				if(cont == 'Y') {
					input = "add";
				}
				else
					continue;
			}
			else if(input.equals("del")) {
				System.out.println("Please enter the itemID you want to delete.");
				int delID;
				int arrayIndex = -1;
				delID = scan.nextInt();
				for(Inventory bill : totalInventory) {
					if(delID == bill.itemId) {
						arrayIndex = totalInventory.indexOf(bill);
					}
				}
				
				try {
					totalInventory.remove(arrayIndex);
				}
				catch(Exception e) {
					System.out.println("invalid index of inventory");
				}
				System.out.println("Item deleted!");
				

			}
			if(input.equals("view")) {
				if(totalInventory.size() > 0)
				{
					System.out.println("This is your inventory");
					for(Inventory bill : totalInventory) {
						System.out.println(bill);
					}
					
					System.out.println();
				}
				else {
					System.out.println("Nothing in your inventory");
					continue;
				}
			}
			if(input.equals("exit")) {
				System.out.println("Program has ended");
				System.exit(0);
			}
		}
	}
}
