package soma_vetor;

import java.util.Locale;
import java.util.Scanner;

public class Soma_vetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            System.out.println("Informe o tamanho do vetor: ");
            int tam = sc.nextInt();

            System.out.printf("Informe o(s) %d valor(es): ", tam);
            double[] vetor = new double[tam];

            double soma = 0.0;
            double media = 0.0;

            for(int i = 0; i < vetor.length; i++){
                double values = sc.nextDouble();
                vetor[i] = values;
                soma += vetor[i];
            }
            System.out.println("Valores: ");
            for(int i = 0; i < vetor.length; i++){
                System.out.print(vetor[i]);
            }
            media = soma/vetor.length;
            System.out.printf("%nSomas dos valores informados: %.2f%n", soma);
            System.out.printf("Média dos valores informados: %.2f%n", media);

        sc.close();
    }
}
