import java.util.*;  
public class Main {  
   public static void main( String args[] ){  
   TimeZone zone = TimeZone.getDefault();  
   String name = zone.getDisplayName();         
   System.out.println("Display name for default time zone: "+ name);  
   
   TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");       
   System.out.println("Value of ID is: " + timezone.getID());  
   
   TimeZone zon= TimeZone.getTimeZone("Asia/Kolkata");   
   System.out.println("The Offset value of TimeZone: " +   
   zon.getOffset(Calendar.ZONE_OFFSET)); 
   
   
   String[] id = TimeZone.getAvailableIDs();        
   System.out.println("In TimeZone class available Ids are: ");  
   for (int i=0; i<id.length; i++){  
   System.out.println(id[i]);  
   }   
   }      
}  
