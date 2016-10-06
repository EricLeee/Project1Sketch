package edu.ncsu.csc216.simulation.environment;

import edu.ncsu.csc216.simulation.actor.Animal;
import edu.ncsu.csc216.simulation.environment.utils.Location;

public class EcoSystem implements EcoGrid {
    
    private int maxRows;
    private int maxCols;

    @Override
    public boolean isEmpty(Location location) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Animal getItemAt(Location location) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void remove(Location place) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void add(Animal x, Location location) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Location findFirstEmptyNeighbor(Location position, int startDirection) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Location dueNorth(Location x) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Location dueSouth(Location x) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Location dueWest(Location x) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Location dueEast(Location x) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Animal[][] getMap() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void enableTheLiving() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void buryTheDead() {
        // TODO Auto-generated method stub
        
    }

}
