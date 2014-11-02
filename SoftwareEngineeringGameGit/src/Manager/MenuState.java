/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.MainMenu;
import Controller.Menu;
import View.MenuDisplay;

/**
 *
 * @author Jordan
 */
public class MenuState extends State {
    
    public MenuState(){
        menu = new MainMenu();
        controller = menu;
        view = new MenuDisplay(menu);
    }
    
    private void displaylevelSelect(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void load(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    Menu menu;
    
}
