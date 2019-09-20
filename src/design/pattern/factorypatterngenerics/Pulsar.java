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
public class Pulsar extends Bike {
    
    
    public Pulsar() {
        setCc();
    }
    

    void setCc() {
        cc = 220;
    }
    
}
