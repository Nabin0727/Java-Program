package Exam;
import java.net.*;
import java.io.*;
import java.util.*;

public class SeverMsg {
	public static void main(String args[]) throws IOException{
		try {
			System.out.println("Server.....\n");
			
			//Defining the server socket
			ServerSocket s = new ServerSocket(95);
			
			System.out.println("Server waiting for Client...");
			
			//Accepting the request
			Socket cs = s.accept();
			
			System.out.println("Clinet Connected!");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
			//Scanner in = new Scanner(cs.getInputStream());
			
			PrintWriter out = new PrintWriter(cs.getOutputStream(),true);
			while(true) {
				BufferedReader din = new BufferedReader(new InputStreamReader(System.in));
				
				System.out.print("To client!");
				String tocl = din.readLine();
				out.println(tocl);
				
				String st = in.readLine();
				
				if (st.equalsIgnoreCase("Bye") || st == null)break;
				System.out.println("From Client " + st);
			}
				in.close();
				out.close();
				cs.close();	
			}catch(IOException e) {}	
			
		}


}
