package Exam;
import java.io.*;
public class ReadFileExample {
public static void main(String[] args) {
	File file = new File("C:\\Users\\ASUS\\Desktop\\7thSem\\Java\\File.txt");
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(file);
		System.out.println("Total file size to read (in bytes) : "
				+ fis.available());
		int content;
		while ((content = fis.read()) != -1) {
			// convert to char and display it
			System.out.print((char) content);
		}
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
		try {
			if (fis != null)
				fis.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	}
}
