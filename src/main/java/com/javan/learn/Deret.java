/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javan.learn;

/**
 *
 * @author akunf
 */
public class Deret {
    
    public void deretSegitigaSiku() {
        for (int i  = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
    public void deretSegitigaSikuTerbalik() {
        for (int i  = 4; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    
    public void deretSegitigaSamaSisi() {
        int a = 6;
        
        for (int i  = 0; i < 4; i++) {
            for (int j = 0; j < a-1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
    }
    
    public void deretSegitigaSamaSisiTerbalik() {
        int b = 6;
        
        for (int i  = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < b-1; j++) {
                System.out.print("* ");
            }
            b--;
            System.out.println();
        }
    }
}
