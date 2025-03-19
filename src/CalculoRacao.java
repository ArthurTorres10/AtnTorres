import java.util.Scanner;

public class CalculoRacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso do saco de ração (kg): ");
        double pesoSacoKg = scanner.nextDouble();



        System.out.print("Digite a quantidade diária de ração para cada gato (g): ");
        double quantidadeDiariaGato = scanner.nextDouble();

        double pesoSacoGramas = pesoSacoKg * 1000;

        double consumoTotal = 2 * quantidadeDiariaGato * 5;

        double racaoRestante = pesoSacoGramas - consumoTotal;

        System.out.println("Após 5 dias, restará " + (racaoRestante / 1000) + " kg de ração no saco.");

        scanner.close();
    }
}