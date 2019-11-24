package Exam.Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Exam.Controllers.Abstractions.ControllerObj;
import Exam.Controllers.NewCollectionCons.CaptureCon;
import Exam.Controllers.NewCollectionCons.FolderCon;
import Exam.Controllers.NewCollectionCons.PointsCon;
import Exam.Controllers.ViewCollectionsCon.ViewCon;
import Exam.Data.Book;
import Exam.Data.Abstractions.ReadWritable;
import Exam.View.Window.Window;

public class HubCon implements ActionListener {
	
	private Window window;
	private ReadWritable bookIOData;
	
	private CaptureCon capCon;
	private FolderCon folCon;
	private PointsCon poiCon;
	private ViewCon viewCon;
	
	public HubCon(Window window, ReadWritable bookIOData) {
		this.window = window;
		this.bookIOData = bookIOData;
	}
	
	public void start() {
		viewCon = ControllerObj.getNewViewCon(window);
		folCon = ControllerObj.getNewFolCon(window);
		poiCon = ControllerObj.getNewPoiCon(window);
		capCon = ControllerObj.getNewCapCon(window, poiCon.getPointsData());
		
		this.window.getTop().getHubNorth().addButtonListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//New collection
		if(e.getSource() == window.getTop().getHubNorth().getButton(0)) 
			showNewCollectionPanel();
		
		//View Collection
		else if(e.getSource() == window.getTop().getHubNorth().getButton(1)) 
			showViewCollectionPanel();
		
		//How
		else if(e.getSource() == window.getTop().getHubNorth().getButton(2)) 
			showHowPanel();
	}
	
	private void showNewCollectionPanel() {
		window.getTop().getHubCenter().changePanel("new");
	}
	
	private void showViewCollectionPanel() {
		if(bookIOData.getBookList() != null) {
			bookIOData.loadBookList();
			addBooksToView();
		}
		
		window.getTop().getHubCenter().changePanel("view");
	}
	
	private void addBooksToView() {
		window.getTop().getHubCenter().getVColView().clearList();
		for(Book i : bookIOData.getBookList()) {
			window.getTop().getHubCenter().getVColView().addToBookJList(i);
		}
	}
	
	private void showHowPanel() {
		window.getTop().getHubCenter().changePanel("how");
	}
}
