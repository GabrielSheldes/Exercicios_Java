import java.util.Scanner;

public class Ordem {
    public static void main(String[] args) {
        Scanner MeuScanner = new Scanner (System.in);
        System.out.println("Digite o primeiro numero:");
        int a = MeuScanner.nextInt();
        System.out.println("Digite o próximo numero");
        int b = MeuScanner .nextInt();
        System.out.println("Digite o ultimo Numero");
        int c = MeuScanner.nextInt();
        int temp;

        if (a > b) {
            temp = a; 
            a = b;
            b = temp; 
        }
        if (a > c) {
            temp = a;
            a = c;
            c = temp;
        }
        if (b > c){
            temp = b;
            b = c;
            c = temp;
        }


        System.out.println("A ordem é: ");
       System.out.println(a + " " + b + " " + c);
    }

}
