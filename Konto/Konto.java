public class Konto
{
    private Osoba wlasciciel;
    private int stanKonta;
    private int limitDebetu;

    private static int stopa = 0;

    public Konto(Osoba wlasciciel)
    {
	this.wlasciciel = wlasciciel;
	this.stanKonta = 0;
	this.limitDebetu = 0;
    }

    public void ustawDebet(int kwota)
    {
	if (kwota < 0)
	    {
		this.limitDebetu += kwota;
	    }
    }

    public void wplata(int kwota)
    {
	this.stanKonta += kwota;
    }

    public boolean wyplata(int kwota)
    {
	if ((this.stanKonta - this.limitDebetu - kwota) > 0)
	    {
		this.stanKonta -= kwota;
		return true;
	    }
	else
	    {
		return false;
	    }
    }

    public boolean przelew(Konto k, int kwota)
    {
	if (this.wyplata(kwota))
	    {
		k.wplata(kwota);
		return true;
	    }
	else
	    {
		System.out.println("Operacja niedozwolona: przelew!");
		return false;
	    }
    }

    public static void ustawStope(int stopa)
    {
	Konto.stopa = stopa;
    }

    public String toString()
    {
	return this.wlasciciel + ", stan konta: " + this.stanKonta;
    }
}