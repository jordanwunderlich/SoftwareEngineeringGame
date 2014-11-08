/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.MainMenu;
import javax.swing.JFrame;

/**
 *
 * @author Jordan
 */
public class Manager {
    
    public static void main(String[] args) {
        //displaySplash();
        frame = new JFrame("Aliens");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        state = new MenuState(frame);
        frame.setVisible(true);
        
    }
    
    private void displaySplash(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void setState(State state) {
        Manager.state = state;
    }
    
    private static State state;
    public static JFrame frame;
    
}
