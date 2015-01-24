package codehunt.sector08;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector08Test {
  private Sector08 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector08();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment01(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(1, instance.captureCodeFragment01(0, 0));
    Assert.assertEquals(2, instance.captureCodeFragment01(0, 1));
    Assert.assertEquals(4, instance.captureCodeFragment01(0, 2));
    Assert.assertEquals(1, instance.captureCodeFragment01(1, 1));
    Assert.assertEquals(3, instance.captureCodeFragment01(1, 2));
    Assert.assertEquals(0, instance.captureCodeFragment01(2, 1));
    Assert.assertEquals(8, instance.captureCodeFragment01(2, 3));
    Assert.assertEquals(0, instance.captureCodeFragment01(4, 1));
    Assert.assertEquals(120, instance.captureCodeFragment01(5, 5));
    Assert.assertEquals(720, instance.captureCodeFragment01(6, 6));
    Assert.assertEquals(840, instance.captureCodeFragment01(5, 6));
    Assert.assertEquals(518918400, instance.captureCodeFragment01(11, 12));
    Assert.assertEquals(-1843995392, instance.captureCodeFragment01(11, 13)); // overflow
  }

  /**
   * Test method for {@link Sector08#calculateFactorial(int)}.
   */
  @Test
  public final void testCalculateFactorial() {
    Assert.assertEquals(1, instance.calculateFactorial(0));
    Assert.assertEquals(1, instance.calculateFactorial(1));
    Assert.assertEquals(2, instance.calculateFactorial(2));
    Assert.assertEquals(6, instance.calculateFactorial(3));
    Assert.assertEquals(24, instance.calculateFactorial(4));
    Assert.assertEquals(120, instance.calculateFactorial(5));
    Assert.assertEquals(720, instance.calculateFactorial(6));
    Assert.assertEquals(5040, instance.calculateFactorial(7));
    Assert.assertEquals(40320, instance.calculateFactorial(8));
    Assert.assertEquals(362880, instance.calculateFactorial(9));
    Assert.assertEquals(3628800, instance.calculateFactorial(10));
    Assert.assertEquals(39916800, instance.calculateFactorial(11));
    Assert.assertEquals(479001600, instance.calculateFactorial(12));
    Assert.assertEquals(1932053504, instance.calculateFactorial(13));// overflow
    // 2^31 = 2147483648
    // 2^31 + 2^31 + 1932053504 = 13!
    // 2147483648 + 2147483648 + 1932053504= 6227020800
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment02(int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("", instance.captureCodeFragment02(0));
    Assert.assertEquals("# ", instance.captureCodeFragment02(1));
    Assert.assertEquals("# ## ", instance.captureCodeFragment02(2));
    Assert.assertEquals("# ## ### ", instance.captureCodeFragment02(3));
    Assert.assertEquals("# ## ### #### ", instance.captureCodeFragment02(4));
    Assert.assertEquals("# ## ### #### ##### ", instance.captureCodeFragment02(5));
    Assert.assertEquals("# ## ### #### ##### ###### ", instance.captureCodeFragment02(6));
    Assert.assertEquals("# ## ### #### ##### ###### ####### ", instance.captureCodeFragment02(7));
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment03(int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals("0 ", instance.captureCodeFragment03(0));
    Assert.assertEquals("0_ 01 ", instance.captureCodeFragment03(1));
    Assert.assertEquals("0__ 01_ 012 ", instance.captureCodeFragment03(2));
    Assert.assertEquals("0___ 01__ 012_ 0123 ", instance.captureCodeFragment03(3));
    Assert.assertEquals("0____ 01___ 012__ 0123_ 01234 ", instance.captureCodeFragment03(4));
    Assert.assertEquals("0_____ 01____ 012___ 0123__ 01234_ 012345 ",
        instance.captureCodeFragment03(5));
    Assert.assertEquals("0______ 01_____ 012____ 0123___ 01234__ 012345_ 0123456 ",
        instance.captureCodeFragment03(6));
    Assert.assertEquals("0_______ 01______ 012_____ 0123____ 01234___ 012345__ 0123456_ 01234567 ",
        instance.captureCodeFragment03(7));
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment04(int, String)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals("", instance.captureCodeFragment04(0, ""));
    Assert.assertEquals("", instance.captureCodeFragment04(0, "a"));
    Assert.assertEquals("-", instance.captureCodeFragment04(1, "a"));
    Assert.assertEquals("-a a-", instance.captureCodeFragment04(2, "a"));
    Assert.assertEquals("-aa a-a aa-", instance.captureCodeFragment04(3, "a"));
    Assert.assertEquals("-aaa a-aa aa-a aaa-", instance.captureCodeFragment04(4, "a"));
    Assert.assertEquals("-aaaa a-aaa aa-aa aaa-a aaaa-", instance.captureCodeFragment04(5, "a"));
    Assert.assertEquals("-", instance.captureCodeFragment04(1, "!"));
    Assert.assertEquals("-& &-", instance.captureCodeFragment04(2, "&"));
    Assert.assertEquals("- - -", instance.captureCodeFragment04(3, ""));
    Assert.assertEquals("-abc abc-", instance.captureCodeFragment04(2, "abc"));
    Assert.assertEquals("-1212 12-12 1212-", instance.captureCodeFragment04(3, "12"));
    Assert.assertEquals("-12121212 12-121212 1212-1212 121212-12 12121212-",
        instance.captureCodeFragment04(5, "12"));
    Assert.assertEquals("---- ----", instance.captureCodeFragment04(2, "---"));
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment05(String)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals("", instance.captureCodeFragment05(""));
    Assert.assertEquals("_", instance.captureCodeFragment05("x"));
    Assert.assertEquals("_", instance.captureCodeFragment05("_"));
    Assert.assertEquals("_y x_", instance.captureCodeFragment05("xy"));
    Assert.assertEquals("_bc a_c ab_", instance.captureCodeFragment05("abc"));
    Assert.assertEquals("_aaa a_aa aa_a aaa_", instance.captureCodeFragment05("aaaa"));
    Assert.assertEquals("_234 1_34 12_4 123_", instance.captureCodeFragment05("1234"));
    Assert.assertEquals("_bcde a_cde ab_de abc_e abcd_", instance.captureCodeFragment05("abcde"));
    Assert.assertEquals("_23 1_3 12_", instance.captureCodeFragment05("123"));
    Assert.assertEquals("_**- -_*- -*_- -**_", instance.captureCodeFragment05("-**-"));
    Assert.assertEquals("__ __", instance.captureCodeFragment05("__"));
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment06(int)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals("", instance.captureCodeFragment06(-1));
    Assert.assertEquals("", instance.captureCodeFragment06(0));
    Assert.assertEquals("$", instance.captureCodeFragment06(1));
    Assert.assertEquals("$$ $$", instance.captureCodeFragment06(2));
    Assert.assertEquals("$$$ $_$ $$$", instance.captureCodeFragment06(3));
    Assert.assertEquals("$$$$ $__$ $__$ $$$$", instance.captureCodeFragment06(4));
    Assert.assertEquals("$$$$$ $___$ $___$ $___$ $$$$$", instance.captureCodeFragment06(5));

  }

  /**
   * Test method for {@link Sector08#captureCodeFragment07(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertEquals("", instance.captureCodeFragment07(0, 0));
    Assert.assertEquals("", instance.captureCodeFragment07(0, 1));
    Assert.assertEquals("", instance.captureCodeFragment07(1, 0));
    Assert.assertEquals("x", instance.captureCodeFragment07(1, 1));
    Assert.assertEquals("xo", instance.captureCodeFragment07(1, 2));
    Assert.assertEquals("xox", instance.captureCodeFragment07(1, 3));
    Assert.assertEquals("x o", instance.captureCodeFragment07(2, 1));
    Assert.assertEquals("xo ox", instance.captureCodeFragment07(2, 2));
    Assert.assertEquals("xox oxo", instance.captureCodeFragment07(2, 3));
    Assert.assertEquals("xox oxo xox", instance.captureCodeFragment07(3, 3));
    Assert.assertEquals("xoxo oxox xoxo", instance.captureCodeFragment07(3, 4));
    Assert.assertEquals("xox oxo xox oxo", instance.captureCodeFragment07(4, 3));
    Assert.assertEquals("xoxo oxox xoxo oxox", instance.captureCodeFragment07(4, 4));
  }

  /**
   * Test method for {@link Sector08#captureCodeFragment08(int)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals("", instance.captureCodeFragment08(0));
    Assert.assertEquals("1", instance.captureCodeFragment08(1));
    Assert.assertEquals("1 22 1", instance.captureCodeFragment08(2));
    Assert.assertEquals("1 22 333 22 1", instance.captureCodeFragment08(3));
    Assert.assertEquals("1 22 333 4444 333 22 1", instance.captureCodeFragment08(4));
    Assert.assertEquals("1 22 333 4444 55555 4444 333 22 1", instance.captureCodeFragment08(5));
    Assert.assertEquals("1 22 333 4444 55555 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(6));
    Assert.assertEquals("1 22 333 4444 55555 666666 7777777 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(7));
    Assert.assertEquals(
        "1 22 333 4444 55555 666666 7777777 88888888 7777777 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(8));
    Assert
    .assertEquals(
        "1 22 333 4444 55555 666666 7777777 88888888 999999999 88888888 7777777 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(9));
    Assert
    .assertEquals(
        "1 22 333 4444 55555 666666 7777777 88888888 999999999 999999999 88888888 7777777 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(10));
    Assert.assertEquals("1 22 333 4444 55555 666666 7777777 88888888 999999999 "
        + "1111111111111111111111 " + "999999999 88888888 7777777 666666 55555 4444 333 22 1",
        instance.captureCodeFragment08(11));
  }

  /**
   * Test method for {@link Sector08#addNumber(StringBuilder, int)}.
   */
  @Test
  public final void testAddNumber() {
    StringBuilder sb = new StringBuilder();
    Assert.assertEquals("", sb.toString());
    instance.addNumber(sb, 1);
    Assert.assertEquals("1 ", sb.toString());
    sb.setLength(0); // to clear purpose
    Assert.assertEquals("", sb.toString());
    instance.addNumber(sb, 2);
    Assert.assertEquals("22 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 3);
    Assert.assertEquals("333 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 4);
    Assert.assertEquals("4444 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 5);
    Assert.assertEquals("55555 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 6);
    Assert.assertEquals("666666 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 7);
    Assert.assertEquals("7777777 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 8);
    Assert.assertEquals("88888888 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 9);
    Assert.assertEquals("999999999 ", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 10);
    Assert.assertEquals("", sb.toString());
    sb.setLength(0);
    instance.addNumber(sb, 11);
    Assert.assertEquals("1111111111111111111111 ", sb.toString());
    sb.setLength(0);
  }

  /**
   * Test method for {@link Sector08#isPalindrome(StringBuilder)}.
   */
  @Test
  public final void testIsPalindrome() {
    StringBuilder number = new StringBuilder();
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.append("1");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
    number.append("123");
    Assert.assertEquals(false, instance.isPalindrome(number));
    number.setLength(0);
    number.append("55555");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
    number.append("4444");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
    number.append("999999999");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
    number.append("141");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
    number.append("7788998877");
    Assert.assertEquals(true, instance.isPalindrome(number));
    number.setLength(0);
  }
}
