package Exam.View.Options.NewCollection.NewColTopView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Exam.View.ViewObj;
import Exam.View.Options.NewCollection.Steps.CaptureView;
import Exam.View.Options.NewCollection.Steps.FoldersView;
import Exam.View.Options.NewCollection.Steps.PointsView;

public class NewCollectionsView {
	
	private FoldersView foldersView;
	private PointsView pointsView;
	private CaptureView captureView;
	
	public JPanel getTopPanel() {
		return newCollectionsPanel();
	}
	
	public NewCollectionsView() {
		pointsView = ViewObj.getNewPointsView();
		captureView = ViewObj.getNewCapView();
		foldersView = ViewObj.getNewFolderView();
	}
	
	public JPanel newCollectionsPanel() {
		JPanel newCPanel = new JPanel();
		newCPanel.setLayout(new BorderLayout());
		newCPanel.setBackground(new Color(20,20,20));
		newCPanel.add(foldersView.north(), BorderLayout.NORTH);
		newCPanel.add(pointsView.center(), BorderLayout.CENTER);
		newCPanel.add(captureView.south(), BorderLayout.SOUTH);
		return newCPanel;
	}

	public String getBookName() {
		return captureView.getBookNameText();
	}
	
	public String getWaitNum() {
		return captureView.getWaitFieldText();
	}
	
	public String getStartPageNum() {
		return captureView.getStartPageNumber();
	}

	
	public String getEndPageNum() {
		return captureView.getEndPageNumber();
	}
	
	
	
	
	
	
	
	//Folder paths
	public void setFolderPath(String path) {
		foldersView.setPathText(path);
		captureView.setPathText(path);
	}
	public String getFolderPath() {
		return foldersView.getPathText();
	}
	
	public void setSavePath(String path) {
		captureView.setPathText(path);
	}
	public String getSavePath() {
		return captureView.getPathText();
	}
	
	
	
	
	
	
	//point text boxes
	public JTextField getPointTextField(int index) {
		return pointsView.getPointField(index);
	}
	
	//Number of folders
	public void setNumField(String i) {
		foldersView.setNumField(i);
	}
	public String getNumOfFoldersText() {
		return foldersView.getNumOfFoldersText();
	}
	
	//Buttons
	public JButton getStartButton() {
		return captureView.getStartButton();
	}
	public JRadioButton getPageDown() {
		return captureView.getPageDownRadio();
	}
	public JRadioButton getRightArrow() {
		return captureView.getRightArrowRadio();
	}
	public JRadioButton getMouseClick() {
		return captureView.getMouseClickRadio();
	}
	
	//Points
	public String getPointFieldText(int i) {
		return pointsView.getPointField(i).getText();
	}
	
	//Button listeners
	public void addStartButtonListener(ActionListener l) {
		captureView.addButtonListener(l);
	}
	public void addFolderButtonListener(ActionListener l) {
		foldersView.addButtonListener(l);
	}
	public void addPointsButtonListener(ActionListener l) {
		pointsView.addButtonListener(l);
	}
}
