/*
 * Tokenizer
 */

package com.mortanoeus.misc.ExpressionParser;

import java.util.List;
import java.util.ArrayList;
 
public class Tokenizer
{
	private String str;
	private List<String> tokenArray;
	
	public Tokenizer(String str)
	{
		this.str = str;
	}
	
	public List<String> getTokens()
	{
		if(tokenArray == null) {
			
			tokenArray = new ArrayList<String>();
			String currentToken = "";
			Operator op = new Operator();
			
			// I should use regex but I'm doing it this way for now...
			
			for(int i=0; i<str.length(); i++) {
              	
 				if(op.isOperator(str.substring(i,i+1))) {
              
 					if(!currentToken.isEmpty()) {
                      
 						tokenArray.add(currentToken.trim());
						currentToken = "";
					}
				
 					tokenArray.add(str.substring(i,i+1).trim());
				}
				else {
					currentToken += str.substring(i,i+1);
                }
 			}
			
			if(!currentToken.isEmpty()) {
 				tokenArray.add(currentToken.trim());
			}
			
		}
		
		return tokenArray;
	}
}