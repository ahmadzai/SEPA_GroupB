package Controller;
import java.io.*;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginController {
	private String key=null;
	private String codedUserName=null;
	private String codedPassword=null;
	
	public LoginController(){
		readFromFile();
		
	}
	/*
	public static void main(String[] args){
		LoginController lg=new LoginController();
		System.out.println(lg.codedPassword+"        " +lg.codedUserName);
		
		System.out.print(lg.checkLogin("khanzaman", "khanzaman123"));
	}
	*/
	public boolean checkLogin(String userName,String password){
		
		if(codedUserName.equals(toSHA256(userName))&& codedPassword.equals(toSHA256(password))){
			this.setKey(userName+password);
			return true;
		}
		return false;
			
		
	}
	public void setKey(String key){
		this.key=key;
	}
	public String getKey(){
		return key;
	}
	private String toSHA256(String NamePas){
		try {
			MessageDigest md=MessageDigest.getInstance("SHA-256");
			md.reset();
			md.update(NamePas.getBytes("UTF-8"));
			byte[] digest=md.digest();
			BigInteger bgInt=new BigInteger(digest);
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
	private void readFromFile(){
		File file=new File("controller.txt");
		try{
		FileInputStream fin=new FileInputStream(file);
		DataInputStream din=new DataInputStream(fin);
		BufferedReader br=new BufferedReader(new InputStreamReader(din));
		for(int i=0; i<2; i++){
			if(i==0)
				codedUserName=br.readLine();
			else
				codedPassword=br.readLine();
			
		}
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
	
			

}
