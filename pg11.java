class pg11{

 public static void main(String[] args) {

   Multipl obj = new Multipl();

   obj.year();
   obj.month();
   obj.data();
 }

}
interface A{
  void year();
}
interface B{
  void month();
}

class Multipl implements A,B{

  public void year(){
    System.out.println("2020");
  }
  public void month(){
    System.out.println("October ");
  }
  void data(){
    System.out.println("11 ");
  }
}
