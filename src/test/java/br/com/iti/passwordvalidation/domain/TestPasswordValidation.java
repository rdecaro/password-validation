package br.com.iti.passwordvalidation.domain;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import br.com.iti.passwordvalidation.domain.passwordrules.ValidationRule;

public class TestPasswordValidation {
	
	@Mock
	private ValidationRule genericRule;
	
	private ArrayList<ValidationRule> rulesListMock;
	private int index;
	private Password password;
	
	@BeforeEach
	public void before() {
		MockitoAnnotations.openMocks(this);

		rulesListMock = new ArrayList<ValidationRule>();
		rulesListMock.add(genericRule);
		
		index = 0;
		
		password = new Password();
	}
	
	@Test
	public void passwordValidationSucess() {
		
		while(rulesListMock.size()>index && password.isValid()) {
			Mockito.when(rulesListMock.get(index).isValid()).thenReturn(true);
			password.setValid(rulesListMock.get(index).isValid());
			index++;			
		}
		
		Assertions.assertTrue(password.isValid());
	}
	
	@Test
	public void passwordValidationFailure() {
		
		while(rulesListMock.size()>index && password.isValid()) {
			Mockito.when(rulesListMock.get(index).isValid()).thenReturn(false);
			password.setValid(rulesListMock.get(index).isValid());
			index++;			
		}
		
		Assertions.assertFalse(password.isValid());
	}
}
