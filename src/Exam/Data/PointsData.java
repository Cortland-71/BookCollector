package Exam.Data;

import Exam.Data.Abstractions.Pointable;

public class PointsData implements Pointable {

	@Override
	public String toString() {
		return "PointsData [fullPath=" + fullPath + ", startingX=" + startingX
				+ ", startingY=" + startingY + ", endingX=" + endingX
				+ ", endingY=" + endingY + ", width=" + width + ", height="
				+ height + "]";
	}

	private final String fullPath = System.getProperty("user.home")
			+ "\\Desktop\\screenshotForPageCollector.png";

	private int startingX = 0;
	private int startingY = 0;

	private int endingX = 0;
	private int endingY = 0;
	
	private int width;
	private int height;
	
	@Override
	public void calculateWH() {
		width = endingX - startingX;
		height = endingY - startingY;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String getFullPath() {
		return fullPath;
	}

	@Override
	public int getStartingX() {
		return startingX;
	}

	@Override
	public void setStartingX(int startingX) {
		this.startingX = startingX;
	}

	@Override
	public int getStartingY() {
		return startingY;
	}

	@Override
	public void setStartingY(int startingY) {
		this.startingY = startingY;
	}

	@Override
	public int getEndingX() {
		return endingX;
	}

	@Override
	public void setEndingX(int endingX) {
		this.endingX = endingX;
	}

	@Override
	public int getEndingY() {
		return endingY;
	}

	@Override
	public void setEndingY(int endingY) {
		this.endingY = endingY;
	}

}
