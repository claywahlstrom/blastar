package me.dylanburton.blastarreborn.spaceships;

import android.graphics.Bitmap;
import android.graphics.Rect;

import java.util.LinkedList;
import java.util.List;

import me.dylanburton.blastarreborn.lasers.MainShipLaser;
import me.dylanburton.blastarreborn.lasers.ShipLaser;
import me.dylanburton.blastarreborn.spaceships.Ship;

/**
 * Created by Dylan on 7/16/2017.
 */

public class PlayerShip extends Ship{

    //main spaceships location and bound
    private Bitmap mainSpaceShip[];
    private float width;
    private float height;
    private int currentSpaceshipFrame=0; //frame of spaceship for animation
    private boolean spaceshipIsMoving;
    //timer for spawning new laser
    private long lastLaserSpawnTime = 0;
    private long spaceshipFrameSwitchTime = 0; //for spaceships fire animation
    private long shipHitForTingeTime = 0; //for red tinge on your spaceship
    private boolean playerHitButNotDead = false; //also for red tinge
    private long shipExplosionActivateTime = 0;
    private boolean endOfTheRoad = false; //makes sure the explosion is only played once

    Rect bounds = new Rect();//bounds for the PlayerShip


    public PlayerShip(Bitmap mainSpaceShip[], Bitmap mainSpaceShipLaser, float x, float y){
        this.mainSpaceShip = mainSpaceShip;

        if(mainSpaceShip.length > 0) {
            this.width = mainSpaceShip[0].getWidth();
            this.height = mainSpaceShip[0].getHeight();
        }else{
            //screw you
        }

        this.setX(x);
        this.setY(y);
    }


    public boolean hasCollision(float collx, float colly) {
        return getBounds().contains((int) collx, (int) colly);
    }

    public boolean hasCollision(Rect rect) {
        return getBounds().contains(rect);
    }

    public Rect getBounds() {
        bounds.set((int)(this.getX()), (int)(this.getY()),
                (int)(this.getX()+width), (int)(this.getY()+height));
        return bounds;
    }



    //getters and setters

    public int getCurrentSpaceshipFrame() {
        return currentSpaceshipFrame;
    }

    public void setCurrentSpaceshipFrame(int currentSpaceshipFrame) {
        this.currentSpaceshipFrame = currentSpaceshipFrame;
    }

    public boolean isSpaceshipMoving() {
        return spaceshipIsMoving;
    }

    public void setSpaceshipIsMoving(boolean spaceshipIsMoving) {
        this.spaceshipIsMoving = spaceshipIsMoving;
    }
    public long getLastLaserSpawnTime() {
        return lastLaserSpawnTime;
    }

    public void setLastLaserSpawnTime(long lastLaserSpawnTime) {
        this.lastLaserSpawnTime = lastLaserSpawnTime;
    }
    public long getSpaceshipFrameSwitchTime() {
        return spaceshipFrameSwitchTime;
    }

    public void setSpaceshipFrameSwitchTime(long spaceshipFrameSwitchTime) {
        this.spaceshipFrameSwitchTime = spaceshipFrameSwitchTime;
    }

    public long getShipHitForTingeTime() {
        return shipHitForTingeTime;
    }

    public void setShipHitForTingeTime(long shipHitForTinge) {
        this.shipHitForTingeTime = shipHitForTinge;
    }

    public boolean isPlayerHitButNotDead() {
        return playerHitButNotDead;
    }

    public void setPlayerHitButNotDead(boolean playerHitButNotDead) {
        this.playerHitButNotDead = playerHitButNotDead;
    }

    public long getShipExplosionActivateTime() {
        return shipExplosionActivateTime;
    }

    public void setShipExplosionActivateTime(long shipExplosionActivateTime) {
        this.shipExplosionActivateTime = shipExplosionActivateTime;
    }

    public boolean isEndOfTheRoad() {
        return endOfTheRoad;
    }

    public void setEndOfTheRoad(boolean endOfTheRoad) {
        this.endOfTheRoad = endOfTheRoad;
    }


}