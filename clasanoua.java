package nou;

public class clasanoua {

	public static void main(String[] args) {
		
		Complex c1=new Complex(3,7);
		c1.afisareComplex();
		
		Complex c2=new Complex(2, 5.4);
		
		Complex suma= c1.suma(c2);
		suma.afisareComplex();
		
		Complex.numarAfisari();
		c2.numarAfisari();
		
	}
	
}
