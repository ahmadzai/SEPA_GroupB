package Helper;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
	private Validation person;
	@Before
	public void setUp() throws Exception {
		person=new Validation();
	}

	@Test
	public void testcheckName() {
		assertTrue(person.checkName("mahmood"));
		assertFalse(person.checkName("Wah@eed"));
		assertFalse(person.checkName("1Wah@eed"));
		assertFalse(person.checkName("Wa1h@eed"));
		assertFalse(person.checkName("Wah@e5ed"));
		assertFalse(person.checkName("Waheed 5"));
		assertFalse(person.checkName("Wah@ eed"));
		assertFalse(person.checkName("Wah#eed"));
		assertFalse(person.checkName("^ Waheed"));
		assertFalse(person.checkName("(Wah@eed"));
		assertFalse(person.checkName("@Wah@eed"));
		assertFalse(person.checkName("Waheed 2"));
		assertFalse(person.checkName("Waheed_khan"));
		assertFalse(person.checkName("Waheed 3"));
		assertFalse(person.checkName("Waheed_2"));
		assertFalse(person.checkName("Waheed #"));
		assertFalse(person.checkName("Wah 2 eed"));
		assertFalse(person.checkName("Wah4eed"));
		assertFalse(person.checkName("Waheed.com"));
		assertFalse(person.checkName("Wah,eed"));
		assertFalse(person.checkName("khan5"));
		assertFalse(person.checkName(".."));
		assertFalse(person.checkName("@"));
		assertFalse(person.checkName("45435"));
		assertFalse(person.checkName("+ada-"));
		assertFalse(person.checkName("$$$$$"));
		assertFalse(person.checkName("/samad"));
		assertFalse(person.checkName("http::"));
		assertFalse(person.checkName("[]"));
		assertFalse(person.checkName("waheed{"));
		//assertTrue(person.checkName("Waheed"));
			//fail("Not yet implemented");
		
		

	
	}


	@Test
	public void testcheckCountryCity1() {
		assertFalse(person.checkCountryCity("{afghanistan"));
		assertFalse(person.checkCountryCity("Afghan@istan"));
		assertFalse(person.checkCountryCity("Pakistan3"));
		assertFalse(person.checkCountryCity("Iran4Afg"));
		assertFalse(person.checkCountryCity("Country#"));
		assertFalse(person.checkCountryCity("1New Zealand"));
		assertFalse(person.checkCountryCity("#Carabean"));
		assertFalse(person.checkCountryCity("%USA"));
		assertFalse(person.checkCountryCity("$UK"));
		assertFalse(person.checkCountryCity("United_Kingdom"));
		assertFalse(person.checkCountryCity("Australia00"));
		assertFalse(person.checkCountryCity("Ire+Land"));
		assertFalse(person.checkCountryCity("@"));
		assertFalse(person.checkCountryCity("345"));
		assertFalse(person.checkCountryCity("....."));
		assertFalse(person.checkCountryCity("."));
		assertFalse(person.checkCountryCity(","));
		assertFalse(person.checkCountryCity("Tajikistan (Russia)"));
		assertFalse(person.checkCountryCity("<Uzbekistan>"));
		assertFalse(person.checkCountryCity("?"));
		assertFalse(person.checkCountryCity("kazakistan @ Asia"));
		assertFalse(person.checkCountryCity("USA , UK"));
		assertFalse(person.checkCountryCity("my country.com"));
		assertFalse(person.checkCountryCity("*****"));
		assertFalse(person.checkCountryCity("+all countries"));
		assertFalse(person.checkCountryCity("(America)*"));
		assertFalse(person.checkCountryCity("1. Afghanistan"));
		assertFalse(person.checkCountryCity("Afgh@nistan"));
		assertFalse(person.checkCountryCity("I7aly"));
		assertFalse(person.checkCountryCity("Ma-ico"));
		assertTrue(person.checkCountryCity("Afghanistan"));
		assertTrue(person.checkCountryCity("afghanistan"));
		assertTrue(person.checkCountryCity("New Zealand"));
		assertTrue(person.checkCountryCity("Australia"));
		assertTrue(person.checkCountryCity("United Kingdom"));
		assertTrue(person.checkCountryCity("UK"));
		assertTrue(person.checkCountryCity("Suria"));
		assertTrue(person.checkCountryCity("USSR"));
		assertTrue(person.checkCountryCity("Russia USSR"));
		assertTrue(person.checkCountryCity("West Indeas Carabean"));
		assertTrue(person.checkCountryCity("North Amercia Brazil"));
		assertTrue(person.checkCountryCity("Saudi Arabia "));
		assertTrue(person.checkCountryCity("Japan"));
		assertTrue(person.checkCountryCity("North sea"));
		assertFalse(person.checkCountryCity("#Kabul"));
		assertFalse(person.checkCountryCity("Chic@go"));
		assertFalse(person.checkCountryCity("1 New York"));
		assertFalse(person.checkCountryCity("London_city"));
		assertFalse(person.checkCountryCity("Paris(elif)"));
		assertFalse(person.checkCountryCity("Mai+mana"));
		assertFalse(person.checkCountryCity("(angar)*"));
		assertFalse(person.checkCountryCity("$Berlin"));
		assertFalse(person.checkCountryCity("Berlin.Wedding"));
		assertFalse(person.checkCountryCity("wedding , Berlin"));
		assertFalse(person.checkCountryCity("leipzig + Berlin"));
		assertFalse(person.checkCountryCity("London > all CIties"));
		assertFalse(person.checkCountryCity("Tibu < Peshawar"));
		assertFalse(person.checkCountryCity("Karachi <= Tehran"));
		assertFalse(person.checkCountryCity("# 2 Frankfurt"));
		assertFalse(person.checkCountryCity("kabul 100km"));
		assertFalse(person.checkCountryCity("new-york"));
		assertFalse(person.checkCountryCity("mia=me"));
		assertFalse(person.checkCountryCity("kitman2"));
		assertFalse(person.checkCountryCity("345"));
		assertFalse(person.checkCountryCity("...."));
		assertFalse(person.checkCountryCity("**"));
		assertFalse(person.checkCountryCity("+++"));
		assertFalse(person.checkCountryCity("@"));
		assertFalse(person.checkCountryCity(","));
		assertFalse(person.checkCountryCity("frankfurt (oder)"));
		assertFalse(person.checkCountryCity("Kabul & Belrin"));
		assertTrue(person.checkCountryCity("kabul"));
		assertTrue(person.checkCountryCity("KABUL"));
		assertTrue(person.checkCountryCity("New York"));
		assertTrue(person.checkCountryCity("London "));
		assertTrue(person.checkCountryCity("Paris"));
		assertTrue(person.checkCountryCity("frankfurt oder"));
		assertTrue(person.checkCountryCity("frankfurt am main"));
		assertTrue(person.checkCountryCity("manchestered united city "));
		assertTrue(person.checkCountryCity("chicago in usa"));
		assertTrue(person.checkCountryCity("logar"));
		
		
	}

	@Test
	public void testcheckStreet() {
		assertTrue(person.checkStreet("Trift Strasse 67"));
		assertTrue(person.checkStreet("Lyner Strasse 5"));
		assertTrue(person.checkStreet("Luxemburg strasse 8"));
		assertTrue(person.checkStreet("2 Franklin strasse "));
		assertFalse(person.checkStreet("@ Franklin str@sse"));
		assertFalse(person.checkStreet(" Franklin_strasse"));
		assertFalse(person.checkStreet("Franklin#str@sse"));
		assertFalse(person.checkStreet("=Franklin strasse"));
		assertFalse(person.checkStreet("Franklin strasse & Lyner Strasse"));
		assertFalse(person.checkStreet("23"));
		assertFalse(person.checkStreet("..."));
		assertFalse(person.checkStreet("+"));
		
	}



	@Test
	public void testcheckDate() {
		assertTrue(person.checkDate("05/10/1980"));
		assertTrue(person.checkDate("1/1/1970"));
		assertFalse(person.checkDate("#"));
		assertFalse(person.checkDate("31990"));
		assertFalse(person.checkDate("1980/5/6"));
		assertFalse(person.checkDate(""));
		assertFalse(person.checkDate("32/5/1990"));
		assertFalse(person.checkDate("21/13/1987"));
		assertFalse(person.checkDate("#/#/1987"));
		assertFalse(person.checkDate("00/00/0000"));
		assertFalse(person.checkDate("two/March/two thousand and one "));
		assertFalse(person.checkDate("1/April/1986"));
		assertFalse(person.checkDate("20/1986"));
		assertFalse(person.checkDate("May/1986"));
		assertFalse(person.checkDate("05/05"));
		assertFalse(person.checkDate("10/09/00"));
		assertFalse(person.checkDate("02|05|1990"));
		assertFalse(person.checkDate("02+05+1967"));
		assertFalse(person.checkDate("02/1984/May"));
		assertFalse(person.checkDate("June/2000/10"));
	}

	@Test
	public void testcheckPhone() {
		assertTrue(person.checkPhoneNr("23423145"));
		assertTrue(person.checkPhoneNr("03053166879"));
		assertTrue(person.checkPhoneNr("06159833570"));
		assertTrue(person.checkPhoneNr("38745295"));
		assertFalse(person.checkPhoneNr("...."));
		assertTrue(person.checkPhoneNr(null));
		assertFalse(person.checkPhoneNr("i dont give my number out :D:D "));
		assertFalse(person.checkPhoneNr("@"));
		assertFalse(person.checkPhoneNr("345#$534"));
		assertFalse(person.checkPhoneNr("@32443543"));
		assertFalse(person.checkPhoneNr("1"));
		assertFalse(person.checkPhoneNr("342"));
		assertTrue(person.checkPhoneNr("045 54342456"));
		assertTrue(person.checkPhoneNr("030 531 668 79"));
		assertTrue(person.checkPhoneNr("0093 75 668 379"));
		assertFalse(person.checkPhoneNr("(27386487)"));
	}

	@Test
	public void testcheckMobileNr() {
		assertTrue(person.checkMobileNr("015777045123"));
		assertTrue(person.checkMobileNr("+4915777045123"));
		assertTrue(person.checkMobileNr("045645654654"));
		assertTrue(person.checkMobileNr("017678935542"));
		assertTrue(person.checkMobileNr("03005988632"));
		assertTrue(person.checkMobileNr("00923005988632"));
		assertTrue(person.checkMobileNr("0093799532865"));
		assertTrue(person.checkMobileNr("0799406686"));
		assertTrue(person.checkMobileNr("004915777045123"));
		assertFalse(person.checkMobileNr("22345465464#"));
		assertFalse(person.checkMobileNr("456"));
		assertFalse(person.checkMobileNr("sdfsd"));
		assertFalse(person.checkMobileNr("@#$#%#$^$#"));
		assertFalse(person.checkMobileNr("0157704512#"));
		assertFalse(person.checkMobileNr("number = 0234353454234"));
		assertFalse(person.checkMobileNr("345342343.5"));
		assertFalse(person.checkMobileNr("<453423433234>"));
		assertFalse(person.checkMobileNr("01456346565 or 0292348723643"));
		assertFalse(person.checkMobileNr("092384734543 / 44"));
		assertFalse(person.checkMobileNr(""));
	}

	@Test
	public void testcheckFax() {
		assertTrue(person.checkFax(""));
		assertTrue(person.checkFax("2345467345"));
		assertTrue(person.checkFax("03074523456"));
		assertFalse(person.checkFax("a56456645"));
		assertFalse(person.checkFax("......."));
		assertFalse(person.checkFax("234234@345"));
		assertFalse(person.checkFax("# = 4354565"));
		assertFalse(person.checkFax("fax # 3053177943"));
		assertFalse(person.checkFax("<56456645>"));
		assertFalse(person.checkFax("3454345.56"));
		assertFalse(person.checkFax("$"));
		assertFalse(person.checkFax("1"));
		
		
	}

	@Test
	public void testcheckApNr() {
		assertTrue(person.checkApNr("6 A"));
		assertTrue(person.checkApNr("617"));
		assertTrue(person.checkApNr("67"));
		assertTrue(person.checkApNr("67 C"));
		assertTrue(person.checkApNr("67 A "));
		assertFalse(person.checkApNr("two"));
		assertFalse(person.checkApNr("# 34"));
		assertFalse(person.checkApNr("4 @ 2"));
		assertTrue(person.checkApNr(""));
	}

	@Test
	public void testcheckZipCode() {
		assertTrue(person.checkZipCode("13353"));
		assertFalse(person.checkZipCode("1"));
		assertFalse(person.checkZipCode(""));
		assertFalse(person.checkZipCode("#34565"));
		assertFalse(person.checkZipCode("4523334"));
		assertFalse(person.checkZipCode(""));
		assertFalse(person.checkZipCode("wedding berlin"));
		assertFalse(person.checkZipCode("1 3 3 5 3"));
		assertFalse(person.checkZipCode("{34556}"));
		
		
		
	}

	@Test
	public void testcheckImage() {
		assertTrue(person.checkImage("jpg"));
		assertTrue(person.checkImage("png"));
		assertTrue(person.checkImage("jpeg"));
		assertTrue(person.checkImage("psd"));
		assertTrue(person.checkImage("gif"));
		assertFalse(person.checkImage("jasdpg"));
		assertFalse(person.checkImage("i am picture"));
		assertFalse(person.checkImage("doc"));
		assertFalse(person.checkImage("pdf"));
		assertFalse(person.checkImage("xml"));
		assertFalse(person.checkImage("@3sd"));
		assertFalse(person.checkImage("txt"));
		assertFalse(person.checkImage("123"));
	}

	@Test
	public void testcheckEmail() {
		assertTrue(person.checkEmail("hj@ht.tc"));
		assertTrue(person.checkEmail("hj@ht.tc-sdf.de"));
		assertTrue(person.checkEmail("hsad32.345_j@ht.tc"));
		assertTrue(person.checkEmail("h1j@ht.tc.pk"));
		assertTrue(person.checkEmail("hj2@ht.tc"));
		assertTrue(person.checkEmail("hj@ht.tc"));
		assertTrue(person.checkEmail("christoph.herbst@mail.tu-berlin.de"));
		assertFalse(person.checkEmail(""));
		assertFalse(person.checkEmail(null));
		assertFalse(person.checkEmail("christoph.herbstmail.tu-berlin.de"));
		assertFalse(person.checkEmail("christoph@herbst@mail.tu-berlin.de"));
		assertFalse(person.checkEmail("christoph.herbst.@mail.tu-berlin.de"));
        assertFalse(person.checkEmail("sediqi@mailbox.tu-berlin.de"));
		assertFalse(person.checkEmail("christoph.herbst@@mail.tu-berlin.de"));
		assertFalse(person.checkEmail("christoph@herbst@@mail.tu-berlin.de"));
	

	}
}
