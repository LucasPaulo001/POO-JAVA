package Q02.entities;

public class Retangle {

    public double width;
    public double heigth;


    public double Area(){
        return heigth * width;
    }

    public double Perimeter(){
        return 2 * (width + heigth);
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
    }

    @Override
    public String toString() {
        return "Área: " + Area() + "\n" +
                "Perímetro: " + Perimeter() + "\n" +
                "Diagonal: " + Diagonal();
    }
}
