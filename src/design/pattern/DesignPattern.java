/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import design.pattern.factorypattern.CarFactory;
import design.pattern.factorypattern.Car;

/**
 *
 * @author shahbaz
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CarFactory carFactory = new CarFactory();
        
        Car honda = carFactory.getCar("maruti");
        
        System.out.println("car price -> "+honda.getPrice());
        
    }
    
    
}
