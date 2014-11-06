/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.MainMenu;
import Controller.Menu;
import View.MenuDisplay;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jordan
 */
public class MenuState extends State {
    
    public MenuState(){
        menu = new MainMenu();
        controller = menu;
        try {
            view = new MenuDisplay(menu);
        } catch (Exception ex) {
            Logger.getLogger(MenuState.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void displaylevelSelect(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void load(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Menu menu;
    
}
