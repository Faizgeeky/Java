
class a extends Thread{

  public void run(){
    for(int i=0;i<5;i++){
        System.out.println("HI i am thread a");
        try {
          Thread.sleep(1000);
        }catch (Exception e) {
          System.out.println(e);
        }
    }
  }
}
class b extends Thread{

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

class pg21{

  public static void main(String[] args) {
    System.out.println("In main");

    a obj = new a();
    b obj2 = new b();

    obj.start();
    try {
      Thread.sleep(10);
    }catch (Exception e) {
      System.out.println(e);
    }
    obj2.start();
  }

}
