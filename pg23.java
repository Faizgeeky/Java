public class Main  {

public static void main(String[] args) throws
InterruptedException {
Tdemo de = new Tdemo();
 
System.out.println("getstate"+de.getState());
de.start();
System.out.println("getstate"+de.getState());

System.out.println("Thred Name"+de.getName());
System.out.println("Thread Priority"+de.getPriority());

System.out.println("getstate"+de.getState());
}
}


class Tdemo extends Thread{
    public void run() {
    for(int i=0;i<3;i++) {
  
    try {
        System.out.println("thread is going to sleep");
        Tdemo.sleep(1000);
        System.out.println(" wake up");
    } 
    catch (InterruptedException e) {
    
         e.printStackTrace();
    }
}
}
}
