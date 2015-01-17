package codehunt.sector02;

public class Sector02 {
  /**
   * Array with ascending order.
   *
   * @param n
   * @return
   */
  public int[] captureCodeFragment01(int n) {
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = i;
    }
    return a;
  }

  /**
   * Array with ascending order. Every value multiplied by the input value.
   *
   * @param n
   * @return
   */
  public int[] captureCodeFragment02(int n) {
    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = i * n;
    }
    return result;
  }

  /**
   * Array of squares.
   *
   * @param n
   * @return
   */
  public int[] captureCodeFragment03(int n) {
    int[] res = new int[n];
    for (int i = 0; i < n; i++) {
      res[i] = i * i;
    }
    return res;
  }

  /**
   * Sum of values or the input array.
   *
   * @param v
   * @return
   */
  public int captureCodeFragment04(int[] v) {
    int sum = 0;
    for (int i = 0; i < v.length; i++) {
      sum += v[i];
    }
    return sum;
  }

  /**
   * Square pyramidal number. Or in other words sum the squares from 1 to input value.
   *
   * @param n
   * @return
   */
  public int captureCodeFragment05(int n) {
    // Square pyramidal number
    return --n * (n + 1) * (2 * n + 1) / 6;
    /*
     * int sum = 0; while(--n > 0){ sum += n * n; } return sum;
     */
  }

  /**
   * Count the numbers of 'a' character in the input string.
   *
   * @param s
   * @return
   */
  public int captureCodeFragment06(String s) {
    String s1 = s.replace("a", "");
    return s.length() - s1.length();
  }

  /**
   * Count the number of input character int the input string.
   *
   * @param s
   * @param x
   * @return
   */
  public int captureCodeFragment07(String s, char x) {
    String s1 = s.replace("" + x, "");
    return s.length() - s1.length();
  }

}
