package com.ssafy.algo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Solution1289_김용희{
		public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int TC = Integer.parseInt(br.readLine());

		for (int i = 1; i <= TC; i++) { 
			String str = br.readLine();
			int cnt = 0;
			int strLength = str.length();
			for (int j = 0; j < strLength; j++) {
				if(j == 0 ) { 
					if(str.charAt(j) == '1') {
						cnt++;
					}
				}else {
					if(str.charAt(j) != str.charAt(j-1)) {
						cnt++; 
					}
				}
			}
			System.out.println("#"+i+" "+cnt);			
		}
    }
}