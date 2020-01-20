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
 * The type Star system.
 */
public class StarSystem {
    private Planet one,two,three,four,five,six,seven,eight,nine;
    private ArrayList<StarRoute> innerRoutes;
    private ArrayList<QuantumTravelRoute> systemRoutes;
    private ArrayList<Planet> planets;

    /**
     * Instantiates a new Star system.
     *
     * @param one   the one
     * @param two   the two
     * @param three the three
     * @param four  the four
     * @param five  the five
     * @param six   the six
     * @param seven the seven
     * @param eight the eight
     * @param nine  the nine
     */
    public StarSystem(Planet one, Planet two, Planet three, Planet four, Planet five, Planet six, Planet seven, Planet eight, Planet nine) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
        this.six = six;
        this.seven = seven;
        this.eight = eight;
        this.nine = nine;
        this.innerRoutes = new ArrayList<>();
        this.systemRoutes = new ArrayList<>();
        this.planets = new ArrayList<>();
        this.planets.add(one);
        this.planets.add(two);
        this.planets.add(three);
        this.planets.add(four);
        this.planets.add(five);
        this.planets.add(six);
        this.planets.add(seven);
        this.planets.add(eight);
        this.planets.add(nine);
    }

    /**
     * Gets planets.
     *
     * @return the planets
     */
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    /**
     * Gets system routes.
     *
     * @return the system routes
     */
    public ArrayList<QuantumTravelRoute> getSystemRoutes() {
        return systemRoutes;
    }

    /**
     * Sets one.
     *
     * @param one the one
     */
    public void setOne(Planet one) {
        this.one = one;
    }

    /**
     * Sets two.
     *
     * @param two the two
     */
    public void setTwo(Planet two) {
        this.two = two;
    }

    /**
     * Sets three.
     *
     * @param three the three
     */
    public void setThree(Planet three) {
        this.three = three;
    }

    /**
     * Sets four.
     *
     * @param four the four
     */
    public void setFour(Planet four) {
        this.four = four;
    }

    /**
     * Sets five.
     *
     * @param five the five
     */
    public void setFive(Planet five) {
        this.five = five;
    }

    /**
     * Sets six.
     *
     * @param six the six
     */
    public void setSix(Planet six) {
        this.six = six;
    }

    /**
     * Sets seven.
     *
     * @param seven the seven
     */
    public void setSeven(Planet seven) {
        this.seven = seven;
    }

    /**
     * Sets eight.
     *
     * @param eight the eight
     */
    public void setEight(Planet eight) {
        this.eight = eight;
    }

    /**
     * Sets nine.
     *
     * @param nine the nine
     */
    public void setNine(Planet nine) {
        this.nine = nine;
    }


    /**
     * Gets one.
     *
     * @return the one
     */
    public Planet getOne() {
        return one;
    }

    /**
     * Gets two.
     *
     * @return the two
     */
    public Planet getTwo() {
        return two;
    }

    /**
     * Gets three.
     *
     * @return the three
     */
    public Planet getThree() {
        return three;
    }

    /**
     * Gets four.
     *
     * @return the four
     */
    public Planet getFour() {
        return four;
    }

    /**
     * Gets five.
     *
     * @return the five
     */
    public Planet getFive() {
        return five;
    }

    /**
     * Gets six.
     *
     * @return the six
     */
    public Planet getSix() {
        return six;
    }

    /**
     * Gets seven.
     *
     * @return the seven
     */
    public Planet getSeven() {
        return seven;
    }

    /**
     * Gets eight.
     *
     * @return the eight
     */
    public Planet getEight() {
        return eight;
    }

    /**
     * Gets nine.
     *
     * @return the nine
     */
    public Planet getNine() {
        return nine;
    }

    /**
     * Gets inner routes.
     *
     * @return the inner routes
     */
    public ArrayList<StarRoute> getInnerRoutes() {
        return innerRoutes;
    }

    @Override
    public String toString() {
        return  "1 ： " + one.toString() + "\n"+
                "2 ： " + two.toString() + "\n"+
                "3 ： " + three.toString() + "\n"+
                "4 ： " + four.toString() + "\n"+
                "5 ： " + five.toString() + "\n"+
                "6 ： " + six.toString() + "\n"+
                "7 ： " + seven.toString()+ "\n"+
                "8 ： " + eight.toString()+ "\n"+
                "9 ： " + nine.toString() + "\n";
    }
}
