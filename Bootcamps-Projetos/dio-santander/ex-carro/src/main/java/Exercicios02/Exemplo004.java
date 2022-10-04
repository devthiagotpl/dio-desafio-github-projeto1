package Exercicios02;

public class Exemplo004 {

    public static void main(String[] args) {

        Funcionarios gerente = new Gerente();
        gerente.setSalario(6000.0);
        System.out.println(gerente.calculaSalario());

        Funcionarios supervisor = new Supervisor();
        supervisor.setSalario(4000.0);
        System.out.println(supervisor.calculaSalario());

        Funcionarios atendente = new Atendente();
        atendente.setSalario(2000.0);
        System.out.println(atendente.calculaSalario());
    }
}
