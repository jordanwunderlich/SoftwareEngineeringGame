/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Model.GridSquare;
import View.GridView;
import View.View;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author Jordan
 */
public class Manager {

    public static void main(String[] args) {
        //displaySplash();
        SCALE = 1;
        frame = new JFrame("Aliens");
        frame.setLayout(null);
        frame.setSize(800 * SCALE, 600 * SCALE);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //state = new MenuState(frame);
        frame.setVisible(true);
        state = new InGameState();
//        GridView temp = new GridView(new GridSquare());
//        temp.setLocation(50,50);
//        frame.add(temp);
        //state = new MenuState (frame);
    }

    private void displaySplash() {
        JFrame f = new JFrame("Alliterative Aliends Are Always After Are Aurum");

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.add(new View());
        f.pack();
        f.setVisible(true);
    }

    public static void setState(State state) {
        Manager.state = state;
    }

    private static State state;
    public static JFrame frame;
    private static int SCALE;

}
