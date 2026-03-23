import java.util.Scanner;

public class Eurotrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o preço da viagem para Alemanha: ");
        double precoAlemanha = scanner.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Quantidade de pessoas para Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o preço da viagem para Portugal: ");
        double precoPortugal = scanner.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Quantidade de pessoas para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Digite o preço da viagem para Itália: ");
        double precoItalia = scanner.nextDouble();
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        System.out.print("Quantidade de pessoas para Itália: ");
        int pessoasItalia = scanner.nextInt();

        // REALIZANDO OPERAÇÕES //
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        double valorTotal = totalAlemanha + totalPortugal + totalItalia;

        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        // RETORNANDO RESULTADO AO USUÁRIO //
        System.out.println("\nTotal de pessoas: " + totalPessoas);
        System.out.println("Valor total da Eurotrip: R$ " + valorTotal);

        scanner.close();
    }
}