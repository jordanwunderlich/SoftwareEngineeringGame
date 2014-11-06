/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model.Creeps;

/**
 *
 * @author Jason
 */
public class CreepBossSlow extends Creep{
    
      public CreepBossSlow(){
          maxHealth = 1000;
        health = 1000;
        speed = 1/2;
        plunder = 90;
        scrap = 800;
    }
    
}
