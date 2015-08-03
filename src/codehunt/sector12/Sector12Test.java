package codehunt.sector12;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Sector12Test is contains tests for Sector 12 section.
 */
public class Sector12Test {

  /** The instance variable to test the not static methods. */
  private static Sector12 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new Sector12();
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
   * Test method for {@link Sector12#captureCodeFragment01(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(0,
        instance.captureCodeFragment01(new int[] {33, 33, 33, 33, 33, 33, 33}, 32));
    Assert.assertEquals(1,
        instance.captureCodeFragment01(new int[] {32, 33, 33, 33, 33, 33, 33}, 32));
    Assert.assertEquals(2,
        instance.captureCodeFragment01(new int[] {32, 32, 33, 33, 33, 33, 33}, 32));
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[] {}, 1));
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[] {}, 0));
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[] {1}, 0));
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[] {1}, 1));
    Assert.assertEquals(4, instance.captureCodeFragment01(new int[] {1, 1, 1, 1}, 1));
    Assert.assertEquals(4, instance.captureCodeFragment01(new int[] {1, 1, 1, 1, 2, 2}, 1));
    Assert.assertEquals(2, instance.captureCodeFragment01(new int[] {1, 1, 1, 1, 2, 2}, 2));
    Assert.assertEquals(2, instance.captureCodeFragment01(new int[] {3, 2, 2, 2, 1, 1}, 1));
    Assert.assertEquals(3, instance.captureCodeFragment01(new int[] {3, 2, 2, 2, 1, 1}, 2));
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[] {3, 2, 2, 2, 1, 1}, 3));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment02(String[], String)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals(
        7,
        instance.captureCodeFragment02(new String[] {"aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
            "aaaa", "aaaa"}, "aaaa"));
    Assert.assertEquals(
        0,
        instance.captureCodeFragment02(new String[] {"aaaa", "aaaa", "aaaa", "aaaa", "aaaa",
            "aaaa", "aaaa"}, "iibb"));
    Assert.assertEquals(0, instance.captureCodeFragment02(new String[] {}, ""));
    Assert.assertEquals(1, instance.captureCodeFragment02(new String[] {""}, ""));
    Assert.assertEquals(2, instance.captureCodeFragment02(new String[] {"", ""}, ""));
    Assert.assertEquals(0, instance.captureCodeFragment02(new String[] {}, "a"));
    Assert.assertEquals(1, instance.captureCodeFragment02(new String[] {"a", "b"}, "a"));
    Assert.assertEquals(3, instance.captureCodeFragment02(new String[] {"1", "1", "2", "1"}, "1"));
    Assert.assertEquals(1,
        instance.captureCodeFragment02(new String[] {"1", "11", "2", "111"}, "1"));
    Assert.assertEquals(1,
        instance.captureCodeFragment02(new String[] {"1", "11", "2", "111"}, "11"));
    Assert.assertEquals(1,
        instance.captureCodeFragment02(new String[] {"1", "11", "2", "111"}, "111"));
    Assert.assertEquals(1,
        instance.captureCodeFragment02(new String[] {"1", "11", "2", "111"}, "2"));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment03(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(0, instance.captureCodeFragment03(new int[] {33, 0, 0, 0, 0, 0, 0}, 33));
    Assert.assertEquals(-1,
        instance.captureCodeFragment03(new int[] {33, 33, 33, 33, 33, 33, 33}, 32));
    Assert.assertEquals(-1, instance.captureCodeFragment03(new int[] {}, 32));
    Assert.assertEquals(-1, instance.captureCodeFragment03(new int[] {1, 2, 3}, 4));
    Assert.assertEquals(-1, instance.captureCodeFragment03(new int[] {1, 2, 3, 3, 3, 1, 2}, 4));
    Assert.assertEquals(2, instance.captureCodeFragment03(new int[] {1, 2, 3, 3, 3, 1, 2}, 3));
    Assert.assertEquals(1, instance.captureCodeFragment03(new int[] {1, 2, 3, 3, 3, 1, 2}, 2));
    Assert.assertEquals(0, instance.captureCodeFragment03(new int[] {1, 2, 3, 3, 3, 1, 2}, 1));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment04(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertEquals(6, instance.captureCodeFragment04(new int[] {0, 0, 0, 0, 0, 0, 33}, 33));
    Assert.assertEquals(-1,
        instance.captureCodeFragment04(new int[] {33, 33, 33, 33, 33, 34, 33}, 32));
    Assert.assertEquals(5,
        instance.captureCodeFragment04(new int[] {33, 33, 33, 33, 33, 34, 33}, 34));
    Assert.assertEquals(6,
        instance.captureCodeFragment04(new int[] {33, 33, 33, 33, 33, 34, 33}, 33));
    Assert.assertEquals(-1, instance.captureCodeFragment04(new int[] {}, 33));
    Assert.assertEquals(0, instance.captureCodeFragment04(new int[] {33}, 33));
    Assert.assertEquals(1, instance.captureCodeFragment04(new int[] {1, 33, 1}, 33));
    Assert.assertEquals(7, instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 3, 2, 1, 0}, 0));
    Assert.assertEquals(6, instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 3, 2, 1, 0}, 1));
    Assert.assertEquals(5, instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 3, 2, 1, 0}, 2));
    Assert.assertEquals(4, instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 3, 2, 1, 0}, 3));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment05(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertArrayEquals(new int[] {},
        instance.captureCodeFragment05(new int[] {33, 33, 33, 33, 33, 33, 33}, 32));
    Assert.assertArrayEquals(new int[] {0},
        instance.captureCodeFragment05(new int[] {32, 33, 33, 33, 33, 33, 33}, 32));
    Assert.assertArrayEquals(new int[] {0, 1},
        instance.captureCodeFragment05(new int[] {32, 32, 33, 33, 33, 33, 33}, 32));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment05(new int[] {32, 32, 32, 33, 33, 33, 33}, 32));
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment05(new int[] {}, 1));
    Assert.assertArrayEquals(new int[] {1, 4, 5},
        instance.captureCodeFragment05(new int[] {0, 1, 2, 3, 1, 1}, 1));
    Assert.assertArrayEquals(new int[] {0, 10},
        instance.captureCodeFragment05(new int[] {0, 1, 2, 2, 3, 4, 3, 2, 2, 1, 0}, 0));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment06(int[], int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertArrayEquals(new int[] {33, 33, 33, 33, 33, 33, 33},
        instance.captureCodeFragment06(new int[] {33, 33, 33, 33, 33, 33, 33}, 30, 31));
    Assert.assertArrayEquals(new int[] {35, 33, 33, 33, 33, 33, 33},
        instance.captureCodeFragment06(new int[] {34, 33, 33, 33, 33, 33, 33}, 34, 35));
    Assert.assertArrayEquals(new int[] {35, 35, 35, 33, 33, 33, 33},
        instance.captureCodeFragment06(new int[] {34, 35, 34, 33, 33, 33, 33}, 34, 35));
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment06(new int[] {}, 1, 2));
    Assert.assertArrayEquals(new int[] {2, 2, 2},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 1, 2));
    Assert.assertArrayEquals(new int[] {3, 2, 3},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 1, 3));
    Assert.assertArrayEquals(new int[] {1, 1, 1},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 2, 1));
    Assert.assertArrayEquals(new int[] {1, 3, 1},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 2, 3));
    Assert.assertArrayEquals(new int[] {1, 2, 1},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 3, 1));
    Assert.assertArrayEquals(new int[] {1, 2, 1},
        instance.captureCodeFragment06(new int[] {1, 2, 1}, 3, 2));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment07(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertArrayEquals(new int[][] {},
        instance.captureCodeFragment07(new int[] {0, 0, 0, 0, 0, 0, 0}, 1));
    Assert.assertArrayEquals(new int[][] {{0, 1}},
        instance.captureCodeFragment07(new int[] {2, 9, 0, 0, 0, 0, 0}, 11));
    Assert.assertArrayEquals(new int[][] { {0, 1}, {0, 2}},
        instance.captureCodeFragment07(new int[] {9, 2, 2, 0, 0, 0, 0}, 11));
    Assert.assertArrayEquals(new int[][] { {0, 1}, {0, 2}, {0, 3}},
        instance.captureCodeFragment07(new int[] {37, 34, 34, 34, 0, 0, 0}, 71));
    Assert.assertArrayEquals(new int[][] { {0, 1}, {0, 2}, {1, 2}},
        instance.captureCodeFragment07(new int[] {1, 1, 1}, 2));
    Assert.assertArrayEquals(new int[][] { {0, 1}, {1, 2}},
        instance.captureCodeFragment07(new int[] {1, 2, 1}, 3));
    Assert.assertArrayEquals(new int[][] {{0, 2}},
        instance.captureCodeFragment07(new int[] {1, 2, 1}, 2));
    Assert
    .assertArrayEquals(new int[][] {}, instance.captureCodeFragment07(new int[] {1, 2, 1}, 4));
    Assert
    .assertArrayEquals(new int[][] {}, instance.captureCodeFragment07(new int[] {1, 2, 1}, 1));
    Assert.assertArrayEquals(new int[][] {},
        instance.captureCodeFragment07(new int[] {1, 2, 1, 2}, 0));
    Assert.assertArrayEquals(new int[][] {},
        instance.captureCodeFragment07(new int[] {1, 2, 1, 2}, 1));
    Assert.assertArrayEquals(new int[][] {{0, 2}},
        instance.captureCodeFragment07(new int[] {1, 2, 1, 2}, 2));
    Assert.assertArrayEquals(new int[][] { {0, 1}, {0, 3}, {1, 2}, {2, 3}},
        instance.captureCodeFragment07(new int[] {1, 2, 1, 2}, 3));
    Assert.assertArrayEquals(new int[][] {{1, 3}},
        instance.captureCodeFragment07(new int[] {1, 2, 1, 2}, 4));
  }

  /**
   * Test method for {@link Sector12#copyOf(int[][], int)}.
   */
  @Test
  public final void testCopyOf() {
    Assert.assertArrayEquals(new int[][] {}, instance.copyOf(new int[][] {}, 0));
    Assert.assertArrayEquals(new int[][] {null}, instance.copyOf(new int[][] {}, 1));
    Assert.assertArrayEquals(new int[][] {null, null}, instance.copyOf(new int[][] {}, 2));
    Assert.assertArrayEquals(new int[][] { {0}, {1}, null},
        instance.copyOf(new int[][] { {0}, {1}}, 3));
    Assert.assertArrayEquals(new int[][] { {0}, {1}, null, null},
        instance.copyOf(new int[][] { {0}, {1}}, 4));
    Assert.assertArrayEquals(new int[][] { {0}, {1}, null, null, null},
        instance.copyOf(new int[][] { {0}, {1}}, 5));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment08(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertEquals(-1, instance.captureCodeFragment08(new int[] {}));
    Assert.assertEquals(-1, instance.captureCodeFragment08(new int[] {1}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {1, 1}));
    Assert.assertEquals(1, instance.captureCodeFragment08(new int[] {1, 1, 2}));
    Assert.assertEquals(2, instance.captureCodeFragment08(new int[] {1, 1, 2, 4}));
    Assert.assertEquals(3, instance.captureCodeFragment08(new int[] {1, 1, 2, 4, 8}));
    Assert.assertEquals(-1, instance.captureCodeFragment08(new int[] {2, 256, 0, 4, 5, 32, 8}));
    Assert.assertEquals(-1,
        instance.captureCodeFragment08(new int[] {290, 28, 517, 903, 12, 4, 293}));
    Assert.assertEquals(-1,
        instance.captureCodeFragment08(new int[] {298, 28, 517, 903, 12, 4, 293}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {768, 138, 517, 3, 78, 0, 32}));
    Assert.assertEquals(-1, instance.captureCodeFragment08(new int[] {552, 0, 514, 5, 12, 6, 4}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {552, 12, 264, 0, 267, 4, 5}));
    Assert.assertEquals(1,
        instance.captureCodeFragment08(new int[] {552, 12, 264, 0, 267, 4, 5, 24}));
    Assert.assertEquals(2,
        instance.captureCodeFragment08(new int[] {552, 12, 264, 0, 267, 4, 5, 24, 528}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {528, 263, 77, 76, 96, 0, 16}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {552, 12, 264, 0, 267, 4, 5}));
    Assert.assertEquals(0, instance.captureCodeFragment08(new int[] {157, 19, 12, 33, 16, 56, 21}));
    Assert.assertEquals(
        -1,
        instance.captureCodeFragment08(new int[] {1816816608, 756039696, 2099642976, -2095353824,
            1480720544, -1033785312, -1537931120}));
    Assert.assertEquals(
        0,
        instance.captureCodeFragment08(new int[] {1816816608, 1879597846, -1877218652, -1877980414,
            739582209, 536906018, -1879037695}));
    Assert.assertEquals(-1,
        instance.captureCodeFragment08(new int[] {903, 914, 634, 918, 754, 771, 915}));
    Assert
    .assertEquals(0, instance.captureCodeFragment08(new int[] {903, 0, 353, 37, 38, 75, 400}));
    Assert
    .assertEquals(0, instance.captureCodeFragment08(new int[] {903, 0, 353, 37, 38, 75, 400}));
    Assert.assertEquals(2,
        instance.captureCodeFragment08(new int[] {903, 0, 353, 37, 38, 75, 400, 706}));

  }

  /**
   * Test method for {@link Sector12#captureCodeFragment09(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {1, 0, 0, 0, 0, 0, 0}));
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {3, 0, 0, 0, 0, 0, 0}));
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {5, 0, 0, 0, 0, 0, 0}));
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {7, 0, 0, 0, 0, 0, 0}));
    Assert.assertEquals(true, instance.captureCodeFragment09(new int[] {}));
    Assert.assertEquals(true, instance.captureCodeFragment09(new int[] {1}));
    Assert.assertEquals(true, instance.captureCodeFragment09(new int[] {1, 1}));
    Assert.assertEquals(true, instance.captureCodeFragment09(new int[] {1, 2}));
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {1, 2, 1}));
    Assert.assertEquals(true, instance.captureCodeFragment09(new int[] {1, 1, 2}));
    Assert.assertEquals(false, instance.captureCodeFragment09(new int[] {1, 1, 2, 1}));
    Assert.assertEquals(true,
        instance.captureCodeFragment09(new int[] {1022, 1023, 1023, 1023, 1023, 1023, 1023}));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment10(String[])}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a", "aa"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a", "aa", "aaa"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a", "b", "c"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a", "b", "cc"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"1", "24", "356"}));
    Assert.assertEquals(true,
        instance.captureCodeFragment10(new String[] {"a", "a", "a", "a", "a", "a", "a"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"a", "b", "cc", "aa"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"aa", "a"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"1", "24", "11"}));
    Assert.assertEquals(true,
        instance.captureCodeFragment10(new String[] {"a", "a", "a", "aa", "aa", "aa", "aa"}));
    Assert.assertEquals(false,
        instance.captureCodeFragment10(new String[] {"a", "a", "a", "aa", "a", "a", "a"}));
    Assert.assertEquals(false,
        instance.captureCodeFragment10(new String[] {"i", "a", "a", "a", "a", "a", "a"}));
    Assert.assertEquals(false,
        instance.captureCodeFragment10(new String[] {"aa", "a", "a", "a", "a", "a", "a"}));
    Assert.assertEquals(true,
        instance.captureCodeFragment10(new String[] {"a", "a", "a", "a", "a", "a", "aa"}));
    Assert.assertEquals(false,
        instance.captureCodeFragment10(new String[] {"aa", "aa", "aa", "aa", "aa", "aa", "a"}));
    Assert.assertEquals(true,
        instance.captureCodeFragment10(new String[] {"ai", "ai", "ai", "ai", "ai", "ai", "ba"}));
    Assert.assertEquals(true,
        instance.captureCodeFragment10(new String[] {"a", "a", "a", "a", "a", "a", "aaa"}));
    Assert.assertEquals(true, instance.captureCodeFragment10(new String[] {"a", "ab", "abc"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"a", "abc", "ab"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"ab", "a", "abc"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"ab", "abc", "a"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"abc", "a", "ab"}));
    Assert.assertEquals(false, instance.captureCodeFragment10(new String[] {"abc", "ab", "a"}));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment11(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment11() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment11(new int[] {}));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment11(new int[] {0}));
    Assert
    .assertArrayEquals(new int[] {1, 512}, instance.captureCodeFragment11(new int[] {512, 1}));
    Assert.assertArrayEquals(new int[] {0, 0}, instance.captureCodeFragment11(new int[] {0, 0}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.captureCodeFragment11(new int[] {0, 1}));
    Assert.assertArrayEquals(new int[] {1, 1, 512},
        instance.captureCodeFragment11(new int[] {512, 1, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 512},
        instance.captureCodeFragment11(new int[] {512, 1, 0, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1},
        instance.captureCodeFragment11(new int[] {0, 1, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3},
        instance.captureCodeFragment11(new int[] {2, 3, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 2},
        instance.captureCodeFragment11(new int[] {0, 1, 0, 2}));
    Assert.assertArrayEquals(
        new int[] {0, 0, 0, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
        instance.captureCodeFragment11(new int[] {2, 1, 0, 0, 2, 1, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2,
            2, 2, 2, 2, 2, 2, 2, 2, 2, 2}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {0, 1, 2}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {0, 2, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {1, 0, 2}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {1, 2, 0}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {2, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 2},
        instance.captureCodeFragment11(new int[] {2, 1, 0}));
  }

  /**
   * Test method for {@link Sector12#captureCodeFragment12(String[])}.
   */
  @Test
  public final void testCaptureCodeFragment12() {
    Assert.assertArrayEquals(new String[] {}, instance.captureCodeFragment12(new String[] {}));
    Assert
    .assertArrayEquals(new String[] {"a"}, instance.captureCodeFragment12(new String[] {"a"}));
    Assert.assertArrayEquals(new String[] {"a", "a"},
        instance.captureCodeFragment12(new String[] {"a", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a"},
        instance.captureCodeFragment12(new String[] {"a", "a", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "aa"},
        instance.captureCodeFragment12(new String[] {"a", "aa"}));
    Assert.assertArrayEquals(new String[] {"a", "aa"},
        instance.captureCodeFragment12(new String[] {"aa", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "aaa", "aaa"},
        instance.captureCodeFragment12(new String[] {"a", "aaa", "aaa"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "aa"},
        instance.captureCodeFragment12(new String[] {"a", "aa", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "b", "b", "b"},
        instance.captureCodeFragment12(new String[] {"a", "a", "b", "b", "b", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "b", "b"},
        instance.captureCodeFragment12(new String[] {"a", "b", "b", "a", "a", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "a", "a", "aa"},
        instance.captureCodeFragment12(new String[] {"a", "a", "a", "a", "a", "aa", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "a", "a", "aa", "aa"},
        instance.captureCodeFragment12(new String[] {"a", "a", "a", "a", "a", "aa", "aa", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "a", "a", "a", "aa", "aa"}, instance
        .captureCodeFragment12(new String[] {"a", "a", "a", "a", "a", "aa", "aa", "a", "a"}));
    Assert.assertArrayEquals(
        new String[] {"a", "a", "a", "a", "a", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa",
            "aa", "aa", "aa", "aa"},
            instance.captureCodeFragment12(new String[] {"a", "a", "a", "a", "a", "aa", "aa", "aa",
                "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa", "aa"}));
    Assert
    .assertArrayEquals(new String[] {"1"}, instance.captureCodeFragment12(new String[] {"1"}));
    Assert.assertArrayEquals(new String[] {"1", "2"},
        instance.captureCodeFragment12(new String[] {"1", "2"}));
    Assert.assertArrayEquals(new String[] {"1", "2"},
        instance.captureCodeFragment12(new String[] {"2", "1"}));
    Assert.assertArrayEquals(new String[] {"1", "1", "2"},
        instance.captureCodeFragment12(new String[] {"1", "2", "1"}));
    Assert.assertArrayEquals(new String[] {"1", "1", "1", "2", "2", "3"},
        instance.captureCodeFragment12(new String[] {"1", "2", "1", "3", "1", "2"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"a", "b", "c"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"a", "c", "b"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"b", "a", "c"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"b", "c", "a"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"c", "a", "b"}));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.captureCodeFragment12(new String[] {"c", "b", "a"}));
  }

}
