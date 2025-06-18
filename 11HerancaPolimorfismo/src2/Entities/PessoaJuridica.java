package Entities;

public class PessoaJuridica extends Pessoa {

    // Atributos
    private Integer numeroFuncionarios;

    // Construtores
    public PessoaJuridica(){
        super();
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Getters and setters
    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    // Methods
    @Override
    public double calcularImposto() {

        if (numeroFuncionarios > 10){
            return getRendaAnual() * 0.14;
        }
        else{
            return getRendaAnual() * 0.16;
        }
    }
}
