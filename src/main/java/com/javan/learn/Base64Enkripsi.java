/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javan.learn;

import java.util.Base64;

/**
 *
 * @author andikscript
 */
public class Base64Enkripsi {
    
    public String encode(String input) {
        return Base64.getEncoder().encodeToString(input.getBytes());
    }
    
    public String decode(String input) {
        return new String(Base64.getDecoder().decode(input));
    }
    
    public void test() {
        String input = "andikscript";
        String en = encode(input);
        System.out.println("Input : " + input);
        System.out.println("Encode : " + en);
        System.out.println("Decode : " + decode(en));
    }
}
