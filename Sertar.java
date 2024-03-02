package exercitiu4;

public class Sertar {
    private double latime;
    private double lungime;
    private double inaltime;

    // Constructor pentru clasa Sertar
    public Sertar(double latime, double lungime, double inaltime) {
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    // Metoda pentru tipărirea informațiilor despre sertar
    public void tipareste() {
        System.out.println("Sertar: latime = " + latime + ", lungime = " + lungime + ", inaltime = " + inaltime);
    }
}
