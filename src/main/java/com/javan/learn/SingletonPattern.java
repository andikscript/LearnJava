/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javan.learn;

public class SingletonPattern {
    
    private static SingletonPattern singletonPattern;
    
    private SingletonPattern() {}
    
    public static SingletonPattern getInstance() {
        if (singletonPattern == null) {
            singletonPattern = new SingletonPattern();
        }
        return singletonPattern;
    }
    
    public void getMessage() {
        System.out.println("Hello Baby");
    }
}
