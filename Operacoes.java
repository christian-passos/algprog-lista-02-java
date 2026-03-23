import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();
        // REALIZANDO OPERAÇÔES E INFORMANDO RESULTADO //
        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        input.close();
    }
}