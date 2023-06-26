package entities;

public class Student {
	
	//atributos
	public String name; 
	public double a;
	public double b;
	public double c;
	
	//metódos
	 
	
	
	public Student(String name, double a, double b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}
	
	public Student(String name, double a, double b, double c) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public String verify () { 
		double sum = a + b + c;
		double missing = Math.abs(60 - sum);
		   if (sum >= 60) {
		   return "FINAL GRADE: " + sum + "\nPASS";
		   } 
		
		   else  { 
			   return "FINAL GRADE: " + sum + "\nFAILED" + "\nMISSING " + missing + " POINTS" ;	
	       }		
	}
	
	public double calcularMedia() {
		return (a + b) / 2;
	}
	
	public boolean aprovado() {
		return calcularMedia() >= 6.0;
	}
}

