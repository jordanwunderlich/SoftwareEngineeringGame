/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class GamePanel extends JPanel implements Runnable, MouseListener, KeyListener{

    private static final int PWIDTH = 500; // size of panel
    private static final int PHEIGHT = 400;

    private Thread animator; // for the animation
    private volatile boolean running = false; // stops the animation

    private volatile boolean gameOver = false; // for game termination

    public GamePanel() {
        setBackground(Color.white); // white background
        setSize(new Dimension(PWIDTH, PHEIGHT));

        setFocusable(true);
        requestFocus();
        addMouseListener(this);
        addKeyListener(this);
        
        setVisible(true);
        //run();
    }
    
    private void testPress(int x, int y){
        if(!gameOver){
            
        }
    }

    private void startGame() // initialise and start the thread
    {
        if (animator == null || !running) {
            animator = new Thread(this);
            animator.start();
        }
    }

    public void stopGame() // called by the user to stop execution
    {
        running = false;
    }

    @Override
    public void run() /* Repeatedly update, render, sleep */ {

        running = true;

        while (running) { 
            gameUpdate(); // game state is updated
            gameRender(); // render to a buffer
            repaint(); // paint with the buffer
            try {
                Thread.sleep(20); // sleep a bit
            } catch (InterruptedException ex) {
            }

        }

        System.exit(0); // so enclosing JFrame/JApplet exits

    } // end of run( )

    private void gameUpdate() {
        if (!gameOver) // update game state ...
        {

        }
    }

    private void gameRender() {

    }

 // more methods, explained later...

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ESCAPE)
            System.exit(0);
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}
}
