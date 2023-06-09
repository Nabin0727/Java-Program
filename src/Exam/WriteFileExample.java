package Exam;
import java.io.*;

public class WriteFileExample {
	
	public static void main(String[] args) {
		FileOutputStream fop = null;
		File file;
		String content = "This is the text content";
		
		try {
			file = new File("C:\\Users\\ASUS\\Desktop\\7thSem\\Java\\newfile.txt");
			fop = new FileOutputStream(file);
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
			// get the content in bytes
			byte[] contentInBytes = content.getBytes();
			fop.write(contentInBytes);
			fop.flush();
			fop.close();
			System.out.println("Done");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
}
		}
	}
}
