/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Creeps;

/**
 *
 * @author Jordan
 */
public abstract class Creep{
    
    /**
     * 
     */
    private void displayHealth(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void addScrap(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void die(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    int maxHealth;
    int health;
    int speed;
    int scrap;
    int plunder;
    
}
