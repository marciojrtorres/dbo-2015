package oo;

public class Agua {

  private int temperatura;

  public Agua() {
    temperatura = 20;
  }

  // método consulta temperatura
  public int temperatura() {
    return temperatura;
  }
  // método comando temperatura
  public void aquece() {
    temperatura = temperatura + 1;
  }

  public boolean estaLiquida() {
    return temperatura >= 0 && temperatura <= 100;
  }

  public boolean estaSolida() {
    return temperatura < 0;
  }

  public boolean estaGasosa() {
    return temperatura > 100;
  }

}