import java.util.Scanner;


public class contaBancaria{

    public static void main(String[] args) {
        Scanner meuScanner = new Scanner (System.in);
        System.out.println ("Digite a primeira nota ");
        float a = meuScanner nextInt();
        System.out.println ("Digite a Segunda nota ");
        float b = meuScanner nextInt();
        System.out.println ("Digite a terceira nota ");
        float c = meuScanner nextInt();
        float m = (a + b + c ) / 3;
        System.out.println ("Sua nota é " + m);
    }
}

   