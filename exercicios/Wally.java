import java.util.Scanner;

public class Wally {
		public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				String listOfNames = input.nextLine();
				String resposta = "?";

				while(listOfNames.equals("wally")!=true) {
						for (String palavra : listOfNames.split(" ")) {
								if (palavra.length() == 5) {
										resposta = palavra;
										}
						}
				System.out.println(resposta);
				listOfNames = input.nextLine();
				resposta = "?";
				}
		}
}
