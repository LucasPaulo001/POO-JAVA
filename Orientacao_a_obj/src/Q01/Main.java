package Q01;

import Q01.entities.product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fazer um programa para ler os dados de um produto em estoque(nome, preço e
        // quantidade no estoque). Em seguida:
        //Mostrar os dados do produto(nome, preço, quantidade no estoque, valor total no
        // estoque)
        //Realizar uma entrada no estoque e mostrar novamente os dados do produto
        //Realizar uma saída no estoque e mostrar novamente os dados do produto

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        product product = new product();

        //Informando dados do produto
        System.out.println("Informe os dados do produto: ");

        System.out.print("Nome: ");
        product.name = scan.nextLine();

        System.out.print("Preço: ");
        product.price = scan.nextDouble();

        System.out.print("Quantidade: ");
        product.quantity = scan.nextInt();

        //Listando dados do produto
        System.out.println("\nDados do produto: \n");

        System.out.println(product.toString());

        //Atualizando a quantidade dos produtos (adicionar)

        System.out.print("\nAdicionar produto: ");
        int addProduct = scan.nextInt();
        product.AddProducts(addProduct);

        //Listando dados do produto
        System.out.println("\nDados do produto: \n");

        System.out.println(product.toString());

        //Atualizando a quantidade de produtos (remover)
        System.out.print("\nRemover produto: ");
        int removeProduct = scan.nextInt();
        product.RemoveProducts(removeProduct);

        //Listando dados do produto
        System.out.println("\nDados do produto: \n");

        System.out.println(product.toString());

    }
}