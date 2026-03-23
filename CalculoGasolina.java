import java.util.Scanner;

public class CalculoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = scanner.nextDouble();

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        // REALIZANDO OPERAÇÕES //
        double total = precoLitro * litros;

        // RETORNANDO RESULTADO AO USUÁRIO //
        System.out.printf("O valor a pagar é: R$ %.2f\n", total);

        scanner.close();
    }
}