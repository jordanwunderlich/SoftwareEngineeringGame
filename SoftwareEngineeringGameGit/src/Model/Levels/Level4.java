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
public class Level4 extends Level{
    

    public Level4(){
     super();
        scrapPool = 50;
        gold = 30;
//        waves.add(new Wave());
//        waves.get(0).addCreeps(new CreepBasic(), 10);
          
//        waves.add(new Wave());
//        waves.get(1).addCreeps(new CreepBasic(), 10);
          waves.get(0).addCreeps(new)
//        waves.add(new Wave());
//        waves.get(2).addCreeps(new CreepBasic(), 10);
        
         startPath = new GridCoordinates(21,16 );
        path.add(new GridCoordinates(21, 15));
        path.add(new GridCoordinates(20, 15));
        path.add(new GridCoordinates(19, 15));
        path.add(new GridCoordinates(18, 15));
        castle = new GridCoordinates(12, 2);
        for(int a = 0; a < path.size(); a++){
            grid[path.get(a).getX()][path.get(a).getY()].setType(GridSquare.Type.PATH);
    
}
}
}