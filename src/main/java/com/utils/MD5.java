package com.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *	MD5算法加密
 */
public class MD5 {
	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		EncoderByMd5("000000");
	}
    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        //确定计算方法
        MessageDigest md5=MessageDigest.getInstance("MD5");
        byte[] b = md5.digest(str.getBytes("utf-8"));
        String result = "";
    	for (int i = 0; i < b.length; i++) {
    	    String tmp = Integer.toHexString(b[i] & 0xFF);
    	    if (tmp.length() == 1) {
    		result += "0" + tmp;
    	    } else {
    		result += tmp;
    	    }
    	}
        return result;
    }
}
