package Exam.Data.Abstractions;

public interface Capturable {

	public abstract void setRadioIndex(int radioIndex);

	public abstract int getPageStart();

	public abstract int getPageEnd();

	public abstract String getExtension();

	public abstract int getRadioIndex();

	public abstract void setPageStart(int pageStart);

	public abstract void setPageEnd(int pageEnd);

	public abstract void setWait(int wait);
	
	public abstract int getWait();
}