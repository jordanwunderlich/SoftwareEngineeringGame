/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Controller;
import Model.Model;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.*;
/**
 *
 * @author Jason
 */
public class View {
    
    public View(Controller controller, Model model) throws Exception{
        this.controller = controller;
        this.model = model;
        JFrame frame = new JFrame("Aliens");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setVisible(true);
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        final JFrame fullscreenFrame = new JFrame();
        fullscreenFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fullscreenFrame.setUndecorated(true);
        fullscreenFrame.setResizable(true);
        fullscreenFrame.add(new JLabel("Alliterative Aliens Are Always After All Our Aurum. Press ALT+F4 to exit fullscreen.", SwingConstants.CENTER), BorderLayout.CENTER);
        fullscreenFrame.validate();
        GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().setFullScreenWindow(fullscreenFrame);
    }
    
    Controller controller;
    Model model;
    
}
