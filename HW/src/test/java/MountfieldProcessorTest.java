import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class MountfieldProcessorTest {

    private MountfieldProcessor mountfieldProcessor;

    @Before
    public void setUp() throws Exception {
        mountfieldProcessor = new MountfieldProcessor();
    }

    @Test
    public void countMountfieldJsonItemsTest() {
        Assert.assertEquals(2122, mountfieldProcessor.countItems());
    }

    @Test
    public void countDiscountedItems() {
        Assert.assertEquals(2114, mountfieldProcessor.getDiscountedItemsCount());
    }

    @Test
    public void sumCurrentPrices() {
        Assert.assertEquals(7734364, mountfieldProcessor.sumCurrentPrices());
    }

    @Test
    public void getBiggestDiscountedItem() {
        Assert.assertEquals("1tkk0112", mountfieldProcessor.getBiggerDiscountItem());
    }
}