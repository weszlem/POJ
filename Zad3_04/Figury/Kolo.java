public class Kolo extends Figura
{
    private int promien;
    private String fig = "Kolo";
    
    public Kolo(int x, int y, int r)
    {
	super(x, y);
	this.promien = r;
    }

    public void pozycja(int x, int y)
    {
	if (Math.pow((x - this.x), 2) + Math.pow((y - this.y), 2) <= Math.pow(this.promien, 2))
	    {
		System.out.println("TAK, LEZY!");
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