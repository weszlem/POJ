public class Startowa
{

    public static void main(String[] args)
    {
	Odcinek o1 = new Odcinek(0, 5, 0, 10);
	System.out.println(o1.dlugosc());
	System.out.println(o1.odleglosc(5, 5));
	System.out.println(o1.dluzszy(new Odcinek(0, 3, 0, 5)));
	System.out.println(o1);

	Odcinek o2 = new Odcinek(1, 12, 2, 10);
	System.out.println(o2.dlugosc());
	System.out.println(o2.odleglosc(5, 5));
	System.out.println(o2.rzutX());
	System.out.println(o2.rzutY());
    }
}