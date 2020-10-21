import myPackage.pack1;

import myPackage.subp.subpack;

class pg16 {

public static void main(String[] args) {
  System.out.println("Main");

  pack1 p = new pack1();
  p.method1(25,98);

  subpack obj = new subpack();
  obj.display();
  // Prot obj = new Prot();
  // obj.display();

}


}
