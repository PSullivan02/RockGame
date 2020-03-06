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
    
    Timer timer;
    private ArrayList<Rock> rocks = new ArrayList<>();
    private ArrayList<Entity> entities = new ArrayList<>();
    
    public World() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 1000/60);
        super.setSize(800, 600);
        for (int i = 0; i < 23; i++) {
            int x = (int) (Math.random() * 800 / 2);
            int y = (int) (Math.random() * 600);
            Rock rock = new Rock(x, y);
            entities.add(rock);
            rocks.add(rock);
        }
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK);
    }
    
    private class ScheduleTask extends TimerTask {
        @Override
        public void run() {
            repaint();
        }
        
    }
    
}
