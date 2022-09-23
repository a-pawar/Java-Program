class OddProduct{
	public static  void main(String [] args){
		
		int product=1;
		for(int i=1;i<=15;i=i+2){
			product *= i;
		
		}
		System.out.println("Product: "+product);
	}
} 