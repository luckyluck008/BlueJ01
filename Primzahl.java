public class Primzahl {
    private int Zahlen;  

    public Primzahl(int Zahlen) {
        this.Zahlen = Zahlen;
    }

    public void Rechnung() {
        for (int i = 2; i <= Zahlen; i++) {  
            if (istPrimzahl(i)) {
                System.out.println(i + " ist eine Primzahl.");
            }
        }
    }

    private boolean istPrimzahl(int zahl) {
        if (zahl <= 2) return false;

        for (int teiler = 2; teiler <= zahl / 2; teiler++) {
            if (zahl % teiler == 0) {
                return false;
            }
        }
        return true;
    }
}
