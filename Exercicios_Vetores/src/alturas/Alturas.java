package alturas;

import alturas.DataPerson.DataPerson;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            //Lendo a quantidade de pessoas
            System.out.println("Quantas pessoas serao digitadas?");
            int quantPersons = sc.nextInt();

            //Criando o vetor
            DataPerson[] dataPeople = new DataPerson[quantPersons];
            double soma = 0.0;
            double menor16 = 0.0;

            for(int i = 0; i < dataPeople.length; i++){
                System.out.printf("Dados da pessoa %d%n", i+1);

                sc.nextLine();
                System.out.print("Informe o nome: ");
                String name = sc.nextLine();

                System.out.print("Informe a idade: ");
                int age = sc.nextInt();

                System.out.print("Informe a altura: ");
                double height = sc.nextDouble();

                dataPeople[i] = new DataPerson(name, age, height);

                soma += dataPeople[i].getHeight();

                if(dataPeople[i].getAge() < 16){
                    menor16++;
                }
            }
            double media = soma/dataPeople.length;
            double percMenor16 = (menor16*100)/quantPersons;
            System.out.printf("%nMédia das alturas: %.2f%n", media);
            System.out.printf("Porcentagem de pessoas com menos de 16 anos: %.2f%%%n", percMenor16);

            //Resgatando pessoas com idade menor que 16 anos
            for(int i = 0; i < dataPeople.length; i++){
                if(dataPeople[i].getAge() < 16){
                    System.out.printf("%s ", dataPeople[i].getName());
                }
            }

        sc.close();
    }
}
