/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.Levels.Level;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class InGameView extends JPanel {
    
    public InGameView(Level level){
        this.level = level;
    }
    
    
    
    private Level level;
    
}
