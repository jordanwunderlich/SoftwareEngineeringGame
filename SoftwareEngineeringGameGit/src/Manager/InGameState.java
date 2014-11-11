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
public class InGameState extends State {

    public InGameState() {
        controller = new InGameController();
        model = new InGameModel();
        //view = new InGameView(controller, model);
    }

    private void animate() {
        
        while (animating) {
            long now = System.nanoTime();
            double nsPerTick = 1000000000.0 / 60.0;

            int ticks = 0;
            int frames = 0;

            long lastTimer = System.currentTimeMillis();
            double delta = 0;

            delta += (now - lastTime) / nsPerTick;
            lastTime = now;
            boolean shouldRender = false;

            while (delta >= 1) {
                ticks++;
                tick();
                delta--;
                shouldRender = true;
            }

            if (shouldRender = true) {
                frames++;
                render();
            }

            if (System.currentTimeMillis() - lastTimer >= 1000) {
                lastTimer += 1000;
                System.out.println(ticks + "ticks," + frames + "frames");
                frames = 0;
                ticks = 0;
            }
        }
    }

    public void tick() {

    }

    public void render() {

    }

    private boolean animating = false;
    private long lastTime;

}
