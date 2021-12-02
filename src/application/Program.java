package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine();
		
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		
		System.out.print("Quantity: ");
		product.quantity = sc.nextInt();
		
		//System.out.print(product.name + "," + product.price + "," + product.quantity);
		
		System.out.println(); // Saltando linha
		System.out.println(product.toString());
		// Ou assim
		System.out.println(); // Saltando linha
		System.out.println(product);
		
		System.out.println(); // Saltando linha
		System.out.println("Product data : " + product);
		
		System.out.println(); // Saltando linha
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println(); // Saltando linha
		System.out.println("Update data : " + product);
		
		System.out.println(); // Saltando linha
		System.out.print("Enter the number of products to be removid from stock: ");
		int quantity2 = sc.nextInt();
		product.removeProducts(quantity2);
		
		System.out.println(); // Saltando linha
		System.out.println("Update data : " + product);
		
		
		sc.close();

	}

}
