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
import java.awt.*;
public class MouseStuck {
    public static void main(String args[]) throws AWTException
    {
        Robot r=new Robot();
        for(int i=0;i>-1;i++)
        {
           r.mouseMove(0,0);
        }
    }
}
