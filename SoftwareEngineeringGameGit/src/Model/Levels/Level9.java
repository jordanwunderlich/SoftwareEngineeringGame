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
public class Level9 extends Level{
    
    public Level9(){
        super();
        scrapPool = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(1).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(2).addCreeps("basic", 10);
        
        
        startPath = new GridCoordinates(13, 1);
        path.add(new GridCoordinates(13, 2));
        path.add(new GridCoordinates(13, 3));
        path.add(new GridCoordinates(12, 3));
        path.add(new GridCoordinates(11, 3));
        path.add(new GridCoordinates(10, 3));
        path.add(new GridCoordinates(9, 3));
        path.add(new GridCoordinates(8, 3));
        path.add(new GridCoordinates(7, 3));
        path.add(new GridCoordinates(6, 3));
        path.add(new GridCoordinates(5, 3));
        path.add(new GridCoordinates(4, 3));
        path.add(new GridCoordinates(3, 3));
        path.add(new GridCoordinates(3, 4));
        path.add(new GridCoordinates(3, 5));
        path.add(new GridCoordinates(3, 6));
        path.add(new GridCoordinates(3, 7));
        path.add(new GridCoordinates(3, 8));
        path.add(new GridCoordinates(3, 9));
        path.add(new GridCoordinates(3, 10));
        path.add(new GridCoordinates(3, 11));
        path.add(new GridCoordinates(3, 12));
        path.add(new GridCoordinates(3, 13));
        path.add(new GridCoordinates(3, 14));
        path.add(new GridCoordinates(3, 15));
        path.add(new GridCoordinates(4, 15));
        path.add(new GridCoordinates(5, 15));
        path.add(new GridCoordinates(5, 14));
        path.add(new GridCoordinates(5, 13));
        path.add(new GridCoordinates(5, 12));
        path.add(new GridCoordinates(5, 11));
        path.add(new GridCoordinates(5, 10));
        path.add(new GridCoordinates(5, 9));
        path.add(new GridCoordinates(5, 8));
        path.add(new GridCoordinates(5, 7));
        path.add(new GridCoordinates(5, 6));
        path.add(new GridCoordinates(5, 5));
        path.add(new GridCoordinates(6, 5));
        path.add(new GridCoordinates(7, 5));
        path.add(new GridCoordinates(8, 5));
        path.add(new GridCoordinates(9, 5));
        path.add(new GridCoordinates(10, 5));
        path.add(new GridCoordinates(11, 5));
        path.add(new GridCoordinates(12, 5));
        path.add(new GridCoordinates(13, 5));
        path.add(new GridCoordinates(14, 5));
        path.add(new GridCoordinates(15, 5));
        path.add(new GridCoordinates(16, 5));
        path.add(new GridCoordinates(17, 5));
        path.add(new GridCoordinates(18, 5));
        path.add(new GridCoordinates(19, 5));
        path.add(new GridCoordinates(20, 5));
        path.add(new GridCoordinates(21, 5));
        path.add(new GridCoordinates(21, 5));
        path.add(new GridCoordinates(21, 6));
        path.add(new GridCoordinates(21, 7));
        path.add(new GridCoordinates(21, 8));
        path.add(new GridCoordinates(21, 9));
        path.add(new GridCoordinates(21, 10));
        path.add(new GridCoordinates(21, 11));
        path.add(new GridCoordinates(21, 12));
        path.add(new GridCoordinates(21, 13));
        path.add(new GridCoordinates(21, 14));
        path.add(new GridCoordinates(21, 15));
        path.add(new GridCoordinates(20, 15));
        path.add(new GridCoordinates(19, 15));
        path.add(new GridCoordinates(19, 14));
        path.add(new GridCoordinates(19, 13));
        path.add(new GridCoordinates(19, 12));
        path.add(new GridCoordinates(19, 11));
        path.add(new GridCoordinates(19, 10));
        path.add(new GridCoordinates(19, 9));
        path.add(new GridCoordinates(19, 8));
        path.add(new GridCoordinates(19, 7));
        path.add(new GridCoordinates(18, 7));
        path.add(new GridCoordinates(17, 7));
        path.add(new GridCoordinates(16, 7));
        path.add(new GridCoordinates(15, 7));
        path.add(new GridCoordinates(14, 7));
        path.add(new GridCoordinates(13, 7));
        path.add(new GridCoordinates(12, 7));
        path.add(new GridCoordinates(11, 7));
        path.add(new GridCoordinates(10, 7));
        path.add(new GridCoordinates(9, 7));
        path.add(new GridCoordinates(8, 7));
        path.add(new GridCoordinates(7, 7));
        path.add(new GridCoordinates(7, 8));
        path.add(new GridCoordinates(7, 9));
        path.add(new GridCoordinates(7, 10));
        path.add(new GridCoordinates(7, 11));
        path.add(new GridCoordinates(7, 12));
        path.add(new GridCoordinates(7, 13));
        path.add(new GridCoordinates(7, 14));
        path.add(new GridCoordinates(7, 15));
        path.add(new GridCoordinates(7, 16));
        path.add(new GridCoordinates(8, 16));
        path.add(new GridCoordinates(9, 16));
        path.add(new GridCoordinates(9, 15));
        path.add(new GridCoordinates(9, 14));
        path.add(new GridCoordinates(9, 13));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(9, 11));
        path.add(new GridCoordinates(9, 10));
        path.add(new GridCoordinates(9, 9));
        path.add(new GridCoordinates(10, 9));
        path.add(new GridCoordinates(11, 9));
        path.add(new GridCoordinates(12, 9));
        path.add(new GridCoordinates(13, 9));
        path.add(new GridCoordinates(14, 9));
        path.add(new GridCoordinates(15, 9));
        path.add(new GridCoordinates(16, 9));
        path.add(new GridCoordinates(17, 9));
        path.add(new GridCoordinates(17, 10));
        path.add(new GridCoordinates(17, 11));
        path.add(new GridCoordinates(17, 12));
        path.add(new GridCoordinates(17, 13));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(17, 15));
        path.add(new GridCoordinates(17, 16));
        path.add(new GridCoordinates(16, 16));
        path.add(new GridCoordinates(15, 16));
        path.add(new GridCoordinates(14, 16));
        path.add(new GridCoordinates(13, 16));
        path.add(new GridCoordinates(13, 15));
        path.add(new GridCoordinates(13, 14));
        castle = new GridCoordinates(12, 12);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    
}
}
