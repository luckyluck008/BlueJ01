public class Bruch
{
    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner)
    {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.kuerzen();
    }

    private void kuerzen()
    {
        int teiler = ggT(this.zaehler, this.nenner);
        this.zaehler = this.zaehler / teiler;
        this.nenner = this.nenner / teiler;
    }

    private int ggT(int a, int b)
    {
        if (b > a)
        {
            int hilf = a;
            a = b;
            b = hilf;
        }

        while (b != 0)
        {
            int rest = a % b;
            a = b;
            b = rest;
        }

        return a;
    }

    public int getZaehler()
    {
        return this.zaehler;
    }

    public int getNenner()
    {
        return this.nenner;
    }

    public double dezimalzahlBerechnen()
    {
        return (1.0 * this.zaehler) / this.nenner;
    }

    public int euklidischerAlgorithmus()
    {
        int a = Math.abs(this.zaehler);
        int b = Math.abs(this.nenner);

        if (b > a)
        {
            int hilf = a;
            a = b;
            b = hilf;
        }

        while (b != 0)
        {
            int rest = a % b;
            a = b;
            b = rest;
        }

        return a;
    }
}
