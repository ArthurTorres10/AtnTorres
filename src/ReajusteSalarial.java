import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salario = input.nextDouble();

        System.out.print("Digite o percentual de aumento (%): ");
        double percentual = input.nextDouble();

        double novoSalario = salario + (salario * percentual / 100);

        System.out.println("Novo salário: R$ " + novoSalario);

        input.close();
    }
}
