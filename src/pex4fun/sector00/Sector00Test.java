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

}
