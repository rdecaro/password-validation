package br.com.iti.passwordvalidation.domain.passwordrules;

import java.util.regex.Pattern;

public class NumberValidation implements ValidationRule {
	
	private String value;
	private final Pattern rule = Pattern.compile("^(?=.*\\d).+$");
	
	public NumberValidation(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		return rule.matcher(this.value).matches();
	}
	
	public String invalidMessage() {
		return "A senha precisa de ao menos 1 dígito";
	}
}
