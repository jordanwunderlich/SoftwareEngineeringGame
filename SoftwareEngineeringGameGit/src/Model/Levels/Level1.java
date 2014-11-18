/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Levels;

import Model.Creeps.CreepBasic;
import Model.GridSquare;

/**
 *
 * @author Jordan
 */
public class Level1 extends Level{
    
    public Level1(){
        super();
        scrapPool = 50;
        gold = 30;
//        waves.add(new Wave());
//        waves.get(0).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(1).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(2).addCreeps(new CreepBasic(), 10);
        
        
        startPath = new GridCoordinates(5, 16);
        path.add(new GridCoordinates(5, 15));
        path.add(new GridCoordinates(5, 14));
        path.add(new GridCoordinates(5, 13));
        path.add(new GridCoordinates(5, 12));
        path.add(new GridCoordinates(5, 11));
        path.add(new GridCoordinates(5, 10));
        path.add(new GridCoordinates(5, 9));
        path.add(new GridCoordinates(6, 9));
        path.add(new GridCoordinates(7, 9));
        path.add(new GridCoordinates(8, 9));
        path.add(new GridCoordinates(9, 9));
        path.add(new GridCoordinates(10, 9));
        path.add(new GridCoordinates(10, 10));
        path.add(new GridCoordinates(10, 11));
        path.add(new GridCoordinates(10, 12));
        path.add(new GridCoordinates(10, 13));
        path.add(new GridCoordinates(10, 14));
        path.add(new GridCoordinates(11, 14));
        path.add(new GridCoordinates(12, 14));
        path.add(new GridCoordinates(13, 14));
        path.add(new GridCoordinates(14, 14));
        path.add(new GridCoordinates(14, 13));
        path.add(new GridCoordinates(14, 12));
        path.add(new GridCoordinates(14, 11));
        path.add(new GridCoordinates(14, 10));
        path.add(new GridCoordinates(14, 9));
        path.add(new GridCoordinates(14, 8));
        path.add(new GridCoordinates(14, 7));
        path.add(new GridCoordinates(15, 7));
        path.add(new GridCoordinates(16, 7));
        path.add(new GridCoordinates(17, 7));
        path.add(new GridCoordinates(18, 7));
        path.add(new GridCoordinates(19, 7));
        path.add(new GridCoordinates(20, 7));
        path.add(new GridCoordinates(20, 6));
        path.add(new GridCoordinates(20, 5));
        path.add(new GridCoordinates(20, 4));
        castle = new GridCoordinates(19, 1);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
    }
    
}
