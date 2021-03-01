package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSpecialCharValidation {
	
	@Test
	public void specialValidationSucess() {
		SpecialCharValidation specialValidation = new SpecialCharValidation("#$+");
		Assertions.assertTrue(specialValidation.isValid());
	}
	
	@Test
	public void specialValidationFailure() {
		SpecialCharValidation specialValidation = new SpecialCharValidation("abc123");
		Assertions.assertFalse(specialValidation.isValid());
	}
	
	@Test
	public void specialValidationFull() {
		SpecialCharValidation specialValidation = new SpecialCharValidation("aB+cDeFgH1");
		Assertions.assertTrue(specialValidation.isValid());
	}
}
