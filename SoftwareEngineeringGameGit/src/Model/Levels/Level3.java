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
public class Level3 extends Level {
    public Level3(){
        super();
        scrapPool = 50;
        gold = 30;
//        waves.add(new Wave());
//        waves.get(0).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(1).addCreeps(new CreepBasic(), 10);
//        waves.add(new Wave());
//        waves.get(2).addCreeps(new CreepBasic(), 10);
        
        startPath = new GridCoordinates(12, 16);
        path.add(new GridCoordinates(12, 15));
        path.add(new GridCoordinates(11, 15));
        path.add(new GridCoordinates(10, 15));
        path.add(new GridCoordinates(9, 15));
        path.add(new GridCoordinates(8, 15));
        path.add(new GridCoordinates(7, 15));
        path.add(new GridCoordinates(6, 15));
        path.add(new GridCoordinates(6, 14));
        path.add(new GridCoordinates(6, 13));
        path.add(new GridCoordinates(6, 12));
        path.add(new GridCoordinates(7, 12));
        path.add(new GridCoordinates(8, 12));
        path.add(new GridCoordinates(9, 12));
        path.add(new GridCoordinates(10, 12));
        path.add(new GridCoordinates(11, 12));
        path.add(new GridCoordinates(12, 12));
        path.add(new GridCoordinates(13, 12));
        path.add(new GridCoordinates(14, 12));
        path.add(new GridCoordinates(15, 12));
        path.add(new GridCoordinates(15, 13));
        path.add(new GridCoordinates(15, 14));
        path.add(new GridCoordinates(16, 14));
        path.add(new GridCoordinates(17, 14));
        path.add(new GridCoordinates(18, 14));
        path.add(new GridCoordinates(19, 14));
        path.add(new GridCoordinates(20, 14));
        path.add(new GridCoordinates(20, 13));
        path.add(new GridCoordinates(21, 13));
        path.add(new GridCoordinates(22, 13));
        path.add(new GridCoordinates(22, 12));
        path.add(new GridCoordinates(22, 11));
        path.add(new GridCoordinates(22, 10));
        path.add(new GridCoordinates(22, 9));
        path.add(new GridCoordinates(22, 8));
        path.add(new GridCoordinates(22, 7));
        path.add(new GridCoordinates(22, 6));
        path.add(new GridCoordinates(21, 6));
        path.add(new GridCoordinates(20, 6));
        path.add(new GridCoordinates(19, 6));
        path.add(new GridCoordinates(18, 6));
        path.add(new GridCoordinates(17, 6));
        path.add(new GridCoordinates(16, 6));
        path.add(new GridCoordinates(16, 7));
        path.add(new GridCoordinates(16, 8));
        path.add(new GridCoordinates(16, 9));
        path.add(new GridCoordinates(16, 6));
        castle = new GridCoordinates(2, 2);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
        }
}
