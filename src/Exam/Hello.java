package Exam;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

//define remote interface
public interface Hello extends Remote{
	String sayHello() throws RemoteException;

}

//Implementation of remote interface
public class HelloImpl extends UnicastRemoteObject implements Hello{
	public HelloImpl() throws RemoteException{
		super();
	}
	public String sayHello() {
		return "Hello";
	}
}

//Creating server
 class Server{
	 public void static main (String args[]) {
		 try {
			 HelloImp obj = new HelloImp(); //remomte object
			 
			 //Blind remote object with rmi 
			 Naming.rebind("//localhost//Hello", obj);
			 
			 System.out.println("Hello server ready");
			 
		 }catch(Exception e) {
			 System.out.println("Server failed" + e);
		 }
	 }
 }
 
 
 //Create Client
 class Client{
	 public static void main(String args[]) {
		 try {
			 //look the remote obj
			 Hello obj = (Hello) Naming.lookup("//localhost/hello");
			 
			 //invoke method 
			 String message = obj.sayHello();
			 
			 System.out.println(message);
			 
		 }catch(Exception e ) {
			 System.out.println("hello client exception " + e);
		 }
	 }
 }
