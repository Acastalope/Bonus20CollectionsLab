import java.util.ArrayList;
import java.util.Collections;
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
		listPrice.add(1.98);
		listPrice.add(5.99);
		listPrice.add(1.99);
		listPrice.add(2.89);
		listPrice.add(3.99);
		listPrice.add(3.89);
		listPrice.add(3.99);
		listPrice.add(1.98);
		listPrice.add(6.99);

		ArrayList<String> foodNames = new ArrayList<>();
		ArrayList<Double> foodPrices = new ArrayList<>();

		System.out.println("Welcome to Angie's Shop-n-Go!");
		System.out.println();

		String cont = "y";

		while (cont.equalsIgnoreCase("y")) {
			while (cont.equalsIgnoreCase("y")) {
				System.out.printf("%2s %4s %10s", "Item#", "Item", "Price");
				System.out.println();
				System.out.printf("%2s %6s %9s", "====", "=====", "=====");
				System.out.println();
				for (int i = 0; i < listFood.size(); i++) {
					System.out.println(listItemNum.get(i) + ". " + listFood.get(i) + " \t$" + listPrice.get(i));
				}
				System.out.println();
				int userSelect = Validator.getInt(sc, "What item number would you like to purchase? ", 1, 10);

				System.out.println();
				System.out.println(
						listFood.get((userSelect - 1)) + " added to cart at $" + listPrice.get((userSelect - 1)) + ".");

				foodNames.add(listFood.get((userSelect - 1)));
				foodPrices.add(listPrice.get((userSelect - 1)));

				cont = Validator.getString(sc, "\nWould you like to continue shopping? y or n");

			}
			System.out.println("\nThanks for your order!");
			System.out.println("\nHere's what you got: ");
			System.out.printf("%1s", "===================");
			System.out.println();
			for (int i = 0; i < foodNames.size(); i++) {
				System.out.println(foodNames.get(i) + " \t$" + foodPrices.get(i));
			}
			getMax(foodPrices);
			getMin(foodPrices);
			sum(foodPrices);
			// System.out.println("\nWould you like to buy more? y/n");
			// cont = sc.next();

			cont = Validator.getString(sc, "\nWould you like to buy more? y/n");
			System.out.println("Thank you for your purchase. Come back soon!");
		}
	}

	public static double getMax(ArrayList<Double> inputArrayList) {
		Collections.sort(inputArrayList);
		Collections.reverse(inputArrayList);
		System.out.println();
		System.out.println("Price of most expensive item purchased: " + " $" + inputArrayList.get(0));
		System.out.printf("%1s", "---------------------------------------");
		System.out.println();
		return inputArrayList.get(0);

	}

	public static double getMin(ArrayList<Double> inputArrayList) {
		Collections.sort(inputArrayList);
		System.out.println("Price of least expensive item purchased: " + "$" + inputArrayList.get(0));
		System.out.printf("%1s", "---------------------------------------");
		System.out.println();
		return inputArrayList.get(0);

	}

	public static double sum(ArrayList<Double> inputArraylist) {
		double sum = 0;
		for (int i = 0; i < inputArraylist.size(); i++) {
			sum += inputArraylist.get(i);
		}
		System.out.printf("Total price of items purchased:   " + "$%5.2f", sum);
		System.out.println();
		System.out.printf("%1s", "-------------------------------");
		// System.out.println("Total price of items purchased: " + " \t$" + sum);
		// DecimalFormat numberFormat = new DecimalFormat("#.00");
		// System.out.println(numberFormat.format(number));

		getAverage(inputArraylist, sum);
		// System.out.printf("\n$%10.2f", sum);
		return sum;
	}

	private static void getAverage(ArrayList<Double> inputArraylist, double sum) {
		double average = sum / inputArraylist.size();
		System.out.println();
		System.out.printf("Average price of items purchased: " + "$%2.2f", average);
		System.out.println();
		System.out.printf("%1s", "--------------------------------");
		System.out.println();

	}
}

// public static int average {
//
// for(int i=0; i<foodPrices.length; i++){
// total = total + foodPrices[i];
// double total = 0;
// double average = total / foodPrices.length;
// System.out.println("The average price of the items you ordered is: " +
// average + ".");

// if (checkuserSelect == true) {
// int x = listItemNum.indexOf(userSelect);
// listPrice.get(x);
// listFood.get(x);
// System.out.println("Add" + listItemNum.get(x) + " to list at" +
// listPrice.get(x));
// listUserSelect.add(listItemNum.get(x));

// }
// else
// System.out.println("Sorry, we don't have that item. Please make another
// selection.");
