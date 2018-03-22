import javax.swing.JColorChooser;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.event.*;

import java.io.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * Write a description of class GamePanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GamePanel extends JPanel
{
    private Dimension panelDimension;

    /**
     * Constructor for objects of class GamePanel
     */
    public GamePanel()
    {
        
    }

    public Dimension getPreferredSize()
    {
        panelDimension = new Dimension(896, 1116);
        return panelDimension;
    }
}
