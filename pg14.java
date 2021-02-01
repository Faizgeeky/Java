class FinalDemo {
    
    int a = 15;
    int b = 20;
    
    // create a final method
    public final void display() {
      System.out.println("This is a final method.");
    }
    
    public void show()
    {

        System.out.println("I can show you definetely");
    }
}

class Main extends FinalDemo {
  // try to override final method
//   public final void display() {
//     System.out.println("The final method is overridden.");
//   }
  
  public void show()
    {
        System.out.println(super.a + super.b + " Example of super");
        System.out.println("I am overide by my child class");
    }
  public static void main(String[] args) {
    Main obj = new Main();
    obj.display();
    obj.show();
  }
}
