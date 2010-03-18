public class Startowa
{

	public static void main(String[] args)
	{

		Wektor2W w = new Wektor2W(1, 4);
		Wektor2W w1 = new Wektor2W(4, 1);
		System.out.println("W + W1: ");
		System.out.println(w.dodac(w1));
		System.out.println("---\nW - W1");
		System.out.println(w.odjac(w1));
		System.out.println("---\nIloczynSk:");
		System.out.println(w.iloczynSkalarny(w1));
		System.out.println("---");
		System.out.println(w);

		Wektor3W w3w = new Wektor3W(1, 4, 9);
		System.out.println(w3w);
		System.out.println((Wektor3W)w3w.dodac(w));
		System.out.println(w.dodac(w3w));
	}
}