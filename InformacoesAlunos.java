// Andre de Figueiredo Castro Cunha 122110110

import java.util.Scanner;

public class InformacoesAlunos {
	   public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   String[] alunoNota = input.split(" ");
		   int somaNotas = 0;
		   int quantasNotas = 0;
		   int maior = 0;
		   int menor = 0;

		   while (input.equals("-")!=true) {
				   quantasNotas = quantasNotas + 1
				   if (alunoNota[1]
