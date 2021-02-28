package br.com.iti.passwordvalidation.domain;

import java.util.ArrayList;

import br.com.iti.passwordvalidation.domain.passwordrules.PasswordRules;

public class PasswordValidation {

	public void passwordValidation(Password password) {
		
		ArrayList<PasswordRules> rules = RulesBuilder.buildRulesList(password.getValue());			
		int index = 0;
		
		while(rules.size()>index && password.isValid()) {
			password.setValid(rules.get(index).isValid());
			index++;			
		}
	}
}
