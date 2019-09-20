/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.factorypatterngenerics;

/**
 *
 * @author shahbaz
 */
public class GenericBikeFactory <T extends Bike> {
    
    final Class theClass;

    public GenericBikeFactory(Class theClass) {
        this.theClass = theClass;
    }
    
    public T createInstance()
    throws IllegalAccessException, InstantiationException {
        return (T) this.theClass.newInstance();
    }
    
}
