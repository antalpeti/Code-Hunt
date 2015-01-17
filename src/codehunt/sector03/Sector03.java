package codehunt.sector03;

public class Sector03 {

  /**
   * <i>Powers of the input value</i><br>
   * The input value to the (power) th power.
   * 
   * @param number
   * @param power
   * @return
   */
  public int captureCodeFragment01(int number, int power) {
    // return (int) Math.pow(number, power);
    /*
     * int result = 1; while(power-- > 0) { result *= number; } return result;
     */
    return power == 0 ? number == 0 ? 0 : 1 : power == 1 ? number : number
        * captureCodeFragment01(number, power - 1);
  }

  /**
   * Factorial of the input value.
   * 
   * @param i
   * @return
   */
  public int captureCodeFragment02(int i) {
    int factor = i == 0 ? 1 : i;
    while (--i > 0) {
      factor *= i;
    }
    return factor;
  }

  /**
   * Multiply the numbers by each other from lowerBound to upperBound.
   * 
   * @param lowerBound
   * @param upperBound
   * @return
   */
  public int captureCodeFragment03(int lowerBound, int upperBound) {
    int result = lowerBound > upperBound ? 0 : 1;
    for (int i = lowerBound; i <= upperBound; i++) {
      result *= i;
    }
    return result;
  }

  /**
   * Sum even numbers from 0 to n - 1.
   * 
   * @param n
   * @return
   */
  public int captureCodeFragment04(int n) {
    int sum = 0;
    for (int i = 2; i < n; i = i + 2) {
      sum += i;
    }
    return sum;
  }

  /**
   * Sum every even * even or every odd * odd numbers. In case of upperdBound is even or odd.
   * 
   * @param upperBound
   * @return
   */
  public int captureCodeFragment05(int upperBound) {
    int sum = 0;
    while (upperBound >= 0) {
      sum += upperBound * upperBound;
      upperBound -= 2;
    }
    return sum;
  }

  /**
   * Replace every character to underline character with a space. Except the end of the word will be
   * no space.
   * 
   * @param word
   * @return
   */
  public String captureCodeFragment06(String word) {
    return word.replaceAll(".", "_ ").trim();
  }

  /**
   * Shift up with 5 spaces every character in the given string.
   * 
   * @param s
   * @return
   */
  public String captureCodeFragment07(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char ch = (char) (s.charAt(i) + 5);
      if (ch > 'z') {
        ch = (char) ('a' - 1 + ch - 'z');
      }
      sb.append(ch);
    }
    return sb.toString();
  }

  /**
   * Calculate the length of the given number.
   * 
   * @param x
   * @return
   */
  public int captureCodeFragment08(int x) {
    String s = x + "";
    return s.length();
  }
}
