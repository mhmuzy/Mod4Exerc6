package Hitss.Treinamento.Apresentacao;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		Random gerador = new Random();

        //imprime sequ�ncia de 10 n�meros inteiros aleat�rios
        for (int i = 1; i <= 6; i++) {
        	
        	System.out.println(gerador.nextInt(7));
				
			

        }
	}
}
