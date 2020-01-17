/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady.Module;

import java.util.ArrayList;

/**
 * The type Planet.
 */
public class Planet {
    private String color;
    private int serialNum;
    private String systemNum;
    private ArrayList<Planet> availablePlanets;
    /**
     * Instantiates a new Planet.
     *
     * @param color     the color
     * @param serialNum the serial num
     * @param systemNum the system num
     */
    public Planet(String systemNum,int serialNum,String color ) {
        this.color = color;
        this.serialNum = serialNum;
        this.systemNum = systemNum;
        this.availablePlanets = new ArrayList<>();
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets serial num.
     *
     * @return the serial num
     */
    public int getSerialNum() {
        return serialNum;
    }

    /**
     * Gets system num.
     *
     * @return the system num
     */
    public String getSystemNum() {
        return systemNum;
    }

    public ArrayList<Planet> getAvailablePlanets() {
        return availablePlanets;
    }

    @Override
    public String toString() {
        return "Planet : " +
                this.getColor() +
                " " + this.getSystemNum() +
                this.getSerialNum();
    }
}
