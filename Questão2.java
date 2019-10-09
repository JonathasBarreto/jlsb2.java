package school.cesar.q2;

import java.util.Scanner;
import java.util.*;
import java.text.DecimalFormat;

public class EquacaoSegundoGrau {
	public double a;
	public double b;
	public double c;
	
	public EquacaoSegundoGrau(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	
	public String getRaizes(EquacaoSegundoGrau eq){
		DecimalFormat df = new DecimalFormat("#,###.00");
		double delta = (eq.getB() * eq.getB()) - (4 * (eq.getA() * eq.getC()));
		double x1 = 0;
		double x2 = 0;
		if (delta >= 0) {
			x1 = (double) ((-(eq.getB()) + Math.sqrt(delta)) / (2 * eq.getA()));
			x2 = (double) ((-(eq.getB()) - Math.sqrt(delta)) / (2 * eq.getA()));	
			return "a = "+ eq.getA() + "\nb = "+ eq.getB() + "\nc = "+ eq.getC() + "\nx1 (+/-) = "+ x1 +" \nx2 (+/-) = "+ x2;
		}
		return null;
		
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		int som = (int) (this.getA() + this.getB() + this.getC());
		String x = ""+som;
		result = prime * result + ((x == null) ? 0 : x.hashCode());
		return result;
	}
	
	/*public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EquacaoSegundoGrau other = (EquacaoSegundoGrau) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;51
		return true;
	}*/
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do A: ");
		double a = entrada.nextDouble();
		
		System.out.println("Informe o valor do B: ");
		double b = entrada.nextDouble();
		
		System.out.println("Informe o valor do C: ");
		double c = entrada.nextDouble();
		
		/*System.out.println("Informe o valor do A: ");
		double A = entrada.nextDouble();
		
		System.out.println("Informe o valor do B: ");
		double B = entrada.nextDouble();
		
		System.out.println("Informe o valor do C: ");
		double C = entrada.nextDouble();*/
		EquacaoSegundoGrau eq = new EquacaoSegundoGrau(a,b,c);
		String result = eq.getRaizes(eq);
		System.out.println("O valor do hash é: " + eq.hashCode());
		System.out.println("Os valores da equação são: ");
		System.out.println(result);
		
	}
}
