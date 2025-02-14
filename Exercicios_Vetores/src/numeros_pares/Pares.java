package numeros_pares;

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Informe a quantidade de números: ");
            int quant = sc.nextInt();

            int[] pares = new int[quant];
            for(int i = 0; i < pares.length; i++){
                System.out.printf("Informe o número da posição %d:  ", i + 1);
                int num = sc.nextInt();
                pares[i] = num;
            }

            System.out.println("NÚMEROS PARES: ");
            int quantPares = 0;
            for(int i = 0; i < pares.length; i++){
                if(pares[i] % 2 == 0){
                    System.out.printf("%d ", pares[i]);
                    quantPares++;
                }
            }
            System.out.print("%nQuantidade de pares: " + quantPares);
        sc.close();
    }
}
