package school.cesar.q1.utils;

import school.cesar.q1.domain.Matriz;

public class Matrizes {
	public static int[][] mult(Matriz m1, Matriz m2){
		
		int [][]vet3 = new int [m2.getLinha()][m2.getColuna()];

		if(m1.getnum() == m2.getLinha()) {

			for (int i=0; i < m1.getnum(); i++){
				for (int j= 0; j < m2.getColuna(); j++){
				
					for (int x= 0; x < m1.getnum(); x++){
						vet3[i][j] += m1.getvetor1()[i][x] * m2.getvetor2()[x][j];
					}
				}
			}
			return vet3;
			
		}else {
			System.out.println("Operação Invalida");
			return null; 
		}
	}
}
