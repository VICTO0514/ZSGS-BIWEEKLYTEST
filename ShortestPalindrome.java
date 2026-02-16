package BiweeklyTest;

import java.util.Scanner;

public class ShortestPalindrome {
	
	public String shortestPalindrome(String s) {
	 if (s.length() == 0) {
		 return "";
	 }

     String rever = new StringBuilder(s).reverse().toString();
     String t = s + rever;

     int[] arr = new int[t.length()];
     
     for (int i = 1; i < t.length(); i++) {
         int j = arr[i - 1];
         while (j > 0 && t.charAt(i) != t.charAt(j)) {
        	 j = arr[j - 1];
         }
         if (t.charAt(i) == t.charAt(j)) {
        	 j++;
         }
         arr[i] = j;
     }

     int len = arr[t.length() - 1];
     
     String suffix = s.substring(len);
     
     String prefix = new StringBuilder(suffix).reverse().toString();
     
     return prefix + s;

 }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		ShortestPalindrome sp = new ShortestPalindrome();
		System.out.println(sp.shortestPalindrome(s));
		
		sc.close();

	}

}
