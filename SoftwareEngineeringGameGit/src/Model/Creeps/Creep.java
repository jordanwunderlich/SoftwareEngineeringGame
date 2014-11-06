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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getScrap() {
        return scrap;
    }
    
    protected int maxHealth;
    protected int health;
    int speed;
    protected int scrap;
    int plunder;
    
}
