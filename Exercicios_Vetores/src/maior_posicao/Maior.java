package maior_posicao;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).

public class Maior {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Quantos números você vai digitar? ");
            int quant = sc.nextInt();
            double maior = 0.0;
            int ordem = 0;

            double[] numbers = new double[quant];
            for(int i = 0; i < numbers.length; i++){
                System.out.printf("Informe o número da posição %d: ", i+1);
                double num = sc.nextDouble();
                numbers[i] = num;
                if(i == 0){
                    maior = numbers[i];
                }
                if(maior < numbers[i]){
                    maior = numbers[i];
                    ordem = i;
                }
            }
            System.out.printf("Maior valor digitado: %.2f%nOrdem: %d", maior, ordem);

        sc.close();
    }
}
