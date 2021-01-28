class Main{

 public static void main(String[] args) {

   Vehicle obj1 = new Vehicle();
   
   
   obj1.carname();
   obj1.model();
  }


}

abstract class Car {

 
  public abstract void carname();
  public void model() {
    System.out.println("2021");
  }

}

class Vehicle extends Car {
    
  public void carname() {
    
    System.out.println("Fortuner");
  }
}
