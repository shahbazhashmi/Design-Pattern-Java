/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern;

import design.pattern.builderpattern.Student;
import design.pattern.factorypattern.CarFactory;
import design.pattern.factorypatternhashmap.CarFactoryHashMap;
import design.pattern.factorypattern.Car;
import design.pattern.factorypatterngenerics.GenericBikeFactory;
import design.pattern.factorypatterngenerics.R15;
import design.pattern.factorypatternhashmap.CarHashMap;
import design.pattern.singletonpattern.BikeSingleton;

/**
 *
 * @author shahbaz
 */
public class DesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
        
            builderPattern();
        
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    
    
    
    private static void factoryPattern() {
        CarFactory carFactory = new CarFactory();
        Car honda = carFactory.getCar("MARUTI");
        System.out.println("car price -> "+honda.getPrice());
    }
    
    
    private static void factoryPatternHashMap() {
        CarFactoryHashMap carFactory = new CarFactoryHashMap();
        CarHashMap honda = carFactory.getCar("MARUTI");
        System.out.println("car price -> "+honda.getPrice());
    }
    
    
    private static void factoryPatternGenerics() throws Exception {
        GenericBikeFactory<R15> r15Factory = new GenericBikeFactory<R15>(R15.class);
        R15 r15 = r15Factory.createInstance();
        System.out.println("R15 cc -> "+r15.getCC());
    }
   

    private static void singletonPattern() {
        BikeSingleton bikeSingleton = BikeSingleton.getInstance();
        System.out.println("bike singleton name -> "+bikeSingleton.getName());
    }
    
    
    private static void builderPattern() {
        Student s = Student.Builder.getInstance().setAddress("Mumbai").setName("Shahbaz").setMobile("98765544444").build();
        System.out.println("builder pattern - Student -> "+s.toString());
    }
    
    
}
