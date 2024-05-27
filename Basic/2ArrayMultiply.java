//Write a Java program to multiply corresponding elements of two arrays of integers.

import java.util.Scanner;
class  Array{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Size of array1: ");
		int a = sc.nextInt();
		int arr1[] = new int[a];
		System.out.println("Enter element of array: ");
		for(int i=0;i<a;i++)
			arr1[i] = sc.nextInt();
		
		System.out.print("Enter Size of array2: ");
		int b = sc.nextInt();
		int arr2[] = new int[b];
		System.out.println("Enter element of array2: ");
		for(int i=0;i<b;i++)
			arr2[i] = sc.nextInt();
		int lar = (a>b) ? a : b;
		System.out.print("Multiply of array: ");
		System.out.print("Multiply of array: ");
		int mul[] = new int[lar];
			
		 int i=0,j=0,k=0;
 		while(i<a&&j<b){
    		mul[k++]=arr1[i++]*arr2[j++];
		}
 		while (i<a)
 		{
    		mul[k++]=arr1[i++]; 
 		}
 		while(j<b){
    		mul[k++]=arr2[j++];
 		}
		for(int var:mul)
			System.out.print(var+" ");
	}
}
