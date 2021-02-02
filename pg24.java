class Main{  

 public static void main(String args[]){  
  Tdemo m1=new Tdemo();  
  Tdemo m2=new Tdemo(); 
  Tdemo m3=new Tdemo();  
  Tdemo m4=new Tdemo(); 
  m1.setPriority(Thread.MIN_PRIORITY);  
  m2.setPriority(Thread.MAX_PRIORITY); 
  m3.setPriority(Thread.MIN_PRIORITY);  
  m4.setPriority(Thread.NORM_PRIORITY); 
  m1.start();  
  m2.start(); 
  m3.start();
  m4.start();
   
 }  
} 

class Tdemo extends Thread{
     public void run(){  
       System.out.println("running thread name is:"+Thread.currentThread().getName());  
      System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
      
      }  
      
}
