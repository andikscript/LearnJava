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
public class CountString {
    public void countString() {
        String a = "DicodeCode123";
        
        int up = 0;
        int low = 0;
        int angka = 0;
        int simbol = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char b = a.charAt(i);
            
            if (b >= 'a' && b <= 'z') {
                low++;
            } else if (b >= 'A' && b <= 'Z') {
                up++;
            } else if (Integer.parseInt(String.valueOf(b)) >= 0 && Integer.parseInt(String.valueOf(b)) <= 9) {
                angka++;
            }
        }
        
        System.out.println("Huruf Besar : " + up);
        System.out.println("Huruf Kecil : " + low);
        System.out.println("Angka : " + angka);
    }
}
