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
public class Level7 extends Level {
    
     public Level7(){
        super();
        scrapPool = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(1).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(2).addCreeps("basic", 10);
        
        
        startPath = new GridCoordinates(2, 2);
        path.add(new GridCoordinates(3, 2));
        path.add(new GridCoordinates(4, 2));
        path.add(new GridCoordinates(5, 2));
        path.add(new GridCoordinates(8, 2));
        path.add(new GridCoordinates(9, 2));
        path.add(new GridCoordinates(10, 2));
        path.add(new GridCoordinates(11, 2));
        path.add(new GridCoordinates(12, 2));
        path.add(new GridCoordinates(13, 2));
        path.add(new GridCoordinates(14, 2));
        path.add(new GridCoordinates(15, 2));
        path.add(new GridCoordinates(16, 2));
        path.add(new GridCoordinates(17, 2));
        path.add(new GridCoordinates(18, 2));
        path.add(new GridCoordinates(19, 2));
        path.add(new GridCoordinates(20, 2));
        path.add(new GridCoordinates(20, 3));
        path.add(new GridCoordinates(20, 4));
        path.add(new GridCoordinates(20, 5));
        path.add(new GridCoordinates(19, 5));
        path.add(new GridCoordinates(19, 5));
        path.add(new GridCoordinates(18, 5));
        path.add(new GridCoordinates(17, 5));
        path.add(new GridCoordinates(16, 5));
        path.add(new GridCoordinates(15, 5));
        path.add(new GridCoordinates(14, 5));
        path.add(new GridCoordinates(13, 5));
        path.add(new GridCoordinates(12, 5));
        path.add(new GridCoordinates(11, 5));
        path.add(new GridCoordinates(10, 5));
        path.add(new GridCoordinates(10, 6));
        path.add(new GridCoordinates(10, 7));
        path.add(new GridCoordinates(10, 8));
        path.add(new GridCoordinates(10, 9));
        path.add(new GridCoordinates(10, 10));
        path.add(new GridCoordinates(10, 11));
        path.add(new GridCoordinates(10, 12));
        path.add(new GridCoordinates(10, 13));
        path.add(new GridCoordinates(10, 14));
        path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(12, 14));
        path.add(new GridCoordinates(12, 15));
        path.add(new GridCoordinates(12, 16));
        path.add(new GridCoordinates(13, 16));
        path.add(new GridCoordinates(14, 16));
        path.add(new GridCoordinates(15, 16));
        path.add(new GridCoordinates(16, 16));
        path.add(new GridCoordinates(17, 16));
        path.add(new GridCoordinates(18, 16));
        path.add(new GridCoordinates(19, 16));
        path.add(new GridCoordinates(20, 16));
        path.add(new GridCoordinates(21, 16));
        path.add(new GridCoordinates(22, 16));
        path.add(new GridCoordinates(22, 15));
        path.add(new GridCoordinates(22, 14));
        castle = new GridCoordinates(21, 12);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
}
}
