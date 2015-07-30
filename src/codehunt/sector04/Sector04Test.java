package codehunt.sector04;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector04Test is contains tests for Sector 04 section.
 */
public class Sector04Test {

  /** The instance variable to test the not static methods. */
  private static Sector04 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector04();
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
   * Test method for {@link Sector04#captureCodeFragment01(Boolean, Boolean)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(false, instance.captureCodeFragment01(false, false));
    Assert.assertEquals(true, instance.captureCodeFragment01(true, false));
    Assert.assertEquals(true, instance.captureCodeFragment01(false, true));
    Assert.assertEquals(true, instance.captureCodeFragment01(true, true));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment02(Boolean, Boolean)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals(false, instance.captureCodeFragment02(false, false));
    Assert.assertEquals(false, instance.captureCodeFragment02(true, false));
    Assert.assertEquals(false, instance.captureCodeFragment02(false, true));
    Assert.assertEquals(true, instance.captureCodeFragment02(true, true));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment03(int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    for (int i = 50; i < 102; i = i + 2) {
      Assert.assertFalse(instance.captureCodeFragment03(i));
    }
    for (int i = 0; i < 50; i = i + 2) {
      Assert.assertTrue(instance.captureCodeFragment03(i));
    }
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment04(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertFalse(instance.captureCodeFragment04(-1, -10));
    Assert.assertFalse(instance.captureCodeFragment04(0, -10));
    Assert.assertFalse(instance.captureCodeFragment04(0, 0));
    Assert.assertFalse(instance.captureCodeFragment04(1, 1));
    Assert.assertFalse(instance.captureCodeFragment04(5, 2));
    Assert.assertTrue(instance.captureCodeFragment04(-1, 0));
    Assert.assertTrue(instance.captureCodeFragment04(34, 35));
    Assert.assertTrue(instance.captureCodeFragment04(45, 85));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment05(int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals(0, instance.captureCodeFragment05(0));
    for (int i = -1; i > -2014; i--) {
      Assert.assertEquals(-1, instance.captureCodeFragment05(i));
    }
    for (int i = 1; i < 2014; i++) {
      Assert.assertEquals(1, instance.captureCodeFragment05(i));
    }
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment06(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    for (int j = 30; j < 2014; j++) {
      Assert.assertEquals(false, instance.captureCodeFragment06(29, j));
    }
    Assert.assertEquals(false, instance.captureCodeFragment06(1, 1));
    for (int i = 30; i < 2014; i++) {
      Assert.assertEquals(true, instance.captureCodeFragment06(i, 29));
    }
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment07(int)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertEquals(2, instance.captureCodeFragment07(0));
    Assert.assertEquals(2, instance.captureCodeFragment07(1));
    Assert.assertEquals(2, instance.captureCodeFragment07(10));
    Assert.assertEquals(2, instance.captureCodeFragment07(34));
    Assert.assertEquals(2, instance.captureCodeFragment07(98));
    Assert.assertEquals(2, instance.captureCodeFragment07(99));
    Assert.assertEquals(3, instance.captureCodeFragment07(100));
    Assert.assertEquals(3, instance.captureCodeFragment07(101));
    Assert.assertEquals(3, instance.captureCodeFragment07(202));
    Assert.assertEquals(3, instance.captureCodeFragment07(1024));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment08(int)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    for (int i = -2014; i < 2015; i += 2) {
      Assert.assertEquals("even", instance.captureCodeFragment08(i));
    }
    for (int j = -2013; j < 2015; j += 2) {
      Assert.assertEquals("odd", instance.captureCodeFragment08(j));
    }
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment09(int)}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    for (int i = -2015; i < 2016; i += 5) {
      Assert.assertEquals("multiple of 5", instance.captureCodeFragment09(i));
    }
    for (int i = -2015; i < 2016; i += 5) {
      Assert.assertEquals("not a multiple of 5", instance.captureCodeFragment09(i + 1));
      Assert.assertEquals("not a multiple of 5", instance.captureCodeFragment09(i + 2));
      Assert.assertEquals("not a multiple of 5", instance.captureCodeFragment09(i + 3));
      Assert.assertEquals("not a multiple of 5", instance.captureCodeFragment09(i + 4));
    }
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment10(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertEquals("multiple of 1", instance.captureCodeFragment10(3, 1));
    Assert.assertEquals("not a multiple of 2", instance.captureCodeFragment10(3, 2));
    Assert.assertEquals("multiple of 3", instance.captureCodeFragment10(3, 3));
    Assert.assertEquals("not a multiple of 2", instance.captureCodeFragment10(3, 2));
    try {
      Assert.assertEquals("ArithemeticException / by zero", instance.captureCodeFragment10(3, 0));
      Assert.fail("No ArithmeticException has been thrown.");
    } catch (ArithmeticException e) {
    }
    Assert.assertEquals("multiple of 2", instance.captureCodeFragment10(0, 2));
    Assert.assertEquals("multiple of 3", instance.captureCodeFragment10(0, 3));
    Assert.assertEquals("multiple of 2", instance.captureCodeFragment10(2, 2));
    Assert.assertEquals("multiple of 10", instance.captureCodeFragment10(20, 10));
    Assert.assertEquals("not a multiple of 10", instance.captureCodeFragment10(21, 10));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment11(int, int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment11() {
    Assert.assertEquals("no", instance.captureCodeFragment11(1, 1, 1));
    Assert.assertEquals("no", instance.captureCodeFragment11(1, 1, 2));
    Assert.assertEquals("no", instance.captureCodeFragment11(1, 2, 1));
    Assert.assertEquals("no", instance.captureCodeFragment11(3, 2, 2));
    Assert.assertEquals("no", instance.captureCodeFragment11(4, 2, 2));
    Assert.assertEquals("yes!", instance.captureCodeFragment11(4, 2, 1));
    Assert.assertEquals("yes!", instance.captureCodeFragment11(27, 3, 1));
    Assert.assertEquals("no", instance.captureCodeFragment11(25, 3, 1));
    Assert.assertEquals("no", instance.captureCodeFragment11(27, 3, 2));
    Assert.assertEquals("yes!", instance.captureCodeFragment11(27, 3, 1));
    Assert.assertEquals("no", instance.captureCodeFragment11(1, 0, 2));
    Assert.assertEquals("yes!", instance.captureCodeFragment11(1, 0, 1));
  }

  /**
   * Test method for {@link Sector04#captureCodeFragment12(int)}.
   */
  @Test
  public final void testCaptureCodeFragment12() {
    for (int i = -8; i < 8; i++) {
      Assert.assertEquals(0, instance.captureCodeFragment12(i));
    }
    for (int i = 8; i < 15; i++) {
      Assert.assertEquals(7, instance.captureCodeFragment12(i));
    }
    for (int i = 15; i < 100; i++) {
      Assert.assertEquals(21, instance.captureCodeFragment12(i));
    }
  }
}
