package br.com.iti.passwordvalidation.domain.passwordrules;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDuplicateValidation {
	
	@Test
	public void duplicateValidationSucess() {
		DuplicateValidation duplicateValidation = new DuplicateValidation("123abc");
		Assertions.assertTrue(duplicateValidation.isValid());
	}
	
	@Test
	public void duplicateValidationFailure() {
		DuplicateValidation duplicateValidation = new DuplicateValidation("112233abbcc");
		Assertions.assertFalse(duplicateValidation.isValid());
	}
	
	@Test
	public void duplicateValidationFull() {
		DuplicateValidation duplicateValidation = new DuplicateValidation("aB+cDeFgH1");
		Assertions.assertTrue(duplicateValidation.isValid());
	}
}
