package codehunt.sector07;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector07Test {
  private Sector07 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector07();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment01(String, String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals("", instance.captureCodeFragment01("", "", ""));
    Assert.assertEquals("cc", instance.captureCodeFragment01("", "", "c"));
    Assert.assertEquals("bb", instance.captureCodeFragment01("", "b", ""));
    Assert.assertEquals("bccb", instance.captureCodeFragment01("", "b", "c"));
    Assert.assertEquals("aa", instance.captureCodeFragment01("a", "", ""));
    Assert.assertEquals("caac", instance.captureCodeFragment01("a", "", "c"));
    Assert.assertEquals("baab", instance.captureCodeFragment01("a", "b", ""));
    Assert.assertEquals("bcaacb", instance.captureCodeFragment01("a", "b", "c"));
    Assert.assertEquals("baaaab", instance.captureCodeFragment01("a", "b", "a"));
    Assert.assertEquals("231132", instance.captureCodeFragment01("1", "2", "3"));
    Assert.assertEquals("aqeeqa", instance.captureCodeFragment01("e", "a", "q"));
    Assert.assertEquals("bcaacb", instance.captureCodeFragment01("a", "b", "c"));
    Assert.assertEquals("yvzxxvzy", instance.captureCodeFragment01("x", "y", "vz"));
    Assert.assertEquals("cdefgababfgcde", instance.captureCodeFragment01("ab", "cde", "fg"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment02(String)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("aa", instance.captureCodeFragment02("aaaaa"));
    Assert.assertEquals("bb", instance.captureCodeFragment02("bbaaa"));
    Assert.assertEquals("bba", instance.captureCodeFragment02("bbaaaa"));
    Assert.assertEquals("a", instance.captureCodeFragment02("ab"));
    Assert.assertEquals("a", instance.captureCodeFragment02("abc"));
    Assert.assertEquals("c", instance.captureCodeFragment02("cb"));
    Assert.assertEquals("c", instance.captureCodeFragment02("cba"));
    Assert.assertEquals("dc", instance.captureCodeFragment02("dcba"));
    Assert.assertEquals("1", instance.captureCodeFragment02("12"));
    Assert.assertEquals("1", instance.captureCodeFragment02("123"));
    Assert.assertEquals("", instance.captureCodeFragment02("c"));
    Assert.assertEquals("", instance.captureCodeFragment02(""));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment03(String, String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals("aaaaaa", instance.captureCodeFragment03("aaaaaa", "i", "a"));
    Assert.assertEquals("iiiiii", instance.captureCodeFragment03("aaaaaa", "a", "i"));
    Assert.assertEquals("ii iii i", instance.captureCodeFragment03("aa aaa a", "a", "i"));
    Assert.assertEquals("abba", instance.captureCodeFragment03("xyba", "xy", "ab"));
    Assert.assertEquals("xyzz", instance.captureCodeFragment03("xyba", "ba", "zz"));
    Assert.assertEquals("ccbbb", instance.captureCodeFragment03("aabbb", "a", "c"));
    Assert.assertEquals("cb", instance.captureCodeFragment03("ab", "a", "c"));
    Assert.assertEquals("th", instance.captureCodeFragment03("kh", "k", "t"));
    Assert.assertEquals("", instance.captureCodeFragment03("", "k", "t"));
    Assert.assertEquals("tmtitotwt", instance.captureCodeFragment03("miow", "", "t"));
    Assert.assertEquals("miow", instance.captureCodeFragment03("miow", "k", ""));
    Assert.assertEquals("miw", instance.captureCodeFragment03("miow", "o", ""));
    Assert.assertEquals("miow", instance.captureCodeFragment03("miow", "", ""));
    Assert.assertEquals("mi ow", instance.captureCodeFragment03("mi ow", "", ""));
    Assert.assertEquals("ededed", instance.captureCodeFragment03("abcdabcdabcd", "abc", "e"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment04(String)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals("a", instance.captureCodeFragment04("a"));
    Assert.assertEquals("aa", instance.captureCodeFragment04("aa"));
    Assert.assertEquals("aaa", instance.captureCodeFragment04("aaa"));
    Assert.assertEquals("ba", instance.captureCodeFragment04("ab"));
    Assert.assertEquals("cba", instance.captureCodeFragment04("abc"));
    Assert.assertEquals("c   ba", instance.captureCodeFragment04("ab   c"));
    Assert.assertEquals("wvzyx", instance.captureCodeFragment04("xyzvw"));
    Assert.assertEquals("c b a", instance.captureCodeFragment04("a b c"));
    Assert.assertEquals("9876543210", instance.captureCodeFragment04("0123456789"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment05(String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals("abababa", instance.captureCodeFragment05("qbbbbbb", "aaaaaaa"));
    Assert.assertEquals("abac", instance.captureCodeFragment05("qbbc", "aaaa"));
    Assert.assertEquals("t", instance.captureCodeFragment05("s", "t"));
    Assert.assertEquals("ts", instance.captureCodeFragment05("ss", "tt"));
    Assert.assertEquals("ts", instance.captureCodeFragment05("as", "tk"));
    Assert.assertEquals("TbFd", instance.captureCodeFragment05("AbCd", "TeFD"));
    Assert.assertEquals("BaB", instance.captureCodeFragment05("aaa", "BBB"));
    Assert.assertEquals("ts", instance.captureCodeFragment05("as", "tk"));
    Assert.assertEquals("32", instance.captureCodeFragment05("12", "34"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment06(String)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals("a", instance.captureCodeFragment06("a         "));
    Assert.assertEquals("", instance.captureCodeFragment06("         "));
    Assert.assertEquals("v", instance.captureCodeFragment06(" v  "));
    Assert.assertEquals("aa", instance.captureCodeFragment06("a a          "));
    Assert.assertEquals("aaaa", instance.captureCodeFragment06("a aaa        "));
    Assert.assertEquals("abcd", instance.captureCodeFragment06("a b  c   d  "));
    Assert.assertEquals("aBCDeF", instance.captureCodeFragment06("a BC D e   F  "));
    Assert.assertEquals("1234", instance.captureCodeFragment06("1  2 3   4  "));
    Assert.assertEquals("97a68", instance.captureCodeFragment06("  9  7  a   6   8  "));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment07(String)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertEquals("", instance.captureCodeFragment07(""));
    Assert.assertEquals("", instance.captureCodeFragment07("a"));
    Assert.assertEquals("", instance.captureCodeFragment07("e"));
    Assert.assertEquals("", instance.captureCodeFragment07("i"));
    Assert.assertEquals("", instance.captureCodeFragment07("u"));
    Assert.assertEquals("", instance.captureCodeFragment07("o"));
    Assert.assertEquals("", instance.captureCodeFragment07("aei"));
    Assert.assertEquals("", instance.captureCodeFragment07("ou"));
    Assert.assertEquals("", instance.captureCodeFragment07("ouiea"));
    Assert.assertEquals("OUIEA", instance.captureCodeFragment07("OUIEA"));
    Assert.assertEquals("OUIEA", instance.captureCodeFragment07("OaUeIiEoAu"));
    Assert.assertEquals("bb", instance.captureCodeFragment07("uuubbuuua"));
    Assert.assertEquals("bbb", instance.captureCodeFragment07("uuubbuuub"));
    Assert.assertEquals("bbb", instance.captureCodeFragment07("ouubbuuub"));
    Assert.assertEquals("bdjpx", instance.captureCodeFragment07("abedijopux"));
    Assert.assertEquals("bbcd", instance.captureCodeFragment07("aaabbcde"));
    Assert.assertEquals("xxyzz", instance.captureCodeFragment07("xxuuuuuyzz"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment08(String, String, String, String)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals(false, instance.captureCodeFragment08("bqbbbbbbb", "b", "a", "a"));
    Assert.assertEquals(false, instance.captureCodeFragment08("baaaaaaaa", "a", "a", "a"));
    Assert.assertEquals(false, instance.captureCodeFragment08("abbbbbbbb", "a", "a", "a"));
    Assert.assertEquals(true, instance.captureCodeFragment08("baaaaaaaa", "b", "b", "a"));
    Assert.assertEquals(false, instance.captureCodeFragment08("abbbbbbbb", "a", "a", "aa"));
    Assert.assertEquals(false, instance.captureCodeFragment08("abbbbbbbb", "ab", "a", "a"));
    Assert.assertEquals(true, instance.captureCodeFragment08("aabaaaaaa", "a", "aa", "a"));
    Assert.assertEquals(true, instance.captureCodeFragment08("aqbbabcbbde", "a", "abc", "de"));
    Assert.assertEquals(false, instance.captureCodeFragment08("aqbbabcbbde", "a", "abc", "ed"));
    Assert.assertEquals(true, instance.captureCodeFragment08("aqbbabcbbde", "a", "abc", "e"));
    Assert.assertEquals(false, instance.captureCodeFragment08("aqbbabcbbde", "a", "abc", "d"));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "1", "23", "56"));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "1", "34", "6"));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "", "", ""));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "1", "", ""));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "", "6", ""));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "", "1", ""));
    Assert.assertEquals(true, instance.captureCodeFragment08("123456", "", "", "6"));
    Assert.assertEquals(true, instance.captureCodeFragment08("", "", "", ""));
    Assert.assertEquals(false, instance.captureCodeFragment08("", "h", "", ""));
    Assert.assertEquals(false, instance.captureCodeFragment08("", "", "i", ""));
    Assert.assertEquals(false, instance.captureCodeFragment08("", "", "", "j"));
    Assert.assertEquals(false, instance.captureCodeFragment08("abc", "A", "", ""));
    Assert.assertEquals(false, instance.captureCodeFragment08("abc", "A", "B", ""));
    Assert.assertEquals(false, instance.captureCodeFragment08("abc", "A", "B", "C"));
    Assert.assertEquals(false, instance.captureCodeFragment08("abc", "A", "B", "C"));
    Assert.assertEquals(true, instance.captureCodeFragment08("AaBbcC", "A", "B", "C"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment09(int, String)}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertEquals("aaa", instance.captureCodeFragment09(1, "aaa"));
    Assert.assertEquals("aaa aaa", instance.captureCodeFragment09(2, "aaa"));
    Assert.assertEquals("aaa aaa aaa", instance.captureCodeFragment09(3, "aaa"));
    Assert.assertEquals("abc", instance.captureCodeFragment09(1, "abc"));
    Assert.assertEquals("abc abc", instance.captureCodeFragment09(2, "abc"));
    Assert.assertEquals("abc  abc  abc ", instance.captureCodeFragment09(3, "abc "));
    Assert.assertEquals("", instance.captureCodeFragment09(0, ""));
    Assert.assertEquals(" ", instance.captureCodeFragment09(2, ""));
    Assert.assertEquals("        ", instance.captureCodeFragment09(9, ""));
    Assert.assertEquals("", instance.captureCodeFragment09(0, "x A"));
    Assert.assertEquals("x Z", instance.captureCodeFragment09(1, "x Z"));
    Assert.assertEquals("x y x y", instance.captureCodeFragment09(2, "x y"));
    Assert.assertEquals("x A x A x A", instance.captureCodeFragment09(3, "x A"));
    Assert.assertEquals(" 3 2  1  3 2  1  3 2  1", instance.captureCodeFragment09(3, " 3 2  1"));
  }

  /**
   * Test method for {@link Sector07#captureCodeFragment10(int)}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertEquals("z", instance.captureCodeFragment10(0));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z",
        instance.captureCodeFragment10(1));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x z", instance.captureCodeFragment10(2));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w z", instance.captureCodeFragment10(3));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v z", instance.captureCodeFragment10(4));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u z", instance.captureCodeFragment10(5));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t z", instance.captureCodeFragment10(6));
    Assert.assertEquals("a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s t u v w x y z "
        + "a b c d e f g h i j k l m n o p q r s z", instance.captureCodeFragment10(7));
  }

}
