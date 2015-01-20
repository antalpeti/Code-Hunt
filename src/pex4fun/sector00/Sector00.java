package pex4fun.sector00;

import java.util.Arrays;

public class Sector00 {
  /**
   * Negate input value.
   *
   * @param x
   * @return
   */
  public int captureCodeFragment02(int x) {
    return -x;
  }

  /**
   * Increment the input value with one.
   *
   * @param x
   * @return
   */
  public int captureCodeFragment03(int x) {
    return x + 1;
  }

  /**
   * Sum of the input values.
   *
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment04(int x, int y) {
    return x + y;
  }

  /**
   * Square of the input value.
   *
   * @param x
   * @return
   */
  public int captureCodeFragment05(int x) {
    return x * x;
  }

  /**
   * Is the values of the input array in increasing order?
   *
   * @param a
   * @return
   */
  public Boolean captureCodeFragment06(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Reverse the values of the input array.
   *
   * @param a
   * @return
   */
  public int[] captureCodeFragment07(int[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      int temp = a[i];
      a[i] = a[a.length - 1 - i];
      a[a.length - 1 - i] = temp;
    }
    return a;
  }

  /**
   * Sort the values of the input array into increasing order.
   *
   * @param a
   * @return
   */
  public int[] captureCodeFragment08(int[] a) {
    Arrays.sort(a);
    return a;
  }

  /**
   * Calculate the mean char value from the char values of the input string.
   * 
   * @param s
   * @return
   */
  public char captureCodeFragment09(String s) {
    int charNum = 0;
    for (int i = 0; i < s.length(); i++) {
      charNum += s.charAt(i);
    }
    return s.length() == 0 ? '\0' : (char) (charNum / s.length());
  }

}
