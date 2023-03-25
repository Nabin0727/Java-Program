package Exam;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import.javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.InternetAddress;
import javax.mail.*;


public class SendingMail {
	public static void main (String args[]) {
		//Recipients mail 
		String toMail = "fromaddress@gmail.com";
		
		//Sender's
		String fromMail = "toaddress@gamil.com";
		
		//Assuming smpt mail server
		String host = "smtp.gmail.com";
		
		//Get system properties
		Properties properties = System.getProperties();
		
		//setup mail server
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", "456");
		properties.put("mail.smtp.ssl.enable", "true");
		properties.put("mail.smtp.auth", "true");
		
		//get the session 
		
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("fromaddress@gmail.com" "hellofirend");
			}
		});
		
		//Used to debug smtp issue
		session.setDebug(true);
		try {
			//create default mimimessage object
			MimeMessage message = new MimeMessage(session);
			
			//set from header
			message.setFrom(new InternetAddress(fromMail));
			
			//to header
			message.addRecipent(Message.RecipentType.TO new InternetAddress(toMail));
			
			//set subject header
			message.setSubject("This is the subject line");
			
			//actual message
			message.setText("this is a actual message");
			System.out.println("Sending.....");
			
			//Send message
			Transport.send(message);
			System.out.println("Message sent sucessfully");
			
		}catch(MessagingException mex) {
			mex.printStackTrace();
		}	
		
	}

}
