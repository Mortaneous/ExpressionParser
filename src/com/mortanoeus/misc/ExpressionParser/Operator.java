/*
 * Operator
 */

package com.mortanoeus.misc.ExpressionParser;

public class Operator
{
	private String operators = "*/+-";
	
	public Operator()
	{
		this("*/+-");
	}
	
	public Operator(String operators)
	{
		this.operators = operators;
	}
	
	public String getOperators()
	{
		return operators;
	}
	
	public boolean isOperator(String op)
	{
		return operators.contains(op);
	}
}