package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLowercaseValidation {
	
	@Test
	public void lowercaseValidationSucess() {
		LowercaseValidation lowercaseValidation = new LowercaseValidation("a");
		Assertions.assertTrue(lowercaseValidation.isValid());
	}
	
	@Test
	public void lowercaseValidationFailure() {
		LowercaseValidation lowercaseValidation = new LowercaseValidation("A");
		Assertions.assertFalse(lowercaseValidation.isValid());
	}
	
	@Test
	public void lowercaseValidationFull() {
		LowercaseValidation lowercaseValidation = new LowercaseValidation("aB+cDeFgH1");
		Assertions.assertTrue(lowercaseValidation.isValid());
	}
}
