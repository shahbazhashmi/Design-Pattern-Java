/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.factorypatternhashmap;

import design.pattern.factorypattern.*;

/**
 *
 * @author shahbaz
 */
public class Honda extends CarHashMap {

    public Honda() {
        setPrice();
    }
    

    void setPrice() {
        price = 1000000;
    }
    
    
    
}
