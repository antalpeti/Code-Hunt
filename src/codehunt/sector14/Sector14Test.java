package codehunt.sector14;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector14Test is contains tests for Sector 14 section.
 */
public class Sector14Test {

  /** The instance variable to test the not static methods. */
  private static Sector14 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector14();
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
   * Test method for {@link Sector14#captureCodeFragment01(int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(0, instance.captureCodeFragment01(0));
    Assert.assertEquals(1, instance.captureCodeFragment01(1));
    Assert.assertEquals(3, instance.captureCodeFragment01(2));
    Assert.assertEquals(6, instance.captureCodeFragment01(3));
    Assert.assertEquals(10, instance.captureCodeFragment01(4));
    Assert.assertEquals(15, instance.captureCodeFragment01(5));
    Assert.assertEquals(21, instance.captureCodeFragment01(6));
    Assert.assertEquals(28, instance.captureCodeFragment01(7));
    Assert.assertEquals(36, instance.captureCodeFragment01(8));
    Assert.assertEquals(45, instance.captureCodeFragment01(9));
    Assert.assertEquals(55, instance.captureCodeFragment01(10));
    Assert.assertEquals(561, instance.captureCodeFragment01(33));
    Assert.assertEquals(595, instance.captureCodeFragment01(34));
    Assert.assertEquals(630, instance.captureCodeFragment01(35));
    Assert.assertEquals(4186, instance.captureCodeFragment01(-92));
    Assert.assertEquals(1953, instance.captureCodeFragment01(-63));
    Assert.assertEquals(2016, instance.captureCodeFragment01(-64));
    Assert.assertEquals(28, instance.captureCodeFragment01(-8));
    Assert.assertEquals(0, instance.captureCodeFragment01(-1));
    Assert.assertEquals(378, instance.captureCodeFragment01(-28));
    Assert.assertEquals(406, instance.captureCodeFragment01(-29));
    Assert.assertEquals(1596, instance.captureCodeFragment01(-57));
    Assert.assertEquals(1830, instance.captureCodeFragment01(-61));
    Assert.assertEquals(1953, instance.captureCodeFragment01(-63));
    Assert.assertEquals(3916, instance.captureCodeFragment01(-89));
    Assert.assertEquals(4278, instance.captureCodeFragment01(-93));
    Assert.assertEquals(4560, instance.captureCodeFragment01(-96));
  }

  // /**
  // * Test method for {@link Sector14#captureCodeFragment02(int)}.
  // */
  // @Test
  // public final void testCaptureCodeFragment02() {
  // Assert.assertEquals(-55320, instance.captureCodeFragment02(-48));
  // Assert.assertEquals(-131104, instance.captureCodeFragment02(-64));
  // Assert.assertEquals(0, instance.captureCodeFragment02(0));
  // Assert.assertEquals(1, instance.captureCodeFragment02(1));
  // Assert.assertEquals(175, instance.captureCodeFragment02(7));
  // Assert.assertEquals(1695, instance.captureCodeFragment02(15));
  // Assert.assertEquals(16400, instance.captureCodeFragment02(32));
  // Assert.assertEquals(17985, instance.captureCodeFragment02(33));
  // Assert.assertEquals(19669, instance.captureCodeFragment02(34));
  // Assert.assertEquals(21455, instance.captureCodeFragment02(35));
  // Assert.assertEquals(470645, instance.captureCodeFragment02(35));
  // }

  // /**
  // * Test method for {@link Sector14#captureCodeFragment03(int, int)}.
  // */
  // @Test
  // public final void testCaptureCodeFragment03() {
  // Assert.assertEquals(true, instance.captureCodeFragment03(2, 2));
  // Assert.assertEquals(true, instance.captureCodeFragment03(3, 3));
  // Assert.assertEquals(true, instance.captureCodeFragment03(4, 2));
  // Assert.assertEquals(true, instance.captureCodeFragment03(33, 11));
  // Assert.assertEquals(true, instance.captureCodeFragment03(156, 2));
  // Assert.assertEquals(true, instance.captureCodeFragment03(336, 2));
  // Assert.assertEquals(true, instance.captureCodeFragment03(363, 2));
  // Assert.assertEquals(true, instance.captureCodeFragment03(9, 9));
  // Assert.assertEquals(false, instance.captureCodeFragment03(1, 1));
  // Assert.assertEquals(false, instance.captureCodeFragment03(11, 6));
  // Assert.assertEquals(false, instance.captureCodeFragment03(11, 9));
  // Assert.assertEquals(false, instance.captureCodeFragment03(22, 22));
  // Assert.assertEquals(false, instance.captureCodeFragment03(33, 1));
  // Assert.assertEquals(false, instance.captureCodeFragment03(33, 2));
  // Assert.assertEquals(false, instance.captureCodeFragment03(33, 4));
  // Assert.assertEquals(false, instance.captureCodeFragment03(33, 5));
  // Assert.assertEquals(false, instance.captureCodeFragment03(33, 33));
  // Assert.assertEquals(false, instance.captureCodeFragment03(75, 3));
  // Assert.assertEquals(false, instance.captureCodeFragment03(234, 9));
  // Assert.assertEquals(false, instance.captureCodeFragment03(266, 1));
  // Assert.assertEquals(false, instance.captureCodeFragment03(266, 11));
  // Assert.assertEquals(false, instance.captureCodeFragment03(266, 38));
  // Assert.assertEquals(false, instance.captureCodeFragment03(266, 133));
  // Assert.assertEquals(false, instance.captureCodeFragment03(801, 3));
  // Assert.assertEquals(false, instance.captureCodeFragment03(780, 10));
  // Assert.assertEquals(false, instance.captureCodeFragment03(780, 778));
  // Assert.assertEquals(false, instance.captureCodeFragment03(801, 11));
  // }

}
