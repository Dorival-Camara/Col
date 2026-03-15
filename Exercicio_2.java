import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto : ");
        String produto = scanner.nextLine();       

        System.out.println("Digite o preço de custo do produto : ");
        Double preco = scanner.nextDouble();

        Double valorCusto = preco * 1.25;

        System.out.println("O produto " +produto+ " terá o valor de venda de : " +valorCusto);

        scanner.close();
    }
}