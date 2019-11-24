package Exam.View;

import Exam.View.Hub.Hub;
import Exam.View.Hub.HubCenter;
import Exam.View.Hub.HubNorth;
import Exam.View.Options.How.How;
import Exam.View.Options.NewCollection.NewColTopView.NewCollectionsView;
import Exam.View.Options.NewCollection.Steps.CaptureView;
import Exam.View.Options.NewCollection.Steps.FoldersView;
import Exam.View.Options.NewCollection.Steps.PointsView;
import Exam.View.Options.ViewCollection.ViewCollectionsView;
import Exam.View.Window.Window;

public class ViewObj {
	
	public static Window getNewWindow() {
		return new Window();
	}

	public static Hub getNewHub() {
		return new Hub();
	}
	
	public static HubNorth getNewHubNorth() {
		return new HubNorth();
	}
	
	public static HubCenter getNewHubCenter() {
		return new HubCenter();
	}
	
	public static ViewCollectionsView getVColView() {
		return new ViewCollectionsView();
	}
	
	public static NewCollectionsView getNColView() {
		return new NewCollectionsView();
	}

	public static How getHowView() {
		return new How();
	}
	public static CaptureView getNewCapView() {
		return new CaptureView();
	}
	
	public static FoldersView getNewFolderView() {
		return new FoldersView();
	}
	
	public static PointsView getNewPointsView() {
		return new PointsView();
	}
}
