package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWhiteSpaceValidation {
	
	@Test
	public void uppercaseValidationSucess() {
		WhiteSpaceValidation whiteSpaceValidation = new WhiteSpaceValidation("AAA");
		Assertions.assertTrue(whiteSpaceValidation.isValid());
	}
	
	@Test
	public void uppercaseValidationFailure() {
		WhiteSpaceValidation whiteSpaceValidation = new WhiteSpaceValidation("a a");
		Assertions.assertFalse(whiteSpaceValidation.isValid());
	}
	
	@Test
	public void uppercaseValidationFull() {
		WhiteSpaceValidation whiteSpaceValidation = new WhiteSpaceValidation("aB+cDeFgH1");
		Assertions.assertTrue(whiteSpaceValidation.isValid());
	}
}
