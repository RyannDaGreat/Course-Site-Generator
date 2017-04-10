package _App_;//Created by Ryan on 4/10/17.
import _App_._GUI_.GUI;
import _App_._IO_.IO;
import _App_._rTPS_.rTPS;
@SuppressWarnings("WeakerAccess")
public class App
{
    public IO io;
    public GUI gui;
    public rTPS rtps;
    public App()
    {
        io=new IO(this);
        gui=new GUI(this);
        rtps=new rTPS(this);
    }
}
