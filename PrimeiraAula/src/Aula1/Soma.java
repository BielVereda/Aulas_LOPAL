package Aula1;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float num1, num2, soma;
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1+num2;
		
		System.out.print("Soma: "+num1+" + "+num2+" = "+soma);
		
		sc.close();

	}

}
