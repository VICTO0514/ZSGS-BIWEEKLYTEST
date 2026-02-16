package BiweeklyTest;

import java.util.Scanner;

public class RearrangeWords {
	
	public String rearrangeWords(String s) {
		
		s = s.substring(0,1).toLowerCase() + s.substring(1);
		
		String[] word = s.split(" ");
		
		for(int i=0; i<word.length-1; i++) {
			for(int j=0; j<word.length-1; j++) {
				
				if(word[j].length() > word[j + 1].length()) {
					
					String t = word[j];
					word[j] = word[j + 1];
					word[j + 1] = t;
				}
			}
		}
		
		word[0] = word[0].substring(0,1).toUpperCase()+word[0].substring(1);
		
		String result = word[0];
		
		for(int i=1; i<word.length; i++) {
			result += " " + word[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		RearrangeWords r = new RearrangeWords();
		System.out.print(r.rearrangeWords(s));
		
	}

}
