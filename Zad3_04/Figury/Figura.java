abstract class Figura
{
    protected int x, y;
    protected String fig = "Jeszcze nie wiadomo";

    public Figura(int x, int y)
    {
	this.x = x;
	this.y = y;
    }

    public void pokaz()
    {
	System.out.println("Figura: " + this.fig);
	System.out.println("Polozenie: " + this.x + " " + this.y);
    }

    public abstract void pozycja(int x, int y);
}