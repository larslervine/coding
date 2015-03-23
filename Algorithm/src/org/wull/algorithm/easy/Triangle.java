package org.wull.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> generate(int numRows) {
    	List<List<Integer>> results = new ArrayList<List<Integer>>();
    	if(numRows<1){
    		return results;
    	}
        for(int i=0;i<numRows;i++){
        	List<Integer> list = new ArrayList<Integer>();
        	if(i==0){
        		list.add(1);
        	}else if(i==1){
        		list.add(1);
        		list.add(1);
        	}else{
        		list.add(1);
        		for(int j=0;j<i-1;j++){
        			list.add(results.get(i-1).get(j)+results.get(i-1).get(j+1));
        		}
        		list.add(1);
        	}
        	results.add(list);
        }
        
        return results;
    }

}
