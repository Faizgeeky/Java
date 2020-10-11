class pg19{

public static void main(String[] args) {

String s = "12s";
try{
  int a = Integer.parseInt(s);
}catch (NumberFormatException e) {
  System.out.println(e);
}

}


}
