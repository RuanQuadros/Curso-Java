package secao4;

import java.util.Scanner;

public class tarefa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextInt();
        int resultado = a + b;
        System.out.printf("Soma: %d%n", resultado);
        sc.close();
    }  
}
