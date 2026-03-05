import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        float a, b, c, d, m;
        Scanner meuScanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota");
        a = meuScanner.nextInt();
        System.out.println("Digite a segunda nota");
        b = meuScanner.nextInt();
        System.out.println("Digite a terceira nota");
        c = meuScanner.nextInt();
         System.out.println("Digite a Quarta nota");
        d = meuScanner.nextInt();

        m = (a + b + c + d) / 4;

        if (m >= 7){
            System.out.println("Aprovado paizão");
            System.out.println("Sua nota foi:" + m);
        } else {
            System.out.println("Foi de vasco pae");
            System.out.println("Sua nota foi:" + m);

        }
        
        
    }
}

