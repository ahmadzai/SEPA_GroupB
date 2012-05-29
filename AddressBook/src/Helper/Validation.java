package Helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	
	/***
	 * @author wazir
	 * @param name
	 * @return Boolean
	 */
	public  Boolean checkName(String s) {
		
		int x = s.length();
		for(int i=0 ; i<x; i++){
		char charact = s.charAt(i);
		int ascii = (int)charact;
		if ((65 <=ascii && ascii<=90) || (97 <=ascii && ascii<=122)||ascii==32);
		
		else x=-1;
		

	}
		if (x==-1) return false;
		else return true;
		
		
	}
	
	/***
	 * @author wazir
	 * @param date
	 * @return Boolean
	 */
	public Boolean checkDate(String date) {
		// dd/mm/yyyy
		String[] items = date.split("/");
		int x = 0;
		for (String item : items){
			String text = item;
			int Value = Integer.parseInt(text);
			x+=1;
			if(x==1){	
				if(0 < Value && Value <32)	 return true;
					//else return false;
			}
			else if(x==2){
				if(0 < Value && Value <13)	 return true;
				//else return false;
			}
			else if(x==3){
				if(1900 < Value && Value <2000)	 return true;
				//else return false;
				}
		}
			return false; 
	}
	/***
	 * @author wazir
	 * @param email
	 * @return Boolean
	 */
	public   Boolean checkEmail(String email) {
		String emailPattren = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern patren = Pattern.compile(emailPattren);
		Matcher match = patren.matcher(email);
		if(match.matches())
			return true;
		return false;
		
	}
	
	
	/***
	 * @author wazir
	 * @param mobileNr
	 * @param phoneNr
	 * @return Boolean
	 * one number eaither mobile or phone is mandatory
	 */
	public  Boolean checkMobileNr(String s) {
		
		//if(s.isEmpty()) return true;
		int x = s.length();
		if(s.charAt(0)=='+') {
			if(s.charAt(1)=='0') x=-1;
		}
		else if(s.charAt(0)=='0' && s.charAt(1)=='0'){
			if(s.charAt(2)=='0') x=-1;
		}
		else //x=-1;
		for(int i=0 ; i<x; i++){
		char charact = s.charAt(i);
		int ascii = (int)charact;
		
		if ((48 <=ascii && ascii<=57)||ascii==32);
		
		else x=-1;
		

	}
		if(s.length()<6) return false;
		if (x==-1) return false;
		else return true;
		
	}
	
	public Boolean checkPhoneNr(String s) {
		
		if(s.isEmpty()) return true;
		int x = s.length();
		for(int i=0 ; i<x; i++){
			char charact = s.charAt(i);
			int ascii = (int)charact;
			
			if (s.charAt(0)=='+'||(48 <=ascii && ascii<=57)||ascii==32);
			
			else x=-1;
			

		}
		if(s.length()<6) return false;
			if (x==-1) return false;
			else return true;
	}
	
	/***
	 * @author wazir
	 * @param fax
	 * @return Boolean
	 * Fax number is optional so if fax was empty it wil also return true;
	 */
	public  Boolean checkFax(String s) {
		if(s.isEmpty()) return true;
		int x = s.length();
		for(int i=0 ; i<x; i++){
			char charact = s.charAt(i);
			int ascii = (int)charact;
			
			if (s.charAt(0)=='+'||(48 <=ascii && ascii<=57)||ascii==32);
			
			else x=-1;
			}
			if(s.length()<6) return false;
			if (x==-1) return false;
			else return true;
	}
	/***
	 * @author wazir
	 * @param country
	 * @return Boolean
	 */
	public  Boolean checkCountryCity(String country) {
		if(!country.isEmpty() && country.length() >= 2 && country.matches("^[a-z A-Z]+$")) 
			return true;
		return false;
	}
	
	public   Boolean checkStreet(String s) {
		
		if(s.isEmpty())
			return false;
		int x = s.length();
		for(int i=0 ; i<x; i++){
		char charact = s.charAt(i);
		if(s.charAt(0)=='0'||s.charAt(0)=='1'||s.charAt(0)=='2'||s.charAt(0)=='3'||s.charAt(0)=='4'||s.charAt(0)=='5'||s.charAt(0)=='6'||s.charAt(0)=='7'||s.charAt(0)=='8'||s.charAt(0)=='9' ) return false;
		int ascii = (int)charact;
		if ((65 <=ascii && ascii<=90) ||(48 <=ascii && ascii<=57)|| (97 <=ascii && ascii<=122)||ascii==32);
		
		else x=-1;
		

	}
		if (x==-1) return false;
		else return true;
		
		
	}
	
	/***
	 * @author wazir
	 * @param apNr
	 * @return Boolean
	 * Apartment Number is optional
	 */
	public  Boolean checkApNr(String s) {
		if(s.isEmpty())
			return true;
		int x = s.length();
		for(int i=0 ; i<x; i++){
		char charact = s.charAt(i);
		if(s.charAt(0)=='A'||s.charAt(0)=='B'||s.charAt(0)=='C'||s.charAt(0)=='a'||s.charAt(0)=='b'||s.charAt(0)=='c') return false;
		int ascii = (int)charact;
		if ((65 <=ascii && ascii<=67) ||(48 <=ascii && ascii<=57)|| (97 <=ascii && ascii<=99)||ascii==32);
		
		else x=-1;
		

	}
		if (x==-1) return false;
		else return true;
		
		
	}
		
	/***
	 * @author wazir
	 * @param zipCode
	 * @return Boolean
	 * zip code is mandatory
	 */
	public   Boolean checkZipCode(String zipCode) {
		if(!zipCode.isEmpty() && zipCode.matches("^[0-9]{5}"))
			return true;
		return false;
	}
	
	public  Boolean checkImage(String extension) {
		if(!extension.isEmpty()&&(extension=="jpg"||extension=="gif"||extension=="jpeg"||extension=="psd"||extension=="png"))
			return true;
		return false;
	}
 	
}
