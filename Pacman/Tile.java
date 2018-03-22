import java.awt.image.*;

/**
 * Write a description of class Tile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tile
{
    private BufferedImage image;
    private boolean blocked;
    
    public Tile(BufferedImage image, boolean blocked)
    {
        this.image = image;
        this.blocked = blocked;
    }
    
    public BufferedImage getImage()
    {
        return this.image;
    }
    
    public boolean isBlocked()
    {
        return this.blocked;
    }
}
