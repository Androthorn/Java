import java.util.Scanner;

public class Caracteristicas {
    public static void main(String[] args) {
            Scanner obj = new Scanner(System.in);
            String entrada = obj.nextLine();
            String[] resultado = entrada.split(" ");

            int soma = 0;

            for (int i = 0; i < resultado.length; i++) {
                    soma += Integer.parseInt(resultado[i]);
            }

            int media = soma / resultado.length;
            for (int c = 0; c < resultado.length; c++) {
                    if(Integer.parseInt(resultado[c]) > media) {
                            System.out.print(resultado[c] + " ");
                    }
            }
            System.out.println("");
        }
    }