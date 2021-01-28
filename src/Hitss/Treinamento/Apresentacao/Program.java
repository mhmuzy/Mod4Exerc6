package Hitss.Treinamento.Apresentacao;

import java.util.Random;

public class Program {
	public static void main(String[] args) {
		
		try {
			
		
		Random gerador = new Random();
		
			System.out.println("");
			System.out.println("       Hitss Treinamento");
			System.out.println("");
			System.out.println("Saíra um número entre 1 e 6.");
			System.out.println("");
        	System.out.println("E o núemro é : " + gerador.nextInt(7));
				
		} catch (Exception e) {
			System.out.println("Erro de processamento: " + e.getMessage());
		}
	}
}
