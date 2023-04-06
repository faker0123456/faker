package exception;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exception {

	private Pattern validEmail = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	private Pattern validName = Pattern.compile("[a-zA-Z]+\\.?", Pattern.CASE_INSENSITIVE);
	private Pattern validPhone = Pattern.compile("^\\d{11}$", Pattern.CASE_INSENSITIVE);
	Pattern validBirthday = Pattern.compile("^(?:0[1-9]|[12]\\d|3[01])([\\/.-])(?:0[1-9]|1[012])\\1(?:19|20)\\d\\d$", Pattern.CASE_INSENSITIVE);
	
	public boolean checkBirthday(String birthday) {
		

		Matcher matcher = validBirthday.matcher(birthday);
		//System.out.println(matcher.find());
		return matcher.find();
		
	}

	public boolean checkEmail(String email) {

		Matcher matcher = validEmail.matcher(email);
		//System.out.println(matcher.find());
		return matcher.find();

	}

	public boolean checkPhone(String phone) {
		Matcher matcher = validPhone.matcher(phone);
		//System.out.println(matcher.find());
		return matcher.find();

	}

	public boolean checkName(String name) {

		Matcher matcher = validName.matcher(name);
		//System.out.println(matcher.find());
		return matcher.find();

	}

	
	
	

}
