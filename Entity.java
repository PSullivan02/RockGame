package rockgamething;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Entity{
    
    private int speed;
    private int x, y, vx, vy;
    private int width, height;
    private Color color;
    private Rectangle bounds;
    private boolean alive = true;
    
    public Entity(int speed, int x, int y, int width, int height, Color color) {
        this.speed = speed;
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.width = width;
        this.height = height;
        this.color = color;
        this.bounds = new Rectangle(x, y, width, height);
    }
    
     public void update() {
        this.x += this.vx;
        this.y += this.vy;
        this.bounds = new Rectangle(x, y, width, height);
    }
    public abstract void draw(Graphics g);
    public int getWidth() {
        return width;
    }    

    public int getX() {
        return x;
    }

    public int getSpeed() {
        return speed;
    }

    public void die() {
        this.alive = false;
    }

    public boolean isAlive() {
        return alive;
    }
    
    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }
    
    public boolean collide(Entity other) {
        boolean collided = this.bounds.intersects(other.bounds);
        if (collided) {
            this.didCollide();
            other.didCollide();
        }
        return collided;
    }
        
    public void didCollide() {
        this.vx = -this.vx;
        this.vy = -this.vy;
        this.update();
    }
}
