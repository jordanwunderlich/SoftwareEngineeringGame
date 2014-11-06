/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Controller.InGameController;
import Model.InGameModel;
import View.InGameView;

/**
 *
 * @author Jordan
 */
public class InGameState extends State{
    
    public InGameState(){
        controller = new InGameController();
        model = new InGameModel();
        view = new InGameView(controller, model);
    }
    
}
