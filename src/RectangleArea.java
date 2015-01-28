import java.util.Scanner;


public class RectangleArea {

	private static Scanner input;

	public static void main(String[] args) {
        
		input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int area = a * b;
        System.out.println(area);

	}

}
