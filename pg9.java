class pg9 {

static int a = stc();

static{
  System.out.println("I am static Block");
}
static int stc(){
  System.out.println("I am static Method");
  return 10;
}

 public static void main(String[] args) {

   System.out.println("In Main");
   System.out.println("Static Var "+a);

}

}
