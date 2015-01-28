import java.util.Scanner;


public class TheSmallestof3Numbers {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a<b && a<c)
		{
			System.out.println(a);
		}
		else if (b<a && b<c)
		{
			System.out.println(b);
		}
		else 
		{
			System.out.println(c);
		}
		
	}

}
