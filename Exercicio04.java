package Exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Conversor de Temperatura: Solicite ao usuário uma temperatura em graus
		 * Celsius e converta-a para Fahrenheit usando a fórmula F = C * 9/5 + 32.
		 */

		Double Fahrenheit, Celsius;

		Scanner sc = new Scanner(System.in);

		System.out.println("Seja bem vindo ao conversor de temperaturas!!");

		System.out.println("Digite uma temperatura para fazer a conversao :");

		Celsius = sc.nextDouble();

		System.out.println("Temperatura Escolhida = " + Celsius);

		Fahrenheit = Celsius * 9 / 5 + 32;

		System.out.println("Celsius = " + Celsius + "\n Fahrennheit = " + Fahrenheit);

		sc.close();

	}

}
