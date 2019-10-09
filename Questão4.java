package school.cesar.q4.domain;

import java.util.Scanner;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	public String semana;
	public int diaSemana;
	
	public Data(int dia, int mes, int ano, String semana){
		if(semana.equalsIgnoreCase("domingo")) {
			this.diaSemana = 1;
			
		}else if(semana.equalsIgnoreCase("SEGUNDA")) {
			this.diaSemana = 2;
			
		}else if(semana.equalsIgnoreCase("terça")) {
			this.diaSemana = 3;

		}else if(semana.equalsIgnoreCase("quarta")) {
			this.diaSemana = 4;

		}else if(semana.equalsIgnoreCase("quinta")) {
			this.diaSemana = 5;

		}else if(semana.equalsIgnoreCase("sexta")) {
			this.diaSemana = 6;

		}else if(semana.equalsIgnoreCase("sabado")) {
			this.diaSemana = 7;
			
		}else {
			System.out.println("Dia da semana invalido");
		}
		
		switch (mes) {
		case 1://janeiro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 2://fevereiro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 29){
				this.dia = 29;
			}
			else {
				this.dia = dia;
			}
		break;

		case 3://março
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;

		case 4://abril
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 30){
				this.dia = 30;
			}
			else {
				this.dia = dia;
			}
		break;

		case 5://maio
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;

		case 6://junho
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 30){
				this.dia = 30;
			}
			else {
				this.dia = dia;
			}
		break;

		case 7://julho
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 8://agosto
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 9://setembro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 30){
				this.dia = 30;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 10://outubro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 11://novembro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 30){
				this.dia = 30;
			}
			else {
				this.dia = dia;
			}
		break;
		
		case 12://dezembro
			this.mes = mes;
			if(dia<1) {
				this.dia = 1;
			}
			else if(dia > 31){
				this.dia = 31;
			}
			else {
				this.dia = dia;
			}
		break;
		
		default:
			if(mes<1) {//janeiro
				this.mes = 1;
				if(dia<1) {
					this.dia = 1;
				}
				else if(dia > 31){
					this.dia = 31;
				}			
				else {
					this.dia = dia;
				}
			}else {//dezembro
				this.mes = 12;
				if(dia<1) {
					this.dia = 1;
				}
				else if(dia > 31){
					this.dia = 31;
				}
				else {
					this.dia = dia;
				}
			}
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}
	
	

	public String comparacao(Data dat, int dia, int mes, int ano) {
		if(dat.getAno() < ano) {
			return "A data atual é menor";
		}
		else if(dat.getAno() > ano) {
			return "A data atual é maior";
		}else {
			if(dat.getMes() < mes) {
				return "A data atual é menor";
			}
			else if(dat.getMes() > mes) {
				return "A data atual é maior";
			}else {
				if(dat.getDia() < dia) {
					return "A data atual é menor";
				}
				else if(dat.getDia() > dia) {
					return "A data atual é maior";
				}else {
					return "A data atual é igual";
				}
			}
		}
	}
	public String comparacao(Data dat, String semana) {
		int x = 0;
		if(semana.equalsIgnoreCase("domingo")) {
			x = 1;
		}
		else if(semana.equalsIgnoreCase("segunda")){
			x = 2;
		}
		else if(semana.equalsIgnoreCase("terça")) {
			x = 3;
		}
		else if(semana.equalsIgnoreCase("quarta")) {
			x = 4;
		}
		else if(semana.equalsIgnoreCase("quinta")) {
			x = 5;
		}
		else if(semana.equalsIgnoreCase("sexta")) {
			x = 6;
		}
		else if(semana.equalsIgnoreCase("sabado")) {
			x = 7;
		}
		else {
			System.out.println("Dia da semana invalido");
		}
		if(dat.getDiaSemana() < x) {
			return "Data atual tem o dia da semana, anterior "
					+ "ao dia da semana passada como parâmetro.";
		}
		else if(dat.getDiaSemana() > x) {
			return "Data atual tem o dia da semana, posterior "
					+ "ao dia da semana passada como parâmetro.";
		}else {
			return "Data atual tem o dia da semana, igual "
					+ "ao dia da semana passada como parâmetro.";
		}		
	}
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o dia a ser passado");
		int dia = entrada.nextInt();
		
		System.out.println("Informe o mes a ser passado");
		int mes = entrada.nextInt();
		
		System.out.println("Informe o ano a ser passado");
		int ano = entrada.nextInt();
		
		System.out.println("Informe a semana a ser passada (String)");
		String semana = entrada.next();
		
		System.out.println("Informe o dia a ser comparado");
		int d = entrada.nextInt();
		
		System.out.println("Informe o mes a ser comparado");
		int m = entrada.nextInt();
		
		System.out.println("Informe o ano a ser comparado");
		int a = entrada.nextInt();
		
		System.out.println("Informe a semana a ser comparada (String)");
		String s = entrada.next();
		
		Data dat = new Data(dia, mes, ano, semana);
		System.out.println(dat.comparacao(dat, d, m, a));
		System.out.println(dat.comparacao(dat, s));

	}
}
