import java.util.Scanner;

public class TriangleArea {

	private static Scanner input;

	public static void main(String[] args) {
		 
		input = new Scanner(System.in);
	    int a1 = input.nextInt();
	    int a2 = input.nextInt();
	    int b1 = input.nextInt();
	    int b2 = input.nextInt();
	    int c1 = input.nextInt();
	    int c2 = input.nextInt();
	    
	    double d1,d2,d3;
	        
	    d1=java.lang.Math.sqrt(Math.pow((a2-a1),2)+Math.pow((b2-b1),2));
	    d2=java.lang.Math.sqrt(Math.pow((b2-b1),2)+Math.pow((c2-c1),2));
	    d3=java.lang.Math.sqrt(Math.pow((c2-c1),2)+Math.pow((a2-a1),2));
	        
	    if (((d1+d2)<d3)&&((d2+d3)<d1)&&((d3+d1)<d2)){
	        
	    	double s= Math.abs((a1*(b2-c2)+b1*(c2-a2)+c1*(a2-b2))/2);
	        System.out.println(Math.round(s));
	        
	    }
	    else {
	    
	    	System.out.println("0");
	    }
	        
		
		
	}

}
