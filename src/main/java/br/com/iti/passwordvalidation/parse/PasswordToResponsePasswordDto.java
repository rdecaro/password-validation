package br.com.iti.passwordvalidation.parse;

import br.com.iti.passwordvalidation.domain.Password;
import br.com.iti.passwordvalidation.dto.ResponsePasswordDto;

public class PasswordToResponsePasswordDto {
	
	public ResponsePasswordDto parse(Password password) {
		ResponsePasswordDto responsePasswordDto = new ResponsePasswordDto();
		responsePasswordDto.setValid(password.isValid());
		return responsePasswordDto;
	}
}
