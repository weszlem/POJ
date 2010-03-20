public class Prostokat extends Figura
{
    private int szer, wys;
    private String fig = "Prostokat";
    
    public Prostokat(int x, int y, int s, int w)
    {
	super(x, y);
	this.szer = s;
	this.wys = w;
    }

    public void pozycja(int x, int y)
    {
	if (x > this.x + this.szer && x < this.x - this.szer && y > this.y + wys && y < this.y - wys)
	    {
		System.out.println("Tak! LEZY!");
	    }
	else
	    {
		System.out.println("Sorry Winnetou!");
	    }
    }
    public void pokaz()
    {
	System.out.println("Figura: " + this.fig);
	System.out.println("Polozenie: " + this.x + " " + this.y);
    }
}