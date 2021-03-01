package br.com.iti.passwordvalidation.domain;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.iti.passwordvalidation.domain.passwordrules.ValidationRule;

@Service
public class PasswordValidation {

	public void passwordValidation(Password password) {
		
		List<ValidationRule> rules = RulesBuilder.buildRulesList(password.getValue());			
		int index = 0;
		
		while(rules.size()>index && password.isValid()) {
			password.setValid(rules.get(index).isValid());
			index++;			
		}
	}
}
