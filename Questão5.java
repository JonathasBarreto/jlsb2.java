package school.cesar.q5;
import java.util.Random;

public class Craps {
	public String lancamento(int dado1, int dado2, int a) {
		Random random = new Random();
		//System.out.println("\n\n");
		System.out.println("Partida: " + (a + 1));

		int soma = dado1 + dado2;
		int lanc = 1;
		int[] v = {0, 0, 0};
		System.out.println("Pontuação atual: "+ soma);
		if(lanc == 1) {
			System.out.println("lançamento: "+lanc);

			if(soma == 7 || soma == 11) {

				return "Jogador venceu";
				
			}
			else if(soma == 2 || soma == 3 || soma == 12) {

				return "Jogador perdeu";
			}
			else {
				v[0] = soma;
				System.out.println("Partida continua\n");

				int lancamento = lanc;
				lancamento ++;
				int som;
				do{
					int d1 = random.nextInt(5) + 1;
					int d2 = random.nextInt(5) + 1;
					som = d1 + d2;
					System.out.println("Pontuação atual: "+ som);
					System.out.println("lançamento: "+ lancamento);
					
					for(int i = 0; i<3; i++) {
						if(v[i] == som) {
							lanc = 1;
	
							return "Jogador venceu";
						}
						
					}
					if(som != 7) {
						System.out.println("Partida continua\n");
					}
					v[2] = v[1];
					v[1] = v[0];
					v[0] = som;
					lancamento ++;
					
				}while(som != 7);
				lanc = 1;

				return "Jogador perdeu";
				
			}
		}
		return null;

	}
	public static void main(String[] args) {
		Random random = new Random();
		Craps cap = new Craps();
		int i = 0;
		String bat = " ";
		while(i < 30) {
			int dado1 = random.nextInt(5) + 1;
			int dado2 = random.nextInt(5) + 1;
			int num = i;
		

			bat = cap.lancamento(dado1,dado2,i);
			System.out.println(bat + "\n\n");
			i++;
			
		}
		
	}
}
