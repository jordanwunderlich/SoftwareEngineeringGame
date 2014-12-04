/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Creeps;

import Model.Levels.GridCoordinates;

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
    
    public int getPlunder() {
        return plunder;
    }
    
    public boolean isHurt = false;
    public int hurtTimer;
    protected int maxHealth;
    protected int health;
    int speed;
    protected int scrap;
    protected int plunder;
    public int yloc;
    public int xloc;
    public GridCoordinates nextSquare;
    public int squareNum;
    public boolean hasSprite;
    
}
