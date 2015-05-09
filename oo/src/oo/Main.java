package oo;

public class Main {
  public static void main(String[] args) {
    // Telefone t1 = new Telefone();
    // t1.setNumero("3334-2223");
    // t1.setOperadora("Vivo");

    Cliente c1 = new Cliente();
    c1.setNome("Valter");
    // Acessando e configurando um objeto composto
    c1.getTelResidencial().setNumero("77662233");
    // c1.setTelResidencial(t1);

    Cliente c2 = new Cliente();
    c2.setNome("Mauro");
    // Acessando e configurando um objeto composto
    c2.getTelResidencial().setNumero("88223344");
    // c2.setTelResidencial(t1);

    System.out.println(c1.getTelResidencial().getNumero());
    System.out.println(c2.getTelResidencial().getNumero());

    // Instanciando e atribuindo um Agregado
    Endereco e1 = new Endereco();
    e1.setRua("Alfredo Huch");
    c1.setEndereco(e1);
    c2.setEndereco(e1);

  }
}