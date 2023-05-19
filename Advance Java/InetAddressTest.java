/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ad.javaclg;
import java.net.*;
/**
 *
 * @author Anshul Pawar
 */
public class InetAddressTest {
    public static void main(String [] args){
        try{
            InetAddress localHostAddress = InetAddress.getLocalHost();
            System.out.println(localHostAddress);
            String a = localHostAddress.getHostAddress();
            System.out.println(a);
            String b = localHostAddress.getHostName();
            System.out.println(b);
            System.out.println(a.equals(b));
            String c = localHostAddress.toString();
            System.out.println(c);
        }
                
        catch(Exception e){
            System.out.print("Error"+ e);
        }
    }
}
