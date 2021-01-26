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
public class SnakeNumber {
    public void snakeNumber() {
        int s = 1;
        
        for (int i = 1; i <= 5; i++) {
            int t = s - 1;
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    System.out.print(t + " ");
                    t--;
                    s--;
                } else {
                    System.out.print(s + " ");
                    s++;
                }
            }
            s += 5;
            System.out.println();
        }
    }
}
