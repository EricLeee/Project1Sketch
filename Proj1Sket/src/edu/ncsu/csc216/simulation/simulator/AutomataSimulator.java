package edu.ncsu.csc216.simulation.simulator;

import edu.ncsu.csc216.simulation.environment.utils.PaintedLocation;

public class AutomataSimulator implements SimulatorInterface {

    private static final int SIZE = 20;
    
    private static final int THRESHOLD = 2;
    
    private static final String SIZE_ERROR_MESSAGE = "";
    
    private static final String THRESHOLD_ERROR_MESSAGE = " ";
    
    private String[] names;
    
    private int numberOfNames;
    
    private char[] symbol;
    
    private static final char EMPTY = ' ';
    
    public AutomataSimulator(String init) {
        
    }
    
    public AutomataSimulator(String init, String conf) {
        
    }
    
    public void step() {
        
    }
    
    public PaintedLocation[][] getView() {
        return null;
    }
    
    public String[] getNames() {
        return null;
    }
}
