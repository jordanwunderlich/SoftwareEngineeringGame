/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Grids;

/**
 *
 * @author Jordan
 */
public abstract class Grid {
    
    public Grid(int row, int col){
        this.row = row;
        column = col;
    }
    
    int row;
    int column;
    
}
