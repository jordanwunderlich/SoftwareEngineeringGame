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
public class Level8 extends Level{
    
    
    public Level8(){
        super();
        scrapPool = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(1).addCreeps("basic", 10);
        waves.add(new Wave());
        waves.get(2).addCreeps("basic", 10);
        
        
        startPath = new GridCoordinates(1, 14);
        path.add(new GridCoordinates(2, 14));
        path.add(new GridCoordinates(3, 14));
        path.add(new GridCoordinates(4, 14));
        path.add(new GridCoordinates(5, 14));
        path.add(new GridCoordinates(6, 14));
        path.add(new GridCoordinates(7, 14));
        path.add(new GridCoordinates(8, 14));
        path.add(new GridCoordinates(9, 14));
        path.add(new GridCoordinates(10, 14));
        path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(12, 14));
        path.add(new GridCoordinates(13, 14));
        path.add(new GridCoordinates(14, 14));
        path.add(new GridCoordinates(15, 14));
        path.add(new GridCoordinates(16, 14));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(18, 14));
        path.add(new GridCoordinates(19, 14));
        path.add(new GridCoordinates(20, 14));
        path.add(new GridCoordinates(21, 14));
        path.add(new GridCoordinates(22, 14));
        path.add(new GridCoordinates(22, 13));
        path.add(new GridCoordinates(22, 12));
        path.add(new GridCoordinates(21, 12));
        path.add(new GridCoordinates(21, 12));
        path.add(new GridCoordinates(19, 12));
        path.add(new GridCoordinates(18, 12));
        path.add(new GridCoordinates(17, 12));
        path.add(new GridCoordinates(16, 12));
        path.add(new GridCoordinates(15, 12));
        path.add(new GridCoordinates(14, 12));
        path.add(new GridCoordinates(13, 12));
        path.add(new GridCoordinates(12, 12));         path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(10, 12));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(8, 12));
        path.add(new GridCoordinates(7, 12));
        path.add(new GridCoordinates(6, 12));
        path.add(new GridCoordinates(5, 12));
        path.add(new GridCoordinates(4, 12));
        path.add(new GridCoordinates(3, 12));
        path.add(new GridCoordinates(2, 12));
        path.add(new GridCoordinates(2, 11));
        path.add(new GridCoordinates(2, 10));
        path.add(new GridCoordinates(2, 9));
        path.add(new GridCoordinates(3, 9));
        path.add(new GridCoordinates(4, 9));
        path.add(new GridCoordinates(5, 9));
        path.add(new GridCoordinates(6, 9));
        path.add(new GridCoordinates(7, 9));
        path.add(new GridCoordinates(8, 9));
        path.add(new GridCoordinates(9, 9));
        path.add(new GridCoordinates(10, 9));
        path.add(new GridCoordinates(11, 9));
        path.add(new GridCoordinates(12, 9));
        path.add(new GridCoordinates(13, 9));
        path.add(new GridCoordinates(14, 9));
        path.add(new GridCoordinates(15, 9));
        path.add(new GridCoordinates(16, 9));
        path.add(new GridCoordinates(17, 9));
        path.add(new GridCoordinates(18, 9));
        path.add(new GridCoordinates(19, 9));
        path.add(new GridCoordinates(20, 9));
        path.add(new GridCoordinates(21, 9));
        path.add(new GridCoordinates(21, 8));
        path.add(new GridCoordinates(21, 7));
        path.add(new GridCoordinates(21, 6));
        path.add(new GridCoordinates(21, 5));
        path.add(new GridCoordinates(21, 4));
        castle = new GridCoordinates(20, 2);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    }
    
}
