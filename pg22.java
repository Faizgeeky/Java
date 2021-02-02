class a implements Runnable{

  public void run(){
    for(int i=0;i<5;i++){
               System.out.println("Hi i am thread a");
        try {
          Thread.sleep(1000);
        }catch (Exception e) {
          System.out.println(e);
        }
    }
    
  }
}
class b implements Runnable{

  public void run(){
    for(int i=0;i<5;i++){
        System.out.println("HELLO i am thread b");
        try {
          Thread.sleep(1000);
        }catch (Exception e) {
          System.out.println(e);
        }
    }
  }
}

class pg22{

  public static void main(String[] args) {
    System.out.println("In main");


      
    a obj = new a();
    b obj2 = new b();
    
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj2);

    t1.start();
    try {
      Thread.sleep(10);
    }catch (Exception e) {
      System.out.println(e);
    }
    t2.start();
  }

}
