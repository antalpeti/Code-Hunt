package codehunt.sector13;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector13Test is contains tests for Sector 13 section.
 */
public class Sector13Test {

  /** The instance variable to test the not static methods. */
  private static Sector13 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Sector13();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector13#captureCodeFragment01(String)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals("", instance.captureCodeFragment01(""));
    Assert.assertEquals("h", instance.captureCodeFragment01("a"));
    Assert.assertEquals("i", instance.captureCodeFragment01("b"));
    Assert.assertEquals("a", instance.captureCodeFragment01("t"));
    Assert.assertEquals("f", instance.captureCodeFragment01("y"));
    Assert.assertEquals("hh", instance.captureCodeFragment01("aa"));
    Assert.assertEquals("ff", instance.captureCodeFragment01("yy"));
    Assert.assertEquals("ras", instance.captureCodeFragment01("ktl"));
    Assert.assertEquals("fhh", instance.captureCodeFragment01("yaa"));
    Assert.assertEquals("fhhh", instance.captureCodeFragment01("yaaa"));
    Assert.assertEquals("hijk", instance.captureCodeFragment01("abcd"));
    Assert.assertEquals("gaog", instance.captureCodeFragment01("zthz"));
    Assert.assertEquals("hhhhh", instance.captureCodeFragment01("aaaaa"));
    Assert.assertEquals("hhfaaaahr", instance.captureCodeFragment01("aayttttak"));
    Assert.assertEquals("abcdefg", instance.captureCodeFragment01("tuvwxyz"));
    Assert.assertEquals("ihhihhhhhhhhhhiifhhhhhhhhhh",
        instance.captureCodeFragment01("baabaaaaaaaaaabbyaaaaaaaaaa"));
  }

  /**
   * Test method for {@link Sector13#captureCodeFragment02(String)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("", instance.captureCodeFragment02(""));
    Assert.assertEquals("3", instance.captureCodeFragment02("0"));
    Assert.assertEquals("0", instance.captureCodeFragment02("|"));
    Assert.assertEquals("2", instance.captureCodeFragment02("~"));
    Assert.assertEquals("22", instance.captureCodeFragment02("~~"));
    Assert.assertEquals("33", instance.captureCodeFragment02("00"));
    Assert.assertEquals("033", instance.captureCodeFragment02("|00"));
    Assert.assertEquals("2333", instance.captureCodeFragment02("~000"));
    Assert.assertEquals("C2T", instance.captureCodeFragment02("@~Q"));
    Assert.assertEquals("C72C", instance.captureCodeFragment02("@4~@"));
    Assert.assertEquals("33333", instance.captureCodeFragment02("00000"));
    Assert.assertEquals("3C;CEEC2O", instance.captureCodeFragment02("0@8@BB@~L"));
    Assert.assertEquals("444444444444444423333333333",
        instance.captureCodeFragment02("1111111111111111~0000000000"));
  }

  /**
   * Test method for {@link Sector13#captureCodeFragment03(String)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals("", instance.captureCodeFragment03(""));
    Assert.assertEquals("b", instance.captureCodeFragment03("a"));
    Assert.assertEquals("c", instance.captureCodeFragment03("b"));
    Assert.assertEquals("a", instance.captureCodeFragment03("z"));
    Assert.assertEquals("k", instance.captureCodeFragment03("j"));
    Assert.assertEquals("bf", instance.captureCodeFragment03("aa"));
    Assert.assertEquals("ae", instance.captureCodeFragment03("zz"));
    Assert.assertEquals("bfjnr", instance.captureCodeFragment03("aaaaa"));
    Assert.assertEquals("bgynsyzaan", instance.captureCodeFragment03("abpabdaxtc"));
    Assert.assertEquals("bfjnrvzdhlptxbfj", instance.captureCodeFragment03("aaaaaaaaaaaaaaaa"));
  }

  /**
   * Test method for {@link Sector13#captureCodeFragment04(String)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals("", instance.captureCodeFragment04(""));
    Assert.assertEquals("c", instance.captureCodeFragment04("a"));
    Assert.assertEquals("b", instance.captureCodeFragment04("z"));
    Assert.assertEquals("cd", instance.captureCodeFragment04("aa"));
    Assert.assertEquals("bb", instance.captureCodeFragment04("zy"));
    Assert.assertEquals("bc", instance.captureCodeFragment04("zz"));
    Assert.assertEquals("cdt", instance.captureCodeFragment04("aaa"));
    Assert.assertEquals("cdtt", instance.captureCodeFragment04("aaaa"));
    Assert.assertEquals("cdttc", instance.captureCodeFragment04("aaaaa"));
    Assert.assertEquals("cdttcd", instance.captureCodeFragment04("aaaaaa"));
    Assert.assertEquals("cdttcdt", instance.captureCodeFragment04("aaaaaaa"));
    Assert.assertEquals("cdttcdtt", instance.captureCodeFragment04("aaaaaaaa"));
    Assert.assertEquals("cdttcdttc", instance.captureCodeFragment04("aaaaaaaaa"));
  }

}
