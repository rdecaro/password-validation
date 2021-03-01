package br.com.iti.passwordvalidation.parse;

import org.springframework.stereotype.Component;

import br.com.iti.passwordvalidation.domain.Password;
import br.com.iti.passwordvalidation.dto.ResponsePasswordDto;

@Component
public class PasswordToResponsePasswordDto {
	
	public ResponsePasswordDto parse(Password password) {
		ResponsePasswordDto responsePasswordDto = new ResponsePasswordDto();
		responsePasswordDto.setValid(password.isValid());
		return responsePasswordDto;
	}
}
