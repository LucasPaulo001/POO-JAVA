import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Criando lista

        //Entre maior que e menor que, vai o tipo da lista
        List<String> list = new ArrayList<>();

        //Adicionando elementos na lista
        list.add("Lucas");
        list.add("Lumena");
        list.add("Maze");
        list.add("João");
        list.add("Maria");

        //Adicionando elemento a um índice da lista, no caso o índice 1
        list.add(1, "Lupi");

        //Informando o tamanho da lista
        System.out.println(list.size());

        //Percorrendo a lista e imprimindo na tela
        for(String x: list){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        //Buscando índice do elemento dentro da lista, se caso não achar retorna-se -1
        System.out.println("Indice de Lucas: " + list.indexOf("Lumena"));

        //Removendo elemento da lista, o remove() irá comparar o valor informado com algum valor da lista e removerá
        list.removeIf(s -> s.charAt(0) == 'L');
        for(String x: list){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        //Filtrando elementos com base na letra inical(pode ser por outras características)
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

        //Cria uma nova lista que irá receber a filtragem da lista original "list", usaremos o .stream() para
        //podermos utilizar o .filter() para filtrar os elementos, logo após filtrar teremos que reconverter
        //a nossa lista para lista com o .collect

        for(String x: result){
            System.out.println(x);
        }

        System.out.println("--------------------------");

        String nome = list.stream().filter(x -> x.charAt(0) == 'K').findFirst().orElse(null);
        System.out.print(nome);
    }
}