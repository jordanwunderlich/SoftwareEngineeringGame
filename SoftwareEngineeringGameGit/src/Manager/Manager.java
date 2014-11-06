/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

/**
 *
 * @author Jordan
 */
public class Manager {
    
    public static void main(String[] args) {
        //displaySplash();
        state = new MenuState();
    }
    
    private void displaySplash(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void setState(State state) {
        Manager.state = state;
    }
    
    private static State state;
    
}
