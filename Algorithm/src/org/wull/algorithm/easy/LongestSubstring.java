package org.wull.algorithm.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		long t1 = System.currentTimeMillis();
		for(int i=0;i<1;i++)
		System.out.println(lengthOfLongestSubstring("abba"));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
	}

	public static int lengthOfLongestSubstring(String s) {
		Map<Character,Integer> hs = new HashMap<Character,Integer>();
		int max = 0;
		int temp =0;
		if(s==null){
			return 0;
		}
		for(int i=0;i<s.length();i++){
			Character ch = s.charAt(i);
			temp++;
			if(hs.containsKey(ch)){
				temp = i-hs.get(ch);
			}
			if(temp>max){
				max = temp;
			}
			hs.put(ch, i);
		}
		return max;
	}

}
