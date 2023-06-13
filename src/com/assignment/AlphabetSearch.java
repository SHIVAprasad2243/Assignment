package com.assignment;

public class AlphabetSearch {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		boolean containsAllAlphabet = true;

		for (char ch = 'a'; ch <= 'z'; ch++) {
		    if (alphabet.indexOf(ch) == -1) {
		        containsAllAlphabet = false;
		        break;
		    }
		}

		if (containsAllAlphabet) {
		    System.out.println("true");
		} else {
		    System.out.println("false");
		}


	}

	}
		
	