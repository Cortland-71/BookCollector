package Exam.Data.Abstractions;

public interface Fileable {

	public abstract String createFiles();

	public abstract String getPath();

	public abstract void setNumberOfFolders(int num);

	public abstract String getBasePath();

	public abstract void setFolderPath(String path);

}