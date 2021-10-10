package Labseesion;

import java.util.Scanner;
import java.util.Stack;

public class BalanceParanthesis {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the input");
		 String exp = sc.next();
		 System.out.println("The input is balanced"+balance(exp));
		 
		 
		 }	
	static boolean balance(String data) {
		if(data.length()%2 == 1) {
			return false;
		}else {
			Stack<Character> st = new Stack<>();
			for(int i=0;i<data.length();i++) {
				char ch = data.charAt(i);
				if(ch == '{'|| ch == '[' || ch =='(') {
					st.push(ch);
				}
				else {
					char c = st.pop();
					switch(ch) {
					case '}':{
						if( c == '[' || c == '(') {
							return false;
							
						}
						break;
					}
					case ')': {
						if(c == '{' || c == '[') {
							return false;
						
						}
						break;
						
					}
					case ']':{
						if(c == '{' || c =='(') {
							return false;
						}
						break;
					}
					}
				}
			}
		}
		return false;
	}
	}
 

