package biweeklyTest4;

import java.util.ArrayList;

public class Kth_Element {
	
	    int solve(ArrayList<Integer> nums, int k) {
	        
	        for(int i=0; i<nums.size(); i++)
	        {
	            int max = Integer.MIN_VALUE; int index = -1;
	            
	            for(int j=0; j<nums.size(); j++)
	            {
	                if(nums.get(j) > max){
	                    max   = nums.get(j);
	                    index = j;
	                }
	            }
	            
	            if(i == k - 1) return max;
	            nums.remove(index);
	        }
	        return -1;
	    }
	    
	    public static void main(String[] args)
	    {
	    	ArrayList<Integer> nums = new ArrayList<>();
	    	nums.add(3);
	    	nums.add(2);
	    	nums.add(1);
	    	nums.add(5);
	    	nums.add(6);
	    	nums.add(4);
	    	
	    	Kth_Element k = new Kth_Element();
	    	System.out.println(k.solve(nums, 2));
	    }

}
