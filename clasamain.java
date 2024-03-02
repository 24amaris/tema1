package exercitiu4;

public class clasamain {

		public static void main(String[] args) {
	        // Crearea a două sertare
	        Sertar sertar1 = new Sertar(30, 40, 10);
	        Sertar sertar2 = new Sertar(35, 45, 15);

	        // Crearea unui birou cu sertarele create anterior
	        Birou birou = new Birou(sertar1, sertar2, 120, 60, 75);

	        // Tipărirea componentelor biroului
	        birou.tipareste();
	    }
	}