package biweeklyTest4;

public class EditDistance {
	       public static int solve(String word1, String word2) {
	        
	        int len1 = word1.length();
	        int len2 = word2.length();
	        
	        int[][] result = new int[len1 + 1][len2 + 1];
	        
	        for(int i=1; i<=len1; ++i)
	        {
	            result[i][0] = i;
	        }
	        
	        for(int j=1; j<=len2; ++j)
	        {
	            result[0][j] = j;
	        }
	        
	        for(int i=1; i<=len1; ++i)
	        {
	            for(int j=1; j<=len2; ++j)
	            {
	                if(word1.charAt(i - 1) == word2.charAt(j - 1))
	                {
	                    result[i][j] = result[i - 1][j - 1];
	                }
	                else{
	                    
	                    int topLeft = result[i - 1][j - 1];
	                    int top     = result[i - 1][j];
	                    int left    = result[i][j - 1];
	                    
	                result[i][j] = Math.min(topLeft, Math.min(top,left)) + 1;
	                }
	            }
	        }
	        return result[len1][len2];
	    }
	       
	       public static void main(String[] args) {
	    	   String word1 = "horse";
	    	   String word2 = "ros";
	    	   
	    	   
	    	   System.out.println(EditDistance.solve(word1, word2));
	    	   
	       }
}

