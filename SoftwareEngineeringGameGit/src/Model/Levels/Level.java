/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Levels;

import Model.GridSquare;
import Model.Creeps.Creep;
import Model.Map;
import Model.Projectile;
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
                creeps.add(waves.get(currentWave).getCreep(currentCreep));
                creeps.get(currentCreep).xloc = path.get(0).getX() * 32;
                creeps.get(currentCreep).yloc = path.get(0).getY() * 32;
                creeps.get(currentCreep).squareNum = 2;
                creeps.get(currentCreep).nextSquare = path.get(1);
                currentCreep++;
            }
            numUpdated = 0;
        }
        if (numUpdated / 30 == Math.round(numUpdated / 30)) {
            moveCreeps();
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
