/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Creeps.Creep;

/**
 *
 * @author Student
 */
public class CreepSprite {
    
    public CreepSprite(Creep creep){
        this.creep=creep;
    }
    
    private Creep creep;
    private Sprite sprite;
}