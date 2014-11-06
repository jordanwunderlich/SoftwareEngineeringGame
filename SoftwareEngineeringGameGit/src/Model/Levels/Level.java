/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.Grids.Grid;
import Model.Creeps.Creep;
import Model.Map;
import Model.Projectile;
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
    
    Map map;
    ArrayList<Creep> creeps;
    ArrayList<Wave> waves;
    int scrapPool;
    int gold;
    
}
