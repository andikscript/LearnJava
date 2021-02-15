/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javan.learn;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author akunf
 */
public class HashingMD5 {
    
    private String getMD5(String input) {
        try {
            // memanggil Hash MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            // memasukkan inputan ke MD5 untuk hashing dengan ditampung pada array byte 
            byte[] messageDiggest = md.digest(input.getBytes());
            // mengubah array byte hashing menjadi BigInteger
            BigInteger bigInteger = new BigInteger(1, messageDiggest);
            // mengubah hashing dari BigInteger ke nilai hexadecimal
            String hashText = bigInteger.toString(16);
            while(hashText.length() < 32) {
                hashText = "0" + hashText;
            }
            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException();
        }
    }
    
    public String hashing(String a) {
        return getMD5(a);
    }
}
