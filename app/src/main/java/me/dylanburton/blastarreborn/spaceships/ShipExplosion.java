package me.dylanburton.blastarreborn.spaceships;

import me.dylanburton.blastarreborn.enemies.Enemy;

/**
 * Created by Dylan on 7/16/2017.
 */

//this is for creating multiple ship explosion animations
public class ShipExplosion{
    float x=0;
    float y=0;
    int currentFrame = 0;

    private Ship s;

    public ShipExplosion(float x, float y, Ship s){
        this.x = x;
        this.y = y;
        this.s = s;
    }

    public int getCurrentFrame(){
        return currentFrame;
    }

    public void nextFrame(){
        currentFrame++;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Ship getShip() {
        return s;
    }

    public void setShip(Enemy e) {
        this.s = s;
    }
}
