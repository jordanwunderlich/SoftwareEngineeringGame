/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.Grids.Grid;
import Model.Creeps.Creep;
import Model.Map;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Level {
    
    public Level(){
        map = new Map(this);
    }
    
    public void add(Grid grid, int x, int y){
        
    }
    
    public void update(){
        moveCreeps();
    }
    
    private void moveCreeps(){
        
    }
    
    Map map;
    ArrayList<Creep> creeps;
    ArrayList<Wave> waves;
    int scrap;
    int gold;
    
}
