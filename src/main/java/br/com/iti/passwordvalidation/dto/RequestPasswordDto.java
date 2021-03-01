package br.com.iti.passwordvalidation.dto;

import javax.validation.constraints.NotNull;

public class RequestPasswordDto {
	
	@NotNull
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}	

}
