public class Test
{
    public static void main(String args[])
    {
	Osoba klient1 = new Osoba("ppj"), klient2 = new Osoba("poj");
	Konto konto1 = new Konto(klient1), konto2 = new Konto(klient2);

	konto1.ustawDebet(0);
	konto2.ustawDebet(-100);

	konto1.wplata(500);
	konto2.wplata(900);

	konto2.wyplata(300);
	konto1.przelew(konto2, 200);

	System.out.println(konto1);
	System.out.println(konto2);

	konto2.przelew(konto1, 950);

	Konto.ustawStope(2);
	konto1.dodajOdset();
	konto2.dodajOdset();

	System.out.println(konto1);
	System.out.println(konto2);
    }
}