package br.com.iti.passwordvalidation.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.iti.passwordvalidation.domain.Password;
import br.com.iti.passwordvalidation.domain.PasswordValidation;
import br.com.iti.passwordvalidation.dto.ResponsePasswordDto;
import br.com.iti.passwordvalidation.dto.RequestPasswordDto;
import br.com.iti.passwordvalidation.parse.PasswordToResponsePasswordDto;
import br.com.iti.passwordvalidation.parse.RequestPasswordDtoToPassword;

public class TestValidationApi {
	
	@Mock
	private PasswordToResponsePasswordDto passwordToResponsePasswordDto;
	
	@Mock
	private RequestPasswordDtoToPassword requestPasswordDtoToPassword;
	
	@Mock
	private PasswordValidation passwordValidation;
	
	private ResponsePasswordDto responsePasswordDto;
	private RequestPasswordDto requestPasswordDto;
	private Password password;
	
	@BeforeEach
	public void before() {
		MockitoAnnotations.openMocks(this);

		responsePasswordDto = new ResponsePasswordDto();
		responsePasswordDto.setValid(true);		
		requestPasswordDto = new RequestPasswordDto();
		requestPasswordDto.setValue("aB+cDeFgH1");
		password = new Password();
	}
	
	@Test
	public void passwordValidation() {
		password.setValue("aB+cDeFgH1");		
		
		Mockito.when(requestPasswordDtoToPassword.parse(requestPasswordDto)).thenReturn(password);
		Password mockPassword = new Password();
		mockPassword = requestPasswordDtoToPassword.parse(requestPasswordDto);
		Assertions.assertEquals(password, mockPassword);
		
		passwordValidation.passwordValidation(mockPassword);
		Mockito.verify(passwordValidation).passwordValidation(mockPassword);
		
		Mockito.when(passwordToResponsePasswordDto.parse(mockPassword)).thenReturn(responsePasswordDto);
		ResponsePasswordDto mockResponsePasswordDto = new ResponsePasswordDto();
		mockResponsePasswordDto = passwordToResponsePasswordDto.parse(mockPassword);
		Assertions.assertEquals(responsePasswordDto, mockResponsePasswordDto);
	}

}
