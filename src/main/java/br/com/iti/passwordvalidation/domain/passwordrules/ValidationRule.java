package br.com.iti.passwordvalidation.domain.passwordrules;

public interface ValidationRule {
	
	public abstract boolean isValid();
	public abstract String invalidMessage();
}
