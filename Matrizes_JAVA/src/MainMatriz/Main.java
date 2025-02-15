package MainMatriz;
//Fazer um programa para ler um número inteiro N e uma matriz de
//ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//principal e a quantidade de valores negativos da matriz.

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lendo o tamanho N da matriz
        System.out.print("Informe o tamanho da matriz: ");
        int tam = sc.nextInt();

        //Crinado a matriz com o tamanho informado
        int[][] matriz = new int[tam][tam];

        //Armazenando os valores na matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //Percorrendo a matriz e informando a diagonal principal
        System.out.print("Valores da diagonal principal: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(i == j){
                    System.out.print(matriz[i][j]);
                }
            }
        }

        //Armazenando a quantidade de valores negativos da matriz
        System.out.printf("%nQuantidade de números negativos: ");
        int negativos = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] < 0){
                    negativos++;
                }
            }
        }

        //Informando a quantidade de valores negativos
        System.out.print(" " + negativos);

        sc.close();
    }
}