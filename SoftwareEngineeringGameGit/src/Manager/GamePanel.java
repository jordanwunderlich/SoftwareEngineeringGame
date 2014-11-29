/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import View.GridView;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import javax.swing.JComponent;
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

    public GamePanel() {
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

    private void testPress(int x, int y) {
        if (!gameOver) {

        }
    }

    private void startGame() // initialize and start the thread
    {
        if (animator == null || !running) {
            //animator = new Thread(this);
            animator.start();
        }
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
            repaint(); // paint with the buffer

            time = System.currentTimeMillis() - time;
            time = 17 - time;
            try {
                Thread.sleep(time); // sleep a bit
            } catch (InterruptedException ex) {
            }

            if (System.currentTimeMillis() - millis >= 1000) {
                System.out.println("Updated 60 times.");
                millis = System.currentTimeMillis();
            }
        }

        System.exit(0);

    } // end of run( )

    private void gameUpdate() {
        if (!gameOver) // update game state ...
        {

        }
    }

    private void gameRender() {
        paint(this.getGraphics());
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
    
//    public GridView add(GridView g){
//        super.add(g);
//        map.add(g);
//        return g;
//    }
//    
//    @Override
//    public Component add(Component j){
//        super.add(j);
//        things.add(j);
//        return j;
//    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (map != null) {
            for (int i = 0; i < map.size(); i++) {
                map.get(i).paint(g);
            }
        }
        if (things != null) {
            for (int i = 0; i < things.size(); i++) {
                System.out.println(things.get(i).getLocation());
                things.get(i).setLocation(32, 32);
                things.get(i).paint(g);
            }
        }
    }
}
