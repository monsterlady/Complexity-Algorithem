/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady.Module;

/**
 * The type Quantum travel.
 */
public class QuantumTravelRoute {
    private StarSystem fromSystem;
    private StarSystem toSystem;

    /**
     * Instantiates a new Quantum travel.
     *
     * @param fromSystem the from system
     * @param toSystem   the to system
     */
    public QuantumTravelRoute(StarSystem fromSystem, StarSystem toSystem) {
        this.fromSystem = fromSystem;
        this.toSystem = toSystem;
    }

    /**
     * Gets from system.
     *
     * @return the from system
     */
    public StarSystem getFromSystem() {
        return fromSystem;
    }

    /**
     * Gets to system.
     *
     * @return the to system
     */
    public StarSystem getToSystem() {
        return toSystem;
    }
}
