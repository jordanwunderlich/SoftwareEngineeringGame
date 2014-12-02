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
public class Level5 extends Level{
    public Level5(){
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
        
         startPath = new GridCoordinates(24,13 );
        path.add(new GridCoordinates(23, 13));
        path.add(new GridCoordinates(22, 13));
        path.add(new GridCoordinates(22, 12));
        path.add(new GridCoordinates(22, 11));
        path.add(new GridCoordinates(22, 10));
        path.add(new GridCoordinates(21, 10));
        path.add(new GridCoordinates(20, 10));
        path.add(new GridCoordinates(19, 10));
        path.add(new GridCoordinates(19, 11));
        path.add(new GridCoordinates(19, 12));
        path.add(new GridCoordinates(19, 13));
        path.add(new GridCoordinates(19, 14));
        path.add(new GridCoordinates(19, 15));
        path.add(new GridCoordinates(18, 15));
        path.add(new GridCoordinates(17, 15));
        path.add(new GridCoordinates(16, 15));
        path.add(new GridCoordinates(15, 15));
        path.add(new GridCoordinates(15, 14));
        path.add(new GridCoordinates(15, 13));
        path.add(new GridCoordinates(15, 12));
        path.add(new GridCoordinates(15, 11));
        path.add(new GridCoordinates(15, 10));
        path.add(new GridCoordinates(15, 9));
        path.add(new GridCoordinates(15, 8));
        path.add(new GridCoordinates(16, 8));
        path.add(new GridCoordinates(17, 8));
        path.add(new GridCoordinates(18, 8));
        path.add(new GridCoordinates(19, 8));
        path.add(new GridCoordinates(20, 8));
        path.add(new GridCoordinates(21, 8));
        path.add(new GridCoordinates(21, 7));
        path.add(new GridCoordinates(21, 6));
        path.add(new GridCoordinates(21, 5));
        path.add(new GridCoordinates(21, 4));
        path.add(new GridCoordinates(21, 3));
        path.add(new GridCoordinates(20, 3));
        path.add(new GridCoordinates(19, 3));
        path.add(new GridCoordinates(18, 3));
        path.add(new GridCoordinates(18, 2));
        path.add(new GridCoordinates(17, 2));
        path.add(new GridCoordinates(16, 2));
        path.add(new GridCoordinates(15, 2));
        path.add(new GridCoordinates(14, 2));
        path.add(new GridCoordinates(14, 3));
        path.add(new GridCoordinates(14, 4));
        path.add(new GridCoordinates(14, 5));
        path.add(new GridCoordinates(13, 5));
        path.add(new GridCoordinates(12, 5));
        path.add(new GridCoordinates(11, 5));
        path.add(new GridCoordinates(11, 4));
        path.add(new GridCoordinates(11, 3));
        path.add(new GridCoordinates(10, 3));
        path.add(new GridCoordinates(9, 3));
        path.add(new GridCoordinates(9, 4));
        path.add(new GridCoordinates(9, 5));
        path.add(new GridCoordinates(9, 6));
        path.add(new GridCoordinates(9, 7));
        path.add(new GridCoordinates(9, 8));
        path.add(new GridCoordinates(10, 8));
        path.add(new GridCoordinates(11, 8));
        path.add(new GridCoordinates(11, 9));
        path.add(new GridCoordinates(11, 10));
        path.add(new GridCoordinates(11, 11));
        path.add(new GridCoordinates(11, 12));
        path.add(new GridCoordinates(10, 12));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(8, 12));
        path.add(new GridCoordinates(7, 12));
        path.add(new GridCoordinates(7, 11));
        path.add(new GridCoordinates(6, 11));
        path.add(new GridCoordinates(5, 11));
        path.add(new GridCoordinates(4, 11));
        path.add(new GridCoordinates(3, 11));
        path.add(new GridCoordinates(3, 10));
        path.add(new GridCoordinates(3, 9));
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
    
