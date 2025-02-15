package MapPosition;

//Fazer um programa para ler dois números inteiros M e N, e depois ler
//uma matriz de M linhas por N colunas contendo números inteiros,
//podendo haver repetições. Em seguida, ler um número inteiro X que
//pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//esquerda, acima, à direita e abaixo de X, quando houver, conforme
//exemplo.

import java.util.Scanner;

public class MapPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Lendo tamanho de linhas e colunas da matriz
        System.out.println("Informe um número M (linhas) e N (colunas) referente a matriz: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        //Criando matriz com o tamanho de acordo com os valores informados
        int[][] matriz = new int[m][n];

        //Informando o conteúdo da matriz
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }

        //Lendo o número que será mapeado na matriz
        System.out.println("Informe um número presente na matriz: ");
        int num = sc.nextInt();

        //Percorrendo a matriz e mapeando o número
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){

                //Informando a posição do número na matriz
                if(matriz[i][j] == num){
                    System.out.println("Posição: " + i + "," + j);

                    //Informando valores a cima do número
                    if(i > 0){
                        System.out.println("A cima: " + matriz[i - 1][j]);
                    }

                    //Informando valor à esquerda do número
                    if(j > 0){
                        System.out.println("A esquerda: " + matriz[i][j - 1]);
                    }

                    //Informando valor à direita do número
                    if(j <  n - 1){
                        System.out.println("A direita: " + matriz[i][j + 1]);
                    }

                    //Informando valor à baixo do número
                    if(i < m - 1){
                        System.out.println("A baixo: " + matriz[i + 1][j]);
                    }
                }
            }
            System.out.printf("%n");
        }


        sc.close();
    }
}
