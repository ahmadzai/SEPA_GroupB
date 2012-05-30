package Helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	
	/***
	 * @author wazir
	 * @param name
	 * @return Boolean
	 */
	public static  Boolean checkName(String name) {
		if(name.matches("^[a-zA-Z ]+$"))
			return true;
		return false;
		
	}
	
	/***
	 * @author wazir
	 * @param date
	 * @return Boolean
	 */
	public static  Boolean checkDate(String date) {
		// dd/mm/yyyy
		String DatePattren = "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
		Pattern pat = Pattern.compile(DatePattren);
		Matcher match = pat.matcher(date);
		if(match.matches())
			return true;
		return false;
	}
	/***
	 * @author wazir
	 * @param email
	 * @return Boolean
	 */
	public static  Boolean checkEmail(String email) {
		String emailPattren = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
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
	public static  Boolean checkMobileNr(String mobileNr) {
		
		 if (mobileNr == null || mobileNr.length() == 0 || mobileNr.length() < 6)
	     return false;
	        
	     for (int i = 0; i < mobileNr.length(); i++) {

	            //If we find a non-digit character we return false.
	    	 if (!Character.isDigit(mobileNr.charAt(i)))
	         return false;
	     }
	        
	     return true;
		
	}
	
	public static  Boolean checkPhoneNr(String phoneNr) {
		
		 if (phoneNr == null || phoneNr.length() == 0 || phoneNr.length() < 6)
		     return false;
		        
		 for (int i = 0; i < phoneNr.length(); i++) {

		            //If we find a non-digit character we return false.
			 if (!Character.isDigit(phoneNr.charAt(i)))
		     return false;
		 }
		        
		 return true;
	}
	
	/***
	 * @author wazir
	 * @param fax
	 * @return Boolean
	 * Fax number is optional so if fax was empty it wil also return true;
	 */
	public static  Boolean checkFax(String fax) {
		
		if (fax == null || fax.length() == 0 || fax.length() < 4)
		     return false;
		        
		 for (int i = 0; i < fax.length(); i++) {

		            //If we find a non-digit character we return false.
			 if (!Character.isDigit(fax.charAt(i)))
		     return false;
		 }
		        
		 return true;
	}
	/***
	 * @author wazir
	 * @param country
	 * @return Boolean
	 */
	public static  Boolean checkCountryCity(String country) {
		if(!country.isEmpty() && country.length() > 3 && country.matches("^[a-zA-Z ]+$")) 
			return true;
		return false;
	}
	
	public static  Boolean checkStreet(String street) {
		
		if(!street.isEmpty() && street.matches("^[a-zA-Z0-9 _-]+$"))
			return true;
		return false;
		
	}
	
	/***
	 * @author wazir
	 * @param apNr
	 * @return Boolean
	 * Apartment Number is optional
	 */
	public static  Boolean checkApNr(String apNr) {
		if (apNr == null || apNr.length() == 0)
		     return true;
		        
		 for (int i = 0; i < apNr.length(); i++) {

		            //If we find a non-digit character we return false.
			 if (!Character.isDigit(apNr.charAt(i)))
		     return false;
		 }
		        
		 return true;
	}
	
	/***
	 * @author wazir
	 * @param zipCode
	 * @return Boolean
	 * zip code is mandatory
	 */
	public static  Boolean checkZipCode(String zipCode) {
		if (zipCode == null || zipCode.length() == 0 || zipCode.length() < 4)
		     return false;
		        
		 for (int i = 0; i < zipCode.length(); i++) {

		            //If we find a non-digit character we return false.
			 if (!Character.isDigit(zipCode.charAt(i)))
		     return false;
		 }
		        
		 return true;

	}
	
	public  Boolean checkImage(String extension) {
		if(!extension.isEmpty()&&(extension=="jpg"||extension=="gif"||extension=="jpeg"||extension=="psd"||extension=="png"))
			return true;
		return false;
	}
 	
}