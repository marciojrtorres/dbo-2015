package intro;

public class Main {
  // static: método da classe
  // int: tipo de retorno
  // int,int: tipo da entrada (parâmetros, argumentos)
  static int multiplica(int multiplicando,
                        int multiplicador) {
    int resultado = 0;
    for (int i = 0; i < multiplicador; i++) {
      resultado += multiplicando;
    }
    return resultado;
  }
  // 2, 3
  static int potencia(int base, int exp) {
    if (exp < 0) {
      throw new IllegalArgumentException("expoente negativo nao eh permitido");
    }
    int resultado = 1;
    for (int i = 0; i < exp; i++) {
      resultado = multiplica(base, resultado);
    }
    return resultado;
  }

  static int quadrado(int base) {
    return potencia(base, 2);
  }

  static int cubo(int base) {
    return potencia(base, 3);
  }

  // main tab
  public static void main(String[] args) {
    // ASSERTIVA: expressão verdadeira
    System.out.println(1 == 1);
    //
    System.out.println(0.1 == 0.1);
    System.out.println(0.1 + 0.1 == 0.2);
    System.out.println(0.1 + 0.1 + 0.1 == 0.3); // false?!?!?!
    System.out.println(0.1 + 0.1 + 0.1); // 0.30.....4
    // Floating Point Problem

    System.out.println(multiplica(5, 3) == 15);
    System.out.println(multiplica(2,12) == 24);
    // assertiva (caso de teste)
    // qual é a especificação?
    // especificação é um contrato
    // casos de teste felizes
    System.out.println(potencia(2, 3) == 8);
    System.out.println(potencia(3, 2) == 9);
    // casos de teste tristes
    System.out.println(potencia(3, 1) == 3);
    System.out.println(potencia(3, 0) == 1);
    // exceção: caso negado
    try {
      System.out.println(potencia(3, -2));
    } catch (Exception e) {
      System.out.println(e);
    }

    System.out.println(quadrado(5) == 25);
    System.out.println(cubo(5) == 125);

  }
}
