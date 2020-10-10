import java.util.Scanner;
class pg5{

public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter Length");
	double l = myObj.nextDouble();
	System.out.println("Enter Width");
	double h = myObj.nextDouble();
	
	Rectangle obj = new Rectangle(l,h);

  }

}

class Rectangle{
	
	double area ;
	public Rectangle(double l, double w){
	  area = l * w;
	  System.out.println("Area of Rectangle is "+area);
	}

}

