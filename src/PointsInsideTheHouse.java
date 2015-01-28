import java.util.Scanner;


public class PointsInsideTheHouse {

	private static Scanner input;

	public static void main(String[] args) {
	
		    input = new Scanner (System.in);
	        
	        float b = input.nextFloat();
	        float a = input.nextFloat();
	        
	        boolean result = false;
	        boolean isItInRectangle1=false;
	        boolean isItInRectangle2=false;
	        boolean isItInTriangle=false;
	        
//			Checking is it in Triangle
	        float x1,x2,x3,y1,y2,y3,s,d,e;
	        x1=12.5f;
	        y1=8.5f;
	        x2=17.5f;
	        y2=3.5f;
	        x3=22.5f;
	        y3=8.5f;
	        
	        
	        s=((y2-y3)*(b-x3)+(x3-x2)*(a-y3))/((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
	        d=((y3 - y1)*(b - x3) + (x1 - x3)*(a - y3)) / ((y2 - y3)*(x1 - x3) + (x3 - x2)*(y1 - y3));
	        e=1-s-d;
	        
	        if ((s>=0 && s<=1) && (d >= 0 && d <= 1) && (e>= 0 && e <= 1))
	        {
	        	isItInTriangle=true;
	        }
	        else
	        {
	        	isItInTriangle=false;
	        }
	        
	        // Checking is it in Rectangle 1 and 2
	        if ((a>=8.0 && a<=13.5) && (b>=12.5 && b<=17.5))
	        {
	            isItInRectangle1=true;
	        }
	   
	        else if ((a>=8.0 && a<=13.5) && (b>=20.0 && b<=22.5)) 
	        {
	            isItInRectangle2=true; 
	        }

	        
	        
	        if ((isItInRectangle1 == true) || (isItInRectangle2 == true || isItInTriangle==true))
	        {
	        	result=true;
	        }
	        else
	        {
	        	result=false;
	        }
	        	
	        
	        if (result==true){
	        	System.out.println("Inside");
	        }
	        else {
	        	System.out.println("Outside");
	        }

	        
	}

}
