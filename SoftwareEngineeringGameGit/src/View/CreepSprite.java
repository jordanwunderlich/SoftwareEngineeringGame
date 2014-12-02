/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JComponent;

/**
 *
 * @author Student
 */
public class CreepSprite extends JComponent{
    
    public CreepSprite(Creep creep){
        this.creep=creep;
        setSize(new Dimension(32, 32));
        if(creep instanceof CreepBasic){
            try {
                sprite = ImageIO.read(new File("basiccreep-v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepFast){
            try {
                sprite = ImageIO.read(new File("creep speed v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepSlow){
            try {
                sprite = ImageIO.read(new File("creep slow v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepFly){
            try {
                sprite = ImageIO.read(new File("ignorepathceep1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepMulti){
            try {
                sprite = ImageIO.read(new File("splitcreepfull1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepSpeed){
            try {
                sprite = ImageIO.read(new File("speedfromslowcreep1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepBossFast){
            try {
                sprite = ImageIO.read(new File("boss 1v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepBossGroup){
            try {
                sprite = ImageIO.read(new File("boss 4v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepBossSlow){
            try {
                sprite = ImageIO.read(new File("boss 3v1.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (creep instanceof CreepBossMulti){
            try {
                sprite = ImageIO.read(new File("splitboss.png"));
            } catch (IOException ex) {
                Logger.getLogger(CreepSprite.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(sprite, creep.xloc, creep.yloc, null);
    }
    
    private Creep creep;
    private BufferedImage sprite;
}
