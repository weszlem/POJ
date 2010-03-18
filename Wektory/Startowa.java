public class Startowa
{

	public static void main(String[] args)
	{

		Wektor2W w = new Wektor2W(1, 4);
		Wektor2W w1 = new Wektor2W(4, 1);
		Wektor2W w2 = new Wektor2W(10);
		Wektor2W w2Copy = new Wektor2W(w2);
		
		System.out.println(w);
		System.out.println(w1);
		System.out.println(w2);	
		System.out.println(w2Copy);
		
		System.out.println("w + w2");
		System.out.println(w.dodac(w2));
		
		System.out.println("w - w2");
		System.out.println(w.odjac(w2));
		
		System.out.println("w * w2");
		System.out.println(w.iloczynSkalarny(w2));
		System.out.println(w.iloczynSkalarny(w1));
		
		}
}