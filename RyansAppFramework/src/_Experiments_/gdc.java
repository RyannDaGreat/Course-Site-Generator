package _Experiments_;//Created by Ryan on 5/7/17.
import _App_.App;
import _Externals_.r;

import java.io.File;

import static _App_._IO_._Misc_.Misc.pwd;
public class gdc//getdircontents
{
    public static void main(String[] args)
    {
        // App app=new App();
        System.out.println(pwd()+"work");
        File[] files = (new File(pwd()+"work/css")).listFiles();
        for (File file : files)
        {
            System.out.println(file.getName());
        }
    }
}
