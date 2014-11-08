/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Controller;
import Model.Model;
import java.awt.Graphics;
import javax.swing.JPanel;
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
    
    @Override
    public void paint(Graphics g){
        // To-do: Paint logic
        // This might get big :/
    }
    
    Controller controller;
    Model model;
    
}
