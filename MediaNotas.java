import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.println("Digite a 1ª nota:");
        double nota1 = entrada.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.println("Digite a 2ª nota:");
        double nota2 = entrada.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.println("Digite a 3ª nota:");
        double nota3 = entrada.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.println("Digite a 4ª nota:");
        double nota4 = entrada.nextDouble();
        // REALIZANDO OPERAÇÕES //
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        // RETORNANDO RESULTADO AO USUÁRIO //
        System.out.printf("A média final é: %.2f%n", media);

        entrada.close();
    }
}