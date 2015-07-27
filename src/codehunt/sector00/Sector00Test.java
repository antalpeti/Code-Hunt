package codehunt.sector00;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector00Test is contains tests for Sector 00 section.
 */
public class Sector00Test {

  /** The instance variable to test the not static methods. */
  private static Sector00 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector00();
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
   * Test method for {@link Sector00#captureCodeFragment01(int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(-1, instance.captureCodeFragment01(1));
    Assert.assertEquals(-2, instance.captureCodeFragment01(2));
    Assert.assertEquals(0, instance.captureCodeFragment01(0));
    Assert.assertEquals(1, instance.captureCodeFragment01(-1));
    Assert.assertEquals(2, instance.captureCodeFragment01(-2));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment02(int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals(2, instance.captureCodeFragment02(1));
    Assert.assertEquals(3, instance.captureCodeFragment02(2));
    Assert.assertEquals(1, instance.captureCodeFragment02(0));
    Assert.assertEquals(0, instance.captureCodeFragment02(-1));
    Assert.assertEquals(-1, instance.captureCodeFragment02(-2));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment03(int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(2, instance.captureCodeFragment03(1));
    Assert.assertEquals(4, instance.captureCodeFragment03(2));
    Assert.assertEquals(0, instance.captureCodeFragment03(0));
    Assert.assertEquals(-2, instance.captureCodeFragment03(-1));
    Assert.assertEquals(-4, instance.captureCodeFragment03(-2));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment04(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals(0, instance.captureCodeFragment04(0, 0));
    Assert.assertEquals(1, instance.captureCodeFragment04(1, 0));
    Assert.assertEquals(1, instance.captureCodeFragment04(0, 1));
    Assert.assertEquals(1, instance.captureCodeFragment04(-1, 2));
    Assert.assertEquals(0, instance.captureCodeFragment04(-5, 5));
    Assert.assertEquals(8, instance.captureCodeFragment04(6, 2));
  }

}
