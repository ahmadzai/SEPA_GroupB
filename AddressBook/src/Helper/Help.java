package Helper;

public class Help {

	public static String getHelpText() {
		String help = "<html> <br><strong> How to use Address Book </strong> <br>";
		help += "<ul style='margin-left:10px;'> <li>How to Login? </li>";
		help += "<ol style='margin-left:15px;'> <li> Give your user name </li>";
		help += "<li> Give your correct password </li>";
		help += "<li> Click <font color = 'blue'>Login</font>  button </li>";
		help += "</ol>";
		help += "<li> How to search a contact?</li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> When you login, in the main page there is a search box " +
				"you can select from combobox that you want to search by and than write in textbox and click <font color = 'blue'>Search</font> button or go to Eidt " +
				"menu and press Search option</p>";
		help += "<li> How to add a new contact? </li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> In main window click \"<font color = 'blue'>Add Contact</font>\" button, a new window " +
				"will open where you can add cantact data and can save </p>";
		help += "<li> How to Edit a contact? </li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> From the list of the contact select a contact and click the \"<font color = 'blue'>Edit</font>\" button " +
				" a new window will open where you can edit the contact and save </p>";
		help += "<li> How to Delete a contact</li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> Select a contact from the list and clike the \"<font color = 'blue'>Delete</font>\" button </p>";
		help += "<li> How to set Image to a contact?</li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> In the Add Contact or Edit Contact form click on the Image and " +
				"select contact photo and attach it \"<font color = 'blue'>Delete</font>\" button same procedure for changing the image </p>";
		help += "<li> How to Print a contact? </li>";
		help += "<p style='margin-left:15px; margin-bottom:5px; width:350px' align='justify'> Select a contact from the list and clike the \"<font color = 'blue'>Print</font>\" button " +
				"or go to File menu and select print option a print dailogbox will apear, where you can easily print contact</p>";
		help += "<li> How to print the whole list?</li>";
		help += "<p style='margin-left:15px;width:350px' align='justify'> From the main page just click the \"<font color = 'blue'>Print All</font>\" button " +
				"or go to File menu and click Print All option, the whole list will print</pl>";
		help += "</ul>";
		help += "</html>";
		return help;
	}
	
	public static String about() {
		
		String about = "<html> <br> <font style='font-size:150%'>About AddressBook:</font> <br>";
		about += "<p><font color = 'blue' style='font-size:120%'>AddressBook Version 1.0.0, for small and meduim size business</font><br></p> ";
		about += "<p style='margin-top:4px'>Developed by: Group B</p>";
		about += "<ul style='margin-left:10px;'><li>Modeling Team:</li>";
		about += "<ul style='margin-left:2px; list-style-type:none'><li>Hamid Ullah, Mahmood and Ghezall</li></ul>";
		about += "<li>Documentation Team:</li>";
		about += "<ul style='margin-left:2px; list-style-type:none'><li>Seyad Ahmad, Huma Yari and Fowziah Naseri</li></ul>";
		about += "<li>Development Team:</li>";
		about += "<ul style='margin-left:2px; list-style-type:none'><li>Hamid Ullah, Wazir khan and Ashraf Ali</li></ul>";
		about += "<li>Testing Team:</li>";
		about += "<ul style='margin-left:2px; list-style-type:none'><li>Waheed Ullah, Ghezall and Mahmood</li></ul>";
		about += "<li>Configuration Team:</li>";
		about += "<ul style='margin-left:2px; list-style-type:none'><li>Wazir Khan, Seyad Ahmad, Foawziah Naseri and Huma Yari</li></ul>";
		about += "</ul><br> <i>Special Thanks to our Teachers</i> <strong style='color:green'>Mr.Ralph</strong>" +
				" <i>and</i>  <strong style='color:green'>Mr.Herbst</strong><br><br>";
		about += "<p align='center'><a href = \"http://www.tu-berlin.de\">www.tu-berlin.de</a></p>";
		about += "</html";
		
		return about;
	
	}
}