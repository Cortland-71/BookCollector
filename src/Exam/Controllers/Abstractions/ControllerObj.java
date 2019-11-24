package Exam.Controllers.Abstractions;

import Exam.Controllers.HubCon;
import Exam.Controllers.NewCollectionCons.CaptureCon;
import Exam.Controllers.NewCollectionCons.FolderCon;
import Exam.Controllers.NewCollectionCons.PointsCon;
import Exam.Controllers.ViewCollectionsCon.ViewCon;
import Exam.Data.CaptureData;
import Exam.Data.DataObj;
import Exam.Data.Abstractions.Pointable;
import Exam.Data.Abstractions.ReadWritable;
import Exam.View.Window.Window;

public abstract class ControllerObj {
	
	private static ReadWritable bookIO;

	public static HubCon getNewNorthHubCon(Window window) {
		bookIO = DataObj.getNewBookIO();
		return new HubCon(window, bookIO);
	}
	
	public static CaptureCon getNewCapCon(Window window, Pointable poiData) {
		return new CaptureCon(window, poiData, bookIO, DataObj.getNewCapData());
	}
	
	public static FolderCon getNewFolCon(Window window) {
		return new FolderCon(window, DataObj.getNewFolData());
	}
	
	public static PointsCon getNewPoiCon(Window window) {
		return new PointsCon(window, DataObj.getNewPointsData());
	}
	
	public static ViewCon getNewViewCon(Window window) {
		return new ViewCon(window);
	}
}
