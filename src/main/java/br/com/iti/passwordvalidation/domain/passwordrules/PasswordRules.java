package br.com.iti.passwordvalidation.domain.passwordrules;

public interface PasswordRules {
	
	public abstract boolean isValid();
	public abstract String invalidMessage();
}
