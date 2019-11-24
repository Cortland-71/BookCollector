package Exam.Controllers.Abstractions;

import java.awt.Robot;
import java.awt.image.BufferedImage;

import Exam.View.Window.Window;

public abstract class ScreenShot {

	protected Robot robot;
	protected BufferedImage image;
	
	protected abstract void capture();
	
	protected void holdOn(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	protected void hubVisible(boolean state, Window window) {
		if (state)
			window.show();
		else
			window.hide();
	}
}
