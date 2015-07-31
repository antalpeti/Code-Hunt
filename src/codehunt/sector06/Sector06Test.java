package codehunt.sector06;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector06Test is contains tests for Sector 06 section.
 */
public class Sector06Test {

  /** The instance variable to test the not static methods. */
  private static Sector06 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector06();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment01(String)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(false, instance.captureCodeFragment01("AAAAA"));
    Assert.assertEquals(false, instance.captureCodeFragment01("AAAA"));
    Assert.assertEquals(false, instance.captureCodeFragment01("AAA"));
    Assert.assertEquals(false, instance.captureCodeFragment01("AA"));
    Assert.assertEquals(false, instance.captureCodeFragment01("A"));
    Assert.assertEquals(false, instance.captureCodeFragment01(""));
    Assert.assertEquals(false, instance.captureCodeFragment01("X y Z"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment02(String)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("IaIaA", instance.captureCodeFragment02("iaiaa"));
    Assert.assertEquals("IaI", instance.captureCodeFragment02("iai"));
    Assert.assertEquals("AbC", instance.captureCodeFragment02("abc"));
    Assert.assertEquals("AbC", instance.captureCodeFragment02("abC"));
    Assert.assertEquals("AbC", instance.captureCodeFragment02("AbC"));
    Assert.assertEquals("ABC", instance.captureCodeFragment02("ABC"));
    Assert.assertEquals("ABC", instance.captureCodeFragment02("ABC"));
    Assert.assertEquals("ABC", instance.captureCodeFragment02("aBc"));
    Assert.assertEquals("", instance.captureCodeFragment02(""));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment03(String)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals("A ", instance.captureCodeFragment03("a "));
    Assert.assertEquals("A   ", instance.captureCodeFragment03("a   "));
    Assert.assertEquals("aaaaaA", instance.captureCodeFragment03("aaaaaa"));
    Assert.assertEquals("I I    ", instance.captureCodeFragment03("i i    "));
    Assert.assertEquals("", instance.captureCodeFragment03(""));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment04(String, int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals('a', instance.captureCodeFragment04("aaaa", 0));
    Assert.assertEquals('b', instance.captureCodeFragment04("abc", 1));
    Assert.assertEquals('c', instance.captureCodeFragment04("abc", 2));
    Assert.assertEquals('x', instance.captureCodeFragment04("x y z", 0));
    Assert.assertEquals(' ', instance.captureCodeFragment04("x y z", 1));
    Assert.assertEquals('y', instance.captureCodeFragment04("x y z", 2));
    Assert.assertEquals(' ', instance.captureCodeFragment04("x y z", 3));
    Assert.assertEquals('z', instance.captureCodeFragment04("x y z", 4));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment05(String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals("", instance.captureCodeFragment05("", ""));
    Assert.assertEquals("ba", instance.captureCodeFragment05("a", "b"));
    Assert.assertEquals("cba", instance.captureCodeFragment05("a", "cb"));
    Assert.assertEquals("a", instance.captureCodeFragment05("a", ""));
    Assert.assertEquals("b", instance.captureCodeFragment05("", "b"));
    Assert.assertEquals("210", instance.captureCodeFragment05("0", "21"));
    Assert.assertEquals("007", instance.captureCodeFragment05("7", "00"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment06(String)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals("", instance.captureCodeFragment06(""));
    Assert.assertEquals("y", instance.captureCodeFragment06("xy"));
    Assert.assertEquals("aaa", instance.captureCodeFragment06("aaaaa"));
    Assert.assertEquals("aaa", instance.captureCodeFragment06("aaaaaa"));
    Assert.assertEquals("23", instance.captureCodeFragment06("123"));
    Assert.assertEquals("cde", instance.captureCodeFragment06("abcde"));
    Assert.assertEquals("def", instance.captureCodeFragment06("abcdef"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment07(String)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertEquals("", instance.captureCodeFragment07(""));
    Assert.assertEquals("BZbbz", instance.captureCodeFragment07("aabbz"));
    Assert.assertEquals("Zyz", instance.captureCodeFragment07("xyz"));
    Assert.assertEquals("Cbc", instance.captureCodeFragment07("abc"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment08(String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals(4, instance.captureCodeFragment08("hkjl", "aaa"));
    Assert.assertEquals(3, instance.captureCodeFragment08("aa", "aaa"));
    Assert.assertEquals(2, instance.captureCodeFragment08("aa", "a"));
    Assert.assertEquals(1, instance.captureCodeFragment08("b", "a"));
    Assert.assertEquals(1, instance.captureCodeFragment08("", "a"));
    Assert.assertEquals(0, instance.captureCodeFragment08("", ""));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment09(String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertEquals("ad", instance.captureCodeFragment09("a", "d"));
    Assert.assertEquals("ab", instance.captureCodeFragment09("ab", "a"));
    Assert.assertEquals("ab", instance.captureCodeFragment09("ab", "c"));
    Assert.assertEquals("aa", instance.captureCodeFragment09("a", "aa"));
    Assert.assertEquals("ab", instance.captureCodeFragment09("a", "ab"));
    Assert.assertEquals("bc", instance.captureCodeFragment09("a", "bc"));
    Assert.assertEquals("bcd", instance.captureCodeFragment09("a", "bcd"));
    Assert.assertEquals("eeee", instance.captureCodeFragment09("a", "eeee"));
    Assert.assertEquals("kkkk", instance.captureCodeFragment09("kkkk", "abc"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment10(String)}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertEquals(0, instance.captureCodeFragment10(""));
    Assert.assertEquals(0, instance.captureCodeFragment10("a"));
    Assert.assertEquals(0, instance.captureCodeFragment10("aa"));
    Assert.assertEquals(1, instance.captureCodeFragment10("aaa"));
    Assert.assertEquals(1, instance.captureCodeFragment10("123"));
    Assert.assertEquals(1, instance.captureCodeFragment10("1234"));
    Assert.assertEquals(1, instance.captureCodeFragment10("12345"));
    Assert.assertEquals(2, instance.captureCodeFragment10("123456"));
    Assert.assertEquals(2, instance.captureCodeFragment10("1234567"));
    Assert.assertEquals(2, instance.captureCodeFragment10("12345678"));
    Assert.assertEquals(3, instance.captureCodeFragment10("123456789"));
    Assert.assertEquals(3, instance.captureCodeFragment10("aaabbbcccdd"));
    Assert.assertEquals(4, instance.captureCodeFragment10("aaabbbcccddde"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment11(int, int, String)}.
   */
  @Test
  public final void testCaptureCodeFragment11() {
    Assert.assertEquals("aa", instance.captureCodeFragment11(0, 0, "aa"));
    Assert.assertEquals("bb", instance.captureCodeFragment11(0, 0, "bb"));
    Assert.assertEquals("bb", instance.captureCodeFragment11(0, 0, "bp"));
    Assert.assertEquals("abab", instance.captureCodeFragment11(0, 0, "abc"));
    Assert.assertEquals("bab", instance.captureCodeFragment11(1, 0, "abc"));
    Assert.assertEquals("abb", instance.captureCodeFragment11(0, 1, "abc"));
    Assert.assertEquals("bb", instance.captureCodeFragment11(1, 1, "abc"));
    Assert.assertEquals("b", instance.captureCodeFragment11(2, 1, "abc"));
    Assert.assertEquals("", instance.captureCodeFragment11(2, 2, "abc"));
    Assert.assertEquals("aaaa", instance.captureCodeFragment11(0, 0, "aaa"));
    Assert.assertEquals("aaa", instance.captureCodeFragment11(1, 0, "aaa"));
    Assert.assertEquals("bbb", instance.captureCodeFragment11(1, 0, "bbb"));
    Assert.assertEquals("aaaaa", instance.captureCodeFragment11(1, 0, "aaaa"));
    Assert.assertEquals("aaaaa", instance.captureCodeFragment11(1, 0, "aaaa"));
    Assert.assertEquals("aaa", instance.captureCodeFragment11(0, 1, "aaa"));
    Assert.assertEquals("aa", instance.captureCodeFragment11(1, 1, "aaa"));
    Assert.assertEquals("bb", instance.captureCodeFragment11(1, 1, "bbb"));
    Assert.assertEquals("aaaaa", instance.captureCodeFragment11(1, 2, "aaaaa"));
    Assert.assertEquals("aaaa", instance.captureCodeFragment11(2, 0, "aaaa"));
    Assert.assertEquals("aa", instance.captureCodeFragment11(2, 2, "aaaa"));
    Assert.assertEquals("bb", instance.captureCodeFragment11(2, 2, "bbbb"));
    Assert.assertEquals("123123", instance.captureCodeFragment11(0, 0, "1234"));
    Assert.assertEquals("23123", instance.captureCodeFragment11(1, 0, "1234"));
    Assert.assertEquals("3123", instance.captureCodeFragment11(2, 0, "1234"));
    Assert.assertEquals("123", instance.captureCodeFragment11(3, 0, "1234"));
    Assert.assertEquals("12323", instance.captureCodeFragment11(0, 1, "1234"));
    Assert.assertEquals("2323", instance.captureCodeFragment11(1, 1, "1234"));
    Assert.assertEquals("323", instance.captureCodeFragment11(2, 1, "1234"));
    Assert.assertEquals("23", instance.captureCodeFragment11(3, 1, "1234"));
    Assert.assertEquals("1233", instance.captureCodeFragment11(0, 2, "1234"));
    Assert.assertEquals("233", instance.captureCodeFragment11(1, 2, "1234"));
    Assert.assertEquals("33", instance.captureCodeFragment11(2, 2, "1234"));
    Assert.assertEquals("3", instance.captureCodeFragment11(3, 2, "1234"));
    Assert.assertEquals("123", instance.captureCodeFragment11(0, 3, "1234"));
    Assert.assertEquals("23", instance.captureCodeFragment11(1, 3, "1234"));
    Assert.assertEquals("3", instance.captureCodeFragment11(2, 3, "1234"));
    Assert.assertEquals("", instance.captureCodeFragment11(3, 3, "1234"));
  }

  /**
   * Test method for {@link Sector06#captureCodeFragment12(String)}.
   */
  @Test
  public final void testCaptureCodeFragment12() {
    Assert.assertEquals("", instance.captureCodeFragment12(""));
    Assert.assertEquals("aa", instance.captureCodeFragment12("a"));
    Assert.assertEquals("11", instance.captureCodeFragment12("1"));
    Assert.assertEquals("aaaa", instance.captureCodeFragment12("aa"));
    Assert.assertEquals("abba", instance.captureCodeFragment12("ab"));
    Assert.assertEquals("bccb", instance.captureCodeFragment12("bc"));
    Assert.assertEquals("1221", instance.captureCodeFragment12("12"));
    Assert.assertEquals("abccba", instance.captureCodeFragment12("abc"));
    Assert.assertEquals("123321", instance.captureCodeFragment12("123"));
    Assert.assertEquals("24799742", instance.captureCodeFragment12("2479"));
  }
}
