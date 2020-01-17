/*
 * ******************************************************
 *  * Copyright (C) 2020 Ruikang Xu: xuruikang6@hotmail.com
 *
 *  * permission of Ruikang Xu
 *  ******************************************************
 */

package Monsterlady;

import Monsterlady.Module.Planet;

import java.util.*;
import java.util.regex.Pattern;

/**
 * The type Application.
 */
public class Application {
    private Map map;
    /**
     * The From.
     */
    public Planet from, /**
     * The To.
     */
    to;
    private Set<Planet> visited = new HashSet<>();

    /**
     * Instantiates a new Application.
     */
    public Application() {
        this.map = new Map();
    }

    /**
     * Is num boolean.
     *
     * @param str the str
     * @return the boolean
     */
    public static boolean isNum(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return  pattern.matcher(str).matches();
    }

    /**
     * Get planet by ss planet.
     *
     * @param name the name
     * @return the planet
     */
    public Planet getPlanetBySS(String name){
        String sa[] = name.split("");
        String systemName = sa[0];
        int serialNum = Integer.parseInt(sa[1]);
       for(Planet planet : map.getPlanets()){
           if(planet.getSerialNum() == serialNum && planet.getSystemNum().equals(systemName.toUpperCase())){
               return planet;
           }
        }
       return null;
    }

    /**
     * Get vaild input string.
     *
     * @return the string
     */
    public String getVaildInput(){
        boolean isSystem;
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        if(input.length() != 2) {
            System.out.println("Input invalid, please try again! ");
            return getVaildInput();
        } else {
            final String[] raw = input.split("");
            switch (raw[0].toUpperCase()) {
                case "A":
                case "B":
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "K":
                case "H":
                    isSystem = true;
                    break;
                default:
                    isSystem = false;
                    break;
            }
            if (isNum(raw[1]) && isSystem && Integer.parseInt(raw[1]) != 0) {
               return input;
            } else {
                System.out.println("Input invalid, please try again! ");
                return getVaildInput();
            }
        }
    }

    /**
     * Find path.
     */
    public void findPath(){
       menu();
        List<Planet> solution  = dfs(from,visited);
        if(!solution.isEmpty()){
            System.out.println("The path is found from " + from.getSystemNum() + from.getSerialNum() + " to " + to.getSystemNum() + to.getSerialNum());
            for(Planet planet :solution){
                if(planet.equals(to)){
                    System.out.print(planet.getSystemNum() + planet.getSerialNum());
                } else {
                    System.out.print(planet.getSystemNum() + planet.getSerialNum() + " to ");
                }
            }
        } else {
            System.out.println("No path found from " + from.toString() + " to " + to.toString());
        }
    }

    private void menu(){
        System.out.println("Please enter the starting point！(eg: A1)");
        String fromPlanet = getVaildInput();
        from = getPlanetBySS(fromPlanet);
        System.out.println(from.toString());
        System.out.println("Please enter the destination！(eg: C7)");
        String toPlanet = getVaildInput();
        to = getPlanetBySS(toPlanet);
        System.out.println(to.toString());
    }

    /**
     * Dfs linked list.
     *
     * @param start   the start
     * @param visited the visited
     * @return the linked list
     */
    LinkedList<Planet> dfs(Planet start, Set<Planet> visited) {
        LinkedList<Planet> solution;
        visited.add(start);
        if (isGoalState(start)) { /* Found */
            solution = new LinkedList<Planet>();
            solution.add(start);
            return solution;
        } else {
            List<Planet> neighbours =start.getAvailablePlanets();
            for(Planet neighbour : neighbours){
                if (!visited.contains(neighbour)) {
                    solution = dfs(neighbour, visited);
                    if (goalIsReached(solution)) {
                        solution.addFirst(start);
                        return solution;
                    }
                }
            }
        }
        /* visited.remove(start); */
        return new LinkedList<Planet>(); /* No solution */
    }

    private boolean goalIsReached(LinkedList<Planet> solution) {
        return solution.contains(to);
    }

    private boolean isGoalState(Planet start) {
       return start.equals(to);
    }
}
