public class Test
{
    public static void main(String[] args)
    {
	Figura fig[] = new Figura[2];

	fig[0] = new Kolo(200, 200, 50);
	fig[0].pokaz();
	fig[0].pozycja(200,200);

	fig[1] = new Prostokat(200, 200, 50, 50);
	fig[1].pokaz();
	fig[1].pozycja(210, 300);
    }
}