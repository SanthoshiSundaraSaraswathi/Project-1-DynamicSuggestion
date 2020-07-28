/**
 * 
 */
package com.git.myWorks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Santhoshi
 *
 */
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values you are about to provide :");
		int numProducts = sc.nextInt();
		System.out.println("Enter the values:");
		List<String> values = new ArrayList<String>();
		for (int i=0; i<numProducts; i++) {
			String val = sc.next();
			values.add(val);
		}
		System.out.println("Enter the String to be identified:");
		String query = sc.next();
		List<List<String>> result = dynamicSuggestion(numProducts, values, query);
		for(int j=0;j<result.size();j++) {
			List<String> subResult = result.get(j);
			for(int k=0; k<subResult.size();k++) {
				System.out.print(subResult.get(k) + "\t");
			}
			System.out.print("\n");
		}

	}
	public static List<List<String>> dynamicSuggestion(int  numProduct,List<String> value, String query){
		List<List<String>> result = new ArrayList<List<String>>();
		for(int i = 2; i < query.length()+1; i++) {
			List<String> middle = new ArrayList<String>();
			Collections.sort(value);
			
			String sample = query.substring(0,i);
			for(String var : value) {
				int size = middle.size();
				boolean flag = var.startsWith(sample);
				if(flag) {
					if(size < 3) {
						middle.add(var);
					}
				}
			}
			result.add(middle);
		}
		return result;
	}
}
