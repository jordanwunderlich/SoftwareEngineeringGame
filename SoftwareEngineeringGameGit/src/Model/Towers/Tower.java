/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Towers;

/**
 *
 * @author Jordan
 */
public abstract class Tower {
    
    private void augmentStat(String stat){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void sellTower(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void launchProjectile(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    int damage;
    int range;
    int cost;
    int rof;
    boolean slows;
    boolean aoe;
    
}
