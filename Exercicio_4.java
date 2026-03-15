import java.util.Scanner;

public class Exercicio_4{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe uma quantia em dólares : ");
        double valor = scanner.nextDouble();

        System.out.println("Informe a cotação atual do Real : ");
        double real = scanner.nextDouble();

        double conversao = valor * real;

        System.out.println("O valor convertido foi de : US$" +valor+ " para : R$"+conversao);

        scanner.close();
    }
}