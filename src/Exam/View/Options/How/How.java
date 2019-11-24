package Exam.View.Options.How;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Exam.View.Abstractions.AES;

public class How {
	
	public JPanel getTopPanel() {
		return howPanel();
	}
	
	private JPanel howPanel() {
		JPanel howPanel = new JPanel();
		howPanel.setLayout(new BorderLayout());
		howPanel.setBackground(new Color(20,20,20));
		howPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
		howPanel.add(howPane(), BorderLayout.CENTER);
		return howPanel;
	}
	
	private JTextArea howArea;
	private JScrollPane howPane;
	private JScrollPane howPane() {
		howArea = new JTextArea();
		howArea.setBackground(new Color(10,10,10));
		AES.setFont(howArea, "Consolas", 0, 15, Color.ORANGE);
		howArea.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
		howPane = new JScrollPane(howArea);
		setHowText();
		return howPane;
	}
	
	private void setHowText() {
		howArea.setText("Note: If you are using a Mac you will need to make a change to"
				+ "path on line 17 in the BookIOData.java file under the Data package."
				+ "\n\nThe following are some tips on capturing pages.\n\n"
				+ "First start by creating a parent directory for your book, I would recommend naming this folder\n"
				+ "the name of the book. Then create sub folders inside for each chapter to house the pages. The\n"
				+ "program will automatically create numbers for your folders if there is more than 1 folder being\n"
				+ "created. The numbering starts at 0.\n"
				+ "Capturing dimensions\n\n"
				+ "Next click the get points button to choose the section of the screen you want to capture.\n"
				+ "When you click this button it will hide the main window to give you a view of whatever\n"
				+ "is behind. Click and drag from the top left to the bottem right and let go to capture that section.\n\n"
				+ "Starting to capture\n\n"
				+ "Finally you can name your book for the collection and choose a method for turning the pages.\n"
				+ "The path will be set to the first directory of whatever set of folders you created last. Change the path\n"
				+ "as needed though you don't need to name the pages, since the page numbers will be the default name.\n"
				+ "Choose a time between turning the page and capturing. This time is in milliseconds so 1 second is\n"
				+ "1000 milliseconds. Do a few tests to get this number correct. Once you are ready you can begin the\n"
				+ "process. Once the capturing begins, you cannot stop it unless you close the program externally.\n"
				+ "So I recommend doing some test runs before capturing a large book.\n\n"
				+ "Viewing the collection\n\n"
				+ "Once you have captured a book, you can then view your collection by selecting the View Collections\n"
				+ "button. This will show you the separate parent directories you have created and a button to open\n"
				+ "that path using the file explorer for easy access. Note: If you change the name or location of a\n"
				+ "parent directory, it will not change in the view collections area. It will no longer give you access\n"
				+ "to view from the application. With each run of a new capture, it will save that information to an\n"
				+ "object and that object will be saved to a list. This list is saved into a file called\n"
				+ "PageCollectorMetaData, that must remain on the desktop. Moving or renaming this file will cause\n"
				+ "the application to no longer find a collection for you to view.");
	}

}
