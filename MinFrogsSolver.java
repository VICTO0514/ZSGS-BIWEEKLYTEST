/* Croaking Frogs
You are given the string croakOfFrogs, which represents a combination of the string "croak" from different frogs. 
Multiple frogs can croak at the same time, so multiple "croak" sounds are mixed together.
Your task is to determine the minimum number of different frogs required to produce all the croaks in the given string.
*/

package BiweeklyTest;

import java.util.Scanner;

public class MinFrogsSolver {
	
	public int minNumberofFrogs(String s) {
		
		int c=0, r=0, o=0, a=0, k=0;
		int maxFrogs = 0;
		
		for(char m : s.toCharArray()) {
			
			if(m == 'c') {
				c++;
			}
			else if(m == 'r') {
				r++;
			}
			else if(m == 'o') {
				o++;
			}
			else if(m == 'a') {
				a++;
			}
			else if(m == 'k') {
				k++;
			}
			else {
				return -1;
			}
			
			if(!(c >= r && r >= o && o >=a && a >= k)) {
				return -1;
			}
			
			int currFrogs = c - k;
			if(currFrogs > maxFrogs) {
				maxFrogs = currFrogs;
			}
			
		}
		
		if(c == r && r == o && o == a && a == k) {
			return maxFrogs;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String croakofFrogs = sc.nextLine();
		
		MinFrogsSolver m = new MinFrogsSolver();
		System.out.println(m.minNumberofFrogs(croakofFrogs));
		
		sc.close();
	}

}
