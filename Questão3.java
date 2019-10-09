package school.cesar.q3;
import java.util.ArrayList;
import java.util.Scanner;
public class SomaDupla {
	ArrayList<SomaDupla> entrada = new ArrayList<SomaDupla>();
	
	public static String calcular(ArrayList<Integer> valores, int alvo) {
		int size = valores.size();
		int soma = 0;
		for(int i = 0; i < valores.size(); i++) {
			for(int f = 0; f < valores.size(); f++) {
				soma = valores.get(i) + valores.get(f);
				if(soma == alvo) {
					String result = "primeiro indice é: " + i +" e o segundo indice é: " + f; 
					return result;
				}
			}
		}
		return "Índices Indeterminados";
		
	}
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String valor;
		boolean parar = false;
		ArrayList<Integer> valores = new ArrayList<Integer>();
		final String valorParada = "parar";

		do {
			System.out.println("digite o valor: ");
			valor = entrada.nextLine();
			
			if(valor.equalsIgnoreCase(valorParada)) {
				parar = true;
			}
			else {
				
				int x = Integer.parseInt(valor);
				valores.add(x);
			}
		}while(parar != true);
		
		System.out.println("digite o alvo: ");
		int alvo = entrada.nextInt();
		entrada.close();
		System.out.println(SomaDupla.calcular(valores, alvo));
	}
}
