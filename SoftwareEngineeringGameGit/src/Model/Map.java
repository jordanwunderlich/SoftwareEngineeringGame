/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Map {
    
    public Map(Level level) {
        this.level = level;
        for(int i = 0; i < rows; i++){
            for(int q = 0; q < columns; q++){
                grid[i][q] = new Grid(i, q);
                level.add(grid[i][q], i*gridSize, q*gridSize);
            }
        }
    }
    
    private void displayMap(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void displayGrid(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    Image mapimg;
    int rows = 25;
    int columns = 19;
    Grid[][] grid = new Grid[rows][columns];
    ArrayList<GridPath> path;
    int gridSize = 32;
    Level level;
    
}
