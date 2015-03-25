package oo;

public class Main {

    public static Fracao multiplica(Fracao primeira, Fracao segunda) {
        Fracao resultado = new Fracao();
        resultado.numerador = primeira.numerador * segunda.numerador;
        resultado.denominador = primeira.denominador * segunda.denominador;
        return resultado;
    }

    public static void main(String[] args) {

        // Fracao.numerador (ERRADO)
        // Tipo variável = valor;
        // Classe é um Tipo
        Fracao a = new Fracao(); // instância
        // new Classe() -> Constrói um objeto
        a.numerador = 2;
        a.denominador = 3;

        Fracao b = new Fracao();
        b.numerador = 3;
        b.denominador = 5;

        Fracao r = multiplica(a, b);

        System.out.println(r.numerador == 6);
        System.out.println(r.denominador == 15);

        Contato c1 = null;
        c1.nome = "Luca";

        System.out.println(c1.nome);

      // int[] a = {2, 3};
      // int[] b = {3, 5};
      // int[] r = multiplica(a, b);
      // System.out.println(r[0] + "/" + r[1]);
      // System.out.println(r[0] == 6);
      // System.out.println(r[1] == 15);
    }
}