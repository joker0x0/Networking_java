package Client;

import java.io.*;  
import java.net.*;  
public class TCPClient {  
	
	public static void main(String[] args) {  
		try{      
			Socket s=new Socket("localhost",1024);  
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			dout.writeUTF("Hello, World!".toUpperCase());  
			dout.flush();  
			dout.close();  
			s.close();  
		}
		catch(Exception e) {
			System.out.println(e);
		}  
	}  
}  
