package Exam.Controllers.NewCollectionCons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Exam.Data.DataObj;
import Exam.Data.Abstractions.Fileable;
import Exam.View.Window.Window;

public class FolderCon implements ActionListener {
	
	private Fileable foldersData;
	private Window window;
	
	public FolderCon(Window window, Fileable foldersData) {
		this.window = window;
		this.foldersData = foldersData;
		window.getTop().getHubCenter().getNColView().setFolderPath(this.foldersData.getBasePath());
		window.getTop().getHubCenter().getNColView().setNumField("1");
		window.getTop().getHubCenter().getNColView().addFolderButtonListener(this);
	}

	//Button events
	@Override
	public void actionPerformed(ActionEvent e) {
		makeFolders();
	}
	
	//Create folders
	private void makeFolders() {
		if(trySetNumFolders()) {
			setPath();
			String added = foldersData.createFiles();
			window.getTop().getHubCenter().getNColView().setFolderPath(foldersData.getPath() + added);
			showMessage("Folder(s) made successfully.");
		}
	}
	
	//Set path to Folder class from text field
	private void setPath() {
		String input = window.getTop().getHubCenter().getNColView().getFolderPath();
		foldersData.setFolderPath(input);
	}
	
	//Set number of folders to Folder class
	private boolean trySetNumFolders() {
		String input = window.getTop().getHubCenter().getNColView().getNumOfFoldersText();
		try {
			int output = Integer.parseInt(input);
			if(output > 0) {
				foldersData.setNumberOfFolders(output);
				return true;
			}
			else
				showMessage("Number of folders must be greater than 0.");
		} catch (NumberFormatException e) {
			showMessage("Invalid input.");
		}
		return false;
	}
	
	//Display messages
	private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}
}
