package br.com.logica.inicio;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco,desconto,valor,total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o preço");
		preco = input.nextInt();
		
		System.out.println("Digite o desconto");
		desconto = input.nextInt();
		
		if (desconto > 100 || desconto < 0) {
			System.out.println("Por favor, coloque um desconto entre 0 a 100");
			desconto = input.nextInt();
		}
		valor = desconto-preco ;
		total = desconto / 100 * preco ;
		System.out.println("Seu desconto foi: "+total);
		System.out.println("Seu valor foi: "+valor);
	}

}
