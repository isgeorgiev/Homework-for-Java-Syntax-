import java.util.Scanner;

public class DecimalToHexadecimal {
	
	private static Scanner input;

	public static void main(String [] args){
	
		input = new Scanner(System.in);
		
		int numInDec=input.nextInt();
		
		String numInHex= Integer.toHexString(numInDec);
		
		System.out.println(numInHex);
	}
	
}
