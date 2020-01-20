/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package RuikangXu.Module;

/**
 * The type Route.
 */
public class StarRoute {
    private Planet from;
    private Planet to;

    /**
     * Instantiates a new Route.
     *
     * @param from the from
     * @param to   the to
     */
    public StarRoute(Planet from, Planet to) {
        this.from = from;
        this.to = to;
    }

    /**
     * Gets from.
     *
     * @return the from
     */
    public Planet getFrom() {
        return from;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public Planet getTo() {
        return to;
    }
}
