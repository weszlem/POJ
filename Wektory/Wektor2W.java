public class Wektor2W
{
	protected double x, y;
	protected int id;
	protected static int iloscObiektow = 0;

	public Wektor2W()
	{
		this.iloscObiektow++;
		this.id = iloscObiektow;
		this.x = 0;
		this.y = 0;
	}

	public Wektor2W(double x, double y)
	{
		this.iloscObiektow++;
		this.id = iloscObiektow;
		this.x = x;
		this.y = y;
	}

	public Wektor2W(double x)
	{
		this.iloscObiektow++;
		this.id = iloscObiektow;
		this.x = x;
		this.y = 0;
	}

	public Wektor2W(Wektor2W w)
	{
		this.iloscObiektow++;
		this.id = iloscObiektow;
		this.x = w.getX();
		this.y = w.getY();
	}
	
	// Gettery i settery
	public double getX() { return this.x; }
	public double getY() { return this.y; }
	public void setX(double x) { this.x = x; }
	public void setY(double y) { this.y = y; }
	public int getId() { return this.id; }
	public String toString() { return "\nX = " + this.x + " Y = " + this.y + "\nDlugosc wektora to: " + this.dlugosc() + "\nId wektora: " + this.id + "\n"; }

	// dzialania na wektorach

	public Wektor2W dodac(Wektor2W w)
	{
		return new Wektor2W((this.x + w.x), (this.y + w.y));
	}
	
	public Wektor2W dodac(Wektor3W w)
	{
		return new Wektor3W((this.x + w.x), (this.y + w.y), w.z);
	}

	public Wektor2W odjac(Wektor2W w)
	{
		return new Wektor2W((this.x - w.x), (this.y - w.y));
	}

	public double iloczynSkalarny(Wektor2W w)
	{
		return (this.x * w.x) + (this.y * w.y);
	}

	public double dlugosc()
	{
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
}

