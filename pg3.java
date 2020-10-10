class pg3{
	
	
	public static void main(String args[]){
		
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=Double.parseDouble(args[2]);
		
		double root1 , root2;
		
		double deter = (b*b) - 4*a*c;
		
		// When determent is Positive //
		if (deter > 0){
		root1 = (-b + Math.sqrt(deter)) / (2 *a);
		root2 = (-b - Math.sqrt(deter)) / (2 *a);
		System.out.println("Root1 & 2 are --> "+root1+ " "+root2);
		}
		// When determent is Zero //
		else if(deter == 0){
			
			root1 = root2 = -b /(2*a); 
			System.out.println("Root1 & 2 are --> "+root1+ " "+root2);
		}
		// When determent is Negative //
		else{
			
			double r = -b /(2*a);
			double img = Math.sqrt(-deter) / (2*a);
			System.out.println(" less then 0 real and img part"+r+ " "+img);
		}
		
	}


}