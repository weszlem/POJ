public class Odcinek
{
    private double x1, x2, y1, y2;
    private int id;
    private static int iloscOdc = 0;

    public Odcinek()
    {
	this.x1 = 0, this.x2 = 0, this.y1 = 0, this.y2 = 0;
	Odcinek.iloscOdc++;
	this.id = Odcinek.iloscOdc;
    }

    public Odcinek(double x1, double x2, double y1, double y2)
    {
	this.x1 = x1, this.x2 = x2, this.y1 = y1, this.y2 = y2;
	Odcinek.iloscOdc++;
	this.id = Odcinek.iloscOdc;
    }

    public double dlugosc()
    {
	return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }