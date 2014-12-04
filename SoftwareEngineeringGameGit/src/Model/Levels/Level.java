/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.GridSquare;
import Model.Creeps.Creep;
import Model.Projectile;
import Model.Towers.Tower;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Jordan
 */
public class Level {

    public Level() {
        for (int rows = 0; rows < 25; rows++) {
            for (int cols = 0; cols < 18; cols++) {
                grid[rows][cols] = new GridSquare();
            }
        }
        currentWave = 0;
        currentCreep = 0;
    }

    public void update() {
        numUpdated++;
        if (Math.round(numUpdated - 120) == 0) {
            if (waves.get(currentWave).getSize() == currentCreep) {
                waveIsOver = true;
            }
            if (!waveIsOver) {
                Creep tempCreep = waves.get(currentWave).getCreep(currentCreep);
                creeps.add(tempCreep);
                tempCreep.xloc = path.get(0).getX() * 32;
                tempCreep.yloc = path.get(0).getY() * 32;
                tempCreep.squareNum = 2;
                tempCreep.nextSquare = path.get(1);
                currentCreep++;
            }
            numUpdated = 0;
        }
        if (numUpdated / 30 == Math.round(numUpdated / 30)) {
            moveCreeps();
        }
        shootCreeps();
        for(int a = 0; a < creeps.size(); a++) {
            if(creeps.get(a).isHurt){
                creeps.get(a).hurtTimer--;
                if(creeps.get(a).hurtTimer == 0){
                    creeps.get(a).isHurt = false;
                }
            }
        }
    }
    
    private void shootCreeps(){
        for (int rows = 0; rows < 25; rows++) {
            for (int cols = 0; cols < 18; cols++) {
                if (grid[rows][cols].getTower() != null) {
                    Tower tower = grid[rows][cols].getTower();
                    if (tower.timeLeft != 0) {
                        tower.timeLeft--;
                    }
                    int range = tower.getRange();
                    for (int a = 0; a < creeps.size(); a++) {
                        if (tower.timeLeft == 0) {
                            if (Math.abs(creeps.get(a).xloc - grid[rows][cols].xloc) + Math.abs(creeps.get(a).yloc - grid[rows][cols].yloc) < range * 32) {
                                tower.timeLeft = tower.rechargeTime;
                                creeps.get(a).setHealth(creeps.get(a).getHealth()-tower.getDamage());
                                creeps.get(a).isHurt = true;
                                creeps.get(a).hurtTimer = 10;
                                if(creeps.get(a).getHealth() < 0){
                                    creeps.remove(a);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void moveCreeps() {
        for (int i = 0; i < creeps.size(); i++) {
            if (creeps.get(i).xloc != creeps.get(i).nextSquare.getX() * 32) {
                if (creeps.get(i).xloc > creeps.get(i).nextSquare.getX() * 32) {
                    creeps.get(i).xloc--;
                } else {
                    creeps.get(i).xloc++;
                }
            } else if (creeps.get(i).yloc != creeps.get(i).nextSquare.getY() * 32) {
                if (creeps.get(i).yloc > creeps.get(i).nextSquare.getY() * 32) {
                    creeps.get(i).yloc--;
                } else {
                    creeps.get(i).yloc++;
                }
            } else if(creeps.get(i).squareNum == path.size()){
                gold = gold - creeps.get(i).getPlunder();
                creeps.remove(i);
            } else {
                creeps.get(i).nextSquare = path.get(creeps.get(i).squareNum++);
            }
        }
    }

    private void moveProjectiles() {
        //move all the projectiles in the projectile array
        //check to see if any projectiles are over creeps, if so, call damageCreep
    }

    private void damageCreep(Creep creep, Projectile projectile) {
        creep.setHealth(creep.getHealth() - projectile.getDamage());
        if (creep.getHealth() < 0) {
            scrapPool = scrapPool + creep.getScrap();
            creeps.remove(creep);
        }
    }

    public ArrayList<Creep> getCreeps() {
        return creeps;
    }

    public int getScrapPool() {
        return scrapPool;
    }

    public int getGold() {
        return gold;
    }

    public GridSquare[][] getGrid() {
        return grid;
    }

    public ArrayList<Wave> getWaves() {
        return waves;
    }

    public LinkedList<GridCoordinates> getPath() {
        return path;
    }

    public GridCoordinates getCastle() {
        return castle;
    }

    public GridCoordinates getStartPath() {
        return startPath;
    }

    protected ArrayList<Creep> creeps = new ArrayList<>();
    protected int scrapPool;
    protected int gold;
    protected GridSquare[][] grid = new GridSquare[25][18];
    private int numUpdated = 0;
    private int currentWave;
    private int currentCreep;
    private boolean waveIsOver = false;

    protected ArrayList<Wave> waves = new ArrayList<>();
    protected LinkedList<GridCoordinates> path = new LinkedList<>();
    protected GridCoordinates castle;
    protected GridCoordinates startPath;

}
