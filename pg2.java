class pg2{
	
	public static void main(String [] args){
	
	 //find sum of 1/1! + 1 /2! + 1/3!...//
	System.out.println("Hello World!");
	int n = 5;
	double sum = 0;
	float	fact = 1;
	int k = 1;
	while (k<=n){
		fact = 1;
		for(int i=1; i<=k;i++){
			fact = fact * i;
		}

		sum = sum + (1/fact);

		k++;
	}
	
	System.out.println(sum);
	}
	
}