package br.com.logica.inicio;

import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2; //Numeros
		int soma, multiplicar, subtrair, dividir; //Aritmetica
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		n1 = input.nextInt();
		
		System.out.println("Digite outro numero");
		n2 = input.nextInt();
		
		soma = n1+n2;
		subtrair = n1-n2;
		dividir = n1/n2;
		multiplicar = n1*n2;
		
		System.out.println("O resultado da soma é: "+soma);
		System.out.println("O resultado da subtração é: "+subtrair);
		System.out.println("O resultado da divisão é: "+dividir);
		System.out.println("O resultado da multiplicação é: "+multiplicar);
		
		System.out.println("AI MESSIII");
	}

}
