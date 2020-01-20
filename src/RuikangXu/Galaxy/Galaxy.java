/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package RuikangXu.Galaxy;

import RuikangXu.Module.Planet;
import RuikangXu.Module.QuantumTravelRoute;
import RuikangXu.Module.StarRoute;
import RuikangXu.Module.StarSystem;

import java.util.ArrayList;

/**
 * The type Galaxy.
 */
public class Galaxy {
    private ArrayList<Planet> planets = new ArrayList<>();
    private ArrayList<StarSystem> starSystems = new ArrayList<>();

    /**
     * Instantiates a new Galaxy.
     */
    public Galaxy() {
        initMap();
    }

    private void initMap(){
        System.out.println("Scanning the Galaxy...");
        /*Get all the systems here*/
        StarSystem systemA = systemA();
        StarSystem systemB = systemB();
        StarSystem systemC = systemC();
        StarSystem systemD = systemD();
        StarSystem systemE = systemE();
        StarSystem systemF = systemF();
        StarSystem systemG = systemG();
        StarSystem systemH = systemH();
        StarSystem systemK = systemK();
        System.out.println("Scanned all the Systems of this Galaxy. ");
        //Initializing System routes
        System.out.println("Scanning the worm holes...");
        /*A system routes*/
        QuantumTravelRoute ab = new QuantumTravelRoute(systemA,systemB);
        QuantumTravelRoute ac = new QuantumTravelRoute(systemA,systemC);
        QuantumTravelRoute ad = new QuantumTravelRoute(systemA,systemD);
        systemA.getSystemRoutes().add(ad);
        systemA.getSystemRoutes().add(ac);
        systemA.getSystemRoutes().add(ab);
        /*B system routes*/
        QuantumTravelRoute ba = new QuantumTravelRoute(systemB,systemA);
        QuantumTravelRoute bd = new QuantumTravelRoute(systemB,systemD);
        QuantumTravelRoute bf = new QuantumTravelRoute(systemB,systemF);
        QuantumTravelRoute bk = new QuantumTravelRoute(systemB,systemK);
        systemB.getSystemRoutes().add(ba);
        systemB.getSystemRoutes().add(bd);
        systemB.getSystemRoutes().add(bf);
        systemB.getSystemRoutes().add(bk);
        /*C system routes*/
        QuantumTravelRoute ca = new QuantumTravelRoute(systemC,systemA);
        QuantumTravelRoute cd = new QuantumTravelRoute(systemC,systemD);
        QuantumTravelRoute ce = new QuantumTravelRoute(systemC,systemE);
        systemC.getSystemRoutes().add(ca);
        systemC.getSystemRoutes().add(cd);
        systemC.getSystemRoutes().add(ce);
        /*D system routes*/
        QuantumTravelRoute da = new QuantumTravelRoute(systemD,systemA);
        QuantumTravelRoute db = new QuantumTravelRoute(systemD,systemB);
        QuantumTravelRoute dc = new QuantumTravelRoute(systemD,systemC);
        QuantumTravelRoute df = new QuantumTravelRoute(systemD,systemF);
        systemD.getSystemRoutes().add(da);
        systemD.getSystemRoutes().add(db);
        systemD.getSystemRoutes().add(dc);
        systemD.getSystemRoutes().add(df);
        /*E system routes*/
        QuantumTravelRoute ec  = new QuantumTravelRoute(systemE,systemC);
        QuantumTravelRoute ef  = new QuantumTravelRoute(systemE,systemF);
        QuantumTravelRoute eg  = new QuantumTravelRoute(systemE,systemG);
        systemE.getSystemRoutes().add(ec);
        systemE.getSystemRoutes().add(ef);
        systemE.getSystemRoutes().add(eg);
        /*F system routes*/
        QuantumTravelRoute fb = new QuantumTravelRoute(systemF,systemB);
        QuantumTravelRoute fd = new QuantumTravelRoute(systemF,systemD);
        QuantumTravelRoute fe = new QuantumTravelRoute(systemF,systemE);
        QuantumTravelRoute fh = new QuantumTravelRoute(systemF,systemH);
        systemF.getSystemRoutes().add(fb);
        systemF.getSystemRoutes().add(fd);
        systemF.getSystemRoutes().add(fe);
        systemF.getSystemRoutes().add(fh);
        /*G system routes*/
        QuantumTravelRoute ge = new QuantumTravelRoute(systemG,systemE);
        QuantumTravelRoute gh = new QuantumTravelRoute(systemG,systemH);
        systemG.getSystemRoutes().add(gh);
        systemG.getSystemRoutes().add(ge);
        /*H system routes*/
        QuantumTravelRoute hf = new QuantumTravelRoute(systemH,systemK);
        QuantumTravelRoute hg = new QuantumTravelRoute(systemH,systemG);
        QuantumTravelRoute hk = new QuantumTravelRoute(systemH,systemF);
        systemH.getSystemRoutes().add(hk);
        systemH.getSystemRoutes().add(hg);
        systemH.getSystemRoutes().add(hf);
        /*K system routes*/
        QuantumTravelRoute kb = new QuantumTravelRoute(systemK,systemB);
        QuantumTravelRoute kh = new QuantumTravelRoute(systemK,systemH);
        systemK.getSystemRoutes().add(kb);
        systemK.getSystemRoutes().add(kh);
        /*Add all initialized systems to list*/
        starSystems.add(systemA);
        starSystems.add(systemB);
        starSystems.add(systemC);
        starSystems.add(systemD);
        starSystems.add(systemE);
        starSystems.add(systemF);
        starSystems.add(systemG);
        starSystems.add(systemH);
        starSystems.add(systemK);
        System.out.println("Quantum travel routes initialized. ");
        //add the neighbour to each planet
        System.out.println("Calculating the available routes for all exists planets...");
        for(StarSystem eachSystem : starSystems){
            //Add neighbour from regular route inner the system
            for(Planet eachPlanet : eachSystem.getPlanets()){
                planets.add(eachPlanet);
                for(StarRoute eachRoute : eachSystem.getInnerRoutes()){

                    if(eachPlanet.equals(eachRoute.getFrom())){
                        eachPlanet.getAvailablePlanets().add(eachRoute.getTo());
                    }
                    if(eachPlanet.equals(eachRoute.getTo())){
                        eachPlanet.getAvailablePlanets().add(eachRoute.getFrom());
                    }
                }
            }

            //Add neighbour from quantum travel route
            for(QuantumTravelRoute eachTravelRoute : eachSystem.getSystemRoutes()){
                for(Planet correspondingStar : eachTravelRoute.getToSystem().getPlanets()){
                    for(Planet thisSystemPlanet : eachSystem.getPlanets()){
                        if((thisSystemPlanet.getSerialNum() == correspondingStar.getSerialNum())
                                && (thisSystemPlanet.getColor().equals(correspondingStar.getColor()))
                                && (!thisSystemPlanet.getSystemName().equals(correspondingStar.getSystemName()))){
                            thisSystemPlanet.getAvailablePlanets().add(correspondingStar);
                        }
                    }
                }
            }
        }
        System.out.println("System is ready to use !");
    }

    private StarSystem systemA(){
        System.out.println("Scanning System A ...");
        /*Initialize System A*/
        Planet a1 = new Planet("A", 1, "red");
        Planet a2 = new Planet("A", 2, "blue");
        Planet a3 = new Planet("A", 3, "yellow");
        Planet a4 = new Planet("A", 4, "red");
        Planet a5 = new Planet("A", 5, "red");
        Planet a6 = new Planet("A", 6, "yellow");
        Planet a7 = new Planet("A", 7, "red");
        Planet a8 = new Planet("A", 8, "red");
        Planet a9 = new Planet("A", 9, "yellow");
        StarRoute A1A2 = new StarRoute(a1, a2);
        StarRoute A1A4 = new StarRoute(a1, a4);
        StarRoute A3A6 = new StarRoute(a3, a6);
        StarRoute A6A9 = new StarRoute(a6, a9);
        StarRoute A7A8 = new StarRoute(a7, a8);
        StarSystem systemA = new StarSystem(a1,a2,a3,a4,a5,a6,a7,a8,a9);
        systemA.getInnerRoutes().add(A1A2);
        systemA.getInnerRoutes().add(A1A4);
        systemA.getInnerRoutes().add(A3A6);
        systemA.getInnerRoutes().add(A6A9);
        systemA.getInnerRoutes().add(A7A8);
        System.out.println("System A initialized");
        return systemA;
    };

    private StarSystem systemB(){
        System.out.println("Scanning System B ...");
        /*Initialize System B*/
        Planet b1 = new Planet("B", 1, "red");
        Planet b2 = new Planet("B", 2, "red");
        Planet b3 = new Planet("B", 3, "yellow");
        Planet b4 = new Planet("B", 4, "yellow");
        Planet b5 = new Planet("B", 5, "red");
        Planet b6 = new Planet("B", 6, "red");
        Planet b7 = new Planet("B", 7, "blue");
        Planet b8 = new Planet("B", 8, "red");
        Planet b9 = new Planet("B", 9, "green");
        StarRoute B1B2 = new StarRoute(b1, b2);
        StarRoute B5B6 = new StarRoute(b5, b6);
        StarSystem systemB = new StarSystem(b1,b2,b3,b4,b5,b6,b7,b8,b9);
        systemB.getInnerRoutes().add(B1B2);
        systemB.getInnerRoutes().add(B5B6);
        System.out.println("System B initialized");
        return systemB;
    };

    private StarSystem systemC(){
        System.out.println("Scanning System C ...");
        /*Initialize System C*/
        Planet c1 = new Planet("C", 1, "red");
        Planet c2 = new Planet("C", 2, "red");
        Planet c3 = new Planet("C", 3, "blue");
        Planet c4 = new Planet("C", 4, "red");
        Planet c5 = new Planet("C", 5, "green");
        Planet c6 = new Planet("C", 6, "blue");
        Planet c7 = new Planet("C", 7, "red");
        Planet c8 = new Planet("C", 8, "green");
        Planet c9 = new Planet("C", 9, "yellow");
        StarRoute C1C2 = new StarRoute(c1, c2);
        StarRoute C1C4 = new StarRoute(c1, c4);
        StarRoute C2C3 = new StarRoute(c2, c3);
        StarRoute C4C7 = new StarRoute(c4, c7);
        StarRoute C5C6 = new StarRoute(c5, c6);
        StarRoute C5C8 = new StarRoute(c5, c8);
        StarSystem systemC = new StarSystem(c1,c2,c3,c4,c5,c6,c7,c8,c9);
        systemC.getInnerRoutes().add(C1C2);
        systemC.getInnerRoutes().add(C1C4);
        systemC.getInnerRoutes().add(C2C3);
        systemC.getInnerRoutes().add(C4C7);
        systemC.getInnerRoutes().add(C5C6);
        systemC.getInnerRoutes().add(C5C8);
        System.out.println("System C initialized");
        return systemC;
    };

    private StarSystem systemD(){
        System.out.println("Scanning System D ...");
        /*Initialize System D*/
        Planet D1 = new Planet("D", 1, "blue");
        Planet D2 = new Planet("D", 2, "blue");
        Planet D3 = new Planet("D", 3, "blue");
        Planet D4 = new Planet("D", 4, "blue");
        Planet D5 = new Planet("D", 5, "blue");
        Planet D6 = new Planet("D", 6, "blue");
        Planet D7 = new Planet("D", 7, "red");
        Planet D8 = new Planet("D", 8, "red");
        Planet D9 = new Planet("D", 9, "yellow");
        /*D system routes between planets*/
        StarRoute D1D4 = new StarRoute(D1, D4);
        StarRoute D2D3 = new StarRoute(D2, D3);
        StarSystem systemD = new StarSystem(D1,D2,D3,D4,D5,D6,D7,D8,D9);
        systemD.getInnerRoutes().add(D1D4);
        systemD.getInnerRoutes().add(D2D3);
        System.out.println("System D initialized");
    return systemD;};

    private StarSystem systemE(){
        System.out.println("Scanning System E ...");
        /*Initialize System E*/
        Planet E1 = new Planet("E", 1, "green");
        Planet E2 = new Planet("E", 2, "green");
        Planet E3 = new Planet("E", 3, "blue");
        Planet E4 = new Planet("E", 4, "red");
        Planet E5 = new Planet("E", 5, "yellow");
        Planet E6 = new Planet("E", 6, "yellow");
        Planet E7 = new Planet("E", 7, "green");
        Planet E8 = new Planet("E", 8, "green");
        Planet E9 = new Planet("E", 9, "yellow");
        /*E system routes between planets*/
        StarRoute E1E4 = new StarRoute(E1, E4);
        StarRoute E2E3 = new StarRoute(E2, E3);
        StarRoute E5E6 = new StarRoute(E5, E6);
        StarRoute E6E9 = new StarRoute(E6, E9);
        StarRoute E7E8 = new StarRoute(E7, E8);
        StarSystem systemE = new StarSystem(E1,E2,E3,E4,E5,E6,E7,E8,E9);
        systemE.getInnerRoutes().add(E1E4);
        systemE.getInnerRoutes().add(E2E3);
        systemE.getInnerRoutes().add(E5E6);
        systemE.getInnerRoutes().add(E6E9);
        systemE.getInnerRoutes().add(E7E8);
        System.out.println("System E initialized");
        return systemE;
    };

    private StarSystem systemF(){
        System.out.println("Scanning System F ...");
        /*Initialize System F*/
        Planet F1 = new Planet("F", 1, "blue");
        Planet F2 = new Planet("F", 2, "blue");
        Planet F3 = new Planet("F", 3, "green");
        Planet F4 = new Planet("F", 4, "red");
        Planet F5 = new Planet("F", 5, "green");
        Planet F6 = new Planet("F", 6, "green");
        Planet F7 = new Planet("F", 7, "blue");
        Planet F8 = new Planet("F", 8, "green");
        Planet F9 = new Planet("F", 9, "green");
        /*F system routes between planets*/
        StarRoute F1F2 = new StarRoute(F1, F2);
        StarRoute F2F3 = new StarRoute(F2, F3);
        StarRoute F3F6 = new StarRoute(F3, F6);
        StarRoute F6F9 = new StarRoute(F6, F9);
        StarRoute F7F8 = new StarRoute(F7, F8);
        StarSystem systemF = new StarSystem(F1,F2,F3,F4,F5,F6,F7,F8,F9);
        systemF.getInnerRoutes().add(F1F2);
        systemF.getInnerRoutes().add(F2F3);
        systemF.getInnerRoutes().add(F3F6);
        systemF.getInnerRoutes().add(F6F9);
        systemF.getInnerRoutes().add(F7F8);
        System.out.println("System F initialized");
    return systemF;
    };

    private StarSystem systemG(){
        System.out.println("Scanning System G ...");
        /*Initialize System G*/
        Planet G1 = new Planet("G", 1, "green");
        Planet G2 = new Planet("G", 2, "green");
        Planet G3 = new Planet("G", 3, "green");
        Planet G4 = new Planet("G", 4, "green");
        Planet G5 = new Planet("G", 5, "yellow");
        Planet G6 = new Planet("G", 6, "green");
        Planet G7 = new Planet("G", 7, "green");
        Planet G8 = new Planet("G", 8, "yellow");
        Planet G9 = new Planet("G", 9, "yellow");
        /*G system routes between planets*/
        StarRoute G2G3 = new StarRoute(G2, G3);
        StarRoute G4G5 = new StarRoute(G4, G5);
        StarRoute G8G9 = new StarRoute(G8, G9);
        StarSystem systemG = new StarSystem(G1,G2,G3,G4,G5,G6,G7,G8,G9);
        systemG.getInnerRoutes().add(G2G3);
        systemG.getInnerRoutes().add(G4G5);
        systemG.getInnerRoutes().add(G8G9);
        System.out.println("System G initialized");
        return systemG;
    };

    private StarSystem systemH(){
        System.out.println("Scanning System H ...");
        /*Initialize System H*/
        Planet H1 = new Planet("H", 1, "yellow");
        Planet H2 = new Planet("H", 2, "yellow");
        Planet H3 = new Planet("H", 3, "yellow");
        Planet H4 = new Planet("H", 4, "yellow");
        Planet H5 = new Planet("H", 5, "green");
        Planet H6 = new Planet("H", 6, "green");
        Planet H7 = new Planet("H", 7, "yellow");
        Planet H8 = new Planet("H", 8, "yellow");
        Planet H9 = new Planet("H", 9, "blue");
        /*H system routes between planets*/
        StarRoute H1H2 = new StarRoute(H1, H2);
        StarRoute H2H3 = new StarRoute(H2, H3);
        StarRoute H4H7 = new StarRoute(H4, H7);
        StarRoute H5H6 = new StarRoute(H5, H6);
        StarRoute H8H9 = new StarRoute(H8, H9);
        StarSystem systemH = new StarSystem(H1,H2,H3,H4,H5,H6,H7,H8,H9);
        systemH.getInnerRoutes().add(H1H2);
        systemH.getInnerRoutes().add(H2H3);
        systemH.getInnerRoutes().add(H4H7);
        systemH.getInnerRoutes().add(H5H6);
        systemH.getInnerRoutes().add(H8H9);
        System.out.println("System H initialized");
        return systemH;
    };

    private StarSystem systemK(){
        System.out.println("Scanning System K ...");
        /*Initialize System K*/
        Planet K1 = new Planet("K", 1, "yellow");
        Planet K2 = new Planet("K", 2, "red");
        Planet K3 = new Planet("K", 3, "yellow");
        Planet K4 = new Planet("K", 4, "yellow");
        Planet K5 = new Planet("K", 5, "green");
        Planet k6 = new Planet("K", 6, "red");
        Planet k7 = new Planet("K", 7, "yellow");
        Planet k8 = new Planet("K", 8, "blue");
        Planet k9 = new Planet("K", 9, "red");
        /*K system routes between planets*/
        StarRoute K1K4 = new StarRoute(K1, K4);
        StarRoute K4K7 = new StarRoute(K4, k7);
        StarRoute K7K8 = new StarRoute(k7, k8);
        StarRoute K8K9 = new StarRoute(k8, k9);
        StarSystem systemK = new StarSystem(K1,K2,K3,K4,K5,k6,k7,k8,k9);
        systemK.getInnerRoutes().add(K1K4);
        systemK.getInnerRoutes().add(K4K7);
        systemK.getInnerRoutes().add(K7K8);
        systemK.getInnerRoutes().add(K8K9);
        System.out.println("System K initialized");
        return systemK;
    };


    /**
     * Gets planets.
     *
     * @return the planets Arraylist;
     */
    public ArrayList<Planet> getPlanets() {
        return planets;
    }

}
