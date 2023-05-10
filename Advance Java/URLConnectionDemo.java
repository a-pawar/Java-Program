/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ad.javaclg;

import java.net.*;
import java.io.*;
import java.util.Date;
/**
 *
 * @author Anshul Pawar
 */
public class URLConnectionDemo {

    
    public static void main(String [] args)throws Exception{
        URL url = new URL("https://www.google.com");
        URLConnection conn =  url.openConnection();
        
        conn.connect();
    
        InputStream input = conn.getInputStream();
        int c;
        while((c=input.read())>0){
            System.out.print((char)c);
        }
        input.close();
    }
}
