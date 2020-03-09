package rockgamething;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JPanel;

public class World extends JPanel{
    Base b;
    Timer timer;
    private ArrayList<Rock> rocks = new ArrayList<>();
    private ArrayList<Entity> entities = new ArrayList<>();
    
    public World() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/60);
        super.setSize(800, 600);
        b = new Base(800, 600);
        for (int i = 0; i < 23; i++) {
            int x = (int) (Math.random() * 800 / 2);
            int y = (int) (Math.random() * 600);
            int vy = 5;
            Rock rock = new Rock(x, y, vy);
            entities.add(rock);
            rocks.add(rock);
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
        g.drawImage(b.img, 240, 480, null);
    }
    
    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
            b.update();
        }
        
    }
    
}
