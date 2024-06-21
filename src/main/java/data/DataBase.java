package data;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import domain.Worker;

public class DataBase implements FileManager<Worker> {

	private final Gson gson = new Gson();

    public DataBase() throws IOException {
	}

	@Override
	public void write(String fileName, Worker data) throws IOException {
		List<Worker> workers = new ArrayList<>();
		File file = new File(fileName);
		if (file.exists()) {
			workers = read(fileName);
		} else {
			file.createNewFile();
		}
		workers.add(data);
		try (FileWriter writer = new FileWriter(file)) {
			gson.toJson(workers, writer);
		}
	}

	@Override
	public ArrayList<Worker> read(String fileName) throws IOException {
		File file = new File(fileName);
		if (!file.exists()) {
			return new ArrayList<>();
		}

		ArrayList<Worker> workers;
		try (JsonReader reader = new JsonReader(new FileReader(file))) {
			workers = gson.fromJson(reader, new TypeToken<ArrayList<Worker>>() {}.getType());
		}
		if (workers == null) {
			workers = new ArrayList<>();
		}
		return workers;
	}

	@Override
	public void createFolder(String folderName) throws IOException {
		File folder = new File(folderName);
		if (folder.exists()) {
			throw new IOException("Folder already exists");
		}
		if (!folder.mkdir()) {
			throw new IOException("Failed to create folder");
		}
	}
}
