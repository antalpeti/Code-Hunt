package codehunt.sector05;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector05Test {
  private Sector05 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector05();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Create a string which contains the given substring more times.
   *
   * @param sub the string will be contains this
   * @param rep number of repetition of the substring
   * @return
   */
  private String createString(String sub, int rep) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < rep; i++) {
      sb.append(sub);
    }
    return sb.toString();
  }

  /**
   * Test method for {@link Sector05#captureCodeFragment01(String)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    for (int i = 0; i < 4; i++) {
      Assert.assertEquals("short", instance.captureCodeFragment01(createString("a", i)));
    }
    for (int i = 4; i < 8; i++) {
      Assert.assertEquals("average", instance.captureCodeFragment01(createString("b", i)));
    }
    for (int i = 8; i < 15; i++) {
      Assert.assertEquals("long", instance.captureCodeFragment01(createString("c", i)));
    }
    for (int i = 15; i < 100; i++) {
      Assert.assertEquals("super long", instance.captureCodeFragment01(createString("d", i)));
    }
  }

  /**
   * Test method for {@link Sector05#captureCodeFragment02(int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("not a fancy year", instance.captureCodeFragment02(0));
    for (int i = 0; i < 1000; i++) {
      Assert.assertEquals("not a fancy year", instance.captureCodeFragment02(i));
    }
    for (int i = 1111; i < 10000; i += 1111) {
      Assert.assertEquals("fancy year", instance.captureCodeFragment02(i));
    }
    for (int i = 1000; i < 10000; i++) {
      if (i % 1111 == 0) {
        continue;
      }
      Assert.assertEquals("not a fancy year", instance.captureCodeFragment02(i));
    }
    for (int i = 10000; i < 12000; i++) {
      Assert.assertEquals("not a fancy year", instance.captureCodeFragment02(i));
    }
  }

  /**
   * Test method for {@link Sector05#captureCodeFragment03(int, int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(false, instance.captureCodeFragment03(0, 0, 0));
    Assert.assertEquals(false, instance.captureCodeFragment03(0, 0, 1));
    Assert.assertEquals(false, instance.captureCodeFragment03(0, 1, 0));
    Assert.assertEquals(false, instance.captureCodeFragment03(0, 1, 1));
    Assert.assertEquals(false, instance.captureCodeFragment03(1, 0, 0));
    Assert.assertEquals(false, instance.captureCodeFragment03(1, 0, 1));
    Assert.assertEquals(false, instance.captureCodeFragment03(1, 1, 0));
    Assert.assertEquals(false, instance.captureCodeFragment03(1, 1, 1));
    Assert.assertEquals(true, instance.captureCodeFragment03(42, 58, 40));
    Assert.assertEquals(true, instance.captureCodeFragment03(45, 27, 36));
    Assert.assertEquals(false, instance.captureCodeFragment03(1, 2, 3));
    Assert.assertEquals(true, instance.captureCodeFragment03(3, 4, 5));
    Assert.assertEquals(true, instance.captureCodeFragment03(5, 3, 4));
    Assert.assertEquals(true, instance.captureCodeFragment03(4, 5, 3));
    Assert.assertEquals(true, instance.captureCodeFragment03(5, 12, 13));
    Assert.assertEquals(false, instance.captureCodeFragment03(5, 12, 14));
    Assert.assertEquals(false, instance.captureCodeFragment03(5, 11, 13));
    Assert.assertEquals(false, instance.captureCodeFragment03(6, 12, 13));
    Assert.assertEquals(true, instance.captureCodeFragment03(6, 8, 10));
    Assert.assertEquals(true, instance.captureCodeFragment03(7, 24, 25));
    Assert.assertEquals(true, instance.captureCodeFragment03(8, 15, 17));
    Assert.assertEquals(true, instance.captureCodeFragment03(9, 40, 41));
    Assert.assertEquals(true, instance.captureCodeFragment03(41, 9, 40));
    Assert.assertEquals(true, instance.captureCodeFragment03(40, 41, 9));
  }

  /**
   * Test method for {@link Sector05#captureCodeFragment04(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals(0, instance.captureCodeFragment04(0, 0));
    Assert.assertEquals(998, instance.captureCodeFragment04(992, -6));
    Assert.assertEquals(2, instance.captureCodeFragment04(1, -1));
    Assert.assertEquals(9, instance.captureCodeFragment04(-8, -1));
    Assert.assertEquals(5, instance.captureCodeFragment04(2, 3));
    Assert.assertEquals(5, instance.captureCodeFragment04(-2, 3));
  }

  /**
   * Test method for {@link Sector05#captureCodeFragment05(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals(false, instance.captureCodeFragment05(2, 3));
    Assert.assertEquals(false, instance.captureCodeFragment05(71572304, 71572305));
    Assert.assertEquals(true, instance.captureCodeFragment05(71572304, 90831104));
    Assert.assertEquals(true, instance.captureCodeFragment05(1, 1));
    Assert.assertEquals(true, instance.captureCodeFragment05(2, 4));
    Assert.assertEquals(true, instance.captureCodeFragment05(3, 9));
    Assert.assertEquals(true, instance.captureCodeFragment05(4, 16));
    Assert.assertEquals(true, instance.captureCodeFragment05(5, 25));
    Assert.assertEquals(true, instance.captureCodeFragment05(6, 36));
    Assert.assertEquals(true, instance.captureCodeFragment05(7, 49));
    Assert.assertEquals(true, instance.captureCodeFragment05(8, 64));
    Assert.assertEquals(true, instance.captureCodeFragment05(9, 81));
    Assert.assertEquals(true, instance.captureCodeFragment05(10, 100));
    Assert.assertEquals(true, instance.captureCodeFragment05(11, 121));
    Assert.assertEquals(true, instance.captureCodeFragment05(12, 144));
    Assert.assertEquals(true, instance.captureCodeFragment05(13, 169));
    Assert.assertEquals(true, instance.captureCodeFragment05(14, 196));
    Assert.assertEquals(true, instance.captureCodeFragment05(15, 225));
    Assert.assertEquals(true, instance.captureCodeFragment05(16, 256));
    Assert.assertEquals(true, instance.captureCodeFragment05(17, 289));
    Assert.assertEquals(true, instance.captureCodeFragment05(18, 324));
    Assert.assertEquals(true, instance.captureCodeFragment05(19, 361));
    Assert.assertEquals(true, instance.captureCodeFragment05(20, 400));
  }
}
