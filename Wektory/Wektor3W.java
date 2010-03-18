public class Wektor3W extends Wektor2W
{
	private double z;

	public Wektor3W()
	{
		super();
		this.z = 0;
	}

	public Wektor3W(double x, double y, double z)
	{
		super(x, y);
		this.z = z;
	}

	public Wektor3W(double x)
	{
		super(x);
		this.z = 0;
	}

	public Wektor3W(Wektor2W w)
	{
		super(w);
		this.z = 0;
	}

	public Wektor3W(Wektor3W w)
	{
		super(w.x, w.y);
		this.z = w.z;
	}

	public double getZ() { return this.z; }
	public void setZ(double z) { this.z = z; }
	public String toString() { return "X = " + this.x + " Y = " + this.y + " Z = " + this.z + "\nDlugosc wektora to: " + this.dlugosc() + "\nId: " + this.id; }

	// dzialania na wektorach

	public Wektor3W dodac(Wektor3W w)
	{
		return new Wektor3W(this.x + w.x, this.y + w.y, this.z + w.z);
	}

	/*    public Wektor3W odjac(Wektor2W w)
	{
		return new Wektor3W((this.x - w.x), (this.y - w.y), (this.z - w.z));
		}*/

			/*    public double iloczynSkalarny(Wektor2W w)
		{
			return (this.x * w.x) + (this.y * w.y) + (this.z * w.z);
			}*/

				public double dlugosc()
			{
				return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
			}
		}
