package codehunt.sector09;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector09Test {
  private Sector09 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector09();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment01(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[] {1}, 0));
    Assert.assertEquals(0, instance.captureCodeFragment01(new int[] {0, 0, 0, 0}, 0));
    Assert.assertEquals(1, instance.captureCodeFragment01(new int[] {0, 1, 2, 3}, 1));
    Assert.assertEquals(2, instance.captureCodeFragment01(new int[] {0, 1, 2, 3}, 2));
    Assert.assertEquals(3, instance.captureCodeFragment01(new int[] {0, 1, 2, 3}, 3));
    Assert.assertEquals(9, instance.captureCodeFragment01(new int[] {9, -1, 4}, 0));
    Assert.assertEquals(-1, instance.captureCodeFragment01(new int[] {9, -1, 4}, 1));
    Assert.assertEquals(4, instance.captureCodeFragment01(new int[] {9, -1, 4}, 2));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment02(String[])}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertEquals("aa", instance.captureCodeFragment02(new String[] {"a", "a", "a", "a"}));
    Assert.assertEquals("ba", instance.captureCodeFragment02(new String[] {"b", "a", "a", "a"}));
    Assert.assertEquals("ab", instance.captureCodeFragment02(new String[] {"a", "a", "a", "b"}));
    Assert.assertEquals("bb", instance.captureCodeFragment02(new String[] {"b", "a", "a", "b"}));
    Assert.assertEquals("13", instance.captureCodeFragment02(new String[] {"1", "2", "3"}));
    Assert.assertEquals("xy", instance.captureCodeFragment02(new String[] {"x", "y"}));
    Assert.assertEquals("zz", instance.captureCodeFragment02(new String[] {"z"}));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment03(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(false, instance.captureCodeFragment03(new int[] {}, 1));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[] {1}, 1));
    Assert.assertEquals(false, instance.captureCodeFragment03(new int[] {1}, 2));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[] {2, 3, 4}, 3));
    Assert.assertEquals(false, instance.captureCodeFragment03(new int[] {2, 3, 4}, 5));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[] {0, 0, 0, 0}, 0));
    Assert.assertEquals(false, instance.captureCodeFragment03(new int[] {0, 0, 0, 0}, 1));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[] {1, 0, 0, 0}, 1));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment04(int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
        instance.captureCodeFragment04(0));
    Assert.assertArrayEquals(new int[] {33, 33, 33, 33, 33, 33, 33, 33, 33, 33},
        instance.captureCodeFragment04(33));
    Assert.assertArrayEquals(new int[] {101, 101, 101, 101, 101, 101, 101, 101, 101, 101},
        instance.captureCodeFragment04(101));
    Assert.assertArrayEquals(new int[] {5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
        instance.captureCodeFragment04(5));
    Assert.assertArrayEquals(new int[] {-4, -4, -4, -4, -4, -4, -4, -4, -4, -4},
        instance.captureCodeFragment04(-4));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment05(int)}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment05(0));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment05(1));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.captureCodeFragment05(2));
    Assert.assertArrayEquals(new int[] {0, 1, 2}, instance.captureCodeFragment05(3));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3}, instance.captureCodeFragment05(4));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4}, instance.captureCodeFragment05(5));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5}, instance.captureCodeFragment05(6));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6}, instance.captureCodeFragment05(7));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, instance.captureCodeFragment05(8));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8},
        instance.captureCodeFragment05(9));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
        instance.captureCodeFragment05(10));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment06()}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertArrayEquals(new Boolean[] {true, true, true, true, true, true, true, true, true,
        true}, instance.captureCodeFragment06());
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment07(String)}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertArrayEquals(new String[] {}, instance.captureCodeFragment07(""));
    Assert.assertArrayEquals(new String[] {"0"}, instance.captureCodeFragment07("0"));
    Assert.assertArrayEquals(new String[] {"1"}, instance.captureCodeFragment07("1"));
    Assert.assertArrayEquals(new String[] {"x"}, instance.captureCodeFragment07("x"));
    Assert.assertArrayEquals(new String[] {"x", "y", "z"}, instance.captureCodeFragment07("xyz"));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "a", "a"},
        instance.captureCodeFragment07("aaaaaa"));
    Assert.assertArrayEquals(new String[] {"b", "a", "a", "a", "a", "a"},
        instance.captureCodeFragment07("baaaaa"));
    Assert.assertArrayEquals(new String[] {"a", "a", "a", "a", "a", "a", "a"},
        instance.captureCodeFragment07("aaaaaaa"));
    Assert.assertArrayEquals(new String[] {"j", "j", "k", "k", "l", "l", "m"},
        instance.captureCodeFragment07("jjkkllm"));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
        instance.captureCodeFragment07("0123456789"));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment08(int)}.
   */
  @Test
  public final void testCaptureCodeFragment08() {
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment08(0));
    Assert.assertArrayEquals(new int[] {1, 0}, instance.captureCodeFragment08(1));
    Assert.assertArrayEquals(new int[] {2, 1, 0}, instance.captureCodeFragment08(2));
    Assert.assertArrayEquals(new int[] {3, 2, 1, 0}, instance.captureCodeFragment08(3));
    Assert.assertArrayEquals(new int[] {4, 3, 2, 1, 0}, instance.captureCodeFragment08(4));
    Assert.assertArrayEquals(new int[] {5, 4, 3, 2, 1, 0}, instance.captureCodeFragment08(5));
    Assert.assertArrayEquals(new int[] {6, 5, 4, 3, 2, 1, 0}, instance.captureCodeFragment08(6));
    Assert.assertArrayEquals(new int[] {7, 6, 5, 4, 3, 2, 1, 0}, instance.captureCodeFragment08(7));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment09(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment09() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment09(new int[] {}));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment09(new int[] {0}));
    Assert.assertArrayEquals(new int[] {-1}, instance.captureCodeFragment09(new int[] {1}));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment09(new int[] {-1}));
    Assert.assertArrayEquals(new int[] {-1, -1}, instance.captureCodeFragment09(new int[] {1, 1}));
    Assert.assertArrayEquals(new int[] {-1, 1}, instance.captureCodeFragment09(new int[] {1, -1}));
    Assert.assertArrayEquals(new int[] {1, -1}, instance.captureCodeFragment09(new int[] {-1, 1}));
    Assert.assertArrayEquals(new int[] {1, 1}, instance.captureCodeFragment09(new int[] {-1, -1}));
    Assert.assertArrayEquals(new int[] {-22, -22, -44, -55, -55},
        instance.captureCodeFragment09(new int[] {22, 22, 44, 55, 55}));
    Assert.assertArrayEquals(new int[] {-33, -33, -33, -33},
        instance.captureCodeFragment09(new int[] {33, 33, 33, 33}));
    Assert.assertArrayEquals(new int[] {101, 0, -202},
        instance.captureCodeFragment09(new int[] {-101, 0, 202}));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment10(int[])}.
   */
  @Test
  public final void testCaptureCodeFragment10() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment10(new int[] {}));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment10(new int[] {0}));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment10(new int[] {1}));
    Assert.assertArrayEquals(new int[] {2, 1}, instance.captureCodeFragment10(new int[] {1, 2}));
    Assert.assertArrayEquals(new int[] {3, 2, 1},
        instance.captureCodeFragment10(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {4, 3, 2, 1},
        instance.captureCodeFragment10(new int[] {1, 2, 3, 4}));
    Assert.assertArrayEquals(new int[] {34, 33, 33, 33},
        instance.captureCodeFragment10(new int[] {33, 33, 33, 34}));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment11(String)}.
   */
  @Test
  public final void testCaptureCodeFragment11() {
    Assert.assertEquals("", instance.captureCodeFragment11(""));
    Assert.assertEquals("a", instance.captureCodeFragment11("a"));
    Assert.assertEquals("1", instance.captureCodeFragment11("1"));
    Assert.assertEquals("cb", instance.captureCodeFragment11("bc"));
    Assert.assertEquals("321", instance.captureCodeFragment11("123"));
    Assert.assertEquals("gfe", instance.captureCodeFragment11("efg"));
    Assert.assertEquals("edcba", instance.captureCodeFragment11("abcde"));
    Assert.assertEquals("gfedcba", instance.captureCodeFragment11("abcdefg"));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment12(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment12() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment12(new int[] {}, 0));
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment12(new int[] {}, 5));
    Assert.assertArrayEquals(new int[] {1, 2}, instance.captureCodeFragment12(new int[] {1, 2}, 4));
    Assert.assertArrayEquals(new int[] {1, 2, 3},
        instance.captureCodeFragment12(new int[] {1, 2, 3}, 6));
    Assert.assertArrayEquals(new int[] {3, 1, 2},
        instance.captureCodeFragment12(new int[] {1, 2, 3}, 7));
    Assert.assertArrayEquals(new int[] {2, 3, 1},
        instance.captureCodeFragment12(new int[] {1, 2, 3}, 8));
    Assert.assertArrayEquals(new int[] {1, 2, 3},
        instance.captureCodeFragment12(new int[] {1, 2, 3}, 9));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment12(new int[] {1}, 3));
    Assert.assertArrayEquals(new int[] {1, 0, 0, 0},
        instance.captureCodeFragment12(new int[] {0, 1, 0, 0}, 3));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment13(int[], int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment13() {
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment13(new int[] {0}, 0, 0));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment13(new int[] {1}, 0, 0));
    Assert.assertArrayEquals(new int[] {1, 0},
        instance.captureCodeFragment13(new int[] {0, 1}, 0, 1));
    Assert.assertArrayEquals(new int[] {3, 1, 0},
        instance.captureCodeFragment13(new int[] {0, 1, 3}, 0, 2));
    Assert.assertArrayEquals(new int[] {0, 1, 3},
        instance.captureCodeFragment13(new int[] {0, 1, 3}, 2, 2));
    Assert.assertArrayEquals(new int[] {0, 3, 1},
        instance.captureCodeFragment13(new int[] {0, 1, 3}, 1, 2));
    Assert.assertArrayEquals(new int[] {1, 0, 3},
        instance.captureCodeFragment13(new int[] {0, 1, 3}, 0, 1));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0},
        instance.captureCodeFragment13(new int[] {0, 0, 0, 0, 0, 0, 0}, 0, 1));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0},
        instance.captureCodeFragment13(new int[] {0, 0, 0, 0, 0, 0, 0}, 0, 2));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 0},
        instance.captureCodeFragment13(new int[] {0, 0, 0, 0, 0, 0, 0}, 1, 6));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 1},
        instance.captureCodeFragment13(new int[] {0, 1, 0, 0, 0, 0, 0}, 1, 6));
  }

  /**
   * Test method for {@link Sector09#captureCodeFragment14(int[], int[])}.
   */
  @Test
  public final void testCaptureCodeFragment14() {
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0},
        instance.captureCodeFragment14(new int[] {0, 0, 0, 0}, new int[] {0, 0, 0, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0},
        instance.captureCodeFragment14(new int[] {0, 0, 0, 0, 0}, new int[] {0, 0, 0, 0, 0, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0},
        instance.captureCodeFragment14(new int[] {0, 0, 0}, new int[] {0, 0, 0, 0, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0},
        instance.captureCodeFragment14(new int[] {0, 0, 0, 0, 0}, new int[] {0, 0, 0}));
    Assert.assertArrayEquals(new int[] {},
        instance.captureCodeFragment14(new int[] {}, new int[] {}));
    Assert.assertArrayEquals(new int[] {2, 3, 4, 0, 0},
        instance.captureCodeFragment14(new int[] {1, 1, 1, 0, 0}, new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {1, 3, 5, 3, 0},
        instance.captureCodeFragment14(new int[] {0, 1, 2, 3, 0}, new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {0, 2, 1},
        instance.captureCodeFragment14(new int[] {0, 1}, new int[] {0, 1, 1}));
  }
}
