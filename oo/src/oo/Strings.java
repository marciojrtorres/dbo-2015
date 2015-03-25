package stringfu;

public class Strings {

  public static boolean eq(String a, String b) {
    // protecao contra nulos
    if (a == null && b == null) return true;
    if (a == null || b == null) return false;

    char[] achar = a.toCharArray();
    char[] bchar = b.toCharArray();

    if (achar.length != bchar.length) return false;

    for (int i = 0; i < achar.length; i++)
        if (achar[i] != bchar[i]) return false;

    return true;
  }

}