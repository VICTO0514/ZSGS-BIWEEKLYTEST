package biweeklyTest4;

import java.util.ArrayList;

public class MaxProductWordLength {
	
	    public int solve(ArrayList<String> words) {
	        
	        int max = 0;
	        
	        for(int i=0; i<words.size(); i++)
	        {
	            for(int j=i+1; j<words.size(); j++)
	            {
	                if(isCommon(words.get(i), words.get(j)))
	                {
	                    int product = words.get(i).length() * words.get(j).length();
	                    max = Math.max(max, product);
	                }
	            }
	        }
	        return max;
	    }
	    
	    boolean isCommon(String a, String b)
	    {
	        boolean[] seen = new boolean[26];
	        
	        for(char c : a.toCharArray())
	        {
	            seen[c - 'a'] = true;
	        }
	        
	        for(char d : b.toCharArray())
	        {
	            if(seen[d - 'a']) return false; 
	        }
	        return true;
	    }

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("abcw");
		words.add("baz");
		words.add("foo");
		words.add("bar");
		words.add("xtfn");
		words.add("abcdef");
		
		MaxProductWordLength m = new MaxProductWordLength();
		
		System.out.println(m.solve(words));
	}

}
