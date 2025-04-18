package Q02;

import Q02.entities.Retangle;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args){
        //Fazer um programa para ler os valores da largura e altura
        //de um retângulo. Em seguida, mostrar na tela o valor de
        //sua área, perímetro e diagonal. Usar uma classe como
        //mostrado no projeto ao lado.

        Scanner scan = new Scanner(System.in);
        Retangle retangle = new Retangle();

        System.out.print("Informe o valor da altura do retângulo: ");
        retangle.heigth = scan.nextDouble();

        System.out.print("Informe o valor da largura do retângulo: ");
        retangle.width = scan.nextDouble();

        System.out.println(retangle.toString());
    }
}
