package Exam;
import java.net.*;
import java.io.*;
import java.util.*;

public class MsgClient {
	public static void main(String args[]) throws IOException{
		try {
			System.out.println("Client.....\n");
			//Defining the  socket
			Socket con = new Socket("localhost", 95);
			
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			PrintWriter out = new PrintWriter(con.getOutputStream(),true);
			
			while(true) {
				String s1 = in.readLine();
				System.out.println("From Sever " + s1);
				
				System.out.println("Enter  message to server :");
				BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
				String st = din.readLine();
				
				out.println(st);
				
				if (st.equalsIgnoreCase("Bye") || st == null)break;
			}
				in.close();
				out.close();
				con.close();	
			}catch(UnknownHostException e) {}	
	}

}
