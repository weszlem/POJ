public class Odcinek
{
    private int x1, x2, y1, y2;
    private int id;
    private static int iloscObiektow = 0;

    public Odcinek()
    {
	this.iloscObiektow++;
	this.id = iloscObiektow;
    }

    public Odcinek(int x1, int x2, int y1, int y2)
    {
	this.iloscObiektow++;
	this.id = iloscObiektow;
	this.x1 = x1;
	this.x2 = x2;
	this.y1 = y1;
	this.y2 = y2;
    }

    public String toString()
    {
	return "X1 = " + this.x1 + " X2 = " + this.x2 + " Y1 = " + this.y1 + " Y2 = " + this.y2 + "\nNumer obiektu to: " + this.id;
    }
    
    public double dlugosc()
    {
	return Math.sqrt(Math.pow((double)(this.x2 - this.x1), 2) + Math.pow((double)(this.y2 - this.y1), 2));
    }

    public double odleglosc(int x, int y)
    {
	double srX = (x1 + x2) / 2;
	double srY = (y1 + y2) / 2;

	return (new Odcinek((int)srX, x, (int)srY, y)).dlugosc();
    }

    public boolean dluzszy(Odcinek od)
    {
	if (this.dlugosc() > od.dlugosc()) return true;
	else return false;
    }

    public Odcinek rzutX()
    {
	return new Odcinek(this.x1, this.x2, 0, 0);
    }

    public Odcinek rzutY()
    {
	return new Odcinek(0, 0, this.y1, this.y2);
    }
}