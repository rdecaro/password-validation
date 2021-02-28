package br.com.iti.passwordvalidation.domain.passwordrules;

import java.util.regex.Pattern;

public class WhiteSpaceValidation implements PasswordRules {
	
	private String value;
	private final Pattern rule = Pattern.compile("\\s");
	
	public WhiteSpaceValidation(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		return !rule.matcher(this.value).find();
	}
	
	public String invalidMessage() {
		return "A senha não pode conter espaços em branco.";
	}
}
