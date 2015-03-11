package stringfu;

// marciojrtorres.github.io

public class Main {
  public static void main(String[] args) {

    String s = "teste"; // string literal
    char c = 'a'; // character literal
    System.out.println((int)(c));
    // ['t', 'e', 's', 't', 'e']
    //   0    1    2    3    4
    char[] chars = s.toCharArray();
    System.out.println(chars[1]);
    for (int i = 0; i < chars.length; i++) {
      System.out.println(chars[i]);
    }
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char) (chars[i] + 1);
    }
    System.out.println(chars);
    for (int i = 0; i < chars.length; i++) {
      chars[i] = (char) (chars[i] - 1);
    }
    System.out.println(chars);

    String s1 = "programador ";
    String s2 = "web";

    char[] c1 = s1.toCharArray();
    char[] c2 = s2.toCharArray();
    char[] re = new char[c1.length+c2.length];
    for (int i = 0; i < c1.length; i++) {
      re[i] = c1[i];
    }
    for (int i = c1.length; i < re.length; i++) {
      re[i] = c2[i - c1.length];
    }
    String s3 = new String(re);
    System.out.println(s3);


  }
}