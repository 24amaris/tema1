package exercitiu4;

public class Birou {
    private Sertar sertar1;
    private Sertar sertar2;
    private double latime;
    private double lungime;
    private double inaltime;

    // Constructor pentru clasa Birou
    public Birou(Sertar sertar1, Sertar sertar2, double latime, double lungime, double inaltime) {
        this.sertar1 = sertar1;
        this.sertar2 = sertar2;
        this.latime = latime;
        this.lungime = lungime;
        this.inaltime = inaltime;
    }

    // Metoda pentru tipărirea informațiilor despre birou și sertarele acestuia
    public void tipareste() {
        System.out.println("Birou: latime = " + latime + ", lungime = " + lungime + ", inaltime = " + inaltime);
        sertar1.tipareste();
        sertar2.tipareste();
    }
}