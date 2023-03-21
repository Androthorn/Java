import java.util.Scanner;

public class DobroTriplo {
		public static void main(String[] args) {
				Scanner obj = new Scanner(System.in);
				int numero = obj.nextInt();
			   	int dobro = numero * 2;
				int triplo = numero * 3;
				System.out.println("dobro: " + dobro + ", " + "triplo: " + triplo);
		}
}
