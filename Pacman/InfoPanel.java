import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import java.lang.*;

/**
 * Write a description of class InfoPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InfoPanel
{
    // instance variables - replace the example below with your own
    private JButton btn;
    private GamePanel pnl;
    private JFrame frm;

    /**
     * Constructor for objects of class InfoPanel
     */
    public InfoPanel()
    {
        btn = new JButton(new ImageIcon("pacman1.png"));
        btn.setMargin (new Insets (0, 0, 0, 0));
        pnl = new GamePanel();
        pnl.add(btn);
        pnl.setPreferredSize(pnl.getPreferredSize());
        frm = new JFrame("g");
        frm.add(pnl);
        frm.pack();
        frm.setVisible(true);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String[] args) throws InterruptedException
    {
        InfoPanel p = new InfoPanel();
        int x = 0;
        int z = 0;
        while(z < 100)
        {
            if(x == 0)
            {
                TimeUnit.MILLISECONDS.sleep(100);
                p.btn.setIcon(new ImageIcon("pacman1.png"));
                x++;
                z++;
            }
            else if(x == 1)
            {
                TimeUnit.MILLISECONDS.sleep(100);
                p.btn.setIcon(new ImageIcon("pacman2.png"));
                x++;
                z++;
            }
            else if(x == 2)
            {
                TimeUnit.MILLISECONDS.sleep(100);
                p.btn.setIcon(new ImageIcon("pacman3.png"));
                x++;
                z++;
            }
            else
            {
                TimeUnit.MILLISECONDS.sleep(100);
                p.btn.setIcon(new ImageIcon("pacman2.png"));
                x = 0;
                z++;
            }
        }
    }
}
