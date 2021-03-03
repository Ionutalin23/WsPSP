package com.hash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ResumenHash {

	public static String hashearPassword(String pass) {
		byte[] pass_a_bytes = pass.getBytes();
		String mensajeBase64 = "";
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-512");
			md.update(pass_a_bytes);
			byte[] resumen = md.digest();
			
			mensajeBase64= Base64.getEncoder().encodeToString(resumen);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mensajeBase64;
	}
	
}
