import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner meuScanner = new Scanner(System.in);
        System.out.println ("Digite o Primeiro Numero");
        int a = meuScanner.nextInt();
        System.out.println ("Digite o Segundo numero");
        int b = meuScanner.nextInt();
        int soma = a + b;
        System.out.println ("O resultado é " + soma);
    }

}
