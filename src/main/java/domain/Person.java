package domain;

public class Person {
	protected final String name;
	protected final String surname;
	protected final String rut;


    public Person(String name, String surname, String rut) {
        this.name = name;
        this.surname = surname;
        this.rut = rut;
    }
}