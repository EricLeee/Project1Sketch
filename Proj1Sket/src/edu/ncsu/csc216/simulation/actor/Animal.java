package edu.ncsu.csc216.simulation.actor;

import java.awt.Color;
import java.util.Random;

import edu.ncsu.csc216.simulation.environment.EcoGrid;
import edu.ncsu.csc216.simulation.environment.utils.Location;

public abstract class Animal {

    private int timeSinceLastMeal;
    
    private int timeSinceLastBreed;
    
    private boolean canActThisStep;
    
    private char symbol;
    
    private boolean alive;
    
    private static int seed = 500;
    
    private static Random randomGenerator = new Random(seed);
    
    public Animal(char s) {
        symbol = s;
    }
    
    public static void setRandomSeed(int seed) {
        
    }
    
    public char getSymbol() {
        return ' ';
    }
    
    public boolean isAlive() {
        return true;
    }
    
    public void enable() {
        
    }
    
    public void disable() {
        
    }
    
    protected void die() {
        
    }
    
    protected boolean canAct() {
        return true;
    }
    
    protected int getTimeSinceLastBreed() {
        return 0;
    }
    
    protected int getTimeSinceLastMeal() {
        return 0;
    }
    
    protected void incrementTimeSinceLastMeal() {
        
    }
    
    protected void incrementTimeSinceLastBreed() {
        
    }
    
    protected boolean breed(Location location, EcoGrid ecoGrid) {
        return true;
    }
    
    protected void move(Location location, EcoGrid ecoGrid) {
        
    }
    
    protected boolean eat(Location location, EcoGrid ecoGrid) {
        return false;
    }
    
    public abstract Color getColor();
    
    public abstract void act(Location location, EcoGrid ecoGrid);
    
    protected abstract boolean pastBreedTime(int time);
    
    protected abstract Animal makeNewBaby();
    
    protected abstract int getFoodChainRank();
    
}
