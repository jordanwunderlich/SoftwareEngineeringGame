/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.Levels.Level;
import View.GridView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class GamePanel extends JPanel implements KeyListener {

    private static final int PWIDTH = 800; // size of panel
    private static final int PHEIGHT = 600;

    private Thread animator; // for the animation
    private volatile boolean running = false; // stops the animation

    private volatile boolean gameOver = false; // for game termination

    public ArrayList<GridView> map;
    public ArrayList<Component> things;
    private Level level;

    public GamePanel(Level level) {
        this.level = level;
        
        setBackground(Color.WHITE); // white background
        setSize(new Dimension(PWIDTH, PHEIGHT));

        setLayout(null);

        setFocusable(true);
        requestFocus();
        addKeyListener(this);

        setVisible(true);

        map = new ArrayList<>();
        things = new ArrayList<>();
        
        
    }

    public void stopGame() // called by the user to stop execution
    {
        running = false;
    }

    //@Override
    public void animate() /* Repeatedly update, render, sleep */ {

        running = true;
        long time;
        long millis = System.currentTimeMillis();

        while (running) {
            time = System.currentTimeMillis();

            gameUpdate(); // game state is updated
            gameRender(); // render to a buffer

            time = System.currentTimeMillis() - time;
            time = 17 - time;
            try {
                System.out.println("Sleep for: " + time);
                Thread.sleep(time); // sleep a bit
            } catch (InterruptedException ex) {
                System.out.println("Timeout value is negative.");
            }

            if (System.currentTimeMillis() - millis >= 1000) {
                System.out.println("Updated 60 times.");
                millis = System.currentTimeMillis();
            }
        }

        //System.exit(0);

    } // end of run( )

    private void gameUpdate() {
        level.update();
    }

    private void gameRender() {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
    @Override
    public Component add(Component j){
        super.add(j);
        if(j instanceof GridView){
            map.add((GridView)j);
        } else{
            things.add(j);
        }
        return j;
    }

    @Override
    public void paint(Graphics g) {
        System.out.println("Painting.");
        super.paint(g);
        if (map != null) {
            for (int i = 0; i < map.size(); i++) {
                map.get(i).paint(g);
            }
        }
        if (things != null) {
            for (int i = 0; i < things.size(); i++) {
                things.get(i).paint(g);
            }
        }
    }
}
