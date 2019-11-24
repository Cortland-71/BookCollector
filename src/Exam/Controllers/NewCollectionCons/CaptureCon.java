package Exam.Controllers.NewCollectionCons;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

import Exam.Controllers.Abstractions.ScreenShot;
import Exam.Data.Book;
import Exam.Data.DataObj;
import Exam.Data.Abstractions.Capturable;
import Exam.Data.Abstractions.Pointable;
import Exam.Data.Abstractions.ReadWritable;
import Exam.View.Window.Window;

public class CaptureCon extends ScreenShot implements ActionListener {

	private ReadWritable bookIO;
	private Pointable poiData;
	private Capturable capData;
	private Window window;
	private String[] inputList = new String[7];
	private int[] outputList = new int[3];

	public CaptureCon(Window window, Pointable poiData, ReadWritable bookIO,
			Capturable capData) {
		makeNewRobot();
		this.window = window;
		this.poiData = poiData;
		this.bookIO = bookIO;
		this.capData = capData;
		this.window.getTop().getHubCenter().getNColView()
				.addStartButtonListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == window.getTop().getHubCenter().getNColView()
				.getStartButton())
			start();

		else if (e.getSource() == window.getTop().getHubCenter().getNColView()
				.getPageDown())
			capData.setRadioIndex(0);

		else if (e.getSource() == window.getTop().getHubCenter().getNColView()
				.getRightArrow())
			capData.setRadioIndex(1);

		else
			capData.setRadioIndex(2);
	}

	private void start() {
		boolean inputValid = checkInputList();
		boolean valid = setVariables(inputValid);
		if (valid) {
			tabToBook();
			setSavePath();
			capture();
			saveBook();
		}
	}

	private void tabToBook() {
		robot.setAutoDelay(500);
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	private String setSavePath() {
		String path = window.getTop().getHubCenter().getNColView()
				.getSavePath();
		return path;
	}

	private String setName() {
		String name = window.getTop().getHubCenter().getNColView()
				.getBookName();
		return name;
	}

	private boolean checkInputList() {
		boolean valid = true;
		inputList[0] = window.getTop().getHubCenter().getNColView()
				.getStartPageNum();
		inputList[1] = window.getTop().getHubCenter().getNColView()
				.getEndPageNum();
		inputList[2] = window.getTop().getHubCenter().getNColView()
				.getWaitNum();
		inputList[3] = window.getTop().getHubCenter().getNColView()
				.getPointFieldText(0);
		inputList[4] = window.getTop().getHubCenter().getNColView()
				.getPointFieldText(1);
		inputList[5] = window.getTop().getHubCenter().getNColView()
				.getPointFieldText(2);
		inputList[6] = window.getTop().getHubCenter().getNColView()
				.getPointFieldText(3);

		for (int i = 0; i < inputList.length; i++)
			try {
				Integer.parseInt(inputList[i]);
			} catch (NumberFormatException e) {
				valid = false;
				showMessage("One or more fields has invalid or missing input.");
				break;
			}
		return valid;
	}

	private boolean setVariables(boolean valid) {
		boolean variableValid = false;
		if (valid) {
			for (int i = 0; i < outputList.length; i++) {
				outputList[i] = Integer.parseInt(inputList[i]);
			}
			capData.setPageStart(outputList[0]);
			capData.setPageEnd(outputList[1]);
			capData.setWait(outputList[2]);
			variableValid = true;
		}
		return variableValid;
	}

	@Override
	protected void capture() {

		int x = poiData.getStartingX();
		int y = poiData.getStartingY();
		int h = poiData.getHeight();
		int w = poiData.getWidth();

		hubVisible(false, window);
		holdOn(1000);
		try {
			for (int i = capData.getPageStart(); i <= capData.getPageEnd(); i++) {
				image = robot.createScreenCapture(new Rectangle(x, y, w, h));
				ImageIO.write(image, "png", new File(setSavePath() + "(" + i
						+ ")" + capData.getExtension()));
				turnPage();
			}
		} catch (Exception e) {
			return;
		}
		hubVisible(true, window);
		showMessage("Completed!");
	}

	private void saveBook() {
		Book book = new Book(setName(), setSavePath());
		bookIO.addBookToList(book);
		bookIO.saveBookList();
	}

	private void turnPage() {
		robot.setAutoDelay(capData.getWait());
		if (capData.getRadioIndex() == 0)
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		else if (capData.getRadioIndex() == 1)
			robot.keyPress(KeyEvent.VK_RIGHT);
		else
			robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	}

	// Display messages
	private void showMessage(String text) {
		JOptionPane.showMessageDialog(null, text);
	}

	private void makeNewRobot() {
		try {
			robot = new Robot();
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}
