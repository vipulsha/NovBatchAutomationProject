package com.priyanka;

//
public class Vowels {
	public static void main(String[] args) {
		String s = "India is my country".toLowerCase().replace(" ", "");
		String vowels= "AEIOUaeiou";
		String resultVowels= "", resultConsonents="";

		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(vowels.contains(ch+"")){
				if(!resultVowels.contains(ch+"")){
					resultVowels= resultVowels+ch;
				}
				
			}else{
				if(!resultConsonents.contains(ch+"")){
					resultConsonents= resultConsonents+ch;
				}
				
			}
				

			}
		System.out.println("vowels:"+resultVowels);
		System.out.println("consonents:"+resultConsonents);

		}


	}


