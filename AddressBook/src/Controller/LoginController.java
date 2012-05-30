package Controller;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginController {
	
	private static String key=null;
	private String codedUserName=null;
	private String codedPassword=null;
	
	/**
	 * Constructor will call method readFromFile
	 */
	public LoginController() {
		readFromFile();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Property which will return the key 
	 * @return String
	 */
	public static String  getKey(){
		return key;
	}
	
	/**
	 * Method is  setting  key for login 
	 * @param key
	 */
	private void setKey(String key){
		this.key=key;
	}
	
	/**
	 * The method will take userName and Password type of string and
	 * will change it cipher then  will compare it with stored userName and password
	 * @param UserName
	 * @param Password
	 * @return Boolean
	 */
	public boolean validatLogin(String UserName,String Password){
		if(codedUserName.equals(toSHA_256(UserName)) && codedPassword.equals(toSHA_256(Password))){
			this.setKey(Password);
			return true;
		}
		return false;
	}
	
	/**
	 * The method will take userName or password then convert it to cipher base on SHA-256 Algorithm 
	 * @param passName
	 * @return String
	 */
	private String toSHA_256(String passName){
		try {
			MessageDigest md=MessageDigest.getInstance("SHA-256");
			md.update(passName.getBytes("UTF-8"));
			BigInteger bgInt=new BigInteger(md.digest());
			return bgInt.toString();
			
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	/**
	 * This Method will read from the file the stored userName and password and assign it to
	 *  codedUserName and codedPassword for further operation
	 */
	private void readFromFile(){
		
		try {
			File file=new File("controller.txt");
			FileInputStream fin;
			fin = new FileInputStream(file);
			DataInputStream din=new DataInputStream(fin);
			BufferedReader br=new BufferedReader(new InputStreamReader(din));
			
			for(int i=0; i<2; i++){
				if(i==0)
					codedUserName=br.readLine();
				else 
					codedPassword=br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
