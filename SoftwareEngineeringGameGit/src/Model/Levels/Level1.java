/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Levels;

import Model.Creeps.CreepBasic;

/**
 *
 * @author Jordan
 */
public class Level1 extends Level{
    
    public Level1(){
        scrap = 50;
        gold = 30;
        waves.add(new Wave());
        waves.get(0).addCreeps(new CreepBasic(), 10);
        waves.add(new Wave());
        waves.get(1).addCreeps(new CreepBasic(), 10);
        waves.add(new Wave());
        waves.get(2).addCreeps(new CreepBasic(), 10);
    }
    
}
