package Entities;

public class Department {

    // Atributos
    private String name;

    // Constructors
    public Department(){}

    public Department(String name){
        this.name = name;
    }

    // Getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
