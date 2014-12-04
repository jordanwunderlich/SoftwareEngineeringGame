/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Creeps.Creep;
import Model.Levels.Level;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Jordan
 */
public class InGameView {

    public InGameView(Level level) {
        this.level = level;
        creepSprites = new ArrayList<>();
        goldLabel = new JLabel("" + level.getGold());
        goldLabel.setBounds(100, 100, 100, 100);
    }

    public ArrayList<CreepSprite> getActiveCreeps() {
        if (level.getCreeps().size() != creepSprites.size()) {
            for (int i = 0; i < creepSprites.size(); i++) {
                creepSprites.remove(i);
            }
            for (int i = 0; i < level.getCreeps().size(); i++) {
                creepSprites.add(new CreepSprite(level.getCreeps().get(i)));
            }
        }
        return creepSprites;
    }

    public ArrayList<BangView> getBangs() {
        ArrayList<BangView> bangs = new ArrayList<>();
        for (int a = 0; a < creepSprites.size(); a++) {
            CreepSprite creep = creepSprites.get(a);
            if (creep.creep.isHurt) {
                creep.banged = true;
            } else {
                creep.banged = false;
            }
            if (creep.banged == true) {
                bangs.add(creep.bang);
            }
        }
        return bangs;
    }

    public JLabel getGold() {
        goldLabel.setText("" + level.getGold());
        return goldLabel;
    }

    private ArrayList<CreepSprite> creepSprites;
    private Level level;
    private JLabel goldLabel;

}
