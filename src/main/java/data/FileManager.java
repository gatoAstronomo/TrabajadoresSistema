package data;

import java.io.IOException;
import java.util.ArrayList;

public interface FileManager<T> {

	public void write(String fileName, T data) throws IOException;

	public ArrayList<T> read(String fileName) throws  IOException;

	public void createFolder(String folderName) throws IOException;

}