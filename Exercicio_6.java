import java.util.Scanner;

public class Exercicio_6{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor da compra : ");
        double compra = scanner.nextDouble();

        double desconto = compra * 0.15;
        double valorFinal = compra - desconto;

        System.out.println("O valor sem desconto do produto é de : " +compra+ " ,com o desconto de 15% : " +desconto+ " ,o valor é de :  R$" +valorFinal);

        scanner.close();
    }
}