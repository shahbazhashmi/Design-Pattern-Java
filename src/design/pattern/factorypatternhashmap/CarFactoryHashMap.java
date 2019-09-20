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
    
    
 /*  private static final Map<String,CarHashMap> factoryMap = new HashMap<>();

    public CarFactoryHashMap() {
        factoryMap.put("HONDA", new Honda());
        factoryMap.put("MARUTI", new Maruti());
    }
    
    
    
   public CarHashMap getCar(String carType) {
       return factoryMap.get(carType);
   }
   */
    
    /**
     * using reflection
     */
     private static final Map<String,String> factoryMap = new HashMap<>();

    public CarFactoryHashMap() {
        factoryMap.put("HONDA", "design.pattern.factorypatternhashmap.Honda");
        factoryMap.put("MARUTI", "design.pattern.factorypatternhashmap.Maruti");
    }
    
    
    
   public CarHashMap getCar(String carType) {
       try{
            String carClass = factoryMap.get(carType).toString();
            //With the class name we use reflection
            //and instantiate a new car
            Class clazz = Class.forName(carClass);
            return (CarHashMap) clazz.newInstance();
        } catch(Exception e) {e.printStackTrace();}
        return null;
   }
}
