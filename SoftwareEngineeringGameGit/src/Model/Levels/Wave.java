/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.Creeps.Creep;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Wave {
    
    public Wave(){
        
    }
    
    public void addCreeps(Creep creep, int number){
        for(int i = 0; i < number; i++){
            creepList.add(creep);
        }
    }
    
    private ArrayList<Creep> creepList = new ArrayList<>();
    int spawnRate;
    
}
