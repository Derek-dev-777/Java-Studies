package Entities;

public class Retangle {

    public double width;
    public double height;

    public double area(){
        return width * height;

    }

    public double perimeter(){

        return (width * 2) + (height * 2);

    }

    public double diagonal(){

        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));
    }

    public String toString(){

        return String.format(
                "Area: %.2f%nPerimeter: %.2f%nDiagonal: %.2f",
                area(), perimeter(), diagonal()
        );

    }
}
