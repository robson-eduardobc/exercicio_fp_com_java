import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Vamos usar o print sem "ln" para o usuário digitar na mesma linha
        System.out.print("Digite um número real: ");

        // 1. Vamos mudar o método para  nextDouble()
        double valorReal = teclado.nextDouble();
        
        // 2 . Exibir o resultado
        System.out.print("O número real digitado foi: " + valorReal);

        teclado.close();
        
    }
    
}
