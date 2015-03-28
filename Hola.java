import java.util.Scanner;

public class Hola
{

	public static void main(String[] args)
	{
	
		String nombre, ape, ape2;
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("Dame un nombre: ");
			nombre = sc.next();
			System.out.println("Hola: " + nombre);

		}

	}

}