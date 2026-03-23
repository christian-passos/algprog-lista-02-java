import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        
        // SOLICITANDO INFORMAÇÃO AO USUÁRIO //
        double numero = teclado.nextDouble();

        // RETORNANDO RESULTADO AO USUÁRIO //
        System.out.println("O número informado foi [" + numero + "].");

        // FIM DO CÓDIGO //
        teclado.close();
    }
}