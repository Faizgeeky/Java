import java.util.Arrays;
class pg4{

public static void main(String [] args){
	String names[] = {"Messi","Roaldo","Neymar","Zlatan","Suarez","Inesta"};
	
	 Arrays.sort(names);
	
	for(int i=0;i<names.length;i++){
		System.out.println(names[i]);
	}
}

}