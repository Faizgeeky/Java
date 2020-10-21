import java.util.Scanner;
public class Throws{
   int division(int a, int b) throws ArithmeticException{
	int t = a/b;
	return t;
   }
   public static void main(String args[]){

   //   Scanner myObj = new Scanner(System.in);
   //     // Create a Scanner object
   //  System.out.println("Enter Number:- ");
   //  int age = myObj.nextInt();
   //
   //  if(age<18)
   //    throw new ArithmeticException("Not Eligible for voting");
   // else
   //    System.out.println("Eligible for voting");




	Throws obj = new Throws();
	try{
	   System.out.println(obj.division(15,0));
	}
	catch(ArithmeticException e){
	   System.out.println("You shouldn't divide number by zero");
	}
   }
}
