package Helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	
	
	/***
	 * @author wazir
	 * @param name
	 * @return Boolean
	 */
	public  Boolean checkName(String name) {
		if(name.matches("^[a-zA-Z]+$"))
			return true;
		return false;
		
	}
	
	/***
	 * @author wazir
	 * @param date
	 * @return Boolean
	 */
	public  Boolean checkDate(String date) {
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
	public  Boolean checkEmail(String email) {
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
	public  Boolean checkMobileNr(String mobileNr) {
		
		if((mobileNr.matches("^[0-9]{10}") || mobileNr.matches("^[0-9]{15}")))
			return true;
		return false;
		
	}
	
	public  Boolean checkPhoneNr(String phoneNr) {
		
		if((phoneNr.matches("^[0-9]{12}") || phoneNr.matches("^[0-9]{8}")))
			return true;
		return false;
	}
	
	/***
	 * @author wazir
	 * @param fax
	 * @return Boolean
	 * Fax number is optional so if fax was empty it wil also return true;
	 */
	public  Boolean checkFax(String fax) {
		if(fax.isEmpty())
			return true;
		else if(fax.matches("^[0-9]{12}") && fax.length() > 6)  
			return true;
		else return false;
	}
	/***
	 * @author wazir
	 * @param country
	 * @return Boolean
	 */
	public  Boolean checkCountryCity(String country) {
		if(!country.isEmpty() && country.length() > 3 && country.matches("^[a-zA-Z]+$")) 
			return true;
		return false;
	}
	
	public  Boolean checkStreet(String street) {
		
		if(!street.isEmpty())
			return true;
		return false;
		
	}
	
	/***
	 * @author wazir
	 * @param apNr
	 * @return Boolean
	 * Apartment Number is optional
	 */
	public  Boolean checkApNr(String apNr) {
		if(apNr.isEmpty())
			return true;
		else if(apNr.matches("^[0-9]{3}"))
			return true;
		else
			return false;
	}
	
	/***
	 * @author wazir
	 * @param zipCode
	 * @return Boolean
	 * zip code is mandatory
	 */
	public  Boolean checkZipCode(String zipCode) {
		if(!zipCode.isEmpty() && zipCode.matches("^[0-9]{6}"))
			return true;
		return false;
	}
	
	public  Boolean checkImage(String extension) {
		if(!extension.isEmpty()&&(extension=="jpg"||extension=="gif"||extension=="jpeg"||extension=="psd"||extension=="png"))
			return true;
		return false;
	}
 	
}
