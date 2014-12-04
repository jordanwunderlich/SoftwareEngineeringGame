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
public class Level10 extends Level{
    
    public Level10(){
        super();
        scrapPool = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(1).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(2).addCreeps("basic", 10);
        
        
        startPath = new GridCoordinates(13, 16);
        path.add(new GridCoordinates(13, 15));
        path.add(new GridCoordinates(13, 14));
        path.add(new GridCoordinates(13, 14));
        path.add(new GridCoordinates(12, 14));
        path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(10, 14));
        path.add(new GridCoordinates(9, 14));
        path.add(new GridCoordinates(9, 13));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(8, 12));
        path.add(new GridCoordinates(7, 12));
        path.add(new GridCoordinates(7, 13));
        path.add(new GridCoordinates(7, 14));
        path.add(new GridCoordinates(6, 14));
        path.add(new GridCoordinates(5, 14));
        path.add(new GridCoordinates(4, 14));
        path.add(new GridCoordinates(3, 14));
        path.add(new GridCoordinates(2, 14));
        path.add(new GridCoordinates(2, 13));
        path.add(new GridCoordinates(2, 12));
        path.add(new GridCoordinates(2, 11));
        path.add(new GridCoordinates(3, 11));
        path.add(new GridCoordinates(4, 11));
        path.add(new GridCoordinates(4, 10));
        path.add(new GridCoordinates(3, 10));
        path.add(new GridCoordinates(2, 10));
        path.add(new GridCoordinates(2, 9));
        path.add(new GridCoordinates(2, 8));
        path.add(new GridCoordinates(2, 7));
        path.add(new GridCoordinates(2, 6));
        path.add(new GridCoordinates(2, 5));
        path.add(new GridCoordinates(3, 5));
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
        path.add(new GridCoordinates(7, 8));
        path.add(new GridCoordinates(7, 9));
        path.add(new GridCoordinates(7, 10));
        path.add(new GridCoordinates(8, 10));
        path.add(new GridCoordinates(9, 10));
        path.add(new GridCoordinates(9, 9));
        path.add(new GridCoordinates(9, 8));
        path.add(new GridCoordinates(9, 7));
        path.add(new GridCoordinates(9, 6));
        path.add(new GridCoordinates(9, 5));
        path.add(new GridCoordinates(9, 4));
        path.add(new GridCoordinates(9, 3));
        path.add(new GridCoordinates(9, 2));
        path.add(new GridCoordinates(10, 2));
        path.add(new GridCoordinates(11, 2));
        path.add(new GridCoordinates(12, 2));
        path.add(new GridCoordinates(13, 2));
        path.add(new GridCoordinates(13, 3));
        path.add(new GridCoordinates(13, 4));
        path.add(new GridCoordinates(13, 5));
        path.add(new GridCoordinates(14, 5));
        path.add(new GridCoordinates(15, 5));
        path.add(new GridCoordinates(15, 4));
        path.add(new GridCoordinates(15, 3));
        path.add(new GridCoordinates(15, 2));
        path.add(new GridCoordinates(16, 2));
        path.add(new GridCoordinates(17, 2));
        path.add(new GridCoordinates(17, 3));
        path.add(new GridCoordinates(17, 4));
        path.add(new GridCoordinates(18, 4));
        path.add(new GridCoordinates(19, 4));
        path.add(new GridCoordinates(20, 4));
        path.add(new GridCoordinates(21, 4));
        path.add(new GridCoordinates(22, 4));
        path.add(new GridCoordinates(23, 4));
        path.add(new GridCoordinates(23, 5));
        path.add(new GridCoordinates(23, 6));
        path.add(new GridCoordinates(23, 7));
        path.add(new GridCoordinates(22, 7));
        path.add(new GridCoordinates(21, 7));
        path.add(new GridCoordinates(21, 8));
        path.add(new GridCoordinates(21, 9));
        path.add(new GridCoordinates(21, 10));
        path.add(new GridCoordinates(22, 10));
        path.add(new GridCoordinates(23, 10));
        path.add(new GridCoordinates(23, 11));
        path.add(new GridCoordinates(23, 12));
        path.add(new GridCoordinates(23, 13));
        path.add(new GridCoordinates(23, 14));
        path.add(new GridCoordinates(22, 14));
        path.add(new GridCoordinates(21, 14));
        path.add(new GridCoordinates(20, 14));
        path.add(new GridCoordinates(19, 14));
        path.add(new GridCoordinates(19, 13));
        path.add(new GridCoordinates(19, 12));
        path.add(new GridCoordinates(19, 11));
        path.add(new GridCoordinates(19, 10));
        path.add(new GridCoordinates(19, 9));
        path.add(new GridCoordinates(19, 8));
        path.add(new GridCoordinates(19, 7));
        path.add(new GridCoordinates(19, 6));
        path.add(new GridCoordinates(18, 6));
        path.add(new GridCoordinates(17, 6));
        path.add(new GridCoordinates(17, 7));
        path.add(new GridCoordinates(17, 8));
        path.add(new GridCoordinates(17, 9));
        path.add(new GridCoordinates(17, 10));
        path.add(new GridCoordinates(17, 11));
        path.add(new GridCoordinates(17, 12));
        path.add(new GridCoordinates(17, 13));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(16, 14));
        path.add(new GridCoordinates(15, 14));
        path.add(new GridCoordinates(15, 13));
        path.add(new GridCoordinates(15, 12));
        path.add(new GridCoordinates(14, 12));
        path.add(new GridCoordinates(13, 12));
        path.add(new GridCoordinates(13, 11));
        path.add(new GridCoordinates(13, 10));
        castle = new GridCoordinates(12, 8);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    
}
}
