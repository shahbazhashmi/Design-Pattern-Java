/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.factorypatternhashmap;

import design.pattern.factorypattern.*;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author shahbaz
 */
public class CarFactoryHashMap {
    
    
   private static final Map<String,CarHashMap> factoryMap = new HashMap<>();

    public CarFactoryHashMap() {
        factoryMap.put("HONDA", new Honda());
        factoryMap.put("MARUTI", new Maruti());
    }
    
    
    
   public CarHashMap getCar(String carType) {
       return factoryMap.get(carType);
   }
    
}
