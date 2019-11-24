package Exam.Data;

import Exam.Data.Abstractions.Capturable;
import Exam.Data.Abstractions.Fileable;
import Exam.Data.Abstractions.Pointable;
import Exam.Data.Abstractions.ReadWritable;

public class DataObj {

	public static ReadWritable getNewBookIO() {
		return new BookIOData();
	}
	
	public static Pointable getNewPointsData() {
		return new PointsData();
	}
	
	public static Capturable getNewCapData() {
		return new CaptureData();
	}
	
	public static Fileable getNewFolData() {
		return new FoldersData();
	}
}
