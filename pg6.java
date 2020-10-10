class pg6{

public static void main(String [] args){

  Car c1 =new Car("Mercedece ");
  Car c2 =new Car("Fortuner ",2020);
  Car c3 =new Car("i20 ","Sportz");


}

}
class Car{

  public Car(String name){
    System.out.println("Car name is "+name);
  }

  public Car(String name, String model){
    System.out.println("Car name is "+name+"and model is "+model);
  }
  public Car(String name, int year){
    System.out.println("Car name is "+name+"launch in year "+year);
  }
}
