package com.tej.generalproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {
		System.out.println(isValid("(])"));
	}
	public static boolean isValid(String s) {
        Map<Character,Character> mappings = new HashMap<Character,Character>(){{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        Stack<Character> letters = new Stack<>();
		
        for(int i = 0; i < s.length(); i++){
            char temp = s.charAt(i);
            if(mappings.containsKey(temp)){
                if(letters.isEmpty() || letters.pop() != mappings.get(temp)){
                    return false;
                }
            } else{
                letters.push(temp);
            }
        }
        return letters.isEmpty();
    }
}
