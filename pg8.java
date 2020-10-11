
public class pg8 {

	  public static void main(String [] args){

	        Animl obj = new Animl();
	        System.out.println(obj.who());

	    }
}
class Animl{

    String animal_type(String name){
        return name;
    }

    String animal_breed(String breed){
        String animal = animal_type("Dog");
        String final_animal = breed+" is a breed of "+animal;
        return  final_animal;
    }

    String who(){
        String animal = animal_breed("pug");
        return animal;
    }
}
