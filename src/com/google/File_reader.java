package com.google;


import java.io.*;
import java.security.spec.KeySpec;
import java.util.*;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.apache.commons.codec.binary.Base64;

public class File_reader {
	SecretKey seckey;
	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory SecKeyfact;
	private Cipher cipher;
	byte[] Bytearray;
	private String EncryptValue;
	private String Encryptpattern;
	
	// Calling method to the encrypt , trippledes and Decrypt.

 
 public File_reader() throws Exception 
 {
	 EncryptValue = "ThisIsSpartaThisIsSparta";
     Encryptpattern = DESEDE_ENCRYPTION_SCHEME;
     Bytearray = EncryptValue.getBytes(UNICODE_FORMAT);
     ks = new DESedeKeySpec(Bytearray);
     SecKeyfact = SecretKeyFactory.getInstance(Encryptpattern);
     cipher = Cipher.getInstance(Encryptpattern);
     seckey = SecKeyfact.generateSecret(ks);
 }
 
 
 public String encrypt (String Notencryptstring) {
	 String encryptedString = null;
     try {
         cipher.init(Cipher.ENCRYPT_MODE, seckey);
         byte[] plainText = Notencryptstring.getBytes(UNICODE_FORMAT);
         byte[] encryptedText = cipher.doFinal(plainText);
         encryptedString = new String(Base64.encodeBase64(encryptedText));
     } catch (Exception e) {
         e.printStackTrace();
     }
     return encryptedString;
	
 }
 
public String decrypt (String encryptedString) {
	String decryptedText=null;
    try {
        cipher.init(Cipher.DECRYPT_MODE, seckey);
        byte[] encryptedText = Base64.decodeBase64(encryptedString);
        byte[] plainText = cipher.doFinal(encryptedText);
        decryptedText= new String(plainText);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return decryptedText;
	 
 }	
	public static void main(String[] args) throws Exception {
		ArrayList <String> stvar = new ArrayList <String> ();
		String ss=null;
	try {
		String s = null;
		String Path ="D:/root/root.txt";
		FileReader fis = new FileReader (Path);
		BufferedReader bf = new BufferedReader(fis);
		while((s=bf.readLine())!=null) 
		  {
			ss=s;
			stvar.add(ss);	
	       }
			
	}catch (Exception e) {
		
		e.printStackTrace();
	}
		//File_reader ob = new File_reader();
	Iterator<String> it = stvar.iterator();
File_reader ob = new File_reader();
	
	while(it.hasNext()){
		
		String encstring= it.next();
		//System.out.println(encstring);
		String encrypted=ob.encrypt(encstring);
        String decrypted=ob.decrypt(encrypted);
        System.out.println("String To Encrypt: "+ encstring);
        System.out.println("Encrypted String:" + encrypted);
        System.out.println("Decrypted String:" + decrypted);
	}
		
	}

}
