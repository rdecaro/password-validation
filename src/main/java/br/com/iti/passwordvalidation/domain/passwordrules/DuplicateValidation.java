package br.com.iti.passwordvalidation.domain.passwordrules;

import java.util.HashMap;
import java.util.Map;

public class DuplicateValidation implements ValidationRule {
	
	private String value;
	
	public DuplicateValidation(String value) {
		this.value = value;
	}
	
	public boolean isValid() {
		char[] chars = value.toCharArray();     
        Map<Character, Boolean> map = new HashMap<>();
        for(char c : chars) {
            if (map.containsKey(c)) 
            	return false;
            else
            	map.put(c, true);
        }
         
		return true;
	}
	
	public String invalidMessage() {
		return "A senha não pode conter caracteres repetidos";
	}
}
