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
public abstract class Car {
    
    int price = 0;
    
    abstract void setPrice();

    public int getPrice() {
        return price;
    }
    
    
    
    
    
}
