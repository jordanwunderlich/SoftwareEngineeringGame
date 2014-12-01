/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Levels.Level;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Jordan
 */
public class InGameView {

    public InGameView(Level level) {
        this.level = level;
        creepSprites = new ArrayList<>();
    }

    public ArrayList<CreepSprite> getActiveCreeps() {
        if (level.getCreeps().size() != creepSprites.size()) {
            creepSprites.add(new CreepSprite(level.getCreeps().get(level.getCreeps().size()-1)));
        }
        return creepSprites;
    }

    private ArrayList<CreepSprite> creepSprites;
    private Level level;

}
