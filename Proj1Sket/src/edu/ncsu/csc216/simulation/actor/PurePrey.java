package edu.ncsu.csc216.simulation.actor;

import java.awt.Color;

import edu.ncsu.csc216.simulation.environment.EcoGrid;
import edu.ncsu.csc216.simulation.environment.utils.Location;

public class PurePrey extends Animal {

    private int age;
    
    public PurePrey(char s) {
        super(s);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Color getColor() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void act(Location location, EcoGrid ecoGrid) {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected boolean pastBreedTime(int time) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    protected Animal makeNewBaby() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected int getFoodChainRank() {
        // TODO Auto-generated method stub
        return 0;
    }

}
