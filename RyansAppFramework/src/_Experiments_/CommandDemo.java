package _Experiments_;
import _Externals_.r;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
interface Command
{
    void execute();
}
class DomesticEngineer implements Command
{
    public void execute()
    {
        System.out.println("take out the trash");
    }
}
class Politician implements Command
{
    public void execute()
    {
        System.out.println("take money from the rich, take votes from the poor");
    }
}
class Programmer implements Command
{
    public void execute()
    {
        System.out.println("sell the bugs, charge extra for the fixes");
    }
}
public class CommandDemo
{
    public static List<Command> produceRequests()
    {
        List<Command> queue=new ArrayList<>();
        queue.add(new DomesticEngineer());
        queue.add(new Politician());
        queue.add(new Programmer());
        return queue;
    }
    public static void workOffRequests(List<Command> queue)
    {
        for(Command command : queue)
        {
            command.execute();
        }
    }
    public static void main(String[] args)
    {
        try
        {
            r.scan();
            List<Command> queue=produceRequests();
            workOffRequests(queue);
        }
        catch(Throwable ignored){
            System.out.println("GOTCHA!");
        }
    }
}