package codehunt.sector04;

/**
 * The class Sector04 is contains solution for Sector 04 section.
 */
public class Sector04 {

  /**
   * Logical expression: x or y
   *
   * @param x
   * @param y
   * @return
   */
  public Boolean captureCodeFragment01(Boolean x, Boolean y) {
    return x || y;
  }

  /**
   * Logical expression: x and y
   *
   * @param x
   * @param y
   * @return
   */
  public Boolean captureCodeFragment02(Boolean x, Boolean y) {
    return x && y;
  }

  /**
   * Is x smaller than 50?
   *
   * @param x
   * @return
   */
  public Boolean captureCodeFragment03(int x) {
    return x < 50;
  }

  /**
   * Is x smaller than y?
   *
   * @param x
   * @param y
   * @return
   */
  public Boolean captureCodeFragment04(int x, int y) {
    return x < y;
  }

  /**
   * Signum of the input number.
   *
   * @param i
   * @return
   */
  public int captureCodeFragment05(int i) {
    double j = Double.valueOf(i);
    return (int) Math.signum(j);
    // return (i >> 31) | (-i >>> 31);
    // return i != 0 ? i / Math.abs(i) : 0;
  }

  /**
   * Is i bigger than j?
   *
   * @param i
   * @param j
   * @return
   */
  public Boolean captureCodeFragment06(int i, int j) {
    return i > j;
  }

  /**
   * If i is bigger than 99 then return 3, in other cases return 2.
   *
   * @param i
   * @return
   */
  public int captureCodeFragment07(int i) {
    return i > 99 ? 3 : 2;
  }

  /**
   * Is i is even or odd number?
   *
   * @param i
   * @return
   */
  public String captureCodeFragment08(int i) {
    return i % 2 == 0 ? "even" : "odd";
  }

  /**
   * Is i is a multiple of 5?
   *
   * @param i
   * @return
   */
  public String captureCodeFragment09(int i) {
    return (i % 5 == 0 ? "" : "not a ") + "multiple of 5";
  }

  /**
   * Is i input value is multiple of x input value?
   *
   * @param i
   * @param x
   * @return
   */
  public String captureCodeFragment10(int i, int x) {
    return (i % x == 0 ? "" : "not a ") + "multiple of " + x;
  }

  /**
   * i input value is power of j input value with j input value base in case of k input value is
   * equal to 1?
   *
   * @param i
   * @param j
   * @param k
   * @return
   */
  public String captureCodeFragment11(int i, int j, int k) {
    return i > j && Math.pow(j, j) == i && k == 1 ? "yes!" : "no";
  }

  /**
   * Return 0, 7, or 21 depending on the input number.
   *
   * @param i
   * @return
   */
  public int captureCodeFragment12(int i) {
    return i < 8 ? 0 : i < 15 ? 7 : 21;
  }
}
