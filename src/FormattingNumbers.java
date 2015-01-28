import java.util.Scanner;

public class FormattingNumbers {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		int a = input.nextInt();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		String aInHex=Integer.toHexString(a);
		String aInBin=Integer.toBinaryString(a);
		int aInBin2=Integer.parseInt(aInBin);
		
		
		System.out.printf("|%-8s  |%010d| %8.2f|%-7.3f%n", aInHex, aInBin2, b, c);
	}

}
