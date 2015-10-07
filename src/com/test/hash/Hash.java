package com.test.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash{
	public static String hash(String str){
		MessageDigest md;
		int i;
		
		StringBuffer hexString = new StringBuffer();
		
		try {
			md = MessageDigest.getInstance("MD5");
		    md.update(str.getBytes());
		    byte[] hash = md.digest();
			 
		    for (i = 0; i < hash.length; i++) {
		    	if ((0xff & hash[i]) < 0x10) {
		    		hexString.append("0" + Integer.toHexString((0xFF & hash[i])));
		    		}else {
		    			hexString.append(Integer.toHexString(0xFF & hash[i]));
		    		}       
		    }
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException("" + e);
		}	 
		
		return hexString.toString();
	}
}