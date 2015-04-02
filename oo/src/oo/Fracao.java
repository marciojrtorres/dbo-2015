package oo;

// classes são sempre substantivos
// geralmente no singular
// modela o objeto real fração
// são declarados as informações essenciais
// sobre o essencial extrai-se informações secundárias
// por enquanto vamos declarar tudo como public
// mas há restrições (serão vistas mais tarde)
public class Fracao {
    // atributo (característica)
    // escopo da Classe

    // IMUTABILIDADE

    public final int numerador;
    public final int denominador;
    // construtor com dois argumentos int
    public Fracao(int a, int b) {
      if (b == 0) throw new IllegalArgumentException();
      numerador = a;
      denominador = b;
    }
    // construtor com um argumento int
    public Fracao(int a) {
      numerador = a;
      denominador = 1;
    }
    // mais de um construtor
    // SOBRECARGA DE CONSTRUTORES
    // POLIMORFISMO BÁSICO

    // não são apenas bolsas de dados
    // OS OBJETOS DEVEM CARREGAR OS ALGORITMOS
    // os objetos devem ter ATRIBUTOS e MÉTODOS
    public Fracao multiplica(Fracao outra) {
      int n = this.numerador * outra.numerador;
      int d = this.denominador * outra.denominador;
      return new Fracao(n, d);
    }
    // sobrecarga do método multiplica
    public Fracao multiplica(int numero) {
      //
      return null;
    }

    public Fracao soma(Fracao fracao) {
      //
      return null;
    }

    public Fracao subtrai(Fracao fracao) {
      //
      return null;
    }
    // observação sobre nomes de métodos
    // métodos representam ações sobre o objeto
    public Fracao divide(Fracao outra) {
      return new Fracao(
        this.numerador * outra.denominador,
        this.denominador * outra.numerador);
    }

    // sempre escrever o toString
    public String toString() {
      return numerador + "/" + denominador;
    }
}