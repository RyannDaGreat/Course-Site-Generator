package _Experiments_;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class CeilingFanPullChain
{
    private State currentState;
    public CeilingFanPullChain()
    {
        currentState=new Off();
    }
    public void set_state(State s)
    {
        currentState=s;
    }
    public void pull()
    {
        currentState.pull(this);
    }
}
interface State
{
    void pull(CeilingFanPullChain wrapper);
}
class Off implements State
{
    public void pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Low());
        System.out.println("low speed");
    }
}
class Low implements State
{
    public void pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Medium());
        System.out.println("medium speed");
    }
}
class Medium implements State
{
    public void pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new High());
        System.out.println("high speed");
    }
}
class High implements State
{
    public void pull(CeilingFanPullChain wrapper)
    {
        wrapper.set_state(new Off());
        System.out.println("turning off");
    }
}
public class StateDemo
{
    public static void main(String[] args)
    {
        CeilingFanPullChain chain=new CeilingFanPullChain();
        while(true)
        {
            System.out.print("Press ENTER");
            getLine();
            chain.pull();
        }
    }
    static String getLine()
    {
        try
        {
            return new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
}
