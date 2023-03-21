package br.com.logica.inicio;

import java.util.Scanner;

public class SalarioMedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double salario,desconto,descontotransporte,calc,calcLiq,total;
		desconto = 7;
		descontotransporte = 6.22;
		
		System.out.println("Por favor, digite o valor do seu salario");
		salario = input.nextDouble();
		
		calc = salario/100*(desconto+descontotransporte);
		calcLiq=salario-calc;
		
		System.out.println("Seu desconto desconto total do seu salario: "+calc);
		System.out.println("Seu salario liquido é:"+calcLiq);
		
	}

}
