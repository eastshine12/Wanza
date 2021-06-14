package util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
	
	/*
	public String encryptSHA256(String str){
	
		String sha = "";
	
		try{
		  MessageDigest sh = MessageDigest.getInstance("SHA-256");
	      sh.update(str.getBytes());
	      byte byteData[] = sh.digest();
	      StringBuffer sb = new StringBuffer();
	      for(int i = 0 ; i < byteData.length ; i++){
	    	  	sb.append(Integer.toString((byteData[i]&0xff) + 0x100, 16).substring(1));
	      }
	
	      sha = sb.toString();
	
		}catch(NoSuchAlgorithmException e){
		  //e.printStackTrace();
		System.out.println("Encrypt Error - NoSuchAlgorithmException");
			sha = null;
		}
	
		return sha;
	} 
	*/
	
	public static String encryptSHA256(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			md.update(password.getBytes());
			byte byteData[] = md.digest();
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
			}
			StringBuffer hexString = new StringBuffer();
			for (int i = 0; i < byteData.length; i++) {
				String hex = Integer.toHexString(0xff & byteData[i]);
				if (hex.length() == 1) {
					hexString.append('0');
				}
				hexString.append(hex);
			}
			return hexString.toString();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException();
		}
	}
	
}
