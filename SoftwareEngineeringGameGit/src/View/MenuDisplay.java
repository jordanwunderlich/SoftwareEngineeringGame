/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Menu;

/**
 *
 * @author Jan-Michael Angeles
 */
public class MenuDisplay extends View {

    public MenuDisplay(Menu menu) {
        super(menu, null);
        this.menu = menu;
    }

    private void displayButtons() {
        for(int i = 0; i < menu.getButtons().length; i++){
            
        }
    }
    
    private Menu menu;

    // creates visuals for the menu screens:
    // main menu
    // pause menu
    // level select
}
