package Entities2;

public class Employee {

    public double salary;
    public double tax;
    public String name;

    public void netSalary(){
        salary -= tax;

    }

    public void increaseSalary(double tax){

        double mainSalary = salary + this.tax;
        double percentage = mainSalary * (tax / 100);

        salary += percentage;


    }

    public String toString(){
        return String.format(
                "Name: %s, salary: %.2f,", name, salary
        );
    }
}
