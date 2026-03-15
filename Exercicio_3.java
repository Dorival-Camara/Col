import java.util.Scanner;

public class Exercicio_3{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto : ");
        String produto = scanner.nextLine();

        System.out.println("Digite a quantidade comprada : ");
        int quantidade = scanner.nextInt();

        System.out.println("Digite o preço do produto : ");
        Double preco = scanner.nextDouble();

        Double total = preco * quantidade;

        System.out.println("O valor total pago foi de : " +total);

        scanner.close();

    }
}