package Exam.Data;

import java.io.File;

import Exam.Data.Abstractions.Fileable;

public class FoldersData implements Fileable {
	
	private File theDir;
	private final String basePath = System.getProperty("user.home") + "\\Desktop\\BookName";
	private String path;
	private int numFiles;
	
	@Override
	public String createFiles() {
		if(!fileExists()) {
			if(numFiles == 1) return createOneFile();
			else return createManyFiles();
		}
		return "";
	}
	
	private String createOneFile() {
		theDir.mkdir();
		return "\\";
	}
	
	private String createManyFiles() {
		for (int i = 0; i < numFiles; i++) {
			theDir = new File(path + "(" + i + ")");
			theDir.mkdir();
		}
		return "(0)\\";
	}

	private boolean fileExists() {
		return theDir.exists() ? true : false;
	}
	
	@Override
	public String getPath() {
		return path;
	}
	@Override
	public void setNumberOfFolders(int num) {
		numFiles = num;
	}

	@Override
	public String getBasePath() {
		return basePath;
	}

	@Override
	public void setFolderPath(String path) {
		this.theDir = new File(path);
		this.path = path;
	}
}
