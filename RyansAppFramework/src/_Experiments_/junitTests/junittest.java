package _Experiments_.junitTests;//Created by Ryan on 4/24/17.
import _Externals_.r;
import org.junit.Test;
public class junittest
{
    static
    {
        r.enableTheGoodOldAssertionKeyword();
    }
    @Test
    public void testSomething()
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
