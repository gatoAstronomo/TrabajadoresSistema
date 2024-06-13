package launcher;

import data.DataBase;
import domain.AFP;
import domain.Isapre;
import domain.Worker;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DataBase db = new DataBase();
        db.write("workers.json", new Worker("Juan", "Perez", "12345678-9", AFP.CUPRUM, Isapre.BANMEDICA));
        db.getWorkers().forEach(System.out::println);
    }
}