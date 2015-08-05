package codehunt.sector14;

/**
 * The class Sector14 is contains solution for Sector 14 section.
 */
public class Sector14 {

  /**
   * Sum the values from 0 to input value. In case of positive the input value is inclusive. In case
   * of negative the input value is exclusive.
   *
   * @param x
   * @return
   */
  public int captureCodeFragment01(int x) {
    x = x >= 0 ? x : -x - 1;
    return x * (x + 1) / 2;
  }

  // /**
  // *
  // * @param x
  // * @return
  // */
  // public int captureCodeFragment02(int x) {
  // if (x == 0) {
  // return 0;
  // }
  // if (x == 32) {
  // return 16400;
  // }
  // return x;
  // }
  //
  // /**
  // *
  // * @param x
  // * @param f
  // * @return
  // */
  // public Boolean captureCodeFragment03(int x, int f) {
  // return true;
  // }
}
