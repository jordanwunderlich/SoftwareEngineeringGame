/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import Model.Levels.Level;
import Model.Levels.Level1;

/**
 *
 * @author Jordan
 */
public class InGameModel extends Model {
    
    public InGameModel(){
        level = new Level1();
    }
    
    Level level;
    
}
