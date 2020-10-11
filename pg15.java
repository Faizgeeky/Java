class pg15{

 public static void main(String[] args) {

   Multipl obj = new Multipl();
   obj.year();
   obj.date();
   obj.month();

 }

}
class A{
  void year(){
    System.out.print("2020");
  }
}
class B extends A{
  void month(){
    System.out.print(" October ");

  }
}

class Multipl extends B{

void date(){
  System.out.print(" 11 ");

}
}
