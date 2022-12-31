/*
 1. *****
    *****
    *****
    *****
    *****


2.  *
    **
    ***
    ****
    *****


3.  *****
    ****
    ***
    **
    *


4.  1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5


5.  *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *
*/
package com.assignment9.patterns;

/**
 *
 * @author Anshul Pawar
 */
public class Pattern1To5 {
    public static void main(String [] args){
           //pattern1(5);
           //pattern2(5);
           //pattern3(5);
           //pattern4(5);
           pattern5(5);
    }
    public static void pattern5(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
                
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
    
    public static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }
}
