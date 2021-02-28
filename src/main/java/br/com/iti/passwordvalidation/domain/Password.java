package br.com.iti.passwordvalidation.domain;

public class Password {
	
	private String value;
	private boolean valid = true;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
