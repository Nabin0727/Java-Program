package Exam;


public class MultiThread extends Thread{
	public void run() {
		System.out.println("Running");
	}
	
	public static void main (String [] args) {
		MultiThread thread = new MultiThread();
		thread.start();
		
	}
	

}
