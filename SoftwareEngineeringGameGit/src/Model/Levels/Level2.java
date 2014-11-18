/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Levels;

import Model.GridSquare;

/**
 *
 * @author Jason
 */
public class Level2 extends Level {
    
     public Level2(){
        super();
        scrapPool = 50;
        gold = 30;
//        waves.add(new Wave());
//        waves.get(0).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(1).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(2).addCreeps(new CreepBasic(), 10);
        
        
        startPath = new GridCoordinates(0, 5);
        path.add(new GridCoordinates(0, 5));
        path.add(new GridCoordinates(1, 5));
        path.add(new GridCoordinates(2, 5));
        path.add(new GridCoordinates(3, 5));
        path.add(new GridCoordinates(3, 6));
        path.add(new GridCoordinates(4, 6));
        path.add(new GridCoordinates(5, 6));
        path.add(new GridCoordinates(5, 7));
        path.add(new GridCoordinates(5, 8));
        path.add(new GridCoordinates(5, 9));
        path.add(new GridCoordinates(5, 10));
        path.add(new GridCoordinates(6, 10));
        path.add(new GridCoordinates(7, 10));
        path.add(new GridCoordinates(8, 10));
        path.add(new GridCoordinates(8, 11));
        path.add(new GridCoordinates(8, 12));
        path.add(new GridCoordinates(8, 13));
        path.add(new GridCoordinates(8, 14));
        path.add(new GridCoordinates(8, 15));
        path.add(new GridCoordinates(8, 16));
        path.add(new GridCoordinates(8, 17));
        castle = new GridCoordinates(8, 17);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    }
    
}
