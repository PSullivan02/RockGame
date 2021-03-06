
package rockgamething;

import java.awt.Color;
import java.awt.Graphics;

public class Laser extends Entity{
    private static Color COLOR = new Color(0,144,255);
    private static final int WIDTH = 5;
    private static final int HEIGHT = 5;
    private static final int SPEED = 0;
    
    public Laser(int x, int y, int vy){
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
        COLOR = Color.LIGHT_GRAY;
    }
    
    @Override
    public void draw(Graphics g) {
        g.setColor(COLOR);
        g.drawOval(super.getX(), super.getY(), super.getWidth(), super.getHeight());
    }
}
