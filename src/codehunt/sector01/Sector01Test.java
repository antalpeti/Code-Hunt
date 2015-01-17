package codehunt.sector01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector01Test {

  private Sector01 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector01();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment01(int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    for (int i = -2014; i < 2014; i++) {
      Assert.assertEquals(-i, instance.captureCodeFragment01(i));
    }
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment02(int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    for (int i = -2014; i < 2014; i++) {
      Assert.assertEquals(i - 2, instance.captureCodeFragment02(i));
    }
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment03(int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    for (int i = -2014; i < 2014; i++) {
      Assert.assertEquals(i * i, instance.captureCodeFragment03(i));
    }
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment04(int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals(0, instance.captureCodeFragment04(0));
    Assert.assertEquals(99, instance.captureCodeFragment04(33));
    Assert.assertEquals(3, instance.captureCodeFragment04(1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment05(int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals(0, instance.captureCodeFragment05(0));
    Assert.assertEquals(11, instance.captureCodeFragment05(33));
    Assert.assertEquals(0, instance.captureCodeFragment05(1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment06(int)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals(0, instance.captureCodeFragment06(29));
    Assert.assertEquals(4, instance.captureCodeFragment06(1));
    Assert.assertEquals(1, instance.captureCodeFragment06(4));
    Assert.assertEquals(0, instance.captureCodeFragment06(-95));
    Assert.assertEquals(2, instance.captureCodeFragment06(2));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment07(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertEquals(0, instance.captureCodeFragment07(1, 1));
    Assert.assertEquals(0, instance.captureCodeFragment07(2, 2));
    Assert.assertEquals(1, instance.captureCodeFragment07(2, 1));
    Assert.assertEquals(-1, instance.captureCodeFragment07(1, 2));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment08(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals(95, instance.captureCodeFragment08(29, 33));
    Assert.assertEquals(3, instance.captureCodeFragment08(1, 1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment09(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertEquals(-2, instance.captureCodeFragment09(2, -1));
    Assert.assertEquals(0, instance.captureCodeFragment09(1, 0));
    Assert.assertEquals(1, instance.captureCodeFragment09(1, 1));
    Assert.assertEquals(4, instance.captureCodeFragment09(2, 2));
    Assert.assertEquals(12, instance.captureCodeFragment09(2, 6));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment10(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertEquals(1, instance.captureCodeFragment10(1, 1));
    Assert.assertEquals(2, instance.captureCodeFragment10(2, 2));
    Assert.assertEquals(4, instance.captureCodeFragment10(3, 3));
    Assert.assertEquals(2, instance.captureCodeFragment10(0, 6));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment11(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment11() {
    Assert.assertEquals(0, instance.captureCodeFragment11(29, 33));
    Assert.assertEquals(1, instance.captureCodeFragment11(1, 1));
    Assert.assertEquals(1, instance.captureCodeFragment11(3, 3));
    Assert.assertEquals(-1, instance.captureCodeFragment11(3, -3));
    Assert.assertEquals(0, instance.captureCodeFragment11(0, 1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment12(int)}.
   */
  @Test
  public final void testCaptureCodeFragment12() {
    Assert.assertEquals(0, instance.captureCodeFragment12(0));
    Assert.assertEquals(2, instance.captureCodeFragment12(23));
    Assert.assertEquals(1, instance.captureCodeFragment12(4));
    Assert.assertEquals(1, instance.captureCodeFragment12(1));
    Assert.assertEquals(-1, instance.captureCodeFragment12(-1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment13(int)}.
   */
  @Test
  public final void testCaptureCodeFragment13() {
    Assert.assertEquals(1, instance.captureCodeFragment13(0));
    Assert.assertEquals(3, instance.captureCodeFragment13(23));
    Assert.assertEquals(2, instance.captureCodeFragment13(4));
    Assert.assertEquals(2, instance.captureCodeFragment13(1));
    Assert.assertEquals(0, instance.captureCodeFragment13(-1));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment14(int)}.
   */
  @Test
  public final void testCaptureCodeFragment14() {
    Assert.assertEquals(1, instance.captureCodeFragment14(-9));
    Assert.assertEquals(2, instance.captureCodeFragment14(-8));
    Assert.assertEquals(0, instance.captureCodeFragment14(-5));
    Assert.assertEquals(0, instance.captureCodeFragment14(-2));
    Assert.assertEquals(0, instance.captureCodeFragment14(1));
    Assert.assertEquals(0, instance.captureCodeFragment14(2));
    Assert.assertEquals(1, instance.captureCodeFragment14(3));
    Assert.assertEquals(2, instance.captureCodeFragment14(4));
    Assert.assertEquals(0, instance.captureCodeFragment14(5));
    Assert.assertEquals(10, instance.captureCodeFragment14(34));
  }

  /**
   * Test method for {@link Sector01#captureCodeFragment15(int, int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment15() {
    Assert.assertEquals(0, instance.captureCodeFragment15(0, 0, 0));
    Assert.assertEquals(2, instance.captureCodeFragment15(1, 2, 3));
    Assert.assertEquals(2, instance.captureCodeFragment15(6, -3, 3));
    Assert.assertEquals(4, instance.captureCodeFragment15(-1, 9, 4));
  }
}
