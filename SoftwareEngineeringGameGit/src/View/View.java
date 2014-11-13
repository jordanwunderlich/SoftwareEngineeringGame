/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Controller;
import Model.Model;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class View extends JPanel {
    
    public View(Controller controller, Model model){
        this.controller = controller;
        this.model = model;
//        JFrame frame = new JFrame("Aliens");
//        frame.setSize(800, 600);
//        frame.setResizable(false);
//        frame.setVisible(true);
//        try {
//            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        final JFrame fullscreenFrame = new JFrame();
//        fullscreenFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        fullscreenFrame.setUndecorated(true);
//        fullscreenFrame.setResizable(true);
//        fullscreenFrame.add(new JLabel("Alliterative Aliens Are Always After All Our Aurum. Press ALT+F4 to exit fullscreen.", SwingConstants.CENTER), BorderLayout.CENTER);
//        fullscreenFrame.validate();
//        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(fullscreenFrame);
    }
    

    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public View() {
       try {
           img = ImageIO.read(new File("splash.jpg"));
       } catch (IOException e) {
       }

    }

    @Override
    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(800,600);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args) {

        JFrame f = new JFrame("Test");
            
        f.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });

        f.add(new View());
        f.pack();
        f.setVisible(true);
    }
    Controller controller;
    Model model;
    
}
