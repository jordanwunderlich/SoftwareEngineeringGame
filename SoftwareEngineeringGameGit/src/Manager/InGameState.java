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
        Manager.frame.add(panel);
        //Loopthingy
        GridSquare square = new GridSquare();
        GridView squareView = new GridView(square);
        squareView.addMouseListener(new GridController(square, squareView));
        //squareView.setLocation(i, i1);
        panel.add(squareView);
        //endloopthingy
    }
    
    GamePanel panel;

}
