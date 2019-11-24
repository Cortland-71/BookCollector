package Exam.Data.Abstractions;

public interface Pointable {

	public abstract String toString();

	public abstract void calculateWH();

	public abstract int getWidth();

	public abstract void setWidth(int width);

	public abstract int getHeight();

	public abstract void setHeight(int height);

	public abstract String getFullPath();

	public abstract int getStartingX();

	public abstract void setStartingX(int startingX);

	public abstract int getStartingY();

	public abstract void setStartingY(int startingY);

	public abstract int getEndingX();

	public abstract void setEndingX(int endingX);

	public abstract int getEndingY();

	public abstract void setEndingY(int endingY);

}