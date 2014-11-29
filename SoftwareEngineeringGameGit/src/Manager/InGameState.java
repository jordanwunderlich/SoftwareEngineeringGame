/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.GridController;
import Model.Creeps.CreepBasic;
import Model.Levels.Level;
import Model.Levels.Level1;
import View.CreepSprite;
import View.GridView;

/**
 *
 * @author Jordan
 */
public class InGameState extends State {

    public InGameState() {
        level = new Level1();
        panel = new GamePanel(level);
        Manager.frame.add(panel);
        for(int rows = 0; rows<25; rows++){
            for(int cols = 0; cols<18; cols++){
                
                //GridSquare square = new GridSquare();
                GridView squareView = new GridView(level.getGrid()[rows][cols]);
                squareView.setX(rows*32);
                squareView.setY(cols*32);
                //squareView.setLocation(rows*32, cols*32);
                squareView.addMouseListener(new GridController(level.getGrid()[rows][cols], squareView));             
                panel.add(squareView);
                //panel.map.add(squareView);
            }
        }
        panel.animate();
    }
    
    
    GamePanel panel;
    Level level;

}
