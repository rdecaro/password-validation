package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberValidation {
	
	@Test
	public void numberValidationSucess() {
		NumberValidation numberValidation = new NumberValidation("123");
		Assertions.assertTrue(numberValidation.isValid());
	}
	
	@Test
	public void numberValidationFailure() {
		NumberValidation numberValidation = new NumberValidation("abc");
		Assertions.assertFalse(numberValidation.isValid());
	}
	
	@Test
	public void numberValidationFull() {
		NumberValidation numberValidation = new NumberValidation("aB+cDeFgH1");
		Assertions.assertTrue(numberValidation.isValid());
	}
}
