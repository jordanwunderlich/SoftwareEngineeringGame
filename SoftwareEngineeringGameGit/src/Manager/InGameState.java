/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.GridController;
import Model.GridSquare;
import View.GridView;

/**
 *
 * @author Jordan
 */
public class InGameState extends State {

    public InGameState() {
        panel = new GamePanel();
        for(int rows = 0; rows<20; rows++){
            for(int cols = 0; cols<20; cols++){
                GridSquare square = new GridSquare();
                GridView squareView = new GridView(square);
                squareView.setLocation(rows*32, cols*32);
                squareView.addMouseListener(new GridController(square, squareView));             
                panel.add(squareView);
            }
        }
        panel.repaint();
        Manager.frame.add(panel);
        Manager.frame.repaint();
    }
    
    
    GamePanel panel;

}
