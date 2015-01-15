package codehunt.sector02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector02Test {

    private Sector02 instance;

    @Before
    public void setUp() throws Exception {
        instance = new Sector02();
    }

    @After
    public void tearDown() throws Exception {
        instance = null;
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment01(int)}.
     */
    @Test
    public final void testCaptureCodeFragment01() {
        Assert.assertArrayEquals(new int[] { 0 }, instance.captureCodeFragment01(1));
        Assert.assertArrayEquals(new int[] { 0, 1 }, instance.captureCodeFragment01(2));
        Assert.assertArrayEquals(new int[] { 0, 1, 2 }, instance.captureCodeFragment01(3));
        Assert.assertArrayEquals(new int[] { 0, 1, 2, 3 }, instance.captureCodeFragment01(4));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment02(int)}.
     */
    @Test
    public final void testCaptureCodeFragment02() {
        Assert.assertArrayEquals(new int[] { 0 }, instance.captureCodeFragment02(1));
        Assert.assertArrayEquals(new int[] { 0, 2 }, instance.captureCodeFragment02(2));
        Assert.assertArrayEquals(new int[] { 0, 3, 6 }, instance.captureCodeFragment02(3));
        Assert.assertArrayEquals(new int[] { 0, 4, 8, 12 }, instance.captureCodeFragment02(4));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment03(int)}.
     */
    @Test
    public final void testCaptureCodeFragment03() {
        Assert.assertArrayEquals(new int[] { 0 }, instance.captureCodeFragment03(1));
        Assert.assertArrayEquals(new int[] { 0, 1 }, instance.captureCodeFragment03(2));
        Assert.assertArrayEquals(new int[] { 0, 1, 4 }, instance.captureCodeFragment03(3));
        Assert.assertArrayEquals(new int[] { 0, 1, 4, 9 }, instance.captureCodeFragment03(4));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment04(int[])}.
     */
    @Test
    public final void testCaptureCodeFragment04() {
        Assert.assertEquals(0, instance.captureCodeFragment04(new int[] { 0 }));
        Assert.assertEquals(0, instance.captureCodeFragment04(new int[] { 0, 0 }));
        Assert.assertEquals(7, instance.captureCodeFragment04(new int[] { 1, 2, 4 }));
        Assert.assertEquals(2, instance.captureCodeFragment04(new int[] { 1, 2, 4, -5 }));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment05(int)}.
     */
    @Test
    public final void testCaptureCodeFragment05() {
        Assert.assertEquals(0, instance.captureCodeFragment05(1));
        Assert.assertEquals(1, instance.captureCodeFragment05(2));
        Assert.assertEquals(5, instance.captureCodeFragment05(3));
        Assert.assertEquals(14, instance.captureCodeFragment05(4));
        Assert.assertEquals(30, instance.captureCodeFragment05(5));
        Assert.assertEquals(55, instance.captureCodeFragment05(6));
        Assert.assertEquals(91, instance.captureCodeFragment05(7));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment06(String)}.
     */
    @Test
    public final void testCaptureCodeFragment06() {
        Assert.assertEquals(0, instance.captureCodeFragment06(""));
        Assert.assertEquals(1, instance.captureCodeFragment06("a"));
        Assert.assertEquals(1, instance.captureCodeFragment06("bbieebbiba"));
        Assert.assertEquals(3, instance.captureCodeFragment06("abb abba"));
        Assert.assertEquals(2, instance.captureCodeFragment06("aibbbbbbbba"));
        Assert.assertEquals(6, instance.captureCodeFragment06("abbbbaaaaa"));
    }

    /**
     * Test method for {@link Sector02#captureCodeFragment07(String)}.
     */
    @Test
    public final void testCaptureCodeFragment07() {
        Assert.assertEquals(5, instance.captureCodeFragment07("daaaaaaadddd", 'd'));
        Assert.assertEquals(1, instance.captureCodeFragment07("paiibdeqqqqb", 'a'));
        Assert.assertEquals(0, instance.captureCodeFragment07("", 'a'));
        Assert.assertEquals(2, instance.captureCodeFragment07("aAbA", 'A'));
    }
}
