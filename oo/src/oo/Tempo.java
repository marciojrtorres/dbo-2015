package oo;

public class Tempo {

  public final int horas, minutos, segundos;

  public Tempo() {
    this.horas = 0;
    this.minutos = 0;
    this.segundos = 0;
  }

  public Tempo(int horas, int minutos, int segundos) {
    this.horas = horas % 24; // aritmética modular e congruência
    this.minutos = minutos;
    this.segundos = segundos;
  }

  public Tempo(int horas, int minutos) {
    this.horas = horas % 24;
    this.minutos = minutos;
    this.segundos = 0;
  }

  public Tempo(int horas) {
    this.horas = horas % 24;
    this.minutos = 0;
    this.segundos = 0;
  }

  public Tempo maisHoras(int h) {
    return new Tempo(horas + h, minutos, segundos);
  }

  public Tempo mais(Tempo t) {
    return new Tempo(this.horas + t.horas,
                     this.minutos + t.minutos,
                     this.segundos + t.segundos);
  }

  // sempre escrever o toString
  public String toString() {
    return (horas < 10 ? "0" + horas : horas)
      + ":"
      + (minutos < 10 ? "0" + minutos : minutos)
      + ":"
      + (segundos < 10 ? "0" + segundos : segundos);
  }
}