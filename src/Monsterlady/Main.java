/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady;

import Monsterlady.Module.Planet;

/**
 * The type Main.
 */
public class Main {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
	// write your code here
        Application application = new Application();
        application.findPath();
        /*String s = "";
        for(Planet p :  application.getPlanetBySS("c1").getAvailablePlanets()){
           s += p.toString();
        }

        System.out.println(s);*/

    }
}
