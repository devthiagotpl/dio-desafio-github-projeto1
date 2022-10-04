package exercicios;

public class Exemplo001 {


        public static void main(String[] args){

            Pessoa eu = new Pessoa("Thiago", 03, 07, 1992);

            System.out.println(eu.getNome());
            System.out.println(eu.getDataNascimento());
            System.out.println(eu.calculaIdade());

            eu.setNome("Thiago Lima");

            System.out.println(eu.getNome());
        }

}
