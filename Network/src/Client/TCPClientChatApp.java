package Client;
import java.net.*;
import java.util.Scanner;
import java.io.*;
class TCPClientChatApp {

	public static void main(String args[]) throws Exception{  
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.print("To connect type 'connect': ");
		str = sc.nextLine();
		
		if(str.equals("connect".toLowerCase())) {
			Connect();
		} else {
			System.out.println("Something went wrong");
		}		  
	}

public static void Connect() throws Exception {
	Socket s=new Socket("192.168.1.14",1026);  
	DataInputStream din=new DataInputStream(s.getInputStream());  
	DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  

	String str="",str2="";  
	while(!str.equals("stop")){  
		str=br.readLine();  
		dout.writeUTF(str);  
		dout.flush(); 
		str2=din.readUTF();  
		System.out.println("Server says: "+str2);  
	}  

	dout.close();  
	s.close();
	}
}