import java.lang.System;
import java.util.*;
import java.util.Scanner.*;
import java.util.*;
import java.awt.*;
import java.io.*;

public class StringToBinary {
	
	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){
		
		System.out.println("Insert a phrase to convert to binary:");
		String phrase = scan.nextLine();
	 
		byte[] byteArray = phrase.getBytes();
		String binPhrase = convertPhrase(byteArray);
		
		System.out.println(binPhrase);
		
	}
	
	public static String convertPhrase(byte[] byteArray){
		byte[] newByteArray = byteArray;
		StringBuilder letter = new StringBuilder();
		StringBuilder binaryPhrase = new StringBuilder();
		
		for(byte b : newByteArray){
			letter.append(String.format("%8s", Integer.toBinaryString((int) b)));
			
			StringBuilder new8Letter = turnTo8Bit(letter);
			
			binaryPhrase.append(new8Letter);
			binaryPhrase.append(" ");
			new8Letter.delete(0, new8Letter.length());
		}
		
		return binaryPhrase.toString();
	}
	
	public static StringBuilder turnTo8Bit(StringBuilder letter){
		StringBuilder newLetter = letter;
		
		for(int i = 0; i < newLetter.length(); i++){
			if(newLetter.charAt(i) == ' '){
				newLetter.setCharAt(i, '0');
			}
		}
		
		return newLetter;
	}
	
}
