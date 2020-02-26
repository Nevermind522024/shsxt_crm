package com.shsxt.crm.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.tomcat.util.codec.binary.Base64;

public class MD5Util {
	
	/**
	 * 将字符串通过md5加密，再通过Base64编码
	 * @param str
	 * @return
	 */
	public static String encode(String str) {
		String value = null;
		
		try {
			// 得到md5的算法程序对象
			MessageDigest messageDigest = MessageDigest.getInstance("md5");
			byte[] bytes = messageDigest.digest(str.getBytes());
			// 将字节转换成字符串
			value = Base64.encodeBase64String(bytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return value;
	}
	
	public static void main(String[] args) {

		System.out.println(encode(encode("123456")));
	}

}
