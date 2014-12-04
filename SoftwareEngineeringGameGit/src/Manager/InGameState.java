/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.GridController;
import Model.GridSquare;
import Model.Levels.Level;
import Model.Levels.Level1;
import View.CastleView;
import View.GridView;
import View.InGameView;

/**
 *
 * @author Jordan
 */
public class InGameState extends State {

    public InGameState() {
        level = new Level1();
        view = new InGameView(level);
        panel = new GamePanel(level, view);
        Manager.frame.add(panel);
        for(int rows = 0; rows<25; rows++){
            for(int cols = 0; cols<18; cols++){
                
                //GridSquare square = new GridSquare();
                GridView squareView = new GridView(level.getGrid()[rows][cols]);
                level.getGrid()[rows][cols].xloc = rows*32;
                level.getGrid()[rows][cols].yloc = cols*32;
                squareView.setLocation(rows*32, cols*32);
                
                squareView.addMouseListener(new GridController(level.getGrid()[rows][cols], squareView));             
                panel.add(squareView);
                //panel.map.add(squareView);
            }
        }
        CastleView castleView = new CastleView(level.getCastle());
        panel.castle = castleView;
        panel.repaint();
        panel.animate();
        //panel.repaint();
    }
    
    
    GamePanel panel;
    Level level;
    InGameView view;

}
