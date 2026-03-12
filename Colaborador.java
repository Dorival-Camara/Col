import java.util.Scanner;

public class Colaborador{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o seu cargo: ");
        String cargo = scanner.nextLine();

        System.out.println("Seja bem vindo,"+nome+"! O seu cargo é de "+cargo+".");

        scanner.close();
    }
}