package com.mycompany.ad.javaclg;

import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Anshul Pawar
 */
public class ClientServerProgram1 {
    public static void main(String [] args){
        try{
            Socket socket = new Socket("localhost",23);
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            //Read the server response
            String response = in.readLine();
            System.out.println("Responce of server:"+response);
            
            //send datat to the server
            out.println("Hello from the client!!!!");
            
            //close the socket
            socket.close();
            
        }
        catch(Exception e){
            System.err.println("Couldn't get I/O for the connection to: localhost");
            System.exit(1);
        }
    }
}
