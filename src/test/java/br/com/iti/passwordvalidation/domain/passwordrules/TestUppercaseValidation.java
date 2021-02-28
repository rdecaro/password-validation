package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUppercaseValidation {
	
	@Test
	public void uppercaseValidationSucess() {
		UppercaseValidation uppercaseValidation = new UppercaseValidation("A");
		Assertions.assertTrue(uppercaseValidation.isValid());
	}
	
	@Test
	public void uppercaseValidationFailure() {
		UppercaseValidation uppercaseValidation = new UppercaseValidation("a");
		Assertions.assertFalse(uppercaseValidation.isValid());
	}
	
	@Test
	public void uppercaseValidationFull() {
		UppercaseValidation uppercaseValidation = new UppercaseValidation("aB+cDeFgH1");
		Assertions.assertTrue(uppercaseValidation.isValid());
	}
}
