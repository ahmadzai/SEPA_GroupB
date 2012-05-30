package Helper;

public class Help {

	public static String getHelpText() {
		String help = "<html> <b> How to use Address Book </b> <br>";
		help += "<ul style='margin-left:10px;'> <li>How to Login? </li>";
		help += "<ol style='margin-left:15px;'> <li> Give your user name </li>";
		help += "<li> Give your correct password </li>";
		help += "<li> Click login button </li>";
		help += "</ol>";
		help += "<li> How to search a contact?</li>";
		help += "<ol style='margin-left:15px;'> <li>When you login, in the main page there is a search box <br> " +
				"you can select from combobox that you want to search by<br> and than write in textbox and click search button</li></ol>";
		help += "<li> How to add a new contact? </li>";
		help += "<ol style='margin-left:15px;'> <li> In main window click \"<font color = 'blue'>Add Contact</font>\" button, a new window <br>" +
				"will open where you can add cantact data and can save </li></ol>";
		help += "</ul>";
		help += "<img src='../images/login.png' width='50' height='50'>";
		help += "</html>";
		return help;
	}
}
