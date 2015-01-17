package codehunt.sector01;

public class Sector01 {

  /**
   * Input value negate.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment01(int x) {
    return -x;
  }

  /**
   * Input value subtract by 2.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment02(int x) {
    return x - 2;
  }

  /**
   * Square input value.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment03(int x) {
    return x * x;
  }

  /**
   * Input value multiply by 3.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment04(int x) {
    return 3 * x;
  }

  /**
   * Input value divide by 3.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment05(int x) {
    return x / 3;
  }

  /**
   * 4 divide by input value.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment06(int x) {
    return 4 / x;
  }

  /**
   * First input value subtract by second input value.
   * 
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment07(int x, int y) {
    return x - y;
  }

  /**
   * Second input value multiply by 2 and add to first input value.
   * 
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment08(int x, int y) {
    return x + 2 * y;
  }

  /**
   * First input value multiply by second input value.
   * 
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment09(int x, int y) {
    return x * y;
  }

  /**
   * Second input value divide by 3 and add to first input value.
   * 
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment10(int x, int y) {
    return x + y / 3;
  }

  /**
   * First input value divide by second input value.
   * 
   * @param x
   * @param y
   * @return
   */
  public int captureCodeFragment11(int x, int y) {
    return x / y;
  }

  /**
   * Input value modulo 3.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment12(int x) {
    return x % 3;
  }

  /**
   * Input value module 3 and add to 1.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment13(int x) {
    return x % 3 + 1;
  }

  /**
   * Input value add to 10 then the sum modulo input value.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment14(int x) {
    return (10 + x) % x;
    /*
     * return Math.abs(x) == 2 ? 0 : (Math.abs(x) < 5 ? ((Math.abs(x / 2))) : (Math.abs(x) < 11 ?
     * ((10 - Math.abs(x)) % 5) : 10));
     */
  }

  /**
   * Sum input values then divide by 3.
   * 
   * @param x
   * @param y
   * @param z
   * @return
   */
  public int captureCodeFragment15(int x, int y, int z) {
    return (x + y + z) / 3;
  }

}
