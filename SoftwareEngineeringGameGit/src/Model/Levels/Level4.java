/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Levels;

import Model.Creeps.CreepFast;
import Model.GridSquare;

/**
 *
 * @author Jason
 */
public class Level4 extends Level{
    

    public Level4(){
     super();
        scrapPool = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps("basic", 10);
        waves.get(0).addCreeps("fast", 10);
        waves.add(new Wave());
        waves.get(1).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(2).addCreeps("basic", 10);
        
         startPath = new GridCoordinates(21,16 );
        path.add(new GridCoordinates(21, 15));
        path.add(new GridCoordinates(20, 15));
        path.add(new GridCoordinates(19, 15));
        path.add(new GridCoordinates(18, 15));
        path.add(new GridCoordinates(17, 15));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(17, 13));
        path.add(new GridCoordinates(17, 13));
        path.add(new GridCoordinates(16, 13));
        path.add(new GridCoordinates(15, 13));
        path.add(new GridCoordinates(14, 13));
        path.add(new GridCoordinates(13, 13));
        path.add(new GridCoordinates(12, 13));
        path.add(new GridCoordinates(11, 13));
        path.add(new GridCoordinates(10, 13));
        path.add(new GridCoordinates(9, 13));
        path.add(new GridCoordinates(8, 13));
        path.add(new GridCoordinates(7, 13));
        path.add(new GridCoordinates(6, 13));
        path.add(new GridCoordinates(6, 14));
        path.add(new GridCoordinates(6, 15));
        path.add(new GridCoordinates(5, 15));
        path.add(new GridCoordinates(4, 15));
        path.add(new GridCoordinates(3, 15));
        path.add(new GridCoordinates(3, 14));
        path.add(new GridCoordinates(3, 13));
        path.add(new GridCoordinates(3, 12));
        path.add(new GridCoordinates(3, 11));
        path.add(new GridCoordinates(3, 10));
        path.add(new GridCoordinates(2, 10));
        path.add(new GridCoordinates(2, 9));
        path.add(new GridCoordinates(2, 8));
        path.add(new GridCoordinates(2, 7));
        path.add(new GridCoordinates(2, 6));
        path.add(new GridCoordinates(3, 6));
        path.add(new GridCoordinates(4, 6));
        path.add(new GridCoordinates(4, 5));
        path.add(new GridCoordinates(4, 4));
        path.add(new GridCoordinates(4, 3));
        path.add(new GridCoordinates(5, 3));
        path.add(new GridCoordinates(6, 3));
        path.add(new GridCoordinates(7, 3));
        path.add(new GridCoordinates(7, 4));
        path.add(new GridCoordinates(7, 5));
        path.add(new GridCoordinates(7, 6));
        path.add(new GridCoordinates(7, 7));
        path.add(new GridCoordinates(6, 7));
        path.add(new GridCoordinates(6, 8));
        path.add(new GridCoordinates(6, 9));
        path.add(new GridCoordinates(6, 10));
        path.add(new GridCoordinates(7, 10));
        path.add(new GridCoordinates(8, 10));
        path.add(new GridCoordinates(9, 10));
        path.add(new GridCoordinates(10, 10));
        path.add(new GridCoordinates(11, 10));
        path.add(new GridCoordinates(12, 10));
        path.add(new GridCoordinates(12, 9));
        path.add(new GridCoordinates(12, 8));
        path.add(new GridCoordinates(12, 7));
        path.add(new GridCoordinates(11, 7));
        path.add(new GridCoordinates(11, 6));
        path.add(new GridCoordinates(11, 5));
        path.add(new GridCoordinates(11, 4));
        path.add(new GridCoordinates(12, 4));
        path.add(new GridCoordinates(13, 4));
        path.add(new GridCoordinates(14, 4));
        path.add(new GridCoordinates(14, 5));
        path.add(new GridCoordinates(14, 6));
        path.add(new GridCoordinates(14, 7));
        path.add(new GridCoordinates(14, 8));
        path.add(new GridCoordinates(14, 9));
        path.add(new GridCoordinates(14, 10));
        path.add(new GridCoordinates(15, 10));
        path.add(new GridCoordinates(16, 10));
        path.add(new GridCoordinates(17, 10));
        path.add(new GridCoordinates(18, 10));
        path.add(new GridCoordinates(19, 10));
        path.add(new GridCoordinates(19, 11));
        path.add(new GridCoordinates(20, 11));
        path.add(new GridCoordinates(21, 11));
        path.add(new GridCoordinates(22, 11));
        path.add(new GridCoordinates(22, 10));
        path.add(new GridCoordinates(22, 9));
        path.add(new GridCoordinates(22, 8));
        path.add(new GridCoordinates(22, 7));
        path.add(new GridCoordinates(22, 6));
        path.add(new GridCoordinates(22, 5));
        path.add(new GridCoordinates(22, 4));
        castle = new GridCoordinates(12, 2);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
    
}
}
}