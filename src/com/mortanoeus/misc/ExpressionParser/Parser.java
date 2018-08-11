/*
 * Parser
 */
 
package com.mortanoeus.misc.ExpressionParser;

public class Parser
{
	private String expression;
	private String prefix;
	private String postfix;
	
	public Parser(String exp)
	{
		expression = exp;
	}
	
	public String reversePolish()
	{
		if(postfix == null || postfix.isEmpty()) {
			postfix = "postfix";
		}
		
		return postfix;
	}
	
	public String polish()
	{
		if(prefix == null || prefix.isEmpty()) {
			prefix = "prefix";
		}
		
		return prefix;
	}
	
	public String getExpression()
	{
		return expression;
	}
}