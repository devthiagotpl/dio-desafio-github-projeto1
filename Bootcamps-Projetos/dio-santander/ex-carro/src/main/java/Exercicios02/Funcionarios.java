package Exercicios02;

public class Funcionarios {

    private String name;
    private String cargo;

    public double salario;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public double calculaSalario(){
        return this.calculaSalario() * 0.1;
    }
}
