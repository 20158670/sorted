package sorted;

import java.util.Scanner;

public class Revenue {

	private static Scanner sc;

	public static void main(String[] args) {
		double quantity;
		double unitPrice;
		double smallAmountDiscount = 0.9;
		double largeAmountDiscount = 0.85;
		
		sc = new Scanner(System.in);
		System.out.print("Enter Quanity: ");
		quantity=sc.nextDouble();
		System.out.print("Enter unit price: ");
		unitPrice=sc.nextDouble();
		
		double total = quantity*unitPrice;
		String discountUsed = "";
		
		if(quantity < 100){
			discountUsed = "0";
		}else if(quantity <= 120){
			total = (total*smallAmountDiscount);
			discountUsed = "10%";
		}else if(quantity > 120){
			total = (total*largeAmountDiscount);
			discountUsed = "15%";
		}
		System.out.println("Your total is " + total);
		System.out.println("Your discount was " + discountUsed);

	}

}
