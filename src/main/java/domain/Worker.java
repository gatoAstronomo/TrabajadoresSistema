package domain;

import data.DataBase;

public class Worker extends Person {
	private AFP afp;
	private Isapre isapre;

	public Worker(String name, String surname, String rut, AFP afp, Isapre isapre) {
		super(name, surname, rut);
		this.afp = afp;
		this.isapre = isapre;
	}


	public AFP getAfp() {
		return this.afp;
	}

	public void setAfp(AFP afp) {
		this.afp = afp;
	}

	public Isapre getIsapre() {
		return this.isapre;
	}

	public void setIsapre(Isapre isapre) {
		this.isapre = isapre;
	}

	@Override
	public String toString() {
		return "Worker [afp: " + afp + ", isapre: " + isapre + ", name: " + super.name + ", rut: " + super.rut + ", surname: " + super.surname + "]";
	}
}