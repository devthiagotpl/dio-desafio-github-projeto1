package exercicios;

// import java.util.ArrayList;

public class Carro {

        String marca;
        String modelo;
        int ano;
        String variante;


        public Carro() {
            marca = "BMW";
            modelo = "322i";
            ano = 2021;
            variante = "Importado";


        }
            public static void main(String[] args) {

            Carro marcaCarro = new Carro();
            Carro modeloCarro = new Carro();
            Carro anoCarro = new Carro();
            Carro varianteCarro = new Carro();

            System.out.println("Marca do Veiculo: " + marcaCarro.marca);
            System.out.println("Modelo: " + modeloCarro.modelo);
            System.out.println("Ano de Fabricação " + anoCarro.ano);
            System.out.println("Variante: " + varianteCarro.variante);

    }

        //String car = "BMW 322i";
//        ArrayList<String> pessoa = new ArrayList<String>();
//        pessoa.add("Thiago");
//        pessoa.add("Deyvid");
//
//        System.out.println("Carro: " +car);
//        System.out.println("Pessoas no Carro: " + pessoa);
//
//        pessoa.remove(0);
//
//        System.out.println("Ocupante " + pessoa + " Removido com Sucesso !");
//
//
//        System.out.println("Carro: " +car);
//        System.out.println("Pessoas no Carro: " + pessoa);
//
//        pessoa.add("Lorrani");
//
//        System.out.println("Carro: " +car);
//        System.out.println("Pessoas no Carro: " + pessoa);
//
//        pessoa.clear();
//        System.out.println("Carro: " +car);
//        System.out.println("Pessoas no Carro: " + pessoa);
//
//    }



    // public class Pessoa {

        // String[] pessoa = {"Thiago"};

    // }


}
