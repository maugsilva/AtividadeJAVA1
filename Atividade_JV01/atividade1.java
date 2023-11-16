package atividade_java;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		int nome_variavel;
		nome_variavel = 5;
		String nome = "Soul ON";
		
		int numero = 10;
		double numer_ponto = 2.5;
		boolean status = false;
		
		int numero_usuario;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero");
		numero_usuario = leitura.nextInt();
		
		System.out.println("voce digitou o numero"+ " " + numero_usuario);
		
		String nome_usuario,sobrenome;
		System.out.println("Digite seu nome");
		nome_usuario = leitura.nextLine();
		String nome_usuario, sobrenome;
		System.out.println("Digite seu sobrenome");
		sobrenome = leitura.nextLine();
		
		System.out.println("Seu nome Completo é" + nome_usuario + " " + sobrenome);
		

	}

}