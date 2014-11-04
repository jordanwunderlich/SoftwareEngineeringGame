/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

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
    
    Map map;
    ArrayList<Creep> creeps;
    ArrayList<Wave> waves;
    int scrap;
    int gold;
    int number;
    boolean available;
    
}
