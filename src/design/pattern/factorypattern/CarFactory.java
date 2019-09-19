/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.factorypattern;

/**
 *
 * @author shahbaz
 */
public class CarFactory {
    
    
   public Car getCar(String carType) {
       if (carType == null) {
           return null;
       }
       
       if(carType.equalsIgnoreCase("HONDA")) {  
                 return new Honda();  
               }   
           else if(carType.equalsIgnoreCase("MARUTI")){  
                return new Maruti();  
            } 
      return null;  
   }
    
}
