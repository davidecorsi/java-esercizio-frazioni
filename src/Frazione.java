/*
 * Create una classe Frazione con 2 costruttori, un metodo somma tra le frazioni ed un metodo toString.
 */
public class Frazione {
	
	int num;
	int den;
	
	public Frazione (int num) {
		this.num = num;
		den = 1;
	}
	
	public Frazione(int num, int den) {
		this.num = num;
		this.den = den;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDen() {
		return den;
	}

	public void setDen(int den) {
		this.den = den;
	}
	
	public Frazione somma(Frazione f) {
		int n = getNum() * f.den + getDen() * this.num;
		int d = getDen() * f.den;
		return new Frazione(n, d);
	}

	public String toString() {
		return getNum() + "/" + getDen();
	}
}
