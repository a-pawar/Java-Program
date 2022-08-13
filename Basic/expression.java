/*Write a Java program to compute the specified expressions and print the output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) */

class ex{
	public static void main(String [] args){
		double a= ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(a);

		double result = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
		System.out.println(result);
	}
}