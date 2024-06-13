package data;

import java.io.IOException;
import java.util.ArrayList;

public interface FileManager<T> {

	public void write(String filename, T data) throws IOException;

	public ArrayList<T> read(String filename) throws  IOException;

	public void createFolder(String foldername) throws IOException;
}