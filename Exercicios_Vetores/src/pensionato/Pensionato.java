package pensionato;

import pensionato.students.Students;

import java.util.Scanner;

//Cadastro de estudantes em uma ordem de quartos, onde cada quarto é apresentado como um vetor fixo de tamanho 10

public class Pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String[] room = new String[10];

            System.out.println("Informe a quantidade de estudantes: ");
            int tam = sc.nextInt();
            Students[] students = new Students[tam];

            for(int i = 0; i < students.length; i++){
                System.out.printf("Dados do estudante %d:%n ", i+1);
                sc.nextLine();
                System.out.printf("Informe o nome do estudante: ");
                String name = sc.nextLine();

                System.out.print("Informe o E-mail do estudante: ");
                String email = sc.nextLine();

                System.out.print("Informe o quarto do estudante: ");
                int numberRoom = sc.nextInt();

               room[numberRoom] = String.valueOf(new Students(name, email));
            }

            for(int i = 0; i < room.length; i++){
                if(room[i] != null){
                    System.out.println(i + ": " + room[i].toString());
                }
            }
        sc.close();
    }
}
