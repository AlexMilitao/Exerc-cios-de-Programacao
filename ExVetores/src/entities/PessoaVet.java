package entities;

public class PessoaVet {
	 private String name;
	 private int age;
	 private double heigth;
	 private char gender;
	 
	 public PessoaVet(char gender, double heigth) {
			this.heigth = heigth;
			this.gender = gender;
		}	 
	 
	 public PessoaVet(String name, int age) {
			this.name = name;
			this.age = age;
		}	 
	 
	public PessoaVet(String name, int age, double heigth) {
		this.name = name;
		this.age = age;
		this.heigth = heigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeigth() {
		return heigth;
	}

	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}
		


