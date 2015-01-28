import java.util.Scanner;

public class PointsInsideAFigure {

	private static Scanner input;

	public static void main(String[] args) {
        
        input = new Scanner (System.in);
        
        float b = input.nextFloat();
        float a = input.nextFloat();
        
        boolean result = false;
        boolean isItInRectangle=false;
        boolean isItInRectangle2=false;
        boolean isItInRectangle3=false;
        
        if ((a>=6.0 && a<=13.5) && (b>=12.5 && b<=17.5))
        {
            isItInRectangle=true;
        }
        else if((a>=6.0 && a<=8.5) && (b>=17.5 && b<=20.0)) 
        {
            isItInRectangle2=true; 
        }
        else if ((a>=6.0 && a<=13.5) && (b>=20.0 && b<=22.5)) 
        {
            isItInRectangle3=true; 
        }
        
        if ((isItInRectangle == true) || (isItInRectangle2 == true) || (isItInRectangle3 == true))
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
