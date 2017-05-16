package _Experiments_.junitTests;//Created by Ryan on 4/24/17.
import _Externals_.r;
import org.junit.Test;
import org.junit.Assert;
public class junittest
{
    static
    {
        Assert.fail();
        r.enableTheGoodOldAssertionKeyword();
    }
    @Test
    public void testSomething()
    {
        assert false;
    }    @Test
    public void testSo5mething()
    {
        assert false;
    }    @Test
    public void testSome1thing()
    {
        assert false;
    }    @Test
    public void testSo1mething()
    {
        assert false;
    }
    @Test
    public void testSomething2()
    {
        System.out.println("Gesttesd");
        assert true;
    }

}
