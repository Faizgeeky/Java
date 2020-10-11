
public class pg12{

	public static void main(String [] args) {

		b obj1 = new b();
		System.out.println(obj1.ab());
	}

}

class a{

	int ab() {
		return 10;
	}

}
class b extends a{

	int ab() {
		return 5;
	}

}
