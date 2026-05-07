import java.util.Scanner;
public class modulo {
    public static void main(String[] args){
        int a;
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        a = meuScanner.nextInt();

        if (a < 0){
            a = a * -1;
        }

        System.out.println("O Modulo do seu numero é: " + a);
    }
    
}
