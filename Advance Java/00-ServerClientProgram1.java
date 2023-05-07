package com.mycompany.ad.javaclg;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Anshul Pawar
 */
public class ServerClientProgram1 {
    public static void main(String [] args){
        try{
//            System.out.println("1");
            ServerSocket serverSocket = new ServerSocket(23);
//            System.out.println("2");
            Socket clientSocket = serverSocket.accept();
//            System.out.println("3");
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(),true);
//            System.out.println("4");
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//            System.out.println("5");
            
            //REad the client request
            String request = in.readLine();
//            System.out.println("7");
            System.out.println("Request from client: "+ request);
//            System.out.println("8");
            //send a responce to a client
            out.println("Hello from the server! I am written in serverclientProgram");
//            System.out.println("6");
            //close the socket
            clientSocket.close();
            serverSocket.close();
//            System.out.println("9");
            
        }
        catch(Exception e){
//            System.out.println("10");
            System.err.print("Could not listen port: 23");
//            System.out.println("11");
            System.exit(1);
//            System.out.println("12");
        }
    }
}
