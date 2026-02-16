package secao4;

import java.util.Locale;

public class aula1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Teste quebra de linha");
        int y = 32;
        int x = 50;
        int resultado = y + x / 2;
        double a = 10.3219843;
        System.out.println(resultado);
        System.out.println(a);
        System.out.printf("%.2f%n", a);
        System.out.printf("%.3f%n", a);
        System.out.printf("Resultado = %d%n", resultado);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$%.2f%n", nome, idade, renda);
    }
}
