
import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        // 1. Prepara o leitor para capturar o que for digitado
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        
        // 2. Lê o número e guarda na variável 'valor'
        int valor = teclado.nextInt();

        // 3. Escreve o valor da variável na tela
        System.out.println("O valor digitado foi: " + valor);

        // 4. Fecha o leitor
        teclado.close();
    }
}