import java.util.Scanner;

public class Monotona {
		public static void main(String[] args) {
				Scanner obj = new Scanner(System.in);
				float numero1 = obj.nextFloat();
				float numero2 = obj.nextFloat();
				float numero3 = obj.nextFloat();
				float numero4 = obj.nextFloat();
				if(numero1 < numero2 && numero2 < numero3 && numero3 < numero4) {
						System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
				}
				else if(numero1 > numero2 && numero2 > numero3 && numero3 > numero4) {
						System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
				}
				else {
						System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
				}
		}
}
