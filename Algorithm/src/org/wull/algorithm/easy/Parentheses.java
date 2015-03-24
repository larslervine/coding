package org.wull.algorithm.easy;

import java.util.Stack;

public class Parentheses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("]"));
	}
	
	
	
	public static boolean isValid(String s) {
        Stack<Integer> stacks = new Stack<Integer>();
		String reg = "()[]{}";
		for(int i=0;i<s.length();i++){
			String ch = s.substring(i,i+1);
			int index = reg.indexOf(ch);
			if(index%2==1){
				if(stacks.isEmpty() || stacks.pop() != index-1){
					return false;
				}
			}else{
				stacks.push(index);
			}
		}
		return stacks.isEmpty();
        
    }
	

}
