public class Startowa
{

	public static void main(String[] args)
	{
		/* */
		Wektor2W w = new Wektor2W(1, 4);
		Wektor2W w1 = new Wektor2W(4, 1);
		Wektor2W w2 = new Wektor2W(10);
		Wektor2W w2Copy = new Wektor2W(w2);
		/*
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
		*/
		
		Wektor3W w3w = new Wektor3W(1, 2, 3);
		Wektor3W w13w = new Wektor3W(3, 2, 1);
		Wektor3W w23w = new Wektor3W(10);
		Wektor3W w2Copy3w = new Wektor3W(w2);
		
		// W3 i W3
		System.out.println("w3w + w13w");
		System.out.println(w3w.dodac(w13w));
		
		System.out.println("w3w - w13w");
		System.out.println(w3w.odjac(w13w));
		
		System.out.println("w3w * w13w");
		System.out.println(w3w.iloczynSkalarny(w13w));
		
		// W2 i W3
		
		System.out.println("w + w13w");
		System.out.println(w.dodac(w13w));
		
		System.out.println("w - w13w");
		System.out.println(w.odjac(w13w));
		
		System.out.println("w * w13w");
		System.out.println(w.iloczynSkalarny(w13w));
		
		// W3 i W2
		}
}