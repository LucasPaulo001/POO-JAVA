package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
o vetor C gerado. */

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Quantos valores terá em cada vetor: ");
            int quant = sc.nextInt();

            int[] vetorA = new int[quant];
            int[] vetorB = new int[quant];
            int[] vetorC = new int[quant];

            //Informando o primeiro vetor - vetor A
            System.out.println("Digite os valores do vetorA: ");
            for(int i = 0; i < vetorA.length; i++){
                int numbersVetorA = sc.nextInt();
                vetorA[i] = numbersVetorA;
            }

            //Informando o segundo vetor - vetor B
            System.out.println("Digitte os valores do vetorB: ");
            for(int i = 0; i < vetorB.length; i++){
                int numbersVetorB = sc.nextInt();
                vetorB[i] = numbersVetorB;
            }

            //Informando a soma dos vetores
            System.out.println("Vetor Resultante: ");
            for(int i = 0; i < vetorC.length; i++){
                vetorC[i] = vetorA[i] + vetorB[i];
                System.out.println(vetorC[i]);
            }

        sc.close();
    }
}
