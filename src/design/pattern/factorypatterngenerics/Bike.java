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
public abstract class Bike {
    
    int cc;
    
    abstract void setCc();
    
    public int getCC() {
        return cc;
    }
    
}
