package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSpecialValidation {
	
	@Test
	public void specialValidationSucess() {
		SpecialValidation specialValidation = new SpecialValidation("#$+");
		Assertions.assertTrue(specialValidation.isValid());
	}
	
	@Test
	public void specialValidationFailure() {
		SpecialValidation specialValidation = new SpecialValidation("abc123");
		Assertions.assertFalse(specialValidation.isValid());
	}
	
	@Test
	public void specialValidationFull() {
		SpecialValidation specialValidation = new SpecialValidation("aB+cDeFgH1");
		Assertions.assertTrue(specialValidation.isValid());
	}
}
