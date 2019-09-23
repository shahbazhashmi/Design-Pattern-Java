/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.singletonpattern;

/**
 *
 * @author shahbaz
 */
public class BikeSingleton {
    
    private BikeSingleton() {
        
    }
    
    private static BikeSingleton bikeSingleton;
    
    public static BikeSingleton getInstance() {
        if(bikeSingleton == null) {
            bikeSingleton = new BikeSingleton();
        }
        return bikeSingleton;
    }
    
    
    private String name = "bike singleton class";

    public String getName() {
        return name;
    }
    
}
