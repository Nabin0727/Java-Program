package Exam;
import java.io.*;

public class CopyFiles{
	public static void main(String [] args) throws IOException{
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("Input.txt");
			out = new FileWriter("Output.txt");
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
			
		}finally {
			if (in != null) {
				in.close();
			}
		}
			if (out != null) {
				out.close();
			}
	}

}
