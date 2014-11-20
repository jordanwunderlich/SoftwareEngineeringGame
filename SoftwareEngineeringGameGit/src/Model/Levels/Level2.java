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
        
        
        startPath = new GridCoordinates(24, 14);
        path.add(new GridCoordinates(23, 14));
        path.add(new GridCoordinates(22, 14));
        path.add(new GridCoordinates(21, 14));
        path.add(new GridCoordinates(21, 13));
        path.add(new GridCoordinates(21, 12));
        path.add(new GridCoordinates(21, 11));
        path.add(new GridCoordinates(21, 10));
        path.add(new GridCoordinates(21, 9));
        path.add(new GridCoordinates(20, 9));
        path.add(new GridCoordinates(19, 9));
        path.add(new GridCoordinates(19, 8));
        path.add(new GridCoordinates(19, 7));
        path.add(new GridCoordinates(19, 6));
        path.add(new GridCoordinates(19, 5));
        path.add(new GridCoordinates(18, 5));
        path.add(new GridCoordinates(17, 5));
        path.add(new GridCoordinates(17, 6));
        path.add(new GridCoordinates(17, 7));
        path.add(new GridCoordinates(17, 8));
        path.add(new GridCoordinates(17, 9));
        path.add(new GridCoordinates(17, 10));
        path.add(new GridCoordinates(17, 11));
        path.add(new GridCoordinates(17, 12));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(16, 14));
        path.add(new GridCoordinates(15, 14));
        path.add(new GridCoordinates(14, 14));
        path.add(new GridCoordinates(13, 14));
        path.add(new GridCoordinates(12, 14));
        path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(11, 13));
        path.add(new GridCoordinates(11, 12));
        path.add(new GridCoordinates(11, 11));
        path.add(new GridCoordinates(11, 10));
        path.add(new GridCoordinates(11, 9));
        path.add(new GridCoordinates(12, 9));
        path.add(new GridCoordinates(12, 8));
        path.add(new GridCoordinates(12, 7));
        path.add(new GridCoordinates(11, 7));
        path.add(new GridCoordinates(10, 7));
        path.add(new GridCoordinates(9, 7));
        path.add(new GridCoordinates(8, 7));
        path.add(new GridCoordinates(8, 8));
        path.add(new GridCoordinates(8, 9));
        path.add(new GridCoordinates(9, 9));
        path.add(new GridCoordinates(9, 10));
        path.add(new GridCoordinates(9, 11));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(9, 13));
        path.add(new GridCoordinates(8, 13));
        path.add(new GridCoordinates(7, 13));
        path.add(new GridCoordinates(6, 13));
        path.add(new GridCoordinates(5, 13));
        path.add(new GridCoordinates(5, 12));
        path.add(new GridCoordinates(5, 11));
        path.add(new GridCoordinates(5, 10));
        path.add(new GridCoordinates(5, 9));
        path.add(new GridCoordinates(5, 8));
        path.add(new GridCoordinates(4, 8));
        path.add(new GridCoordinates(3, 8));
        path.add(new GridCoordinates(3, 7));
        path.add(new GridCoordinates(3, 6));
        path.add(new GridCoordinates(3, 5));
        path.add(new GridCoordinates(3, 4));
        castle = new GridCoordinates(2, 2);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    }
    
}
