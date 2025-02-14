package negativos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Informe o tamanho do vetor, (max: 10): ");
            int Tam = sc.nextInt();
            if(Tam > 10){
                System.out.print("Informe um tamanho menor que 10: ");
            }
            else{
                int[] vetor = new int[Tam];

                for(int i = 0; i<vetor.length; i++){
                    int num = sc.nextInt();
                    vetor[i] = num;
                }
                System.out.println("Números negativos: ");
                for(int i = 0; i < vetor.length; i++){
                    if(vetor[i] < 0){
                        System.out.println(" " + vetor[i]);
                    }
                }
            }

        sc.close();
    }
}