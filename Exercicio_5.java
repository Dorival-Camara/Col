import java.util.Scanner;

public class Exercicio_5{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do sálario : ");
        double salario = scanner.nextDouble();

        System.out.println("Informe o valor obtido pelas vendas : ");
        double vendas = scanner.nextDouble();

        double comissao = vendas*0.05;
        double salarioFinal = salario + comissao;

        System.out.println("O valor da comissão foi de :" +comissao+ " e o salário final foi de : " + salarioFinal );

        scanner.close();
    }
}