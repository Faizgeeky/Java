class pg10{

public static void main(String[] args) {
      Child obj1 = new Child();

      obj1.Child();
      obj1.Parent();

}

}
class Parent{

  void Parent(){
    System.out.println("I am Parent class");
  }
}
class Child extends Parent{

  void Child(){
    System.out.println("I am Child class");
  }

}
