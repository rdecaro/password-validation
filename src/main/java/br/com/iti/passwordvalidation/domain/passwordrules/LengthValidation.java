package br.com.iti.passwordvalidation.domain.passwordrules;

import java.util.regex.Pattern;

public class LengthValidation implements ValidationRule {
	
	private String value;
	private final Pattern rule = Pattern.compile("^.{9,}$");
	
	public LengthValidation(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		return rule.matcher(this.value).matches();
	}
	
	public String invalidMessage() {
		return "A senha precisa de ao menos 9 caracteres";
	}
}
