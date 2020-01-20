/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady.Module;

import java.util.ArrayList;

public class StarSystem {
    private Planet one,two,three,four,five,six,seven,eight,nine;
    private ArrayList<StarRoute> innerRoutes;
    private ArrayList<QuantumTravelRoute> systemRoutes;
    private ArrayList<Planet> planets;

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

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public ArrayList<QuantumTravelRoute> getSystemRoutes() {
        return systemRoutes;
    }

    public void setOne(Planet one) {
        this.one = one;
    }

    public void setTwo(Planet two) {
        this.two = two;
    }

    public void setThree(Planet three) {
        this.three = three;
    }

    public void setFour(Planet four) {
        this.four = four;
    }

    public void setFive(Planet five) {
        this.five = five;
    }

    public void setSix(Planet six) {
        this.six = six;
    }

    public void setSeven(Planet seven) {
        this.seven = seven;
    }

    public void setEight(Planet eight) {
        this.eight = eight;
    }

    public void setNine(Planet nine) {
        this.nine = nine;
    }


    public Planet getOne() {
        return one;
    }

    public Planet getTwo() {
        return two;
    }

    public Planet getThree() {
        return three;
    }

    public Planet getFour() {
        return four;
    }

    public Planet getFive() {
        return five;
    }

    public Planet getSix() {
        return six;
    }

    public Planet getSeven() {
        return seven;
    }

    public Planet getEight() {
        return eight;
    }

    public Planet getNine() {
        return nine;
    }

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
