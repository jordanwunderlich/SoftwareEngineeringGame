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
public class Level6 extends Level{
    
    public Level6(){
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
        
         startPath = new GridCoordinates(24,5 );
        path.add(new GridCoordinates(23, 5));
        path.add(new GridCoordinates(23, 4));
        path.add(new GridCoordinates(23, 3));
        path.add(new GridCoordinates(22, 3));
        path.add(new GridCoordinates(21, 3));
        path.add(new GridCoordinates(21, 4));
        path.add(new GridCoordinates(21, 5));
        path.add(new GridCoordinates(21, 6));
        path.add(new GridCoordinates(20, 6));
        path.add(new GridCoordinates(20, 7));
        path.add(new GridCoordinates(20, 8));
        path.add(new GridCoordinates(20, 9));
        path.add(new GridCoordinates(20, 10));
        path.add(new GridCoordinates(19, 10));
        path.add(new GridCoordinates(18, 10));
        path.add(new GridCoordinates(17, 10));
        path.add(new GridCoordinates(17, 9));
        path.add(new GridCoordinates(17, 8));
        path.add(new GridCoordinates(17, 7));
        path.add(new GridCoordinates(17, 6));
        path.add(new GridCoordinates(17, 5));
        path.add(new GridCoordinates(17, 4));
        path.add(new GridCoordinates(17, 3));
        path.add(new GridCoordinates(17, 2));
        path.add(new GridCoordinates(16, 2));
        path.add(new GridCoordinates(15, 2));
        path.add(new GridCoordinates(15, 3));
        path.add(new GridCoordinates(15, 4));
        path.add(new GridCoordinates(15, 5));
        path.add(new GridCoordinates(15, 6));
        path.add(new GridCoordinates(15, 7));
        path.add(new GridCoordinates(15, 8));
        path.add(new GridCoordinates(14, 8));
        path.add(new GridCoordinates(13, 8));
        path.add(new GridCoordinates(12, 8));
        path.add(new GridCoordinates(11, 8));
        path.add(new GridCoordinates(11, 7));
        path.add(new GridCoordinates(11, 6));
        path.add(new GridCoordinates(11, 5));
        path.add(new GridCoordinates(11, 4));
        path.add(new GridCoordinates(10, 4));
        path.add(new GridCoordinates(9, 4));
        path.add(new GridCoordinates(8, 4));
        path.add(new GridCoordinates(7, 4));
        path.add(new GridCoordinates(6, 4));
        path.add(new GridCoordinates(5, 4));
        path.add(new GridCoordinates(4, 4));
        path.add(new GridCoordinates(3, 4));
        path.add(new GridCoordinates(3, 5));
        path.add(new GridCoordinates(3, 6));
        path.add(new GridCoordinates(3, 7));
        path.add(new GridCoordinates(4, 7));
        path.add(new GridCoordinates(5, 7));
        path.add(new GridCoordinates(6, 7));
        path.add(new GridCoordinates(7, 7));
        path.add(new GridCoordinates(8, 7));
        path.add(new GridCoordinates(8, 8));
        path.add(new GridCoordinates(8, 9));
        path.add(new GridCoordinates(8, 10));
        path.add(new GridCoordinates(9, 10));
        path.add(new GridCoordinates(10, 10));
        path.add(new GridCoordinates(11, 10));
        path.add(new GridCoordinates(12, 10));
        path.add(new GridCoordinates(13, 10));
        path.add(new GridCoordinates(13, 11));
        path.add(new GridCoordinates(13, 12));
        path.add(new GridCoordinates(14, 12));
        path.add(new GridCoordinates(15, 12));
        path.add(new GridCoordinates(16, 12));
        path.add(new GridCoordinates(16, 13));
        path.add(new GridCoordinates(16, 14));
        path.add(new GridCoordinates(16, 15));
        path.add(new GridCoordinates(15, 15));
        path.add(new GridCoordinates(14, 15));
        path.add(new GridCoordinates(13, 15));
        path.add(new GridCoordinates(12, 15));
        path.add(new GridCoordinates(11, 15));
        path.add(new GridCoordinates(10, 15));
        path.add(new GridCoordinates(9, 15));
        path.add(new GridCoordinates(8, 15));
        path.add(new GridCoordinates(7, 15));
        path.add(new GridCoordinates(6, 15));
        path.add(new GridCoordinates(5, 15));
        path.add(new GridCoordinates(4, 15));
        path.add(new GridCoordinates(3, 15));
        path.add(new GridCoordinates(3, 14));
        path.add(new GridCoordinates(3, 13));
        castle = new GridCoordinates(2, 11);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
    
}
    }
}
