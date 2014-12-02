/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.Creeps.Creep;
import Model.Creeps.CreepBasic;
import Model.Creeps.CreepBossFast;
import Model.Creeps.CreepBossGroup;
import Model.Creeps.CreepBossMulti;
import Model.Creeps.CreepBossSlow;
import Model.Creeps.CreepFast;
import Model.Creeps.CreepFly;
import Model.Creeps.CreepMulti;
import Model.Creeps.CreepSlow;
import Model.Creeps.CreepSpeed;
import java.util.ArrayList;

/**
 *
 * @author Jordan
 */
public class Wave {
    
    public Wave(){
        
    }
    
    public void addCreeps(String string, int number){
        for(int i = 0; i < number; i++){
            if(string.equals("basic")){
                creepList.add(new CreepBasic());
            } else if(string.equals("fast")){
                creepList.add(new CreepFast());
            }else if (string.equals("slow")){
                creepList.add(new CreepSlow());
            }else if (string.equals("fly")){
                creepList.add(new CreepFly());
            }else if (string.equals("multi")){
                creepList.add(new CreepMulti());
            }else if (string.equals("speed")){
                creepList.add(new CreepSpeed());
            }else if (string.equals("bossfast")){
                creepList.add(new CreepBossFast());
            }else if (string.equals("bossslow")){
                creepList.add(new CreepBossSlow());
            }else if (string.equals("bossgroup")){
                creepList.add(new CreepBossGroup());
            }else if (string.equals("bossmulti")){
                creepList.add(new CreepBossMulti());
            }
        }
    }
    
    public Creep getCreep(int i){
        return creepList.get(i);
    }
    
    public int getSize(){
        return creepList.size();
    }
    
    private ArrayList<Creep> creepList = new ArrayList<>();
    int spawnRate;
    
}
