package oo;

public class Main {

    public static void main(String[] args) {
        // 02:15:30
        Tempo t1 = new Tempo(2, 15, 30);
        System.out.println(t1.horas); // 2
        System.out.println(t1.minutos); // 15
        System.out.println(t1.segundos); // 30
        // representação string do objeto
        System.out.println(t1); // toString()
        System.out.println(t1.toString());

        Tempo t2 = new Tempo(12, 20); // h, m
        //
        Tempo t3 = new Tempo(12); // h

        Tempo t5 = new Tempo(26); // 02:00:00
        System.out.println(t5);

        // implementar
        Tempo t6 = new Tempo(-5); // 19:00:00
        System.out.println(t6);

        Tempo t7 = new Tempo(2, 30, 0);

        Tempo t8 = t7.maisHoras(2);

        System.out.println(t8); // 04:30:00

        Tempo t9 = new Tempo(1, 20, 15);

        Tempo t10 = t7.mais(t9);

        System.out.println(t10); // 03:50:15



        Complexo c1 = new Complexo(4, 5);
        System.out.println(c1); // 4 + 5i

        Complexo c2 = new Complexo(4);
        System.out.println(c2); // 4

        Complexo c3 = new Complexo(4.2, 1.2);
        System.out.println(c3); // 4.2 + 1.2i

        Complexo c4 = c1.mais(c2);
        System.out.println(c4); // 8 + 5i

        Complexo c5 = new Complexo(3, 2);
        Complexo c6 = c5.mais(1);
        System.out.println(c6); // 4 + 2i
        System.out.println(c6.real == 4);
        System.out.println(c6.imaginario == 2);

        /*
        // instanciando, construindo
        // construtor vazio (automático)po
        // Fracao f = new Fracao(); // CONSTRUTOR

        Fracao f = new Fracao(2, 3); // CONSTRUTOR COM ARGUMENTOS
        // f.numerador = 2;
        // f.denominador = 3;
        System.out.println(f.numerador);
        System.out.println(f.denominador);

        Fracao f2 = new Fracao(2); //
        System.out.println(f2.numerador);
        System.out.println(f2.denominador);

        // FAIL-FAST: FALHE RÁPIDO/CEDO
        // FAIL-SAFE: SEGURO CONTRA FALHAS
        // mais instruções

        Fracao t1 = new Fracao(3, 4);
        Fracao t2 = new Fracao(5, 6);
        Fracao t3 = t1.multiplica(t2);
        System.out.println(t3.numerador == 15);
        System.out.println(t3.denominador == 24);
        */
    }
}