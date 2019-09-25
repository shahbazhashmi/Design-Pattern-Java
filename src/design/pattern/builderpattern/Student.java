/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.pattern.builderpattern;

/**
 *
 * @author shahbaz
 */
public final class Student {
    
    private String name;
    private String mobile;
    private String address;
    
    public Student(Builder builder) 
    { 
        this.name = builder.name; 
        this.mobile = builder.mobile; 
        this.address = builder.address; 
    } 

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
   
    public static class Builder {
        
        public static Builder getInstance() {
            return new Builder();
        }
        
        private Builder() {} 
        
        private String name;
        private String mobile;
        private String address;
        
        
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
        
        
        public Student build() 
        { 
            return new Student(this); 
        } 
        
    }
    
    
    @Override
    public String toString() 
    { 
        return "name = " + this.name + ", mobile = " + this.mobile +  
                               ", address = " + this.address; 
    } 
    
}
