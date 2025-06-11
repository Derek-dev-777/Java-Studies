package Entities;

public class Funcionario {

    private Integer id;
    private Double salary;
    private String nome;

    public Funcionario(Integer id, Double salary, String nome){
        this.id = id;
        this.salary = salary;
        this.nome = nome;
    }

    public Integer getId(){
        return id;
    }

    public Double getSalary(){
        return salary;
    }

    public String getNome(){
        return nome;
    }

    public void increaseSalaryPercentage(Double percentage){

        salary += salary * (percentage / 100);



    }

    public String toString() {
        return String.format("ID: %d, Nome: %s, Salário: %.2f", id, nome, salary);
    }
}
