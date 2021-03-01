package br.com.iti.passwordvalidation.domain;

import java.util.List;

import br.com.iti.passwordvalidation.domain.passwordrules.DuplicateValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.LengthValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.LowercaseValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.NumberValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.ValidationRule;
import br.com.iti.passwordvalidation.domain.passwordrules.SpecialCharValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.UppercaseValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.WhiteSpaceValidation;

public class RulesBuilder {

	public static List<ValidationRule> buildRulesList(String password){
		List<ValidationRule> rules = List.of(
			new WhiteSpaceValidation(password),
			new LengthValidation(password),
			new NumberValidation(password),
			new UppercaseValidation(password),
			new LowercaseValidation(password),
			new SpecialCharValidation(password),
			new DuplicateValidation(password)
		);
		
		return rules;
	}
	
}
