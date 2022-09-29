
class MethodOverloading{
	public static  void main(String [] args){
		Demo obj = new Demo();	
		int sum1=obj.add(10,20);
		System.out.println(sum1);
		int sum2=obj.add(10,20,30);	
		System.out.println(sum2);
	}
} 

class Demo{
	public int add(int a,int b){
		return a+b;
	}
	public int add(int a,int b,int c){
		return a+b+c;
	}
} 