import java.util.Scanner;

public class Calculadora {
		public static void main(String[] args) {
				Scanner obj = new Scanner(System.in);
				String operador = obj.nextLine();
				if(operador.equals("+") || (operador.equals("-")) || (operador.equals("/")) || (operador.equals("*"))) {
						float num1 = obj.nextFloat();
						float num2 = obj.nextFloat();
						switch (operador) {
								case "+":
										System.out.println("RESULTADO: " + (num1 + num2));
										break;
								case "-":
										System.out.println("RESULTADO: " + (num1 - num2));
										break;			
								case "/":
										if(num2 == 0.0) {
												System.out.println("ERRO");
												break;
										}
										else {
										System.out.println("RESULTADO: " + (num1 / num2));
										break;
										}	
								case "*":
										System.out.println("RESULTADO: " + (num1 * num2));
								break;
						}
				}
				else {
						System.out.println("ENTRADA INVALIDA");
				}
		}
}		
