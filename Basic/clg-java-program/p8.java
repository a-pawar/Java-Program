// Main method is in ObjectDemo class
class ObjectDemo{
	int i =10;                //instance variable
	static int j=20;
	public static void main(String [] args){
		int k=30;
		ObjectDemo obj = new ObjectDemo();
		System.out.println("Instance variable: "+obj.i);
		System.out.println("Local Variable: "+k);
		System.out.println("Static Variable: "+j);
		
		Demo obj1 = new Demo();
		obj1.print();
		System.out.println("Static Variable: "+obj1.s);
		
	}
}

class Demo{
	static int s=200;
	int i = 100;          
	void print(){
		int a=300;
		System.out.println("Instance variable: "+i);
		System.out.println("Local Variable: "+a);
	}
}
		