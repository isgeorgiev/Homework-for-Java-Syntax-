import java.util.Scanner;


public class CountOfBitsOne {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		int counter=0;
		int n = input.nextInt();
		String bits=Integer.toBinaryString(n);
		char[] bitsArray=bits.toCharArray();
		for (int i=0; i<bitsArray.length; i++)
		{
			if (bitsArray[i]=='1')
			counter++;
		}
		System.out.println(counter);

	}

}
