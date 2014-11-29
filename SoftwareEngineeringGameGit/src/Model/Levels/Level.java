/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.GridSquare;
import Model.Creeps.Creep;
import Model.Map;
import Model.Projectile;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Jordan
 */
public class Level {
    
    public Level(){
        for(int rows = 0; rows<25; rows++){
            for(int cols = 0; cols<18; cols++){
                grid[rows][cols] = new GridSquare();
            }
        }
    }
    
    public void update(){
        numUpdated++;
        if(numUpdated/120 == Math.round(numUpdated/120)){
            
        }
    }
    
    private void moveCreeps(){
        
    }
    
    private void moveProjectiles(){
        //move all the projectiles in the projectile array
        //check to see if any projectiles are over creeps, if so, call damageCreep
    }
    
    private void damageCreep(Creep creep, Projectile projectile){
        creep.setHealth(creep.getHealth()-projectile.getDamage());
        if(creep.getHealth()<0){
            scrapPool = scrapPool + creep.getScrap();
            creeps.remove(creep);
        }
    }

    public ArrayList<Creep> getCreeps() {
        return creeps;
    }

    public int getScrapPool() {
        return scrapPool;
    }

    public int getGold() {
        return gold;
    }

    public GridSquare[][] getGrid() {
        return grid;
    }

    public ArrayList<Wave> getWaves() {
        return waves;
    }

    public LinkedList<GridCoordinates> getPath() {
        return path;
    }

    public GridCoordinates getCastle() {
        return castle;
    }

    public GridCoordinates getStartPath() {
        return startPath;
    }
    
    protected ArrayList<Creep> creeps;
    protected int scrapPool;
    protected int gold;
    protected GridSquare[][] grid = new GridSquare[25][18];
    private int numUpdated = 0;
    
    protected ArrayList<Wave> waves = new ArrayList<>();
    protected LinkedList<GridCoordinates> path = new LinkedList<>();
    protected GridCoordinates castle;
    protected GridCoordinates startPath;
    
}
