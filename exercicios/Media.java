import java.util.Scanner;

public class Media {
		public static void main(String[] args) {
				Scanner obj = new Scanner(System.in);
				float num1 = obj.nextFloat();
				float num2 = obj.nextFloat();
				float media = num1 + num2;
				if((media / 2) >= 7.0) {
						System.out.println("pass: True!");
				}
				else {
						System.out.println("pass: False!");
				}
		}
}
