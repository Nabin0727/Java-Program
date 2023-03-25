package Exam;
import java.awt.*;
import java.awt.event.*;

public class PopUpMenu {
	PopUpMenu(){
		final Frame frame = new Frame("Pop up menu");
		final PopupMenu popupmenu = new PopupMenu("Edit");
		MenuItem copy = new MenuItem("copy");
		copy.setActionCommand("copy");
		MenuItem paste = new MenuItem("paste");
		paste.setActionCommand("paste");
		popupmenu.add(copy);
		popupmenu.add(paste);
		frame.add(popupmenu);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
		public static void main(String [] args) {
			new PopUpMenu();
			
		}
		
		
		
	}
	
	
	

