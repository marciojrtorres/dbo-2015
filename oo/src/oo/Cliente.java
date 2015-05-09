package oo;

// padrão JavaBean
// accessors and mutators
// getters/setters
// consulta/comando

public class Cliente {

  private String nome;
  private String sobrenome;
  private int numero;

  // Relacionamentos
  // Composição é diferente de Agregação



  // Cliente TEM um Telefone!
  // Eh uma Composição: Cliente instancia e tem o próprio Telefone
  // Cliente não tem setter para Telefone
  // Se Cliente deixar de existir o telefone também deixará
  private Telefone telResidencial = new Telefone();


  // Cliente TEM um Endereco!
  // Eh uma Agregação: Cliente recebe uma instância de Endereco
  // O Telefone existe independente do Cliente e pode ser agregado a outros Clientes
  private Endereco endereco;

  // Telefone não deve ter SETTER pois é uma composição
  // public void setTelResidencial(Telefone telRes) {
  //   telResidencial = telRes;
  // }

  public Telefone getTelResidencial() {
    return telResidencial;
  }

  // Endereco tem GETTER e SETTER pois é agregado
  public Endereco getEndereco() {
    return this.endereco;
  }

  public void setEndereco(Endereco e) {
    this.endereco = e;
  }




  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  // mutator: "void setAlgo"
  public void setNome(String nome) {
    this.nome = nome;
  }
  // accessor: "Tipo getAlgo"
  public String getNome() {
    return nome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getSobrenome() {
    return sobrenome;
  }
}