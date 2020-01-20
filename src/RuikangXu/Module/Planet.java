/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package RuikangXu.Module;

import java.util.ArrayList;

/**
 * The type Planet.
 */
public class Planet {
    private String color;
    private int serialNum;
    private String systemName;
    private ArrayList<Planet> availablePlanets;

    /**
     * Instantiates a new Planet.
     *
     * @param systemName the system num
     * @param serialNum  the serial num
     * @param color      the color
     */
    public Planet(String systemName, int serialNum, String color ) {
        this.color = color;
        this.serialNum = serialNum;
        this.systemName = systemName;
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
    public String getSystemName() {
        return systemName;
    }

    /**
     * Gets available planets.
     *
     * @return the available planets
     */
    public ArrayList<Planet> getAvailablePlanets() {
        return availablePlanets;
    }

    @Override
    public String toString() {
        return "Planet : " +
                this.getColor() +
                " " + this.getSystemName() +
                this.getSerialNum();
    }
}
