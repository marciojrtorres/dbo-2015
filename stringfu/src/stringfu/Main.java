package stringfu;

public class Main {
  public static void main(String[] args) {

    // bioinformática
    // DNA ACGT
    // ACTTTTGACTTACGGGGTAACCCCTGTAACCAA
    // ACTTTTGACTTACGCGGTAACCCCTGTAACCAA
    // ACTTTTGACTTACGCCGTAACCCCTGTAACCAA
    // Algoritmo de Distância de Hamming

    System.out.prinln(
      Hamming.distance("ACCGT", "ACGGT") == 1
    );

    System.out.prinln(
      Hamming.distance("AAAAA", "CCCCC") == 5
    );

    //System.out.println(Strings.eq("teste1", "teste11") == false);
    //System.out.println(Strings.eq("teste", "teste") == true);
    //System.out.println(Strings.eq("teste   ", "teste   ") == true);
    //System.out.println(Strings.eq("", "") == true);
    //System.out.println(Strings.eq("teSte", "teste") == false);
    //System.out.println(Strings.eq("dbo", "poo") == false);

  }
}