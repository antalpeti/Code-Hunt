package codehunt.sector03;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Sector03Test {

    private Sector03 instance;

    @Before
    public void setUp() throws Exception {
        instance = new Sector03();
    }

    @After
    public void tearDown() throws Exception {
        instance = null;
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment01(int, int)}.
     */
    @Test
    public final void testCaptureCodeFragment01() {
        Assert.assertEquals(0, instance.captureCodeFragment01(0, 0));
        Assert.assertEquals(1, instance.captureCodeFragment01(1, 0));
        Assert.assertEquals(1, instance.captureCodeFragment01(1, 1));
        Assert.assertEquals(128, instance.captureCodeFragment01(2, 7));
        Assert.assertEquals(1, instance.captureCodeFragment01(3, 0));
        Assert.assertEquals(3, instance.captureCodeFragment01(3, 1));
        Assert.assertEquals(9, instance.captureCodeFragment01(3, 2));
        Assert.assertEquals(27, instance.captureCodeFragment01(3, 3));
        //underflow
        Assert.assertEquals(1937019605, instance.captureCodeFragment01(-11, 9));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment02(int)}.
     */
    @Test
    public final void testCaptureCodeFragment02() {
        Assert.assertEquals(1, instance.captureCodeFragment02(0));
        Assert.assertEquals(1, instance.captureCodeFragment02(1));
        Assert.assertEquals(2, instance.captureCodeFragment02(2));
        Assert.assertEquals(6, instance.captureCodeFragment02(3));
        Assert.assertEquals(24, instance.captureCodeFragment02(4));
        Assert.assertEquals(120, instance.captureCodeFragment02(5));
        Assert.assertEquals(720, instance.captureCodeFragment02(6));
        Assert.assertEquals(5040, instance.captureCodeFragment02(7));
        Assert.assertEquals(40320, instance.captureCodeFragment02(8));
        Assert.assertEquals(362880, instance.captureCodeFragment02(9));
        Assert.assertEquals(3628800, instance.captureCodeFragment02(10));
        Assert.assertEquals(39916800, instance.captureCodeFragment02(11));
        Assert.assertEquals(479001600, instance.captureCodeFragment02(12));
        //overflow
        Assert.assertEquals(1932053504, instance.captureCodeFragment02(13));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment03(int, int)}.
     */
    @Test
    public final void testCaptureCodeFragment03() {
        Assert.assertEquals(0, instance.captureCodeFragment03(0, 1));
        Assert.assertEquals(0, instance.captureCodeFragment03(2, 0));
        Assert.assertEquals(1, instance.captureCodeFragment03(1, 1));
        Assert.assertEquals(2, instance.captureCodeFragment03(1, 2));
        Assert.assertEquals(6, instance.captureCodeFragment03(2, 3));
        Assert.assertEquals(40320, instance.captureCodeFragment03(1, 8));
        Assert.assertEquals(40320, instance.captureCodeFragment03(2, 8));
        Assert.assertEquals(20160, instance.captureCodeFragment03(3, 8));
        Assert.assertEquals(6720, instance.captureCodeFragment03(4, 8));
        Assert.assertEquals(1680, instance.captureCodeFragment03(5, 8));
        Assert.assertEquals(336, instance.captureCodeFragment03(6, 8));
        Assert.assertEquals(56, instance.captureCodeFragment03(7, 8));
        Assert.assertEquals(8, instance.captureCodeFragment03(8, 8));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment04(int)}.
     */
    @Test
    public final void testCaptureCodeFragment04() {
        Assert.assertEquals(0, instance.captureCodeFragment04(0));
        Assert.assertEquals(0, instance.captureCodeFragment04(2));
        Assert.assertEquals(2, instance.captureCodeFragment04(4));
        Assert.assertEquals(6, instance.captureCodeFragment04(5));
        Assert.assertEquals(6, instance.captureCodeFragment04(6));
        Assert.assertEquals(12, instance.captureCodeFragment04(7));
        Assert.assertEquals(42, instance.captureCodeFragment04(14));
        Assert.assertEquals(56, instance.captureCodeFragment04(15));
        Assert.assertEquals(56, instance.captureCodeFragment04(16));
        Assert.assertEquals(72, instance.captureCodeFragment04(17));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment05(int)}.
     */
    @Test
    public final void testCaptureCodeFragment05() {
        Assert.assertEquals(0, instance.captureCodeFragment05(0));
        Assert.assertEquals(1, instance.captureCodeFragment05(1));
        Assert.assertEquals(4, instance.captureCodeFragment05(2));
        Assert.assertEquals(10, instance.captureCodeFragment05(3));
        Assert.assertEquals(20, instance.captureCodeFragment05(4));
        Assert.assertEquals(35, instance.captureCodeFragment05(5));
        Assert.assertEquals(56, instance.captureCodeFragment05(6));
        Assert.assertEquals(84, instance.captureCodeFragment05(7));
        Assert.assertEquals(120, instance.captureCodeFragment05(8));
        Assert.assertEquals(165, instance.captureCodeFragment05(9));
        Assert.assertEquals(220, instance.captureCodeFragment05(10));
        Assert.assertEquals(286, instance.captureCodeFragment05(11));
        Assert.assertEquals(364, instance.captureCodeFragment05(12));
        Assert.assertEquals(455, instance.captureCodeFragment05(13));
        Assert.assertEquals(560, instance.captureCodeFragment05(14));
        Assert.assertEquals(680, instance.captureCodeFragment05(15));
        Assert.assertEquals(5456, instance.captureCodeFragment05(31));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment06(String)}.
     */
    @Test
    public final void testCaptureCodeFragment06() {
        Assert.assertEquals("", instance.captureCodeFragment06(""));
        Assert.assertEquals("_", instance.captureCodeFragment06("a"));
        Assert.assertEquals("_", instance.captureCodeFragment06("b"));
        Assert.assertEquals("_ _", instance.captureCodeFragment06("aa"));
        Assert.assertEquals("_ _", instance.captureCodeFragment06("cd"));
        Assert.assertEquals("_ _ _", instance.captureCodeFragment06("aaa"));
        Assert.assertEquals("_ _ _", instance.captureCodeFragment06("efg"));
        Assert.assertEquals("_ _ _ _", instance.captureCodeFragment06("aaaa"));
        Assert.assertEquals("_ _ _ _", instance.captureCodeFragment06("hijk"));
        Assert.assertEquals("_ _ _ _ _", instance.captureCodeFragment06("aaaaa"));
        Assert.assertEquals("_ _ _ _ _", instance.captureCodeFragment06("abced"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("aaaaaa"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("xfekhd"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("baaaaa"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("babaaa"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("bahomh"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("qaaaca"));
        Assert.assertEquals("_ _ _ _ _ _", instance.captureCodeFragment06("umzctb"));
        Assert.assertEquals("_ _ _ _ _ _ _ _ _ _ _ _", instance.captureCodeFragment06("aaaaaaaaaaaa"));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment07(String)}.
     */
    @Test
    public final void testCaptureCodeFragment07() {
        Assert.assertEquals("", instance.captureCodeFragment07(""));
        Assert.assertEquals("f", instance.captureCodeFragment07("a"));
        Assert.assertEquals("i", instance.captureCodeFragment07("d"));
        Assert.assertEquals("z", instance.captureCodeFragment07("u"));
        Assert.assertEquals("a", instance.captureCodeFragment07("v"));
        Assert.assertEquals("b", instance.captureCodeFragment07("w"));
        Assert.assertEquals("c", instance.captureCodeFragment07("x"));
        Assert.assertEquals("d", instance.captureCodeFragment07("y"));
        Assert.assertEquals("e", instance.captureCodeFragment07("z"));
        Assert.assertEquals("ff", instance.captureCodeFragment07("aa"));
        Assert.assertEquals("ee", instance.captureCodeFragment07("zz"));
        Assert.assertEquals("ea", instance.captureCodeFragment07("zv"));
        Assert.assertEquals("za", instance.captureCodeFragment07("uv"));
        Assert.assertEquals("qii", instance.captureCodeFragment07("ldd"));
        Assert.assertEquals("fgh", instance.captureCodeFragment07("abc"));
    }

    /**
     * Test method for {@link Sector03#captureCodeFragment08(int)}.
     */
    @Test
    public final void testCaptureCodeFragment08() {
        Assert.assertEquals(1, instance.captureCodeFragment08(0));
        Assert.assertEquals(1, instance.captureCodeFragment08(1));
        Assert.assertEquals(2, instance.captureCodeFragment08(25));
        Assert.assertEquals(3, instance.captureCodeFragment08(101));
        Assert.assertEquals(3, instance.captureCodeFragment08(925));
        Assert.assertEquals(4, instance.captureCodeFragment08(1024));
        Assert.assertEquals(4, instance.captureCodeFragment08(3251));
        Assert.assertEquals(4, instance.captureCodeFragment08(4258));
        Assert.assertEquals(5, instance.captureCodeFragment08(11125));
        Assert.assertEquals(5, instance.captureCodeFragment08(16725));
        Assert.assertEquals(6, instance.captureCodeFragment08(578967));
        Assert.assertEquals(6, instance.captureCodeFragment08(785894));
        Assert.assertEquals(7, instance.captureCodeFragment08(1259781));
        Assert.assertEquals(7, instance.captureCodeFragment08(2359867));
    }

}
