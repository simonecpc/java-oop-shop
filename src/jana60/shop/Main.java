package jana60.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		System.out.println("Iserire il nome del prodotto:");
		nome = scan.nextLine();
		
		String brand;
		System.out.println("Inserire il brand:");
		brand = scan.nextLine();
		
		float prezzo;
		System.out.println("Inserire Prezzo:");
		prezzo = scan.nextFloat();
		
		int IVA = 22;
		
		Prodotto p = new Prodotto(brand, nome, prezzo, IVA);
		
		
		
		System.out.println("Il prezzo finale di" + nome + " " + brand + " compreso di IVA è: " + p.spf() );
	}
	
}
