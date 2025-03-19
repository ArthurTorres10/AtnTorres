import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Salário atual: ");
        double salario = input.nextDouble();

        System.out.println("Novo salário: R$ " + (salario * 1.25));

        input.close();
    }
}