package Helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;



import org.junit.Before;
import org.junit.Test;

public class ValidationTest {
	//private Validation person;
	@Before
	public void setUp() throws Exception {
	//	person=new Validation();
	}

	@Test
	public  void testcheckName() {
		assertTrue(Validation.checkName("mahmood"));
		assertFalse(Validation.checkName("Wah@eed"));
		assertFalse(Validation.checkName("1Wah@eed"));
		assertFalse(Validation.checkName("Wa1h@eed"));
		assertFalse(Validation.checkName("Wah@e5ed"));
		assertFalse(Validation.checkName("Waheed 5"));
		assertFalse(Validation.checkName("Wah@ eed"));
		assertFalse(Validation.checkName("Wah#eed"));
		assertFalse(Validation.checkName("^ Waheed"));
		assertFalse(Validation.checkName("(Wah@eed"));
		assertFalse(Validation.checkName("@Wah@eed"));
		assertFalse(Validation.checkName("Waheed 2"));
		assertFalse(Validation.checkName("Waheed_khan"));
		assertFalse(Validation.checkName("Waheed 3"));
		assertFalse(Validation.checkName("Waheed_2"));
		assertFalse(Validation.checkName("Waheed #"));
		assertFalse(Validation.checkName("Wah 2 eed"));
		assertFalse(Validation.checkName("Wah4eed"));
		assertFalse(Validation.checkName("Waheed.com"));
		assertFalse(Validation.checkName("Wah,eed"));
		assertFalse(Validation.checkName("khan5"));
		assertFalse(Validation.checkName(".."));
		assertFalse(Validation.checkName("@"));
		assertFalse(Validation.checkName("45435"));
		assertFalse(Validation.checkName("+ada-"));
		assertFalse(Validation.checkName("$$$$$"));
		assertFalse(Validation.checkName("/samad"));
		assertFalse(Validation.checkName("http::"));
		assertFalse(Validation.checkName("[]"));
		assertFalse(Validation.checkName("waheed{"));
		//assertTrue(person.checkName("Waheed"));
			//fail("Not yet implemented");
		
		

	
	}


	@Test
	public   void testcheckCountryCity1() {
		assertFalse(Validation.checkCountryCity("{afghanistan"));
		assertFalse(Validation.checkCountryCity("Afghan@istan"));
		assertFalse(Validation.checkCountryCity("Pakistan3"));
		assertFalse(Validation.checkCountryCity("Iran4Afg"));
		assertFalse(Validation.checkCountryCity("Country#"));
		assertFalse(Validation.checkCountryCity("1New Zealand"));
		assertFalse(Validation.checkCountryCity("#Carabean"));
		assertFalse(Validation.checkCountryCity("%USA"));
		assertFalse(Validation.checkCountryCity("$UK"));
		assertFalse(Validation.checkCountryCity("United_Kingdom"));
		assertFalse(Validation.checkCountryCity("Australia00"));
		assertFalse(Validation.checkCountryCity("Ire+Land"));
		assertFalse(Validation.checkCountryCity("@"));
		assertFalse(Validation.checkCountryCity("345"));
		assertFalse(Validation.checkCountryCity("....."));
		assertFalse(Validation.checkCountryCity("."));
		assertFalse(Validation.checkCountryCity(","));
		assertFalse(Validation.checkCountryCity("Tajikistan (Russia)"));
		assertFalse(Validation.checkCountryCity("<Uzbekistan>"));
		assertFalse(Validation.checkCountryCity("?"));
		assertFalse(Validation.checkCountryCity("kazakistan @ Asia"));
		assertFalse(Validation.checkCountryCity("USA , UK"));
		assertFalse(Validation.checkCountryCity("my country.com"));
		assertFalse(Validation.checkCountryCity("*****"));
		assertFalse(Validation.checkCountryCity("+all countries"));
		assertFalse(Validation.checkCountryCity("(America)*"));
		assertFalse(Validation.checkCountryCity("1. Afghanistan"));
		assertFalse(Validation.checkCountryCity("Afgh@nistan"));
		assertFalse(Validation.checkCountryCity("I7aly"));
		assertFalse(Validation.checkCountryCity("Ma-ico"));
		assertTrue(Validation.checkCountryCity("Afghanistan"));
		assertTrue(Validation.checkCountryCity("afghanistan"));
		assertTrue(Validation.checkCountryCity("New Zealand"));
		assertTrue(Validation.checkCountryCity("Australia"));
		assertTrue(Validation.checkCountryCity("United Kingdom"));
		assertTrue(Validation.checkCountryCity("UK"));
		assertTrue(Validation.checkCountryCity("Suria"));
		assertTrue(Validation.checkCountryCity("USSR"));
		assertTrue(Validation.checkCountryCity("Russia USSR"));
		assertTrue(Validation.checkCountryCity("West Indeas Carabean"));
		assertTrue(Validation.checkCountryCity("North Amercia Brazil"));
		assertTrue(Validation.checkCountryCity("Saudi Arabia "));
		assertTrue(Validation.checkCountryCity("Japan"));
		assertTrue(Validation.checkCountryCity("North sea"));
		assertFalse(Validation.checkCountryCity("#Kabul"));
		assertFalse(Validation.checkCountryCity("Chic@go"));
		assertFalse(Validation.checkCountryCity("1 New York"));
		assertFalse(Validation.checkCountryCity("London_city"));
		assertFalse(Validation.checkCountryCity("Paris(elif)"));
		assertFalse(Validation.checkCountryCity("Mai+mana"));
		assertFalse(Validation.checkCountryCity("(angar)*"));
		assertFalse(Validation.checkCountryCity("$Berlin"));
		assertFalse(Validation.checkCountryCity("Berlin.Wedding"));
		assertFalse(Validation.checkCountryCity("wedding , Berlin"));
		assertFalse(Validation.checkCountryCity("leipzig + Berlin"));
		assertFalse(Validation.checkCountryCity("London > all CIties"));
		assertFalse(Validation.checkCountryCity("Tibu < Peshawar"));
		assertFalse(Validation.checkCountryCity("Karachi <= Tehran"));
		assertFalse(Validation.checkCountryCity("# 2 Frankfurt"));
		assertFalse(Validation.checkCountryCity("kabul 100km"));
		assertFalse(Validation.checkCountryCity("new-york"));
		assertFalse(Validation.checkCountryCity("mia=me"));
		assertFalse(Validation.checkCountryCity("kitman2"));
		assertFalse(Validation.checkCountryCity("345"));
		assertFalse(Validation.checkCountryCity("...."));
		assertFalse(Validation.checkCountryCity("**"));
		assertFalse(Validation.checkCountryCity("+++"));
		assertFalse(Validation.checkCountryCity("@"));
		assertFalse(Validation.checkCountryCity(","));
		assertFalse(Validation.checkCountryCity("frankfurt (oder)"));
		assertFalse(Validation.checkCountryCity("Kabul & Belrin"));
		assertTrue(Validation.checkCountryCity("kabul"));
		assertTrue(Validation.checkCountryCity("KABUL"));
		assertTrue(Validation.checkCountryCity("New York"));
		assertTrue(Validation.checkCountryCity("London "));
		assertTrue(Validation.checkCountryCity("Paris"));
		assertTrue(Validation.checkCountryCity("frankfurt oder"));
		assertTrue(Validation.checkCountryCity("frankfurt am main"));
		assertTrue(Validation.checkCountryCity("manchestered united city "));
		assertTrue(Validation.checkCountryCity("chicago in usa"));
		assertTrue(Validation.checkCountryCity("logar"));
		
		
	}

	@Test
	public void testcheckStreet() {
		assertTrue(Validation.checkStreet("Trift Strasse 67"));
		assertTrue(Validation.checkStreet("Lyner Strasse 5"));
		assertTrue(Validation.checkStreet("Luxemburg strasse 8"));
		assertTrue(Validation.checkStreet("Franklin strasse "));
		assertFalse(Validation.checkStreet("@ Franklin str@sse"));
		assertFalse(Validation.checkStreet(" Franklin_strasse"));
		assertFalse(Validation.checkStreet("Franklin#str@sse"));
		assertFalse(Validation.checkStreet("=Franklin strasse"));
		assertFalse(Validation.checkStreet("Franklin strasse & Lyner Strasse"));
		assertFalse(Validation.checkStreet("23"));
		assertFalse(Validation.checkStreet("..."));
		assertFalse(Validation.checkStreet("+"));
		
		
	}



	@Test
	public void testcheckDate() {
		assertTrue(Validation.checkDate("05/10/1980"));
		assertTrue(Validation.checkDate("1/1/1970"));
		assertFalse(Validation.checkDate("@"));
		assertFalse(Validation.checkDate("31990"));
		assertFalse(Validation.checkDate("1980/5/6"));
		assertFalse(Validation.checkDate(""));
		assertFalse(Validation.checkDate("56/5/1990"));
		assertFalse(Validation.checkDate("21/13/1987"));
		assertFalse(Validation.checkDate("#/#/1987"));
		assertFalse(Validation.checkDate("00/00/0000"));
		assertFalse(Validation.checkDate("two/March/two thousand and one "));
		assertFalse(Validation.checkDate("1/April/1986"));
		assertFalse(Validation.checkDate("20/1986"));
		assertFalse(Validation.checkDate("May/1986"));
		assertFalse(Validation.checkDate("05/05"));
		assertFalse(Validation.checkDate("10/09/00"));
		assertFalse(Validation.checkDate("02|05|1990"));
		assertFalse(Validation.checkDate("02+05+1967"));
		assertFalse(Validation.checkDate("02/1984/May"));
		assertFalse(Validation.checkDate("June/2000/10"));
	}

	@Test
	public void testcheckPhone() {
		assertTrue(Validation.checkPhoneNr("23423145"));
		assertTrue(Validation.checkPhoneNr("03053166879"));
		assertTrue(Validation.checkPhoneNr("06159833570"));
		assertTrue(Validation.checkPhoneNr("38745295"));
		assertFalse(Validation.checkPhoneNr("...."));
		assertTrue(Validation.checkPhoneNr(""));
		assertFalse(Validation.checkPhoneNr("i dont give my number out :D:D "));
		assertFalse(Validation.checkPhoneNr("@"));
		assertFalse(Validation.checkPhoneNr("345#$534"));
		assertFalse(Validation.checkPhoneNr("@32443543"));
		assertFalse(Validation.checkPhoneNr("1"));
		assertFalse(Validation.checkPhoneNr("342"));
		assertTrue(Validation.checkPhoneNr("045 54342456"));
		assertTrue(Validation.checkPhoneNr("030 531 668 79"));
		assertTrue(Validation.checkPhoneNr("0093 75 668 379"));
		assertFalse(Validation.checkPhoneNr("(27386487)"));
	}

	@Test
	public void testcheckMobileNr() {
		assertTrue(Validation.checkMobileNr("015777045123"));
		assertTrue(Validation.checkMobileNr("+4915777045123"));
		assertTrue(Validation.checkMobileNr("045645654654"));
		assertTrue(Validation.checkMobileNr("017678935542"));
		assertTrue(Validation.checkMobileNr("03005988632"));
		assertTrue(Validation.checkMobileNr("00923005988632"));
		assertTrue(Validation.checkMobileNr("0093799532865"));
		assertTrue(Validation.checkMobileNr("0799406686"));
		assertTrue(Validation.checkMobileNr("004915777045123"));
		assertFalse(Validation.checkMobileNr("22345465464#"));
		assertFalse(Validation.checkMobileNr("456"));
		assertFalse(Validation.checkMobileNr("sdfsd"));
		assertFalse(Validation.checkMobileNr("@#$#%#$^$#"));
		assertFalse(Validation.checkMobileNr("0157704512#"));
		assertFalse(Validation.checkMobileNr("number = 0234353454234"));
		assertFalse(Validation.checkMobileNr("345342343.5"));
		assertFalse(Validation.checkMobileNr("<453423433234>"));
		assertFalse(Validation.checkMobileNr("01456346565 or 0292348723643"));
		assertFalse(Validation.checkMobileNr("092384734543 / 44"));
	}

	@Test
	public void testcheckFax() {
		assertTrue(Validation.checkFax(""));
		assertTrue(Validation.checkFax("267345"));
		assertTrue(Validation.checkFax("03074523456"));
		assertFalse(Validation.checkFax("a56456645"));
		assertFalse(Validation.checkFax("......."));
		assertFalse(Validation.checkFax("234234@345"));
		assertFalse(Validation.checkFax("# = 4354565"));
		assertFalse(Validation.checkFax("fax # 3053177943"));
		assertFalse(Validation.checkFax("<56456645>"));
		assertFalse(Validation.checkFax("3454345.56"));
		assertFalse(Validation.checkFax("$"));
		assertFalse(Validation.checkFax("1"));
		
		
	}

	@Test
	public void testcheckApNr() {
		assertTrue(Validation.checkApNr("6 A"));
		assertTrue(Validation.checkApNr("617"));
		assertTrue(Validation.checkApNr("67"));
		assertTrue(Validation.checkApNr("67 C"));
		assertTrue(Validation.checkApNr("67 A "));
		assertFalse(Validation.checkApNr("two"));
		assertFalse(Validation.checkApNr("# 34"));
		assertFalse(Validation.checkApNr("4 @ 2"));
		assertTrue(Validation.checkApNr(""));
	}

	@Test
	public void testcheckZipCode() {
		assertTrue(Validation.checkZipCode("13353"));
		assertFalse(Validation.checkZipCode("1"));
		assertFalse(Validation.checkZipCode(""));
		assertFalse(Validation.checkZipCode("#34565"));
		assertFalse(Validation.checkZipCode("4523334"));
		assertFalse(Validation.checkZipCode(""));
		assertFalse(Validation.checkZipCode("wedding berlin"));
		assertFalse(Validation.checkZipCode("1 3 3 5 3"));
		assertFalse(Validation.checkZipCode("{34556}"));
		
		
		
	}

	@Test
	public void testcheckImage() {
		assertTrue(Validation.checkImage("jpg"));
		assertTrue(Validation.checkImage("png"));
		assertTrue(Validation.checkImage("jpeg"));
		assertTrue(Validation.checkImage("psd"));
		assertTrue(Validation.checkImage("gif"));
		assertFalse(Validation.checkImage("jasdpg"));
		assertFalse(Validation.checkImage("i am picture"));
		assertFalse(Validation.checkImage("doc"));
		assertFalse(Validation.checkImage("pdf"));
		assertFalse(Validation.checkImage("xml"));
		assertFalse(Validation.checkImage("@3sd"));
		assertFalse(Validation.checkImage("txt"));
		assertFalse(Validation.checkImage("123"));
	}

	@Test
	public void testcheckEmail() {
		assertTrue(Validation.checkEmail("hj@ht.tc"));
		assertTrue(Validation.checkEmail("hj@ht.tc-sdf.de"));
		assertTrue(Validation.checkEmail("hsad32.345_j@ht.tc"));
		assertTrue(Validation.checkEmail("h1j@ht.tc.pk"));
		assertTrue(Validation.checkEmail("hj2@ht.tc"));
		assertTrue(Validation.checkEmail("hj@ht.tc"));
		assertTrue(Validation.checkEmail("christoph.herbst@mail.tu-berlin.de"));
		assertFalse(Validation.checkEmail(""));
		assertFalse(Validation.checkEmail("christoph.herbstmail.tu-berlin.de"));
		assertFalse(Validation.checkEmail("christoph@herbst@mail.tu-berlin.de"));
		assertFalse(Validation.checkEmail("christoph.herbst@@mail.tu-berlin.de"));
		assertFalse(Validation.checkEmail("christoph@herbst@@mail.tu-berlin.de"));
		assertFalse(Validation.checkEmail("myemail#@gmail.com"));
		assertFalse(Validation.checkEmail("1ahmad.com"));
		assertFalse(Validation.checkEmail("1suliman@yaho.com"));
		assertFalse(Validation.checkEmail("wsadsfwe@webmail.tu%-mail.de"));
		assertFalse(Validation.checkEmail("myemai#lid@cricbox.com.uk"));
		assertTrue(Validation.checkEmail("email_address.own-special@company.business-place.country"));
	}
}