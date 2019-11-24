package Exam.Data;

import Exam.Data.Abstractions.Capturable;

public class CaptureData implements Capturable {

	private int pageStart;
	private int pageEnd;
	private int wait;
	private int radioIndex = 2;
	private final String extension = ".png";
	
	@Override
	public void setRadioIndex(int radioIndex) {
		this.radioIndex = radioIndex;
	}
	
	@Override
	public int getPageStart() {
		return pageStart;
	}
	@Override
	public int getPageEnd() {
		return pageEnd;
	}
	
	@Override
	public String getExtension() {
		return extension;
	}
	@Override
	public int getRadioIndex() {
		return radioIndex;
	}
	@Override
	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}
	@Override
	public void setPageEnd(int pageEnd) {
		this.pageEnd = pageEnd;
	}
	@Override
	public void setWait(int wait) {
		this.wait = wait;
	}
	
	@Override
	public int getWait() {
		return this.wait;
	}
}
