package secao4;

import java.util.Locale;
import java.util.Scanner;

public class aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.println("Digite seu nome: ");
        x = sc.next();
        System.out.printf("Seu nome é: %s%n", x);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.printf("Sua idade é: %d%n", idade);
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.printf("Sua altura é: %.2f%n", altura);


        String a;
        int z;
        double w;
        
        a = sc.next();
        z = sc.nextInt();
        w = sc.nextDouble();

        System.out.println(a);
        System.out.println(z);
        System.out.println(w);

        sc.close();
    }

}
