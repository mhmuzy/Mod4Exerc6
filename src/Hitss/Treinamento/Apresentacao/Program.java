package Hitss.Treinamento.Apresentacao;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		
		try {
			
		
		Random gerador = new Random();
		
			System.out.println("");
			System.out.println("       Hitss Treinamento");
			System.out.println("");
			System.out.println("Sa�ra um n�mero entre 1 e 6.");
			System.out.println("");
        	System.out.println("E o n�emro � : " + gerador.nextInt(7));
				
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
