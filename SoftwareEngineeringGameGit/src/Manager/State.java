/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.Controller;
import Model.Model;
import View.View;

/**
 *
 * @author Jordan
 */
public abstract class State {
    
    public State(){
        
    }
    
    private void displayExitMenu(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void exitGame(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public Controller getController() {
        return controller;
    }
    
    Controller controller;
    Model model;
    View view;

}
