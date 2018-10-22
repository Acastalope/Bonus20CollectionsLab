import java.util.ArrayList;
import java.util.Scanner;

public class Bonus20CollectionsLab {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> listItemNum = new ArrayList<Integer>();
		listItemNum.add(1);
		listItemNum.add(2);
		listItemNum.add(3);
		listItemNum.add(4);
		listItemNum.add(5);
		listItemNum.add(6);
		listItemNum.add(7);
		listItemNum.add(8);
		listItemNum.add(9);
		listItemNum.add(10);

		ArrayList<String> listFood = new ArrayList<String>();
		listFood.add("Chips");
		listFood.add("Soup");
		listFood.add("Ice cream");
		listFood.add("Milk");
		listFood.add("Cereal");
		listFood.add("Cheese");
		listFood.add("Bagels");
		listFood.add("Tofu");
		listFood.add("Pasta");
		listFood.add("Coffee");

		ArrayList<Double> listPrice = new ArrayList<Double>();
		listPrice.add(2.99);
		listPrice.add(1.99);
		listPrice.add(5.99);
		listPrice.add(1.99);
		listPrice.add(2.99);
		listPrice.add(3.99);
		listPrice.add(2.99);
		listPrice.add(3.99);
		listPrice.add(1.99);
		listPrice.add(7.99);

		System.out.println("Welcome to Angie's Shop-n-Go!");
		System.out.println();


	//	System.out.println("\nWhich item would you like to purchase? (enter Item# of food selection)");

		
//		sc.next();
		
		String cont = "y";
		
		while (cont.equalsIgnoreCase("y")) {
			System.out.printf("%2s %4s %10s", "Item#", "Item", "Price");
			System.out.println();
			System.out.printf("%2s %6s %9s", "====", "=====", "=====");
			System.out.println();
			for (int i = 0; i < listFood.size(); i++) {
				System.out.println(listItemNum.get(i) + ". " + listFood.get(i) + " \t$" + listPrice.get(i));
			}
			System.out.println();
			System.out.println("What item number would you like to purchase? ");
			int userSelect = sc.nextInt();

			System.out.println();
			System.out.println(listFood.get((userSelect - 1)) + " added to cart at $" + listPrice.get((userSelect - 1)) + ".");
			System.out.println("\nWould you like to continue shopping? y or n");
			//cont = sc.nextLine();
			cont = sc.next();
		}
		System.out.println("\nThanks for your order!");

		//sc.next();
//	if (cont.equalsIgnoreCase("y")) {
//		for (int i = 0; i < listFood.size(); i++) {
//			
//			System.out.println("Welcome to Angie's Shop-n-Go!");
//			System.out.println();
//
//			System.out.printf("%2s %4s %10s", "Item#", "Item", "Price");
//			System.out.println();
//			System.out.printf("%2s %6s %9s", "====", "=====", "=====");
//			System.out.println();
//			
//			System.out.println(listItemNum.get(i) + ". " + listFood.get(i) + " \t$" + listPrice.get(i));
//		}
//	}
//	else {
//			System.out.println("\nThanks for your order!");
//		}
//		System.out.println("\nSorry, we don't have that item. Please make another selection.");
		
		}
}

