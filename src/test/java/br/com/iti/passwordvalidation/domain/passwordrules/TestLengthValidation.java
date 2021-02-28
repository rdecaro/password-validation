package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestLengthValidation {
	
	@Test
	public void lengthValidationMinimum() {
		LengthValidation lengthValidation = new LengthValidation("aaaaaaaaa");
		Assertions.assertTrue(lengthValidation.isValid());
	}
	
	@Test
	public void lengthValidationMore() {
		LengthValidation lengthValidation = new LengthValidation("aaaaaaaaaaaaaaaaaaaaaa");
		Assertions.assertTrue(lengthValidation.isValid());
	}
	
	@Test
	public void lengthValidationLess() {
		LengthValidation lengthValidation = new LengthValidation("aaaa");
		Assertions.assertFalse(lengthValidation.isValid());
	}
	
	@Test
	public void uppercaseValidationFull() {
		UppercaseValidation uppercaseValidation = new UppercaseValidation("aB+cDeFgH1");
		Assertions.assertTrue(uppercaseValidation.isValid());
	}
}
