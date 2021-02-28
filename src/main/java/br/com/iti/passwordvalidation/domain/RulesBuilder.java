package br.com.iti.passwordvalidation.domain;

import java.util.ArrayList;

import br.com.iti.passwordvalidation.domain.passwordrules.DuplicateValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.LengthValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.LowercaseValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.NumberValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.PasswordRules;
import br.com.iti.passwordvalidation.domain.passwordrules.SpecialValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.UppercaseValidation;
import br.com.iti.passwordvalidation.domain.passwordrules.WhiteSpaceValidation;

public class RulesBuilder {

	public static ArrayList<PasswordRules> buildRulesList(String password){
		ArrayList<PasswordRules> rules = new ArrayList<PasswordRules>();
		rules.add(new WhiteSpaceValidation(password));
		rules.add(new LengthValidation(password));
		rules.add(new NumberValidation(password));
		rules.add(new UppercaseValidation(password));
		rules.add(new LowercaseValidation(password));
		rules.add(new SpecialValidation(password));
		rules.add(new DuplicateValidation(password));
		
		return rules;
	}
	
}
