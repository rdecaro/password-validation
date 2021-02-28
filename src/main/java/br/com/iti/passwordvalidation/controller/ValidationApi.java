package br.com.iti.passwordvalidation.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.iti.passwordvalidation.domain.Password;
import br.com.iti.passwordvalidation.domain.PasswordValidation;
import br.com.iti.passwordvalidation.dto.ResponsePasswordDto;
import br.com.iti.passwordvalidation.dto.RequestPasswordDto;
import br.com.iti.passwordvalidation.parse.PasswordToResponsePasswordDto;
import br.com.iti.passwordvalidation.parse.RequestPasswordDtoToPassword;

@RestController
@RequestMapping ("/password")
public class ValidationApi {
	
	PasswordToResponsePasswordDto passwordToResponsePasswordDto;
	RequestPasswordDtoToPassword requestPasswordDtoToPassword;
	PasswordValidation passwordValidation;
	
	@PostMapping
	public ResponsePasswordDto passwordValidation(@RequestBody RequestPasswordDto requestPasswordDto) {
		requestPasswordDtoToPassword = new RequestPasswordDtoToPassword();
		passwordToResponsePasswordDto = new PasswordToResponsePasswordDto();
		passwordValidation = new PasswordValidation();
		
		Password password = requestPasswordDtoToPassword.parse(requestPasswordDto);
		passwordValidation.passwordValidation(password);
		
		return passwordToResponsePasswordDto.parse(password);
	}
}
