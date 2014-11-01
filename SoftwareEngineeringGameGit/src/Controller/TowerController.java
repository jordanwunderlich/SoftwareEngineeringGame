/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;

/**
 *
 * @author student
 */
public class TowerController {
    
    public TowerController (int x, int y) {
        this.x = x;
        this.y = y;
        xEnd = x + 32;
        yEnd = y + 32;
    }
    
    public void clickedOn() {
        
    }
    
    public boolean contains(int x, int y){
        
        return false;
    }
    
    int x;
    int y;
    int xEnd;
    int yEnd;
    
}
