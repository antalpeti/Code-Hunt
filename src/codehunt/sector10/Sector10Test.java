package codehunt.sector10;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector10Test is contains tests for Sector 10 section.
 */
public class Sector10Test {

  /** The instance variable to test the not static methods. */
  private static Sector10 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector10();
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
   * Test method for {@link Sector10#captureCodeFragment01(int[][], int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[][] { {0}, {0}}, 0, 0));
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[][] { {0}, {1}}, 1, 0));
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[][] { {0, 1}, {2, 3}}, 0, 0));
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[][] { {0, 1}, {2, 3}}, 0, 1));
    Assert.assertEquals(2, instance.captureCodeFragment01(new int[][] { {0, 1}, {2, 3}}, 1, 0));
    Assert.assertEquals(3, instance.captureCodeFragment01(new int[][] { {0, 1}, {2, 3}}, 1, 1));
    Assert.assertEquals(3, instance.captureCodeFragment01(new int[][] { {1, 2, 3}, {4}}, 0, 2));
    Assert.assertEquals(4, instance.captureCodeFragment01(new int[][] { {1, 2, 3}, {4}}, 1, 0));
    Assert.assertEquals(3, instance.captureCodeFragment01(new int[][] { {0}, {1, 2, 3}}, 1, 2));

  }

  /**
   * Test method for {@link Sector10#captureCodeFragment02()}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertArrayEquals(new int[][] { {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0},
        {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}, instance.captureCodeFragment02());
  }

  /**
   * Test method for {@link Sector10#captureCodeFragment03(int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertArrayEquals(new int[][] { {0, 0, 0}, {0, 0, 0}, {0, 0, 0}},
        instance.captureCodeFragment03(3, 0));
    Assert.assertArrayEquals(new int[][] {}, instance.captureCodeFragment03(0, 0));
    Assert.assertArrayEquals(new int[][] {}, instance.captureCodeFragment03(0, 1));
    Assert.assertArrayEquals(new int[][] { {4, 4}, {4, 4}}, instance.captureCodeFragment03(2, 4));
    Assert.assertArrayEquals(new int[][] { {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}},
        instance.captureCodeFragment03(4, 1));
    Assert.assertArrayEquals(new int[][] { {-7, -7, -7}, {-7, -7, -7}, {-7, -7, -7}},
        instance.captureCodeFragment03(3, -7));
    Assert.assertArrayEquals(new int[][] {{5}}, instance.captureCodeFragment03(1, 5));
  }

  /**
   * Test method for {@link Sector10#captureCodeFragment04(int[][])}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertArrayEquals(new int[][] {{2}}, instance.captureCodeFragment04(new int[][] {{1}}));
    Assert.assertArrayEquals(new int[][] {{4}}, instance.captureCodeFragment04(new int[][] {{2}}));
    Assert.assertArrayEquals(new int[][] { {2, 2}, {2, 2}},
        instance.captureCodeFragment04(new int[][] { {1, 1}, {1, 1}}));
    Assert.assertArrayEquals(new int[][] { {2, 2}, {2, 2}},
        instance.captureCodeFragment04(new int[][] { {1, 1}, {1, 1}}));

  }

  /**
   * Test method for {@link Sector10#captureCodeFragment05(int[][], int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertEquals(0, instance.captureCodeFragment05(new int[][] {{}}, 0));
    Assert.assertEquals(0, instance.captureCodeFragment05(new int[][] {{}}, 1));
    Assert.assertEquals(0, instance.captureCodeFragment05(new int[][] {{1}}, 0));
    Assert.assertEquals(1, instance.captureCodeFragment05(new int[][] {{1}}, 1));
    Assert.assertEquals(0, instance.captureCodeFragment05(new int[][] { {1, 1}, {1, 1}}, 0));
    Assert.assertEquals(2, instance.captureCodeFragment05(new int[][] { {2, 3}, {3, 1}}, 3));
    Assert.assertEquals(1, instance.captureCodeFragment05(new int[][] { {2, 3}, {3, 1}}, 2));
    Assert.assertEquals(5, instance.captureCodeFragment05(new int[][] { {0, 0, 0}, {0, 0}}, 0));
    Assert
        .assertEquals(3, instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {1, 2}, {1}}, 1));
    Assert
    .assertEquals(2, instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {1, 2}, {1}}, 2));
    Assert
    .assertEquals(1, instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {1, 2}, {1}}, 3));
    Assert.assertEquals(1,
        instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 1));
    Assert.assertEquals(2,
        instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2));
    Assert.assertEquals(3,
        instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 3));
    Assert.assertEquals(2,
        instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 4));
    Assert.assertEquals(1,
        instance.captureCodeFragment05(new int[][] { {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 5));
  }

  /**
   * Test method for {@link Sector10#captureCodeFragment06(int[][])}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertEquals(Integer.MIN_VALUE, instance.captureCodeFragment06(new int[][] {{}}));
    Assert.assertEquals(0, instance.captureCodeFragment06(new int[][] {{0}}));
    Assert.assertEquals(1, instance.captureCodeFragment06(new int[][] {{1}}));
    Assert.assertEquals(9, instance.captureCodeFragment06(new int[][] { {1}, {9}, {7}}));
    Assert.assertEquals(74, instance.captureCodeFragment06(new int[][] { {1}, {-5}, {74}}));
    Assert.assertEquals(1014,
        instance.captureCodeFragment06(new int[][] { {1014, 1014}, {1014, 1}}));
    Assert.assertEquals(1022, instance.captureCodeFragment06(new int[][] { {1, 1022}, {1022, 1}}));
    Assert.assertEquals(5514,
        instance.captureCodeFragment06(new int[][] { {1, 1022}, {1022, 1}, {5514, -2000}}));
  }

  /**
   * Test method for {@link Sector10#captureCodeFragment07(int[][])}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment07(new int[][] {{}}));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment07(new int[][] {{1}}));
    Assert.assertArrayEquals(new int[] {129, 1},
        instance.captureCodeFragment07(new int[][] { {129, 1}, {1, 128}}));
    Assert.assertArrayEquals(new int[] {129, 1},
        instance.captureCodeFragment07(new int[][] { {32, 33}, {129, 1}}));
    Assert.assertArrayEquals(new int[] {1, 1, 1},
        instance.captureCodeFragment07(new int[][] { {1, 1, 1}, {1, 1, 1}, {1, 1, 1}}));
    Assert.assertArrayEquals(new int[] {0},
        instance.captureCodeFragment07(new int[][] { {2, -3}, {0}, {-1, -2, -1}}));
    Assert.assertArrayEquals(new int[] {10},
        instance.captureCodeFragment07(new int[][] { {10}, {0}, {-10}}));
    Assert.assertArrayEquals(new int[] {1, 3, 7},
        instance.captureCodeFragment07(new int[][] { {1, 4, 5}, {1, 3, 7}, {9, -1, 2}}));
  }

  /**
   * Test method for {@link Sector10#captureCodeFragment08(int[][])}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[][] {{}}));
    Assert.assertEquals(1, instance.captureCodeFragment08(new int[][] {{1}}));
    Assert.assertEquals(1586, instance.captureCodeFragment08(new int[][] { {816, 990}, {770, 33}}));
    Assert
        .assertEquals(1791, instance.captureCodeFragment08(new int[][] { {816, 990}, {770, 801}}));
    Assert.assertEquals(3, instance.captureCodeFragment08(new int[][] { {1, 2}, {2, 1}}));
    Assert
        .assertEquals(15, instance.captureCodeFragment08(new int[][] { {1, 2}, {2, 1}, {11, 12}}));
  }
}
