/*
 * Creare il metodo main dove andare a sommare 2 frazioni e si stampa il risultato.
 */
public class Main {
	public static void main(String[] args) {
		Frazione frazione1 = new Frazione(3, 4);
		Frazione frazione2 = new Frazione(5, 2);
		System.out.println(frazione1.somma(frazione2));
	}
}
