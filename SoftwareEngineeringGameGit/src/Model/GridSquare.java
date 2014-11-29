/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Towers.Tower;

/**
 *
 * @author Jordan
 */
public class GridSquare {
    
    public enum Type {
        EMPTY,PATH,CASTLE,ENTRY
    }
    
    public GridSquare(){
        type = Type.EMPTY;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }
    
    private Type type;
    private Tower tower;
    public int xloc;
    public int yloc;
    
}
