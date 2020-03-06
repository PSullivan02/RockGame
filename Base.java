package rockgamething;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.*;

public class Base extends Entity{
    private static Color COLOR = new Color(0,144,255);
    private static final int WIDTH = 81;
    private static final int HEIGHT = 21;
    private static final int SPEED = 0;
    private Rectangle bounds = new Rectangle();
    private ImageIcon base;
    Image img;
    public Base(int x, int y){
        super(SPEED, x, y, WIDTH, HEIGHT, COLOR);
        bounds = new Rectangle(x,y, WIDTH, HEIGHT);
        this.base = new ImageIcon(getClass().getResource("Base.png"));
        this.img = base.getImage();
    }
    @Override
    public void draw(Graphics g){
    
    }
    
    public void update(){
        this.bounds = new Rectangle( getX(), getY(), WIDTH, HEIGHT);
    }
}
