/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import design.pattern.factorypattern.CarFactory;
import design.pattern.factorypatternhashmap.CarFactoryHashMap;
import design.pattern.factorypattern.Car;
import design.pattern.factorypatternhashmap.CarHashMap;

/**
 *
 * @author shahbaz
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        factoryPatternHashMap();
        
    }
    
    
    
    private static void factoryPattern() {
        CarFactory carFactory = new CarFactory();
        Car honda = carFactory.getCar("MARUTI");
        System.out.println("car price -> "+honda.getPrice());
    }
    
    
    private static void factoryPatternHashMap() {
        CarFactoryHashMap carFactory = new CarFactoryHashMap();
        CarHashMap honda = carFactory.getCar("HONDA");
        System.out.println("car price -> "+honda.getPrice());
    }
    
    
   
    
    
}
