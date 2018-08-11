package com.mortanoeus.misc.ExpressionParser;

import java.util.List;

public class TestHarness
{
  public static void main(String[] args)
  {
    System.out.println("Hello, World!");
    
    Operator op = new Operator();
    String[] sample = {"/+", "+", "*", "-", "/", "/*", "BA"};
    
    for(int i=0; i<sample.length; i++) {
    	System.out.println(sample[i] + " --> " + (op.isOperator(sample[i]) ? "Yes" : "NO"));
    }
    
    Tokenizer tokenizer = new Tokenizer("AB + C *   D");
    List<String> tokens = tokenizer.getTokens();
    
    for(int i=0; i<tokens.size(); i++) {
      System.out.println(i + " [" + tokens.get(i) + "]");
    }
  }

}