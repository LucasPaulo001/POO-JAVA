package Q01.entities;

public class product {

    //Atributos
    public String name;
    public double price;
    public int quantity;

    //Métodos

    //Informando valor com base na quantidade do produto
    public double TotalValueInStock(){
        return price * quantity;
    }

    //Atualizando a quantidade do produto adicionado
    public void AddProducts(int quantity){
        this.quantity += quantity;
    }

    //Atualizando a quantidade de produto removido
    public void RemoveProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\n" +
                "Quantidade: " + quantity + "\n" +
                "Preço: " + price + "\n" +
                "Preço total: " + TotalValueInStock();
    }
}
