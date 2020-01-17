/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady;

import Monsterlady.Module.Planet;
import Monsterlady.Module.QuantumTravelRoute;
import Monsterlady.Module.StarRoute;

import java.util.ArrayList;

public class Map {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<StarRoute> starRoutes = new ArrayList<>();
    private ArrayList<QuantumTravelRoute> systemRoutes = new ArrayList<>();

    public Map() {
        initMap();
    }

    //Initializing planets
    private Planet a1 = new Planet("A", 1, "red");
    private Planet a2 = new Planet("A", 2, "blue");
    private Planet a3 = new Planet("A", 3, "yellow");
    private Planet a4 = new Planet("A", 4, "red");
    private Planet a5 = new Planet("A", 5, "red");
    private Planet a6 = new Planet("A", 6, "yellow");
    private Planet a7 = new Planet("A", 7, "red");
    private Planet a8 = new Planet("A", 8, "red");
    private Planet a9 = new Planet("A", 9, "yellow");
    private Planet b1 = new Planet("B", 1, "red");
    private Planet b2 = new Planet("B", 2, "red");
    private Planet b3 = new Planet("B", 3, "yellow");
    private Planet b4 = new Planet("B", 4, "yellow");
    private Planet b5 = new Planet("B", 5, "red");
    private Planet b6 = new Planet("B", 6, "red");
    private Planet b7 = new Planet("B", 7, "blue");
    private Planet b8 = new Planet("B", 8, "red");
    private Planet b9 = new Planet("B", 9, "green");
    private Planet c1 = new Planet("C", 1, "red");
    private Planet c2 = new Planet("C", 2, "red");
    private Planet c3 = new Planet("C", 3, "blue");
    private Planet c4 = new Planet("C", 4, "red");
    private Planet c5 = new Planet("C", 5, "green");
    private Planet c6 = new Planet("C", 6, "blue");
    private Planet c7 = new Planet("C", 7, "red");
    private Planet c8 = new Planet("C", 8, "green");
    private Planet c9 = new Planet("C", 9, "yellow");
    private Planet D1 = new Planet("D", 1, "blue");
    private Planet D2 = new Planet("D", 2, "blue");
    private Planet D3 = new Planet("D", 3, "blue");
    private Planet D4 = new Planet("D", 4, "blue");
    private Planet D5 = new Planet("D", 5, "blue");
    private Planet D6 = new Planet("D", 6, "blue");
    private Planet D7 = new Planet("D", 7, "red");
    private Planet D8 = new Planet("D", 8, "red");
    private Planet D9 = new Planet("D", 9, "yellow");
    private Planet E1 = new Planet("E", 1, "green");
    private Planet E2 = new Planet("E", 2, "green");
    private Planet E3 = new Planet("E", 3, "blue");
    private Planet E4 = new Planet("E", 4, "red");
    private Planet E5 = new Planet("E", 5, "yellow");
    private Planet E6 = new Planet("E", 6, "yellow");
    private Planet E7 = new Planet("E", 7, "green");
    private Planet E8 = new Planet("E", 8, "green");
    private Planet E9 = new Planet("E", 9, "yellow");
    private Planet F1 = new Planet("F", 1, "blue");
    private Planet F2 = new Planet("F", 2, "blue");
    private Planet F3 = new Planet("F", 3, "green");
    private Planet F4 = new Planet("F", 4, "red");
    private Planet F5 = new Planet("F", 5, "green");
    private Planet F6 = new Planet("F", 6, "green");
    private Planet F7 = new Planet("F", 7, "blue");
    private Planet F8 = new Planet("F", 8, "green");
    private Planet F9 = new Planet("F", 9, "green");
    private Planet G1 = new Planet("G", 1, "green");
    private Planet G2 = new Planet("G", 2, "green");
    private Planet G3 = new Planet("G", 3, "green");
    private Planet G4 = new Planet("G", 4, "green");
    private Planet G5 = new Planet("G", 5, "yellow");
    private Planet G6 = new Planet("G", 6, "green");
    private Planet G7 = new Planet("G", 7, "green");
    private Planet G8 = new Planet("G", 8, "yellow");
    private Planet G9 = new Planet("G", 9, "yellow");
    private Planet H1 = new Planet("H", 1, "yellow");
    private Planet H2 = new Planet("H", 2, "yellow");
    private Planet H3 = new Planet("H", 3, "yellow");
    private Planet H4 = new Planet("H", 4, "yellow");
    private Planet H5 = new Planet("H", 5, "green");
    private Planet H6 = new Planet("H", 6, "green");
    private Planet H7 = new Planet("H", 7, "yellow");
    private Planet H8 = new Planet("H", 8, "yellow");
    private Planet H9 = new Planet("H", 9, "blue");
    private Planet K1 = new Planet("K", 1, "yellow");
    private Planet K2 = new Planet("K", 2, "red");
    private Planet K3 = new Planet("K", 3, "yellow");
    private Planet K4 = new Planet("K", 4, "yellow");
    private Planet K5 = new Planet("K", 5, "green");
    private Planet k6 = new Planet("K", 6, "red");
    private Planet k7 = new Planet("K", 7, "yellow");
    private Planet k8 = new Planet("K", 8, "blue");
    private Planet k9 = new Planet("K", 9, "red");

    //Initializing routes between stars
    /*A system routes between planets*/
    private StarRoute A1A2 = new StarRoute(a1, a2);
    private StarRoute A1A4 = new StarRoute(a1, a4);
    private StarRoute A3A6 = new StarRoute(a3, a6);
    private StarRoute A6A9 = new StarRoute(a6, a9);
    private StarRoute A7A8 = new StarRoute(a7, a8);
    /*B system routes between planets*/
    private StarRoute B1B2 = new StarRoute(b1, b2);
    private StarRoute B5B6 = new StarRoute(b5, b6);
    /*C system routes between planets*/
    private StarRoute C1C2 = new StarRoute(c1, c2);
    private StarRoute C1C4 = new StarRoute(c1, c4);
    private StarRoute C2C3 = new StarRoute(c2, c3);
    private StarRoute C4C7 = new StarRoute(c4, c7);
    private StarRoute C5C6 = new StarRoute(c5, c6);
    private StarRoute C5C8 = new StarRoute(c5, c8);
    /*D system routes between planets*/
    private StarRoute D1D4 = new StarRoute(D1, D4);
    private StarRoute D2D3 = new StarRoute(D2, D3);
    /*E system routes between planets*/
    private StarRoute E1E4 = new StarRoute(E1, E4);
    private StarRoute E2E3 = new StarRoute(E2, E3);
    private StarRoute E5E6 = new StarRoute(E5, E6);
    private StarRoute E6E9 = new StarRoute(E6, E9);
    private StarRoute E7E8 = new StarRoute(E7, E8);
    /*F system routes between planets*/
    private StarRoute F1F2 = new StarRoute(F1, F2);
    private StarRoute F2F3 = new StarRoute(F2, F3);
    private StarRoute F3F6 = new StarRoute(F3, F6);
    private StarRoute F6F9 = new StarRoute(F6, F9);
    private StarRoute F7F8 = new StarRoute(F7, F8);
    /*G system routes between planets*/
    private StarRoute G2G3 = new StarRoute(G2, G3);
    private StarRoute G4G5 = new StarRoute(G4, G5);
    private StarRoute G8G9 = new StarRoute(G8, G9);
    /*H system routes between planets*/
    private StarRoute H1H2 = new StarRoute(H1, H2);
    private StarRoute H2H3 = new StarRoute(H2, H3);
    private StarRoute H4H7 = new StarRoute(H4, H7);
    private StarRoute H5H6 = new StarRoute(H5, H6);
    private StarRoute H8H9 = new StarRoute(H8, H9);
    /*K system routes between planets*/
    private StarRoute K1K4 = new StarRoute(K1, K4);
    private StarRoute K4K7 = new StarRoute(K4, k7);
    private StarRoute K7K8 = new StarRoute(k7, k8);
    private StarRoute K8K9 = new StarRoute(k8, k9);

    //Initializing System routes
    /*A system routes*/
    private QuantumTravelRoute ab = new QuantumTravelRoute("A","B");
    private QuantumTravelRoute ac = new QuantumTravelRoute("A","C");
    private QuantumTravelRoute ad = new QuantumTravelRoute("A","D");
    /*B system routes*/
    private QuantumTravelRoute ba = new QuantumTravelRoute("B","A");
    private QuantumTravelRoute bd = new QuantumTravelRoute("B","D");
    private QuantumTravelRoute bf = new QuantumTravelRoute("B","F");
    private QuantumTravelRoute bk = new QuantumTravelRoute("B","K");
    /*C system routes*/
    private QuantumTravelRoute ca = new QuantumTravelRoute("C","A");
    private QuantumTravelRoute cd = new QuantumTravelRoute("C","D");
    private QuantumTravelRoute ce = new QuantumTravelRoute("C","E");
    /*D system routes*/
    private QuantumTravelRoute da = new QuantumTravelRoute("D","A");
    private QuantumTravelRoute db = new QuantumTravelRoute("D","B");
    private QuantumTravelRoute dc = new QuantumTravelRoute("D","C");
    private QuantumTravelRoute df = new QuantumTravelRoute("D","F");
    /*E system routes*/
    private QuantumTravelRoute ec  = new QuantumTravelRoute("E","C");
    private QuantumTravelRoute ef  = new QuantumTravelRoute("E","F");
    private QuantumTravelRoute eg  = new QuantumTravelRoute("E","G");
    /*F system routes*/
    private QuantumTravelRoute fb = new QuantumTravelRoute("F","B");
    private QuantumTravelRoute fd = new QuantumTravelRoute("F","D");
    private QuantumTravelRoute fe = new QuantumTravelRoute("F","E");
    private QuantumTravelRoute fh = new QuantumTravelRoute("F","H");
    /*G system routes*/
    private QuantumTravelRoute ge = new QuantumTravelRoute("G","E");
    private QuantumTravelRoute gh = new QuantumTravelRoute("G","H");
    /*H system routes*/
    private QuantumTravelRoute hf = new QuantumTravelRoute("H","F");
    private QuantumTravelRoute hg = new QuantumTravelRoute("H","G");
    private QuantumTravelRoute hk = new QuantumTravelRoute("H","K");
    /*K system routes*/
    private QuantumTravelRoute kb = new QuantumTravelRoute("K","B");
    private QuantumTravelRoute kh = new QuantumTravelRoute("K","H");

    public void initMap(){
        //Reading planets...
        System.out.println("Reading planets...");
        planets.add(a1);
        planets.add(a2);
        planets.add(a3);
        planets.add(a4);
        planets.add(a5);
        planets.add(a6);
        planets.add(a7);
        planets.add(a8);
        planets.add(a9);
        planets.add(b1);
        planets.add(b2);
        planets.add(b3);
        planets.add(b4);
        planets.add(b5);
        planets.add(b6);
        planets.add(b7);
        planets.add(b8);
        planets.add(b9);
        planets.add(c1);
        planets.add(c2);
        planets.add(c3);
        planets.add(c4);
        planets.add(c5);
        planets.add(c6);
        planets.add(c7);
        planets.add(c8);
        planets.add(c9);
        planets.add(D1);
        planets.add(D2);
        planets.add(D3);
        planets.add(D4);
        planets.add(D5);
        planets.add(D6);
        planets.add(D7);
        planets.add(D8);
        planets.add(D9);
        planets.add(E1);
        planets.add(E2);
        planets.add(E3);
        planets.add(E4);
        planets.add(E5);
        planets.add(E6);
        planets.add(E7);
        planets.add(E8);
        planets.add(E9);
        planets.add(F1);
        planets.add(F2);
        planets.add(F3);
        planets.add(F4);
        planets.add(F5);
        planets.add(F6);
        planets.add(F7);
        planets.add(F8);
        planets.add(F9);
        planets.add(G1);
        planets.add(G2);
        planets.add(G3);
        planets.add(G4);
        planets.add(G5);
        planets.add(G6);
        planets.add(G7);
        planets.add(G8);
        planets.add(G9);
        planets.add(H1);
        planets.add(H2);
        planets.add(H3);
        planets.add(H4);
        planets.add(H5);
        planets.add(H6);
        planets.add(H7);
        planets.add(H8);
        planets.add(H9);
        planets.add(K1);
        planets.add(K2);
        planets.add(K3);
        planets.add(K4);
        planets.add(K5);
        planets.add(k6);
        planets.add(k7);
        planets.add(k8);
        planets.add(k9);
        //Reading routes between planets
        System.out.println("Reading routes between planets...");
        starRoutes.add(A1A2);
        starRoutes.add(A1A4);
        starRoutes.add(A3A6);
        starRoutes.add(A6A9);
        starRoutes.add(A7A8);
        starRoutes.add(B1B2);
        starRoutes.add(B5B6);
        starRoutes.add(C1C2);
        starRoutes.add(C1C4);
        starRoutes.add(C2C3);
        starRoutes.add(C4C7);
        starRoutes.add(C5C6);
        starRoutes.add(C5C8);
        starRoutes.add(D1D4);
        starRoutes.add(D2D3);
        starRoutes.add(E1E4);
        starRoutes.add(E2E3);
        starRoutes.add(E5E6);
        starRoutes.add(E6E9);
        starRoutes.add(E7E8);
        starRoutes.add(F1F2);
        starRoutes.add(F2F3);
        starRoutes.add(F3F6);
        starRoutes.add(F6F9);
        starRoutes.add(F7F8);
        starRoutes.add(G2G3);
        starRoutes.add(G4G5);
        starRoutes.add(G8G9);
        starRoutes.add(H1H2);
        starRoutes.add(H2H3);
        starRoutes.add(H4H7);
        starRoutes.add(H5H6);
        starRoutes.add(H8H9);
        starRoutes.add(K1K4);
        starRoutes.add(K4K7);
        starRoutes.add(K7K8);
        starRoutes.add(K8K9);
        //Reading System routes
        System.out.println("Reading System routes...");
        systemRoutes.add(ab);
        systemRoutes.add(ac);
        systemRoutes.add(ad);
        systemRoutes.add(ba);
        systemRoutes.add(bd);
        systemRoutes.add(bf);
        systemRoutes.add(bk);
        systemRoutes.add(ce);
        systemRoutes.add(ca);
        systemRoutes.add(cd);
        systemRoutes.add(da);
        systemRoutes.add(db);
        systemRoutes.add(dc);
        systemRoutes.add(df);
        systemRoutes.add(ec);
        systemRoutes.add(ef);
        systemRoutes.add(eg);
        systemRoutes.add(fe);
        systemRoutes.add(fb);
        systemRoutes.add(fd);
        systemRoutes.add(fh);
        systemRoutes.add(ge);
        systemRoutes.add(gh);
        systemRoutes.add(hf);
        systemRoutes.add(hg);
        systemRoutes.add(hk);
        systemRoutes.add(kb);
        systemRoutes.add(kh);
        //add neighbor to each planets
        System.out.println("Scanning neighbors of each planets");
        for(Planet eachPlanet : planets){
            //add routes in the same system
            for(StarRoute eachStarRoute : starRoutes){
                //add TO planet
                if(eachStarRoute.getFrom().equals(eachPlanet)){
                    eachPlanet.getAvailablePlanets().add(eachStarRoute.getTo());
                }
                //add FROM planet
                if(eachStarRoute.getTo().equals(eachPlanet)){
                    eachPlanet.getAvailablePlanets().add(eachStarRoute.getFrom());
                }
            }

            //add the same color and serialNum routes
            for(QuantumTravelRoute eachSystemRoute : systemRoutes){
                //check if the planet is on the quantum travel route
                if(eachSystemRoute.getFromSystem().equals(eachPlanet.getSystemNum())
                ){
                    for(Planet correspondingPlanet : planets){
                        //skip itself
                        if(correspondingPlanet.equals(eachPlanet)){
                            continue;
                        }
                        //if the corresponding planet is located in the to system
                        if(correspondingPlanet.getSystemNum().equals(eachSystemRoute.getToSystem())){
                            //if the color and serialNum is the same
                            if(correspondingPlanet.getSerialNum() == eachPlanet.getSerialNum() && eachPlanet.getColor().equals(correspondingPlanet.getColor())){
                                eachPlanet.getAvailablePlanets().add(correspondingPlanet);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Initializing process finished");
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public ArrayList<StarRoute> getStarRoutes() {
        return starRoutes;
    }

    public ArrayList<QuantumTravelRoute> getSystemRoutes() {
        return systemRoutes;
    }
}
