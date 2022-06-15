package jana60.shop;

import java.text.DecimalFormat;

public class Prodotto {

	String brand, nome;
	float prezzo;
	int IVA;
	
	DecimalFormat d = new DecimalFormat ("#.00€");
	
	public Prodotto(String brand, String nome, float prezzo, int iVA) {
		super();
		this.brand = brand;
		this.nome = nome;
		this.prezzo = prezzo;
		IVA = iVA;
	}
	
	float prezzoFinale () {
		return prezzo + (prezzo/100 * IVA);
	}
	
	String spf () {
		return d.format(prezzoFinale());
	}
	
}
