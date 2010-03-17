public class Konto
{
    private Osoba wlasciciel;
    private int stanKonta;
    private int limitDebetu;

    public Konto(Osoba wlasciciel)
    {
	this.wlasciciel = wlasciciel;
	this.stanKonta = 0;
	this.limitDebetu = 0;
    }

    public void wplata(int kwota)
    {
	