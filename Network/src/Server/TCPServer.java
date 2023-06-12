package Server;

import java.io.*;  
import java.net.*;  

public class TCPServer {  
	
	public static void main(String[] args){  
		try{  
			ServerSocket ss=new ServerSocket(1024);  
			Socket s=ss.accept();//establishes connection   
			DataInputStream dis=new DataInputStream(s.getInputStream());  
			String  str=(String)dis.readUTF();  
			System.out.println("Client said: "+str);  
			ss.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}  
	} 
} 
