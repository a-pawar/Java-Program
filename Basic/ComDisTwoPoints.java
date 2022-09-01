//Write a Java program to compute the distance between two points on the surface of earth.
//d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)
//Radius of the earth r = 6371.01 Kilometers

import java.util.Scanner;
class Distance{
	public static void main(String [] args){
		double lat1,lon1,lat2,lon2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the latitude of coordinate 1:  ");
		lat1 = sc.nextDouble();
		System.out.print("Enter the longatude of coordinate 1:  ");
		lon1 = sc.nextDouble();
		System.out.print("Enter the latitude of coordinate 2:  ");
		lat2 = sc.nextDouble();
		System.out.print("Enter the longatude of coordinate 2:  ");
		lon2 = sc.nextDouble();
		
		System.out.println(computeLatLong(lat1,lon1,lat2,lon2));
	}

public static double computeLatLong(double lat1,double lon1,double lat2,double lon2){
	 lat1 = Math.toRadians(lat1);
	 lon1 = Math.toRadians(lon1);
	 lat2 = Math.toRadians(lat2);
	 lon2 = Math.toRadians(lon2);
	
	double radius = 6371.01 ; //km
	double d = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2)+ Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
	return d;
	}
}
