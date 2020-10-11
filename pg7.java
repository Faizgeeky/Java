class pg7{

 public static void main(String[] args) {

   Vehicle obj1 = new Vehicle();
   obj1.carname();
  }


}

abstract class Car {


  public abstract void carname();


}

class Vehicle extends Car {
  public void carname() {

    System.out.println("Fortuner");
  }
}
