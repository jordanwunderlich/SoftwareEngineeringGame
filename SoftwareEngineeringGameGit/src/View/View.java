/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Controller.Controller;
import Model.Model;
import javax.swing.JFrame;

/**
 *
 * @author Jason
 */
public class View {
    
    public View(Controller controller, Model model){
        this.controller = controller;
        this.model = model;
        JFrame frame = new JFrame("Aliens");
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    Controller controller;
    Model model;
    
}
