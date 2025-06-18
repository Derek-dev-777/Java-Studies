package Entities;

public  class PessoaFisica extends Pessoa{

    // Atributos
    private double gastosSaude;

    // Construtores
    public PessoaFisica(){
        super();
    }

    public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    // Getters and Setters
    public double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    // Methods

    @Override
    public double calcularImposto() {

        if (getRendaAnual() <= 20000.00) {
            if (getGastosSaude() > 0) {
                return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
            } else {
                return getRendaAnual() * 0.15;
            }
        }
        else{
            if (getGastosSaude() > 0){
                return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
            }
            else{
                return getRendaAnual() * 0.25;
            }
            }
        }
    }


