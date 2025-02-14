package alturas.DataPerson;

public class DataPerson {

    //Dados do objeto
    private String name;
    private int age;
    private double height;

    //Classe construtora do objeto
    public DataPerson(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

}
