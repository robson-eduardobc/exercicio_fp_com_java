import java.util.Scanner;
// 1. Importar ferramenta de leitura
public class exercicio_02 {
    public static void main(String[] args) {
// 2. Criar o objeto Scanner para receber dados do teclado (System.in)
Scanner leitor = new Scanner(System.in);

System.out.print("Digite um número inteiro: ");

// 3. O programa vai parar agora e aguardar entrada de dados
int numero = leitor.nextInt();

// 4. Agora confirmando que o arquivo foi guardado
System.out.println("Você digitou o número: " + numero);

// 5. Aqui vamos fechar o leitor (Boa prática)
leitor.close();

    }
    
}
