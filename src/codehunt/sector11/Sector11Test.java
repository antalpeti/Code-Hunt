package codehunt.sector11;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector11Test {
  private Sector11 instance;

  @Before
  public void setUp() throws Exception {
    instance = new Sector11();
  }

  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment01(int[], int[])}.
   */
  @Test
  public final void testCaptureCodeFragment01() {
    Assert.assertArrayEquals(
        new int[] {384, 32, 146, 146, 265},
        instance.captureCodeFragment01(new int[] {128, 730, 642, 656, 265}, new int[] {512, 698,
            496, 510}));
    Assert.assertArrayEquals(new int[] {179, 0, 3},
        instance.captureCodeFragment01(new int[] {769, 783, 1018}, new int[] {590, 783, 1015}));
    Assert.assertArrayEquals(new int[] {451, 512, 1, 0},
        instance.captureCodeFragment01(new int[] {317, 512, 29}, new int[] {768, 0, 28, 0}));
    Assert.assertArrayEquals(new int[] {124, 25, 146, 0, 0},
        instance.captureCodeFragment01(new int[] {384, 25, 658}, new int[] {260, 0, 512, 0, 0}));
    Assert.assertArrayEquals(
        new int[] {180, 1, 50, 146, 265, 265, 265},
        instance.captureCodeFragment01(new int[] {640, 1, 576, 656, 265, 265, 265}, new int[] {460,
            2, 526, 510}));
    Assert.assertArrayEquals(new int[] {},
        instance.captureCodeFragment01(new int[] {}, new int[] {}));
    Assert.assertArrayEquals(new int[] {10, 9, 8, 1, 2, 3},
        instance.captureCodeFragment01(new int[] {11, 12, 13, 1, 2, 3}, new int[] {1, 3, 5}));
    Assert.assertArrayEquals(new int[] {1, 2, 3},
        instance.captureCodeFragment01(new int[] {1, 2, 3}, new int[] {}));
    Assert.assertArrayEquals(new int[] {1, 2, 3},
        instance.captureCodeFragment01(new int[] {}, new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {1, 2, 3},
        instance.captureCodeFragment01(new int[] {1, 2, 3}, new int[] {}));
    Assert.assertArrayEquals(new int[] {0, 0, 0},
        instance.captureCodeFragment01(new int[] {1, 2, 3}, new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {2, 4, 0},
        instance.captureCodeFragment01(new int[] {-1, 2, 3}, new int[] {1, -2, 3}));
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment02(String[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment02() {
    Assert.assertArrayEquals(new String[] {}, instance.captureCodeFragment02(new String[] {""}, 0));
    Assert
    .assertArrayEquals(new String[] {}, instance.captureCodeFragment02(new String[] {"1"}, 0));
    Assert
    .assertArrayEquals(new String[] {}, instance.captureCodeFragment02(new String[] {"x"}, 0));
    Assert.assertArrayEquals(new String[] {""},
        instance.captureCodeFragment02(new String[] {""}, 1));
    Assert.assertArrayEquals(new String[] {"", ""},
        instance.captureCodeFragment02(new String[] {"", ""}, 1));
    Assert.assertArrayEquals(new String[] {"", "", "", ""},
        instance.captureCodeFragment02(new String[] {"", ""}, 2));
    Assert.assertArrayEquals(new String[] {"a", "a", "", ""},
        instance.captureCodeFragment02(new String[] {"a", ""}, 2));
    Assert.assertArrayEquals(new String[] {" ", " ", " "},
        instance.captureCodeFragment02(new String[] {" "}, 3));
    Assert.assertArrayEquals(new String[] {"x-y", "x-y", "z", "z"},
        instance.captureCodeFragment02(new String[] {"x-y", "z"}, 2));
    Assert.assertArrayEquals(new String[] {"", "", "", "", "", "", "", "", "", "", "", "", "", "",
        "", "", "", "", "", "", "", "aa", "aa", "aa", "aa", "aa", "aa"},
        instance.captureCodeFragment02(new String[] {"", "", "", "", "", "", "", "aa", "aa"}, 3));
    Assert.assertArrayEquals(new String[] {"1", "1", "1", "1", "2", "2", "2", "2", "3", "3", "3",
        "3"}, instance.captureCodeFragment02(new String[] {"1", "2", "3"}, 4));
    Assert.assertArrayEquals(new String[] {"-", "-", "-", "-", "-", "|", "|", "|", "|", "|", "+",
        "+", "+", "+", "+"}, instance.captureCodeFragment02(new String[] {"-", "|", "+"}, 5));

  }

  /**
   * Test method for {@link Sector11#captureCodeFragment03(int[][])}.
   */
  @Test
  public final void testCaptureCodeFragment03() {
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] {{0}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {0, 0}, {0, 0}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {1, 2}, {1, 2}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {584, 584}, {0, 0}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {72, 72}, {128, 128}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {128, 128}, {72, 72}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {55, 320}, {257, 522}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {3, 4}, {288, 289}}));
    Assert.assertEquals(false,
        instance.captureCodeFragment03(new int[][] { {1023, 433}, {973, 512}}));
    Assert
        .assertEquals(false, instance.captureCodeFragment03(new int[][] { {266, 1022}, {0, 197}}));
    Assert.assertEquals(false, instance.captureCodeFragment03(new int[][] { {916, 1022}, {0, 0}}));
    Assert.assertEquals(true,
        instance.captureCodeFragment03(new int[][] { {0, 0, 0}, {0, 0, 0}, {0, 0, 0}}));
    Assert.assertEquals(true,
        instance.captureCodeFragment03(new int[][] { {584, 0, 0}, {1, 1, 0}, {584, 585, 0}}));
    Assert.assertEquals(true,
        instance.captureCodeFragment03(new int[][] { {101, 0, 0}, {1, 1, 885}, {101, 585, 0}}));
    Assert.assertEquals(true,
        instance.captureCodeFragment03(new int[][] { {73, 963, 512}, {68, 87, 0}, {73, 0, 512}}));
    Assert.assertEquals(true,
        instance.captureCodeFragment03(new int[][] { {-1, 1, -1}, {68, 1, 0}, {1, 20, 1}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {-1, 1}, {-1, 1}}));
    Assert.assertEquals(true, instance.captureCodeFragment03(new int[][] { {1, -2}, {3, 0}}));
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment04(int[], int)}.
   */
  @Test
  public final void testCaptureCodeFragment04() {
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment04(new int[] {}, 1));
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment04(new int[] {}, 0));
    Assert.assertArrayEquals(new int[] {}, instance.captureCodeFragment04(new int[] {}, 5));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment04(new int[] {9}, 1));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment04(new int[] {9}, 2));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment04(new int[] {9}, 3));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment04(new int[] {9}, 4));
    Assert.assertArrayEquals(new int[] {4}, instance.captureCodeFragment04(new int[] {9}, 5));
    Assert.assertArrayEquals(new int[] {3}, instance.captureCodeFragment04(new int[] {9}, 6));
    Assert.assertArrayEquals(new int[] {2}, instance.captureCodeFragment04(new int[] {9}, 7));
    Assert.assertArrayEquals(new int[] {1}, instance.captureCodeFragment04(new int[] {9}, 8));
    Assert.assertArrayEquals(new int[] {0}, instance.captureCodeFragment04(new int[] {9}, 9));
    Assert.assertArrayEquals(new int[] {9}, instance.captureCodeFragment04(new int[] {9}, 10));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0},
        instance.captureCodeFragment04(new int[] {1, 1, 1, 1}, 1));
    Assert.assertArrayEquals(new int[] {1, 1, 1, 1},
        instance.captureCodeFragment04(new int[] {1, 1, 1, 1}, 2));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0},
        instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 4}, 1));
    Assert.assertArrayEquals(new int[] {0, 1, 0, 1, 0},
        instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 4}, 2));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 0, 1},
        instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 4}, 3));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 0},
        instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 4}, 4));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4},
        instance.captureCodeFragment04(new int[] {0, 1, 2, 3, 4}, 5));
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment05(String[])}.
   */
  @Test
  public final void testCaptureCodeFragment05() {
    Assert.assertArrayEquals(new String[] {"aa", "aa", "aa"},
        instance.captureCodeFragment05(new String[] {"a", "a", "a", "a", "a", "a"}));
    Assert.assertArrayEquals(new String[] {"aa", "aa", "a"},
        instance.captureCodeFragment05(new String[] {"a", "a", "a", "a", "a"}));
    Assert.assertArrayEquals(new String[] {}, instance.captureCodeFragment05(new String[] {}));
    Assert.assertArrayEquals(new String[] {""}, instance.captureCodeFragment05(new String[] {""}));
    Assert.assertArrayEquals(new String[] {""},
        instance.captureCodeFragment05(new String[] {"", ""}));
    Assert.assertArrayEquals(new String[] {"", ""},
        instance.captureCodeFragment05(new String[] {"", "", ""}));
    Assert
    .assertArrayEquals(new String[] {"b"}, instance.captureCodeFragment05(new String[] {"b"}));
    Assert.assertArrayEquals(new String[] {"ab"},
        instance.captureCodeFragment05(new String[] {"ab"}));
    Assert.assertArrayEquals(new String[] {"abc"},
        instance.captureCodeFragment05(new String[] {"abc"}));
    Assert.assertArrayEquals(new String[] {"abcd"},
        instance.captureCodeFragment05(new String[] {"abc", "d"}));
    Assert.assertArrayEquals(new String[] {"abcde"},
        instance.captureCodeFragment05(new String[] {"abc", "de"}));
    Assert.assertArrayEquals(new String[] {"abcde", "fg"},
        instance.captureCodeFragment05(new String[] {"abc", "de", "fg"}));
    Assert.assertArrayEquals(new String[] {"891", "26"},
        instance.captureCodeFragment05(new String[] {"89", "1", "26"}));
    Assert
        .assertArrayEquals(new String[] {"1"}, instance.captureCodeFragment05(new String[] {"1"}));
    Assert.assertArrayEquals(new String[] {"12"},
        instance.captureCodeFragment05(new String[] {"1", "2"}));
    Assert.assertArrayEquals(new String[] {"12", "34"},
        instance.captureCodeFragment05(new String[] {"1", "2", "34"}));
    Assert.assertArrayEquals(new String[] {"12", "345"},
        instance.captureCodeFragment05(new String[] {"1", "2", "34", "5"}));
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment06(int[], int, int, int, int)}.
   */
  @Test
  public final void testCaptureCodeFragment06() {
    Assert.assertArrayEquals(new String[] {"A", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {96, 0, 0, 0}, 95, 79, 75, 65));
    Assert.assertArrayEquals(new String[] {"B", "A", "E", "E"},
        instance.captureCodeFragment06(new int[] {80, 96, 0, 0}, 95, 79, 75, 65));
    Assert.assertArrayEquals(new String[] {"B", "A", "A", "E"},
        instance.captureCodeFragment06(new int[] {80, 96, 96, 0}, 95, 79, 75, 65));
    Assert.assertArrayEquals(new String[] {"A", "D", "D", "D"},
        instance.captureCodeFragment06(new int[] {96, 64, 64, 64}, 95, 91, 81, 59));
    Assert.assertArrayEquals(new String[] {"C", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {80, 0, 0, 0}, 91, 89, 71, 69));
    Assert.assertArrayEquals(new String[] {"B", "A", "A", "B"},
        instance.captureCodeFragment06(new int[] {96, 100, 100, 96}, 99, 79, 69, 68));
    Assert.assertArrayEquals(new String[] {"A", "B", "C", "D"},
        instance.captureCodeFragment06(new int[] {90, 80, 70, 60}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"B", "C", "D", "E"},
        instance.captureCodeFragment06(new int[] {80, 70, 60, 50}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E", "D", "C", "B"},
        instance.captureCodeFragment06(new int[] {50, 60, 70, 80}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E", "C", "D", "B"},
        instance.captureCodeFragment06(new int[] {55, 77, 66, 88}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"A"},
        instance.captureCodeFragment06(new int[] {97}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"B"},
        instance.captureCodeFragment06(new int[] {89}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"C"},
        instance.captureCodeFragment06(new int[] {78}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"D"},
        instance.captureCodeFragment06(new int[] {65}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E"},
        instance.captureCodeFragment06(new int[] {54}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E"},
        instance.captureCodeFragment06(new int[] {32}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {},
        instance.captureCodeFragment06(new int[] {}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E"},
        instance.captureCodeFragment06(new int[] {-5}, 90, 80, 70, 60));
    Assert.assertArrayEquals(new String[] {"E", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {0, 0, 0, 0}, 95, 78, 69, 68));
    Assert.assertArrayEquals(new String[] {"A", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {96, 0, 0, 0}, 91, 82, 81, 60));
    Assert.assertArrayEquals(new String[] {"B", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {88, 0, 0, 0}, 92, 87, 69, 60));
    Assert.assertArrayEquals(new String[] {"D", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {68, 0, 0, 0}, 94, 79, 72, 65));
    Assert.assertArrayEquals(new String[] {"C", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {77, 0, 0, 0}, 95, 78, 77, 60));
    Assert.assertArrayEquals(new String[] {"A", "A", "E", "E"},
        instance.captureCodeFragment06(new int[] {96, 96, 0, 0}, 95, 78, 69, 60));
    Assert.assertArrayEquals(new String[] {"A", "B", "B", "E"},
        instance.captureCodeFragment06(new int[] {96, 80, 80, 0}, 89, 79, 69, 60));
    Assert.assertArrayEquals(new String[] {"A", "C", "C", "E"},
        instance.captureCodeFragment06(new int[] {96, 68, 68, 0}, 95, 79, 68, 58));
    Assert.assertArrayEquals(new String[] {"A", "E", "E", "D", "D"},
        instance.captureCodeFragment06(new int[] {96, 0, 0, 64, 64}, 95, 79, 73, 59));
    Assert.assertArrayEquals(new String[] {"A", "E", "E", "E"},
        instance.captureCodeFragment06(new int[] {100, 0, 0, 0}, 100, 81, 71, 69));
  }

  /**
   * Test method for {@link Sector11#captureCodeFragment07(String[][])}.
   */
  @Test
  public final void testCaptureCodeFragment07() {
    Assert.assertArrayEquals(new String[][] {{"a"}},
        instance.captureCodeFragment07(new String[][] {{"a"}}));
    Assert.assertArrayEquals(new String[][] {{"aa"}},
        instance.captureCodeFragment07(new String[][] {{"aa"}}));
    Assert.assertArrayEquals(
        new String[][] { {"a", "a", "a"}, {"a", "a", "a"}, {"a", "a", "a"}},
        instance.captureCodeFragment07(new String[][] { {"a", "a", "a"}, {"a", "a", "a"},
            {"a", "a", "a"}}));
    Assert.assertArrayEquals(
        new String[][] { {"a", "a", "aa"}, {"a", "a", "aa"}, {"a", "a", "aa"}},
        instance.captureCodeFragment07(new String[][] { {"a", "a", "a"}, {"a", "a", "a"},
            {"aa", "aa", "aa"}}));
    Assert.assertArrayEquals(
        new String[][] { {"a", "a", "aa"}, {"a", "a", "aa"}, {"a", "a", "aa"}},
        instance.captureCodeFragment07(new String[][] { {"a", "a", "a"}, {"a", "a", "a"},
            {"aa", "aa", "aa"}}));
    Assert.assertArrayEquals(
        new String[][] { {"a", "a", "a"}, {"a", "a", "b"}, {"a", "a", "a"}},
        instance.captureCodeFragment07(new String[][] { {"a", "a", "a"}, {"a", "a", "a"},
            {"a", "b", "a"}}));
    Assert.assertArrayEquals(
        new String[][] { {"a", "d", "g"}, {"b", "e", "h"}, {"c", "f", "j"}},
        instance.captureCodeFragment07(new String[][] { {"a", "b", "c"}, {"d", "e", "f"},
            {"g", "h", "j"}}));
    Assert.assertArrayEquals(
        new String[][] { {"11", "21", "31"}, {"12", "22", "32"}, {"13", "23", "33"}},
        instance.captureCodeFragment07(new String[][] { {"11", "12", "13"}, {"21", "22", "23"},
            {"31", "32", "33"}}));
  }
}
