package Exam.Controllers;

import java.awt.AWTException;

import Exam.Controllers.Abstractions.ControllerObj;
import Exam.View.ViewObj;
import Exam.View.Hub.Hub;
import Exam.View.Window.Window;

public class CarrilloFinalExam {
	
	//Name: Cortland Carrillo
	//Date: 5/5/2019
	//Description: This program can capture pages from your computer and save them. A list of
	//objects are created based on the books that you've captured, their location can then
	//be easily opened. 

	private static Window window;
	private static HubCon hubCon;

	public static void main(String[] args) throws AWTException {
		window = ViewObj.getNewWindow();
		hubCon = ControllerObj.getNewNorthHubCon(window);
		hubCon.start();
		window.setVisible(true);
	}
}
