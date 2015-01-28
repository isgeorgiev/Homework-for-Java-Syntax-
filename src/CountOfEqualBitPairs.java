import java.util.Scanner;


public class CountOfEqualBitPairs {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int counter=0;
		int n = input.nextInt();
		String bits=Integer.toBinaryString(n);
		
		for (int i=0; i<bits.length()-1; i++)
		{
			if(bits.charAt(i)==bits.charAt(i+1))
				counter++;
		}
			
		System.out.println(counter);

	}

}
