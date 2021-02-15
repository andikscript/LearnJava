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
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDiggest = md.digest(input.getBytes());
            BigInteger bigInteger = new BigInteger(1, messageDiggest);
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
