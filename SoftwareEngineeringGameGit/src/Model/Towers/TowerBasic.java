/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Towers;

/**
 *
 * @author Jason
 */
public class TowerBasic extends Tower {

    public TowerBasic() {
        rechargeTime = 180;
        timeLeft = 0;
        damage = 3;
        cost = 100;
        rof = 1;
        range = 5;
    }
}
