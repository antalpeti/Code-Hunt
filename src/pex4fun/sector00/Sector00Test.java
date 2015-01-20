package pex4fun.sector00;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector00Test {
  private Sector00 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector00();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment02(int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals(1125, instance.captureCodeFragment02(-1125));
    Assert.assertEquals(112, instance.captureCodeFragment02(-112));
    Assert.assertEquals(11, instance.captureCodeFragment02(-11));
    Assert.assertEquals(2, instance.captureCodeFragment02(-2));
    Assert.assertEquals(0, instance.captureCodeFragment02(0));
    Assert.assertEquals(-2, instance.captureCodeFragment02(2));
    Assert.assertEquals(-11, instance.captureCodeFragment02(11));
    Assert.assertEquals(-112, instance.captureCodeFragment02(112));
    Assert.assertEquals(-1125, instance.captureCodeFragment02(1125));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment03(int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(-9, instance.captureCodeFragment03(-10));
    Assert.assertEquals(-4, instance.captureCodeFragment03(-5));
    Assert.assertEquals(0, instance.captureCodeFragment03(-1));
    Assert.assertEquals(1, instance.captureCodeFragment03(0));
    Assert.assertEquals(3, instance.captureCodeFragment03(2));
    Assert.assertEquals(13, instance.captureCodeFragment03(12));
    Assert.assertEquals(14, instance.captureCodeFragment03(13));
    Assert.assertEquals(46, instance.captureCodeFragment03(45));
    Assert.assertEquals(68, instance.captureCodeFragment03(67));
    Assert.assertEquals(101, instance.captureCodeFragment03(100));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment04(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals(0, instance.captureCodeFragment04(0, 0));
    Assert.assertEquals(0, instance.captureCodeFragment04(-1, 1));
    Assert.assertEquals(0, instance.captureCodeFragment04(2, -2));
    Assert.assertEquals(1, instance.captureCodeFragment04(1, 0));
    Assert.assertEquals(1, instance.captureCodeFragment04(0, 1));
    Assert.assertEquals(33, instance.captureCodeFragment04(22, 11));
    Assert.assertEquals(320, instance.captureCodeFragment04(110, 210));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment05(int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals(16, instance.captureCodeFragment05(-4));
    Assert.assertEquals(9, instance.captureCodeFragment05(-3));
    Assert.assertEquals(4, instance.captureCodeFragment05(-2));
    Assert.assertEquals(1, instance.captureCodeFragment05(-1));
    Assert.assertEquals(0, instance.captureCodeFragment05(0));
    Assert.assertEquals(1, instance.captureCodeFragment05(1));
    Assert.assertEquals(4, instance.captureCodeFragment05(2));
    Assert.assertEquals(9, instance.captureCodeFragment05(3));
    Assert.assertEquals(16, instance.captureCodeFragment05(4));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment06(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals(true, instance.captureCodeFragment06(new int[] {}));
    Assert.assertEquals(true, instance.captureCodeFragment06(new int[] {0, 0}));
    Assert.assertEquals(true, instance.captureCodeFragment06(new int[] {0, 1}));
    Assert.assertEquals(false, instance.captureCodeFragment06(new int[] {1, 0}));
    Assert.assertEquals(true, instance.captureCodeFragment06(new int[] {0, 0, 0}));
    Assert.assertEquals(true, instance.captureCodeFragment06(new int[] {0, 2, 5}));
    Assert.assertEquals(false, instance.captureCodeFragment06(new int[] {2, 5, 3}));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment07(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment07(new int[] {}));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment07(new int[] {0}));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment07(new int[] {1}));
    Assert.assertArrayEquals(new int[] {2}, instance.captureCodeFragment07(new int[] {2}));
    Assert.assertArrayEquals(new int[] {0, 0}, instance.captureCodeFragment07(new int[] {0, 0}));
    Assert.assertArrayEquals(new int[] {1, 0}, instance.captureCodeFragment07(new int[] {0, 1}));
    Assert.assertArrayEquals(new int[] {2, 1}, instance.captureCodeFragment07(new int[] {1, 2}));
    Assert.assertArrayEquals(new int[] {3, 2, 1},
        instance.captureCodeFragment07(new int[] {1, 2, 3}));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment08(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment08(new int[] {}));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment08(new int[] {0}));
    Assert
    .assertArrayEquals(new int[] {1, 512}, instance.captureCodeFragment08(new int[] {512, 1}));
    Assert.assertArrayEquals(new int[] {0, 0}, instance.captureCodeFragment08(new int[] {0, 0}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.captureCodeFragment08(new int[] {0, 1}));
    Assert.assertArrayEquals(new int[] {1, 1, 512},
        instance.captureCodeFragment08(new int[] {512, 1, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 512},
        instance.captureCodeFragment08(new int[] {512, 1, 0, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1},
        instance.captureCodeFragment08(new int[] {0, 1, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3},
        instance.captureCodeFragment08(new int[] {2, 3, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 2},
        instance.captureCodeFragment08(new int[] {0, 1, 0, 2}));
    Assert.assertArrayEquals(
        new int[] {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        instance.captureCodeFragment08(new int[] {2, 1, 0, 0, 2, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
  }

  /**
   * Test method for {@link Sector00#captureCodeFragment09(String)}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertEquals('\0', instance.captureCodeFragment09(""));
    Assert.assertEquals('a', instance.captureCodeFragment09("a"));
    Assert.assertEquals('a', instance.captureCodeFragment09("aa"));
    Assert.assertEquals('b', instance.captureCodeFragment09("ac"));
    Assert.assertEquals('1', instance.captureCodeFragment09("1"));
    Assert.assertEquals('1', instance.captureCodeFragment09("12"));
    Assert.assertEquals('2', instance.captureCodeFragment09("123"));
    Assert.assertEquals('2', instance.captureCodeFragment09("1234"));
    Assert.assertEquals('3', instance.captureCodeFragment09("12345"));
    Assert.assertEquals('3', instance.captureCodeFragment09("123456"));
    Assert.assertEquals('c', instance.captureCodeFragment09("abef"));
    Assert.assertEquals('d', instance.captureCodeFragment09("abefg"));
    Assert.assertEquals('d', instance.captureCodeFragment09("abcefg"));
    Assert.assertEquals('d', instance.captureCodeFragment09("abcefgh"));
    Assert.assertEquals('e', instance.captureCodeFragment09("abcefghi"));
  }

}
