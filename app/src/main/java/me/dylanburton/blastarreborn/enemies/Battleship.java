package me.dylanburton.blastarreborn.enemies;

import android.graphics.Bitmap;

import java.util.List;

import me.dylanburton.blastarreborn.lasers.ShipLaser;

/**
 * Created by Dylan on 7/17/2017.
 * Edited by claywahlstrom
 *
 */

/*
 * Classes will be used to differentiate movement behavior/firing behavior by changing variables for each type of enemy. This will allow for special movements, and various other things
 */
public class Battleship extends Enemy {
    private List<ShipLaser> shipLasers; //the lasers for the ship
    private Bitmap laserBitmap;

    public Battleship(Bitmap shipBitmap, Bitmap laserBitmap){
        //calls main Enemy constructor
        super(shipBitmap, EnemyType.BATTLESHIP);
        this.laserBitmap = laserBitmap;

    }


    @Override
    public void spawnShipLasers(){

        //imperials in our game shoot straight...
        //addToShipLaserPositionsList(new DiagonalLaser(1, laserBitmap));
        addToShipLaserPositionsList(new ShipLaser(laserBitmap));
        //addToShipLaserPositionsList(new DiagonalLaser(-1, laserBitmap));

        this.shipLasers = getShipLaserPositionsList();

        //positions of lasers relative to ship
        //shipLasers.get(shipLasers.size()-3).setPosition(getX()+getBitmap().getWidth()*3/5, getY()+getBitmap().getHeight()/2);
        shipLasers.get(0).setPosition(getX()+getBitmap().getWidth()/3, getY()+getBitmap().getHeight()*3/4);
        //shipLasers.get(shipLasers.size()-1).setPosition(getX()+getBitmap().getWidth()/6, getY()+getBitmap().getHeight()/2);

    }



}
