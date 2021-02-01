public class Main
{  
  public static void main(String[] args) 
  {  
    try
    {    
      int a[]=new int[10];    
      System.out.println(a[0]);  
    }    
    catch(ArithmeticException e)  
    {  
      System.out.println("Arithmetic Exception --> "+e);  
    }    
    catch(ArrayIndexOutOfBoundsException e)  
    {  
      System.out.println("ArrayIndexOutOfBounds Exception --> "+e);  
    }    
    catch(Exception e)  
    {  
      System.out.println(e);  
    }                 
  }  
}
