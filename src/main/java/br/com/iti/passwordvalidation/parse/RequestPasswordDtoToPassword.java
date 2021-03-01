package br.com.iti.passwordvalidation.parse;

import org.springframework.stereotype.Component;

import br.com.iti.passwordvalidation.domain.Password;
import br.com.iti.passwordvalidation.dto.RequestPasswordDto;

@Component
public class RequestPasswordDtoToPassword {
	
	public Password parse(RequestPasswordDto requestPasswordDto) {
		Password password = new Password();
		password.setValue(requestPasswordDto.getValue());
		return password;
	}
}
