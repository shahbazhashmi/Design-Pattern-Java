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
public class Honda extends Car {

    public Honda() {
        setPrice();
    }
    

    void setPrice() {
        price = 1000000;
    }
    
    
    
}
