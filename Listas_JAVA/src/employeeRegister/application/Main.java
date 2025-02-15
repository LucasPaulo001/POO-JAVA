package employeeRegister.application;

import employeeRegister.util.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Criando lista de funcionários
        List<Employee> employee = new ArrayList<>();

        //Quantidade de funcionários
        System.out.println("Quantos funcionários serão cadastrados? ");
        int quant = sc.nextInt();

        //Percorrendo a quantidade fornecida e atribuindo à lista
        for(int i = 1; i <= quant; i++){
            System.out.println("Funcionário " + i + ": ");

            //Informando os dados dos funcionários
            System.out.print("Id: ");
            int id = sc.nextInt();

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();

            System.out.print("Salário: ");
            Double salary = sc.nextDouble();

            //Criar o novo objeto com os dados
            Employee employeeData = new Employee(id, name, salary);

            //Colocando objeto de funcionário na lista
            employee.add(employeeData);
        }

        //Ações do metodo de atualização de salário
        System.out.print("Informe o ID do funcionário que você quer atualizar o salário: ");
        int idData = sc.nextInt();

        //Informando a porcentagem de aumento de salário
        System.out.print("Informe a porcentagem: ");
        Double percenteAtt = sc.nextDouble();

        //Buscando funcionário na lista com base no id
        List<Employee> result = employee.stream()
                .filter(e -> e.id.equals(idData))
                .collect(Collectors.toList());

        if(result.isEmpty()){
            //Informando dados da lista
            System.out.println("Esse id não existe!");
            System.out.println("Lista de funcionários: ");
            for(Employee x: employee){
                System.out.println(x.id);
                System.out.println(x.name);
                System.out.println(x.salary);
            }
        }
        else{
            //Com base no id encontrado chama o metodo para atualizar o salário
            result.get(0).increaseSalary(percenteAtt);

            //Informando dados da lista
            System.out.println("Lista de funcionários: ");
            for(int i = 0; i < employee.size(); i++){
                System.out.println(employee.get(i).id);
                System.out.println(employee.get(i).name);
                System.out.println(employee.get(i).salary);
            }
        }

        sc.close();
    }
}
