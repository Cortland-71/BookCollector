package Exam.Controllers.NewCollectionCons;

import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

import Exam.Controllers.Abstractions.ScreenShot;
import Exam.Data.DataObj;
import Exam.Data.Abstractions.Pointable;
import Exam.View.Options.FullScreen;
import Exam.View.Window.Window;

public class PointsCon extends ScreenShot implements ActionListener, MouseListener{
	private Window window;
	private Pointable pointsData;
	private FullScreen fs;
	
	public Pointable getPointsData() {
		return pointsData;
	}

	public PointsCon(Window window, Pointable pointsData) {
		this.window = window;
		
		this.pointsData = pointsData;
		fs = new FullScreen();
		window.getTop().getHubCenter().getNColView().addPointsButtonListener(this);
		fs.addLabelMouseListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		hubVisible(false, window);
		holdOn(1000);
		capture();
		holdOn(1000);
		fs.setVisible(true);
		JOptionPane.showMessageDialog(null, "Press OK and click and drag the portion of the screen you want to capture.");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pointsData.setStartingX(e.getX());
		pointsData.setStartingY(e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		pointsData.setEndingX(e.getX());
		pointsData.setEndingY(e.getY());

		window.getTop().getHubCenter().getNColView().getPointTextField(0)
				.setText(Integer.toString(pointsData.getStartingX()));
		
		window.getTop().getHubCenter().getNColView().getPointTextField(1)
				.setText(Integer.toString(pointsData.getStartingY()));

		pointsData.calculateWH();

		window.getTop().getHubCenter().getNColView().getPointTextField(2)
				.setText(Integer.toString(pointsData.getWidth()));
		window.getTop().getHubCenter().getNColView().getPointTextField(3)
		.setText(Integer.toString(pointsData.getHeight ()));
		
		hubVisible(true, window);
		fs.setVisible(false);
	}

	@Override
	protected void capture() {
		try {
			robot = new Robot();
			image = robot.createScreenCapture(new Rectangle(Toolkit
					.getDefaultToolkit().getScreenSize()));
			fs.setScreenShotLabel(image);
		} catch (HeadlessException e1) {
			e1.printStackTrace();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}
}
